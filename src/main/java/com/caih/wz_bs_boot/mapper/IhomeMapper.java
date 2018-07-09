package com.caih.wz_bs_boot.mapper;

import com.caih.wz_bs_boot.po.IhomeRecord;

import java.util.List;

public interface IhomeMapper {

	List<IhomeRecord> findNew();
	List<IhomeRecord> findNewById(String id);
}
