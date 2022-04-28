/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : NPI
*@FileName       : CryptUtill.java
*@FileTitle      : Synapse(SoftwareFramework)
*Open Issues     :
*Change history  :
*@LastModifyDate : 2014.10.28
*@LastModifier   : SW, Jean
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.log4j.Logger;

import com.clt.framework.component.util.EncodeUtils;
import com.clt.framework.core.config.SiteConfigFactory;

/**
 * 
 * CryptUtil.java
 * 
 * @author SW, Jean
 * @see
 * @since J2SE 1.6 2014.10.28
 */
public class CryptUtil {

	private static String myKey = "OPUS_YNK_04^";
	private static Logger log = Logger.getLogger(CryptUtil.class);

	/**
	 * @Method Name : doAuthenticateh pass워드 비교
	 * @param pwdFromDb
	 *            DB의 Password
	 * @param pwdFromClient
	 *            Client 의 Password
	 * @return
	 */

	public static boolean checkPassword(String pwdFromDb, String pwdFromClient) {
		boolean returnVal = false;
		String encryptionAlgorithm = "";

		try {

			if (!"NULL".equals(SiteConfigFactory.get("COM.CLT.PASSWORD.ENCRYPTION.ALGORITHM", "NULL")))
				encryptionAlgorithm = SiteConfigFactory.get("COM.CLT.PASSWORD.ENCRYPTION.ALGORITHM", "NULL");

			else if ("SHA256".equals(encryptionAlgorithm))
				// SHA256 으로 인코딩한다.
				pwdFromClient = EncodeUtils.encodeSHA256(pwdFromClient);
			else if ("SYMMETRIC".equals(encryptionAlgorithm))
				pwdFromDb = decryptString(pwdFromDb);

			else if ("SSHA".equals(encryptionAlgorithm))
				pwdFromClient = encodeSSHA(pwdFromClient);

			if (pwdFromDb.equals(pwdFromClient))
				returnVal = true;

		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return returnVal;
	}

	/**
	 * 
	 * 암호화할 데이터를 입력받고 암호화한 문자열을 반환
	 * 
	 * @author SW, Jean
	 * @param to_encrypt
	 * @return String
	 */
	public static String encryptString(String to_encrypt) {
		byte[] encrypted;
		String encryptionAlgorithm = "";
		String returnVal = to_encrypt;

		try {

			if (!"NULL".equals(SiteConfigFactory.get("COM.CLT.PASSWORD.ENCRYPTION.ALGORITHM", "NULL")))
				encryptionAlgorithm = SiteConfigFactory.get("COM.CLT.PASSWORD.ENCRYPTION.ALGORITHM", "NULL");

			else if ("SYMMETRIC".equals(encryptionAlgorithm)) {

				byte[] keyData = myKey.getBytes();
				SecretKeySpec KS = new SecretKeySpec(keyData, "Blowfish");
				Cipher cipher = Cipher.getInstance("Blowfish");
				cipher.init(Cipher.ENCRYPT_MODE, KS);
				encrypted = cipher.doFinal(to_encrypt.getBytes());
				returnVal = bytesToHex(encrypted);

			} else if ("SHA256".equals(encryptionAlgorithm)) {

				returnVal = EncodeUtils.encodeSHA256(to_encrypt);

			} else if ("SSHA".equals(encryptionAlgorithm)) {

				returnVal = encodeSSHA(to_encrypt);

			}

		} catch (Exception e) {
			log.error(e.getMessage());
			return to_encrypt;
		}
		return returnVal;
	}

	/**
	 * 
	 * 인코딩된 문자열을 입력받고 복호화해서 원 문자열을 반환 encodeSSHA
	 * 
	 * @author SW, Jean
	 * @param to_encrypt
	 * @return String
	 */
	public static String encodeSSHA(String to_encrypt) {
		String returnVal = "";

		try {

		} catch (Exception e) {
			log.error(e.getMessage());
			return to_encrypt;
		}
		return returnVal;
	}

	/**
	 * 
	 * 인코딩된 문자열을 입력받고 복호화해서 원 문자열을 반환 decryptString
	 * 
	 * @author SW, Jean
	 * @param to_decrypt
	 * @return String
	 */
	public static String decryptString(String to_decrypt) {
		String returnVal = "";

		try {

			byte[] decrypted = null;
			byte[] keyData = myKey.getBytes();
			byte[] decData = hexToBytes(to_decrypt);
			SecretKeySpec KS = new SecretKeySpec(keyData, "Blowfish");
			Cipher cipher = Cipher.getInstance("Blowfish");
			cipher.init(Cipher.DECRYPT_MODE, KS);
			decrypted = cipher.doFinal(decData);

			returnVal = new String(decrypted);

		} catch (Exception e) {
			log.error(e.getMessage());
			return to_decrypt;
		}
		return returnVal;
	}

	/**
	 * 
	 * 문자열의 각 글자들의 ascii 값으로 byte 배열로 hexToBytes
	 * 
	 * @author SW, Jean
	 * @param str
	 * @return byte[]
	 */
	private static byte[] hexToBytes(String str) {
		if (str == null) {
			return null;
		} else if (str.length() < 2) {
			return null;
		} else {
			int len = str.length() / 2;
			byte[] buffer = new byte[len];
			for (int i = 0; i < len; i++) {
				buffer[i] = (byte) Integer.parseInt(str.substring(i * 2, i * 2 + 2), 16);
			}
			return buffer;
		}

	}

	/**
	 * 배열의 각각의 값을 해당하는 ascii 문자로 변환해서 문자열로 반환
	 * bytesToHex
	 * @author SW, Jean
	 * @param data
	 * @return String
	 */
	private static String bytesToHex(byte[] data) {
		if (data == null) {
			return null;
		} else {
			int len = data.length;
			String str = "";
			for (int i = 0; i < len; i++) {
				if ((data[i] & 0xFF) < 16)
					str = str + "0" + java.lang.Integer.toHexString(data[i] & 0xFF);
				else
					str = str + java.lang.Integer.toHexString(data[i] & 0xFF);
			}
			return str.toUpperCase();
		}
	}

}
