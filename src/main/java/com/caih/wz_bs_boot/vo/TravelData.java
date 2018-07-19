package com.caih.wz_bs_boot.vo;

import com.caih.wz_bs_boot.bo.TravelBaseUnit;
import com.caih.wz_bs_boot.bo.TravelTouristUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "TravelData", description = "TravelData描述")
public class TravelData {

	@ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "景点人次")
	private List<TravelTouristUnit> touristNum;//景点人次

	@ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "游客来源")
	private List<TravelBaseUnit> touristSource;//游客来源

	@ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "交通工具")
	private List<TravelBaseUnit> touristVehicle;//交通工具

	@ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "游客APP")
	private List<TravelBaseUnit> touristApp;//游客APP

	@ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "消费能力")
	private List<TravelBaseUnit> consumption;//消费能力

	@ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "逗留时长")
	private List<TravelBaseUnit> stayTime;//逗留时长

	@ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "日客流量")
	private List<TravelBaseUnit> touristFlowDate;//日客流量

	@ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "周客流量")
	private List<TravelBaseUnit> touristFlowWeek;//周客流量

	@ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "月客流量")
	private List<TravelBaseUnit> touristFlowMonth;//月客流量
	
	public List<TravelTouristUnit> getTouristNum() {
		return touristNum;
	}
	public void setTouristNum(List<TravelTouristUnit> touristNum) {
		this.touristNum = touristNum;
	}
	public List<TravelBaseUnit> getTouristSource() {
		return touristSource;
	}
	public void setTouristSource(List<TravelBaseUnit> touristSource) {
		this.touristSource = touristSource;
	}
	public List<TravelBaseUnit> getTouristVehicle() {
		return touristVehicle;
	}
	public void setTouristVehicle(List<TravelBaseUnit> touristVehicle) {
		this.touristVehicle = touristVehicle;
	}
	public List<TravelBaseUnit> getTouristApp() {
		return touristApp;
	}
	public void setTouristApp(List<TravelBaseUnit> touristApp) {
		this.touristApp = touristApp;
	}
	public List<TravelBaseUnit> getConsumption() {
		return consumption;
	}
	public void setConsumption(List<TravelBaseUnit> consumption) {
		this.consumption = consumption;
	}
	public List<TravelBaseUnit> getStayTime() {
		return stayTime;
	}
	public void setStayTime(List<TravelBaseUnit> stayTime) {
		this.stayTime = stayTime;
	}
	public List<TravelBaseUnit> getTouristFlowDate() {
		return touristFlowDate;
	}
	public void setTouristFlowDate(List<TravelBaseUnit> touristFlowDate) {
		this.touristFlowDate = touristFlowDate;
	}
	public List<TravelBaseUnit> getTouristFlowWeek() {
		return touristFlowWeek;
	}
	public void setTouristFlowWeek(List<TravelBaseUnit> touristFlowWeek) {
		this.touristFlowWeek = touristFlowWeek;
	}
	public List<TravelBaseUnit> getTouristFlowMonth() {
		return touristFlowMonth;
	}
	public void setTouristFlowMonth(List<TravelBaseUnit> touristFlowMonth) {
		this.touristFlowMonth = touristFlowMonth;
	}

	
}
