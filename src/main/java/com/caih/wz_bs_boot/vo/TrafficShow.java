package com.caih.wz_bs_boot.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "TrafficShow", description = "TrafficShow描述")
public class TrafficShow {

	@ApiModelProperty(required = true, example = "success", value = "success表示成功，failed表示失败")
	private String status;

	@ApiModelProperty(required = true, example = "TrafficData对象", value = "TrafficData对象列表")
	private TrafficData data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TrafficData getData() {
		return data;
	}
	public void setData(TrafficData data) {
		this.data = data;
	}
	
}
