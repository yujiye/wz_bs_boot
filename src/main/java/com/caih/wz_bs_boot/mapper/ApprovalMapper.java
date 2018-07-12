package com.caih.wz_bs_boot.mapper;

import com.caih.wz_bs_boot.po.ApprovalRecord;

import java.util.List;

public interface ApprovalMapper {
    List<ApprovalRecord> findNew();
    ApprovalRecord findNewByKeyword(String keyword);
}
