package cn.nullah.newborn.model.http;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import cn.nullah.newborn.model.common.SecurityInfo;

import com.alibaba.fastjson.JSONObject;

public class OpenSvcReqText extends SecurityInfo implements Serializable {
	private static final long serialVersionUID = 4352462893470757150L;
	public static final Integer ENCRYP_TYPE_MD5 = Integer.valueOf(1);
	public static final Integer ENCRYP_TYPE_NO = Integer.valueOf(0);

	@NotNull
	private Long reqId;

	private long custCode;

	private int svcId;

	private JSONObject data;

	public Long getReqId() {
		return reqId;
	}

	public void setReqId(Long reqId) {
		this.reqId = reqId;
	}

	public int getSvcId() {
		return svcId;
	}

	public void setSvcId(int svcId) {
		this.svcId = svcId;
	}

	public JSONObject getData() {
		return data;
	}

	public void setData(JSONObject data) {
		this.data = data;
	}

	public Long getCustCode() {
		return custCode;
	}

	public void setCustCode(Long custCode) {
		this.custCode = custCode;
	}

}
