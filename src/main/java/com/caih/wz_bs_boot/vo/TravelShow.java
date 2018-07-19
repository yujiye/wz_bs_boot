package com.caih.wz_bs_boot.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "TravelShow", description = "TravelShow描述")
public class TravelShow {

	@ApiModelProperty(required = true, example = "success", value = "success表示成功，failed表示失败")
	private String status;

	@ApiModelProperty(required = true, example = "TravelData对象", value = "TravelData对象列表")
	private TravelData data;

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TravelData getData() {
		return data;
	}
	public void setData(TravelData data) {
		this.data = data;
	}
	
}
