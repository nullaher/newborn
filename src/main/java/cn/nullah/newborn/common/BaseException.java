package cn.nullah.newborn.common;

import org.apache.commons.lang3.StringUtils;

public class BaseException extends RuntimeException {
	private static final long serialVersionUID = -2086673821015768041L;
	private String code;

	public BaseException(String code) {
		super(getCodeMsg(code));
		this.code = code;
	}

	public BaseException(String code, Throwable cause) {
		super(getCodeMsg(code), cause);
	}

	private static String getCodeMsg(String code) {
		return StringUtils.isNoneEmpty(code) ? "" + code : code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
