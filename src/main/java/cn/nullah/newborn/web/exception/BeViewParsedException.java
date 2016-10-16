package cn.nullah.newborn.web.exception;

import com.alibaba.fastjson.JSONObject;

import cn.nullah.newborn.common.BaseException;

public class BeViewParsedException extends BaseException {
	private static final long serialVersionUID = 4454790359703883232L;
	private int type;
	private String action;
	private JSONObject data;

	public BeViewParsedException(String code) {
		super(code);
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public JSONObject getData() {
		return data;
	}

	public void setData(JSONObject data) {
		this.data = data;
	}

}
