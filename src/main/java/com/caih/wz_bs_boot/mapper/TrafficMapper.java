package com.caih.wz_bs_boot.mapper;

import com.caih.wz_bs_boot.po.CurveRecord;
import com.caih.wz_bs_boot.po.TrafficIndexRecord;
import com.caih.wz_bs_boot.po.TrafficRecord;

import java.util.List;

public interface TrafficMapper {

	TrafficRecord findNewOne();
	TrafficIndexRecord findIndexNewOne();
	List<CurveRecord> findCurve();
}
