package com.caih.wz_bs_boot.vo;

import com.caih.wz_bs_boot.bo.IhomeBaseUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;
import java.util.Map;

@ApiModel(value = "IhomeData", description = "IhomeData描述")
public class IhomeData {
	@ApiModelProperty(required = true, example = "50000", value = "总服务数")
	private String currentServiceNum;

	@ApiModelProperty(required = true, example = "30000", value = "线上服务数")
	private String onlineServiceNum;

	@ApiModelProperty(required = true, example = "20000", value = "下线服务数")
	private String offlineServiceNum;

	@ApiModelProperty(required = true, example = "97%", value = "满意率")
	private String satisfactionRate;

	@ApiModelProperty(required = true, example = "success", value = "月服务总数")
	private String serviceTotalNumMonth;

	@ApiModelProperty(required = true, example = "success", value = "月服务次数")
	private Map<String,String> serviceNumMonth;

	@ApiModelProperty(required = true, example = "success", value = "月服务时长")
	private Map<String,String> serviceTimeMonth;

//	private IhomeServicePurchase servicePurchase;
//	private IhomeMerchantType merchantType;
//	private IhomeUserNum userNum;
//	private IhomeIll ill;

	@ApiModelProperty(required = true, example = "success", value = "政府购买服务")
	private List<IhomeBaseUnit> servicePurchase;

	@ApiModelProperty(required = true, example = "success", value = "商家类型")
	private List<IhomeBaseUnit> merchantType;

	@ApiModelProperty(required = true, example = "success", value = "用户数量")
	private List<IhomeBaseUnit> userNum;

	@ApiModelProperty(required = true, example = "success", value = "病情分布")
	private List<IhomeBaseUnit> ill;

	public String getCurrentServiceNum() {
		return currentServiceNum;
	}
	public void setCurrentServiceNum(String currentServiceNum) {
		this.currentServiceNum = currentServiceNum;
	}
	public String getOnlineServiceNum() {
		return onlineServiceNum;
	}
	public void setOnlineServiceNum(String onlineServiceNum) {
		this.onlineServiceNum = onlineServiceNum;
	}
	public String getOfflineServiceNum() {
		return offlineServiceNum;
	}
	public void setOfflineServiceNum(String offlineServiceNum) {
		this.offlineServiceNum = offlineServiceNum;
	}
	public String getSatisfactionRate() {
		return satisfactionRate;
	}
	public void setSatisfactionRate(String satisfactionRate) {
		this.satisfactionRate = satisfactionRate;
	}
	public String getServiceTotalNumMonth() {
		return serviceTotalNumMonth;
	}
	public void setServiceTotalNumMonth(String serviceTotalNumMonth) {
		this.serviceTotalNumMonth = serviceTotalNumMonth;
	}
	public Map<String, String> getServiceNumMonth() {
		return serviceNumMonth;
	}
	public void setServiceNumMonth(Map<String, String> serviceNumMonth) {
		this.serviceNumMonth = serviceNumMonth;
	}
	public Map<String, String> getServiceTimeMonth() {
		return serviceTimeMonth;
	}
	public void setServiceTimeMonth(Map<String, String> serviceTimeMonth) {
		this.serviceTimeMonth = serviceTimeMonth;
	}

	public List<IhomeBaseUnit> getServicePurchase() {
		return servicePurchase;
	}

	public void setServicePurchase(List<IhomeBaseUnit> servicePurchase) {
		this.servicePurchase = servicePurchase;
	}

	public List<IhomeBaseUnit> getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(List<IhomeBaseUnit> merchantType) {
		this.merchantType = merchantType;
	}

	public List<IhomeBaseUnit> getUserNum() {
		return userNum;
	}

	public void setUserNum(List<IhomeBaseUnit> userNum) {
		this.userNum = userNum;
	}

	public List<IhomeBaseUnit> getIll() {
		return ill;
	}

	public void setIll(List<IhomeBaseUnit> ill) {
		this.ill = ill;
	}
}
