package cn.nullah.newborn.model.common;

import java.io.Serializable;

public class SecurityInfo implements Serializable {

	private static final long serialVersionUID = -1592372908859141810L;

	public static final Integer ENCRYP_TYPE_MD5 = Integer.valueOf(1);
	public static final Integer ENCRYP_TYPE_NO = Integer.valueOf(0);

	private int encrypType;
	
	private String fingerprint;

	public int getEncrypType() {
		return encrypType;
	}

	public void setEncrypType(int encrypType) {
		this.encrypType = encrypType;
	}

	public String getFingerprint() {
		return fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

}
