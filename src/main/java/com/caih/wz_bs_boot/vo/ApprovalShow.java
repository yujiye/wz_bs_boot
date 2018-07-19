package com.caih.wz_bs_boot.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ApprovalShow", description = "ApprovalShow描述")
public class ApprovalShow {

    @ApiModelProperty(required = true, example = "success", value = "success表示成功，failed表示失败")
    private String status;

    @ApiModelProperty(required = true, example = "ApprovalData对象", value = "ApprovalData对象")
    private ApprovalData data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApprovalData getData() {
        return data;
    }

    public void setData(ApprovalData data) {
        this.data = data;
    }
}
