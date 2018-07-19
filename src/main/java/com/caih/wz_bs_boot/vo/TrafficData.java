package com.caih.wz_bs_boot.vo;

import com.caih.wz_bs_boot.bo.TrafficUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

@ApiModel(value = "TrafficData", description = "TrafficData描述")
public class TrafficData {

	@ApiModelProperty(required = true, example = "TrafficUnit对象", value = "交通指标数据")
	private TrafficUnit trafficUnit;

	@ApiModelProperty(required = true, example = "时间：拥堵指数", value = "交通拥堵指数变换曲线")
	private Map<String,String> curveMinute;

	public TrafficUnit getTrafficUnit() {
		return trafficUnit;
	}

	public void setTrafficUnit(TrafficUnit trafficUnit) {
		this.trafficUnit = trafficUnit;
	}
	public Map<String, String> getCurveMinute() {
		return curveMinute;
	}
	public void setCurveMinute(Map<String, String> curveMinute) {
		this.curveMinute = curveMinute;
	}
	
}
