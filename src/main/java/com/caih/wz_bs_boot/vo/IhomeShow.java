package com.caih.wz_bs_boot.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "IhomeShow", description = "IhomeShow描述")
public class IhomeShow {
	@ApiModelProperty(required = true, example = "success", value = "success表示成功，failed表示失败")
	private String status;
	@ApiModelProperty(required = true, example = "IhomeData对象", value = "IhomeData对象列表")
	private IhomeData data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public IhomeData getData() {
		return data;
	}
	public void setData(IhomeData data) {
		this.data = data;
	}
	
}
