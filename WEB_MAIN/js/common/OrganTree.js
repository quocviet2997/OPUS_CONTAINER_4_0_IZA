
    var returnFunction = '';
    var personDisplay = false;
    function initTree(treeDivID, rFunction, pDisplay) {
		favoriteGen.Tree = document.getElementById(treeDivID);
		favoriteGen.setDoc(UpdateOrganTree());
		favoriteGen.generateXML("clt");
		returnFunction = rFunction;
		if ( pDisplay != null ) personDisplay = pDisplay;
    }
    
    function changeCompany(treeDivID, comCode) {
    	document.getElementById(treeDivID).innerHTML='';
    	favoriteGen.generateXML(comCode);
    }

	var trides = new ActiveXObject("Ez3DES.TriDES");
    var XMLConst =
    {
        ELEMENT_NODE                    :1,
        ATTRIBUTE_NODE                    :2,
        TEXT_NODE                        :3,
        CDATA_SECTION_NODE                :4,
        ENTITY_REFERENCE_NODE            :5,
        ENTITY_NODE                        :6,
        PROCESSING_INSTRUCTION_NODE        :7,
        COMMENT_NODE                    :8,
        DOCUMENT_NODE                    :9,
        DOCUMENT_TYPE_NODE                :10,
        DOCUMENT_FRAGMENT_NODE            :11,
        NOTATION_NODE                    :12
    }
    var favoriteGen =
    {
        xmlDoc            : null,
        Tree    : null,

        setDoc : function(doc)
        {
        	if(doc == null) alert('Complete');
        	else xmlDoc = doc;
        },
        getDoc : function()
        {
        	if(xmlDoc == null) alert('Please Complete to install of Groupware!');
        	else return xmlDoc;
        },
        generateXML : function(cn)
        {
            if(xmlDoc != null)
            {
                if(xmlDoc.hasChildNodes())
                {
                    var xChildNodes = "";
                    var xNodes = "";
                    
                    if(document.all)
                        xChildNodes = xmlDoc.childNodes[1].childNodes[0].childNodes;
                    else
                        xChildNodes = xmlDoc.childNodes[0].childNodes[0].childNodes;

                    for(var i=0 ; i < xChildNodes.length ; i++)
                        if ( getAttribute(xChildNodes[i], "CN") == cn )
                     	   xNodes = xChildNodes[i].childNodes;

                    for(var i=0 ; i < xNodes.length ; i++)
                    {
                        var node = xNodes[i];
                        
                        if(node.nodeType == XMLConst.ELEMENT_NODE)
                        {
                            var title = getAttribute(node,"NAME");
                             
                            if(node.nodeName == "DEPT")
                            {
                                // recursive
                                var folderNode = getFolder("true",title, node.xml);
                                favoriteGen.Tree.appendChild(folderNode);

                               // favoriteGen.generateXML_R(node,folderNode);
                            }
                            else
                            {
                            	if ( personDisplay ) favoriteGen.Tree.appendChild(getDoc(node));
                            	else favoriteGen.Tree.appendChild(getDocData(node));
                            }
                        }
                    }
                }
            }
        },
        generateXML_R : function(pNode,pAppendNode)
        {
            if(pNode.hasChildNodes())
            {
                var xChildNodes = pNode.childNodes;

                for(var i=0 ; i < xChildNodes.length ; i++)
                {
                    var node = xChildNodes[i];
                    
                    if(node.nodeType == XMLConst.ELEMENT_NODE)
                    {
                        var title = getAttribute(node,"NAME");
                        
                        if(node.nodeName == "DEPT")
                        {
                            // recursive
                            var folderNode = getFolder("false",title, node.xml);
                            pAppendNode.appendChild(folderNode);

                            // favoriteGen.generateXML_R(node,folderNode);
                        }
                        else
                        {
                        	if ( personDisplay ) pAppendNode.appendChild(getDoc(node));
                        	else pAppendNode.appendChild(getDocData(node));
                        }
                    }
                }
            }
        }
    };
    function getFolder(pIsOpen,pText, xml)
    {
        var div                 = document.createElement("div");
        
        var isOpenAtt            = document.createAttribute("isOpen");
        isOpenAtt.value            = "false";
        
        var classNameAtt        = document.createAttribute("class");
        classNameAtt.value        = ((pIsOpen=="true")?"folder_node_visible":"folder_node_hidden");

        var nodeAtt            = document.createAttribute("xml");
        nodeAtt.value            = xml;

        var isLoadAtt            = document.createAttribute("isLoad");
        isLoadAtt.value            = "false";
        
        div.setAttributeNode(isOpenAtt);
        div.setAttributeNode(classNameAtt);
        div.setAttributeNode(nodeAtt);
        div.setAttributeNode(isLoadAtt);
        
        var spanHTML            = "<span class=\"folder_closed\" onClick=\"setOpen(this);\">" + pText + "</span>";
        
        div.innerHTML = spanHTML;

        return div;
    }
    function getDoc(node)
    {
        var div                 = document.createElement("div");
        
        var classNameAtt        = document.createAttribute("class");
        classNameAtt.value        = "doc_node_visible";

        var nodeAtt            = document.createAttribute("xml");
        nodeAtt.value            = node.xml;
       
        div.setAttributeNode(classNameAtt);
        div.setAttributeNode(nodeAtt);
        
        var spanHTML            = "<span onClick=\"setData(this);\">" + getAttribute(node,"NAME") + "</span>";
        
        div.innerHTML = spanHTML;
        return div;
    }
    function getDocData(node)
    {
        var div                 = document.createElement("div");
        var classNameAtt        = document.createAttribute("class");
        classNameAtt.value        = "doc_node_hidden";
        div.setAttributeNode(classNameAtt);

        var nodeAtt = document.createAttribute("xml");
        nodeAtt.value = node.xml;
        div.setAttributeNode(nodeAtt);

        return div;
    }
    function setData(pObj) {
    	//alert(getAttribute(pObj.parentNode,"xml"));
    	eval(returnFunction)(new Array(xml2map(getAttribute(pObj.parentNode,"xml"))));
    }
    function setOpen(pObj)
    {
        var folderNode = pObj.parentNode;
        var isOpen = getAttribute(folderNode,"isOpen");
        var isLoad = getAttribute(folderNode,"isLoad");
        var xml = getAttribute(folderNode,"xml");
        var personArray = new Array();
        
        if (isLoad == "false") {
	        var doc = new ActiveXObject("Microsoft.XMLDOM");
	        doc.async="false";
	        doc.loadXML(xml);
	        favoriteGen.generateXML_R(doc.childNodes[0], folderNode);
	        setAttribute(folderNode,"isLoad","true");
        }
        
        if(folderNode.hasChildNodes())
        {
            var xChildNodes = folderNode.childNodes;
            var idx = 0;

            for(var i=0 ; i < xChildNodes.length ; i++)
            {
                var node = xChildNodes[i];
                
                if(node.nodeType == XMLConst.ELEMENT_NODE)
                {
                    if(node.nodeName == "DIV")
                    {
                    	var className = getAttribute(node,"class");
                        if(className.substr(0,3) == "doc")
                        {
                        	personArray[idx++] = xml2map(node.xml);
                        	if (personDisplay) {
	                            if(isOpen == "true") setAttribute(node,"class","doc_node_hidden");
	                            else setAttribute(node,"class","doc_node_visible");
                        	}
                        } else {
                            if(isOpen == "true") setAttribute(node,"class","folder_node_hidden");
                            else setAttribute(node,"class","folder_node_visible");
                        }
                    }
                }
            }
            if ( !personDisplay ) eval(returnFunction)(personArray);
        }
        setAttribute(pObj,"class",(isOpen=="true" ? "folder_closed" : "folder_open"));
        setAttribute(folderNode,"isOpen",(isOpen=="true" ? "false" : "true"));
    }

    function getAttribute(pNode,pAttributeName)
    {
        var attributes = pNode.attributes;

        var attNode = attributes.getNamedItem(pAttributeName);

        return attNode != null ? attNode.nodeValue: null;
    }
    function setAttribute(pNode,pAttributeName,pValue)
    {
        var attributes = pNode.attributes;

        var attNode = attributes.getNamedItem(pAttributeName);

        if(attNode != null)
            attNode.value = pValue;
    }

    /* -- 조직도 업데이트 -- */

    function UpdateOrganTree()
    {
    	try
    	{
              var sDomain = null;
       //debugger;
    			
    		var util = new ActiveXObject("ezOrganCtrl.Util");
    		if (sDomain == null)
    			// sDomain = document.location.protocol + "//" +
				// document.location.hostname;
    			sDomain = "http://gw.opus.com";
                            

    		// -1 = reflesh(update all)
    		// 0 = always update
    		// 1 = every day update
    		// 2 = every hour update
    		// 3 = every minute update
    		// alert(document.location.protocol + "//" +
			// document.location.hostname + " ^^ " + sDomain);
    		util.UpdateOrganTree(sDomain, 0);

        	return util.LoadOrganTree();
    		// util.UpdateOrganTree("http://gw.opus.com",0);

    		// return util.LoadOrganTree();
    	}
    	catch (e)
    	{
    		ComShowMessage(e);
    	}
    }
    
    function xml2map(xml) {
    	var map = new HashMap();
    	var doc = new ActiveXObject("Microsoft.XMLDom");
    	doc.loadXML("<DATA>"+xml+"</DATA>");
    	var node = doc.selectSingleNode("//PERSON");
    	map.put("TEAMNM", getAttribute(node, "TEAMNM"));
    	map.put("NAME", getAttribute(node, "NAME"));
    	map.put("MAIL", trides.Decrypt("", getAttribute(node,"MAIL")));
    	map.put("PHONE",trides.Decrypt("", getAttribute(node,"PHONE")));
    	map.put("CN", getAttribute(node, "CN"));
    	map.put("LNAME", getAttribute(node, "LNAME"));
    	map.put("POS", getAttribute(node, "POS"));
    	map.put("JOB", getAttribute(node, "JOB"));
    	map.put("JCODE", getAttribute(node, "JCODE"));
    	map.put("TEAM", getAttribute(node, "TEAM"));
    	map.put("INITNM", getAttribute(node, "INITNM"));
    	map.put("BUJAE", getAttribute(node, "BUJAE"));
    	map.put("SIP", trides.Decrypt("", getAttribute(node,"SIP")));
    	return map;
    }
    
    function findXML(attr, val)
    {
    	var xpath = "";
    	var nodelist;
    	var personArray = new Array();
    	if ( attr == "NAME" ) xpath = "//PERSON[contains(@NAME,'"+val+"') or contains(@LNAME,'"+val+"')]";
    	else xpath = "//PERSON[contains(@"+attr+",'"+val+"')]";
    	nodelist = favoriteGen.getDoc().selectNodes(xpath);
        for(var i=0 ; i < nodelist.length ; i++) {
        	var node = nodelist[i];
        	personArray[i] = xml2map(node.xml);
        }
        eval(returnFunction)(personArray);
    }
