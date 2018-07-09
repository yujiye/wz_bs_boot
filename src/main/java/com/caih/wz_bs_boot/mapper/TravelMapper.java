package com.caih.wz_bs_boot.mapper;

import com.caih.wz_bs_boot.po.TravelRecord;

import java.util.List;

public interface TravelMapper {
	public List<TravelRecord> findVehicle();
	public List<TravelRecord> findTouristSource();
	public List<TravelRecord> findStayTime();
	public List<TravelRecord> findTouristFolwHours();
	public List<TravelRecord> findTouristFolwHoursbak(int nDay);
	public List<TravelRecord> findTouristFolwHoursYesterday();
	public List<TravelRecord> findConsumption();
	public List<TravelRecord> findAppType();
	public List<TravelRecord> findtouristFlowDate();
	public List<TravelRecord> findtouristFlowWeek();
	public List<TravelRecord> findtouristFlowMonth();
}
