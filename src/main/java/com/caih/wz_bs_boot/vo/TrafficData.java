package com.caih.wz_bs_boot.vo;

import com.caih.wz_bs_boot.bo.TrafficUnit;

import java.util.Map;

public class TrafficData {

	private TrafficUnit trafficUnit;
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
