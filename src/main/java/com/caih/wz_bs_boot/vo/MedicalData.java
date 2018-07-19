package com.caih.wz_bs_boot.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "MedicalShow", description = "MedicalShow描述")
public class MedicalData {

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "当前已接入机构")
	private String orgNum;

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "当前已接入机构（市级）")
	private String orgNumCity;

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "当前已接入机构（县级）")
	private String orgNumCounty;

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "当前已接入机构（社区）")
	private String orgNumCommunity;

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "健康卡数量（无数据）")
	private String healthCardNum;//无接口

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "今日累计预约量")
	private String dateResNum;

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "健康档案查询量")
	private String healthRecordNum;

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "家庭医生签约量")
	private String hcpSignedNum;

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "平台访问量（无数据）")
	private String visitorNum;//无接口

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "日访问量（无数据）")
	private String datevisitorNum;//无接口

	@ApiModelProperty(required = true, example = "MedicalData对象", value = "日预约量（无数据）")
	private String appointmentNum;//无接口
	public String getOrgNum() {
		return orgNum;
	}
	public void setOrgNum(String orgNum) {
		this.orgNum = orgNum;
	}
	public String getOrgNumCity() {
		return orgNumCity;
	}
	public void setOrgNumCity(String orgNumCity) {
		this.orgNumCity = orgNumCity;
	}
	public String getOrgNumCounty() {
		return orgNumCounty;
	}
	public void setOrgNumCounty(String orgNumCounty) {
		this.orgNumCounty = orgNumCounty;
	}
	public String getOrgNumCommunity() {
		return orgNumCommunity;
	}
	public void setOrgNumCommunity(String orgNumCommunity) {
		this.orgNumCommunity = orgNumCommunity;
	}
	public String getHealthCardNum() {
		return healthCardNum;
	}
	public void setHealthCardNum(String healthCardNum) {
		this.healthCardNum = healthCardNum;
	}
	public String getDateResNum() {
		return dateResNum;
	}
	public void setDateResNum(String dateResNum) {
		this.dateResNum = dateResNum;
	}
	public String getHealthRecordNum() {
		return healthRecordNum;
	}
	public void setHealthRecordNum(String healthRecordNum) {
		this.healthRecordNum = healthRecordNum;
	}
	public String getHcpSignedNum() {
		return hcpSignedNum;
	}
	public void setHcpSignedNum(String hcpSignedNum) {
		this.hcpSignedNum = hcpSignedNum;
	}
	public String getVisitorNum() {
		return visitorNum;
	}
	public void setVisitorNum(String visitorNum) {
		this.visitorNum = visitorNum;
	}
	public String getDatevisitorNum() {
		return datevisitorNum;
	}
	public void setDatevisitorNum(String datevisitorNum) {
		this.datevisitorNum = datevisitorNum;
	}
	public String getAppointmentNum() {
		return appointmentNum;
	}
	public void setAppointmentNum(String appointmentNum) {
		this.appointmentNum = appointmentNum;
	}
	
	
}
