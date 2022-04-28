/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : WeblogicSendQClientTemp.java
*@FileTitle : WeblogicSendQClientTemp
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.16
*@LastModifier : 우지석
*@LastVersion : 1.0
* 2009.04.16 우지석
* 1.0 Creation
=========================================================*/


package com.clt.bizcommon.erpcom.jms.integration;

import java.io.IOException;
import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.clt.framework.core.layer.event.EventException;
import com.jf.transfer.AbstractSendEai;
import com.jf.transfer.TransferEAI;
import com.jf.transfer.eai.exception.EAIException;
import com.jf.transfer.eai.util.DateFormat4Performance;
import com.jf.transfer.eai.util.StopWatch;

/**    
 * <pre>
 * Weblogic JMS Send Queue Class 
 * This module use to send message to Weblogic JMS Queue. 
 * - You have to set jms queue factory, queue name, and initial context 
 *   factory(default)
 * When you have to call constructor with target URL. 
 * example below : 
 * 
 *      String reString = "" ;
 *      TransferEAI eai = new JmsSendQClient("t3://203.246.152.51:9001");
 *      eai.setFactory("com.clt.QueueConnectionFactory2");
 *      eai.setQueue("test.queue2");
 *      eai.setMessage("JMS Client SaMessageProducermple Message ! ");
 *      try {
 *          reString = eai.Commit();
 *      } catch (EAIException e) {
 *          ... ... 
 *      }
 *      
 * <pre>
 * 
 * @author          :   Hyunsu, Ryu 
 * @version         :   1.0
 * @since           :   JDK1.4.2_09
 * @see             :   
*/
public class WeblogicSendQClientTemp extends AbstractSendEai implements TransferEAI{

    /**
     * Apache Log4j Logger !
     */
     protected transient org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(this.getClass().getName());

    String errorHead = "WeblogicSendQClient Document-style Web Service : ERROR_MESSAGE=";

