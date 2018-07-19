package com.caih.wz_bs_boot.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "MedicalShow", description = "MedicalShow描述")
public class MedicalShow {

	@ApiModelProperty(required = true, example = "success", value = "success表示成功，failed表示失败")
	private String status;

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "MedicalData对象")
	private MedicalData data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public MedicalData getData() {
		return data;
	}
	public void setData(MedicalData data) {
		this.data = data;
	}
	
}
