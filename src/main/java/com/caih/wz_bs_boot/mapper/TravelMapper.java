package com.caih.wz_bs_boot.mapper;

import com.caih.wz_bs_boot.po.TravelRecord;

import java.util.List;

public interface TravelMapper {
	List<TravelRecord> findVehicle();
	List<TravelRecord> findTouristSource();
	List<TravelRecord> findStayTime();
	List<TravelRecord> findTouristFlowHours(int nDay);
	List<TravelRecord> findConsumption();
	List<TravelRecord> findAppType();
	List<TravelRecord> findtouristFlowDate();
	List<TravelRecord> findtouristFlowWeek();
	List<TravelRecord> findtouristFlowMonth();
}