    /**
     * JMS Send Queue Client Constructor <br>
     *  
     * @param String tu
     * @param Class c
     * @exception IOException 
     */
    public WeblogicSendQClientTemp( String tu, Class c ) throws IOException
    {   
    	setTarget(tu);
    	setEaiType(TransferEAI.WLS_ASY_DOC);
    	setCaller(c.getName());
    	setBound("O");
    	setTransferType("NO_MQJMS_BINDING");
    	setTargetClient("NO_CLIENT_MQJMSTYPE");
    	setChannel("NO_CHANNEL");
    }
    
    
    /**
     * Execute transfer message to EAI by WebLogic
     * @param String instanceID
     * @return String
     * throws EAIException
     */
    public String commit( String instanceID) throws EAIException
    {
        QueueConnectionFactory qconFactory = null;
        QueueConnection qCon = null;
        QueueSession qSession = null;
        QueueSender qSender = null;
        Queue qu = null;
        TextMessage msg = null;

        // Start count by StopWatch
        StopWatch sw = new StopWatch();
        logger.debug("Asynchronous Jms-style Web Service Send STARTED("+DateFormat4Performance.getCurrentTimestampString() +")!");

        try{
    		
        	setIntegrationID(instanceID);

            // Factory lookup
            Properties prop = new Properties();
            prop.put(Context.INITIAL_CONTEXT_FACTORY, getINITIAL_CONTEXT_FACTORY() );
            prop.put(Context.PROVIDER_URL, getTarget());
            if( getUserId() != null && !getUserId().equals(""))
            {
            	prop.put(Context.SECURITY_PRINCIPAL, getUserId() );
            	prop.put(Context.SECURITY_CREDENTIALS, getUserPasswd() );
            }
            
            // Initial Context with Properties.
            Context ctx = new InitialContext(prop);
            qconFactory = (QueueConnectionFactory) ctx.lookup(getFactory());

            // Creation Connection 
            qCon = qconFactory.createQueueConnection();
            
            // Open session
            qSession = qCon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

            // queue lookup
            qu = (Queue) ctx.lookup(getQueue());

            // sender target queue.
            qSender = qSession.createSender(qu);
            
            //qSender.setTimeToLive(30000);

            //msg = qSession.createObjectMessage();
            msg = qSession.createTextMessage();

            qCon.start();

            // JMS Type is NULL;
            if( getDestination() == null ) 
                throw new Exception(" There is no jms type for connection (" + getDestination() + ")!");
            msg.setJMSType(getDestination());
            

            // If seted Object, use Object !
//            if( getObj() == null )
//            {
//                // Object is NULL;
//                if( getMessage() == null ) 
//                    throw new Exception(" There is no messages for connection !" );
//                msg.setText(getMessage());
//            } else {
//                // Object is not NULL;
//                if( getObj().toString().equals("") ) 
//                    throw new Exception(" There is no object messages for connection !");                
//                
//                logger.error("msg start=================================================================");
//                //msg.setText(docReq);
//                //msg.setText(getObj().toString());
//                logger.error("length : "+msg.getText().length());
//                logger.error("msg start=================================================================");
//                
//            }
            //chun 추가
            if( getMessage() == null || getMessage().toString().equals("") ) 
        	  throw new Exception(" There is no messages for connection !" );
          	
            msg.setText(getMessage());            
            
            qSender.send(msg);
            // Process Completed.   
            logger.debug("Asynchronous Jms-style Web Service Send SUCCESS(Elapsed:"+ 
        	    sw.getElapsed() +"/1000) !");
            
            super.setElapsedTime(sw.getElapsed());
            setObj(null);
            
           
        }
        catch (JMSException e) {
            super.setElapsedTime(sw.getElapsed());
            String eString = errorHead + getEaiInfo() + "\n JMSException" + e;
			setConnResult("CF(" + getElapsedTime() + ")");
			setResultMessage(eString);
            //logger.error( FrmCommon.makeLog4EaiSQL(this) );
            throw new EAIException( eString );
        } 
        catch (NamingException e) {
            super.setElapsedTime(sw.getElapsed());
            String eString = errorHead + getEaiInfo() + "\n NamingException" + e;
			setConnResult("CF(" + getElapsedTime() + ")");
			setResultMessage(eString);
            //logger.error( FrmCommon.makeLog4EaiSQL(this) );
            throw new EAIException( eString );
        }
        catch (Exception e) {
            super.setElapsedTime(sw.getElapsed());
		    String eString = errorHead + getEaiInfo() + "\n Exception" + e;
			setConnResult("CF(" + getElapsedTime() + ")");
			setResultMessage(eString);
            //logger.error( FrmCommon.makeLog4EaiSQL(this) );
            throw new EAIException( eString );        
        } 
        finally {
            super.setElapsedTime(sw.getElapsed());
            
            
            //qSender Close 
            if( qSender != null )
            {
        	try{
                    qSender.close();
                } catch (Exception e) {
                	
            	String eString = ">> JMS QueueConnection qSender Close Exception : " + e + 
        	    	":" + super.getEaiInfo();
                    // Log를 남긴다.
            	logger.error("qSender Exception 		:"+eString);
                throw new EAIException( eString );
                }
            }// qSender 
            
            if( qSession != null )
            {
                try{
                    qSession.close();
                } catch (Exception e) {
            	String eString = ">> JMS QueueConnection qSession Close Exception : " + e + 
        	    	":" + super.getEaiInfo();
            	logger.error("qSession Exception 		:"+eString);
                    throw new EAIException( eString );
                }
                
            }// qSession
            
            
            
            if( qCon != null )
            {
                try{
                    qCon.close();                    
                } catch (Exception e) {
                    String eString = ">> JMS QueueConnection Close Exception : " + e + 
        	    	":" + super.getEaiInfo();
                    logger.error("qCon Exception 		:"+eString);
                    throw new EAIException( eString );
                }
                // qSession Close 
                
            }// qCon
            
            logger.error("chun start=================================================================");
            
            if( qCon != null ){
            	logger.error("2 qCon 		:"+qCon);
            }
        	
            if( qSession != null ) {
            	logger.error("2 qSession 	:"+qSession);            	
            }
            
            if( qSender != null ) {
            	logger.error("2 qSender 	:"+qSender);            	
            }
            
            logger.error("chun end=================================================================");
            
        } 
		setConnResult("CT("+getElapsedTime()+")");
		setResultMessage("COMMIT");
		setMessage("");
		//logger.info( FrmCommon.makeLog4EaiSQL(this));
        return "SUCCESS";
    }

    /**
     * close
     */
	public void close()
	{
		setConnResult("CT("+getElapsedTime()+")");
		setResultMessage("CLOSE");
		setMessage("");
		//logger.info( FrmCommon.makeLog4EaiSQL(this));
	}

	/**
	 * rollback
	 * @param Exception e
	 */
	public void rollback(Exception e)
	{
	    String eString = errorHead + getEaiInfo() + "\n JMS Rollback Exception" + e.getMessage();
		setConnResult("RF("+getElapsedTime()+")");
		setResultMessage(eString);
		//logger.error( FrmCommon.makeLog4EaiSQL(this));
	}


	@Override
	public String getHeaderMessage() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getUsrHeaderMsg(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setHeaderMessage(String arg0) {
		// TODO Auto-generated method stub
		
	}
}
