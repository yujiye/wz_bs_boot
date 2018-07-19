package com.caih.wz_bs_boot.controller;

import com.caih.wz_bs_boot.service.*;
import com.caih.wz_bs_boot.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/wz_ihome")
@Api(tags = "wz_ihome", description = "包含梧州大屏旅游、交通、养老、卫计委、政务等接口")
public class GetData {

    @Autowired
	IhomeService ihomeService;
    @Autowired
	TrafficService trafficService;
    @Autowired
	MedicalService medicalService;
    @Autowired
	TravelService travelService;
	@Autowired
	ApprovalService approvalService;

	@ApiOperation(value = "养老接口", notes = "养老接口方法说明")
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(value="/getIhomeData.action", method={RequestMethod.GET})
    @ResponseBody
    public IhomeShow getIhomeData(){
		return ihomeService.getShow();
	}

	@ApiOperation(value = "交通接口", notes = "交通接口方法说明")
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(value="/getTrafficData.action", method={RequestMethod.GET})
	@ResponseBody
	public TrafficShow getTrafficData(){
		return trafficService.getShow();
	}

	@ApiOperation(value = "卫计委接口", notes = "卫计委接口方法说明")
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(value="/getMedicalData.action", method={RequestMethod.GET})
	@ResponseBody
	public MedicalShow getMedicalData(){
		return medicalService.getShow();
	}

	@ApiOperation(value = "旅游接口", notes = "旅游接口方法说明")
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(value="/getTravelData.action", method={RequestMethod.GET})
	@ResponseBody
	public TravelShow getTravelData(){
		return travelService.getShow();
	}

	@ApiOperation(value = "政务接口", notes = "政务接口方法说明")
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping(value="/getApprovalData.action", method={RequestMethod.GET})
	@ResponseBody
	public ApprovalShow getApprovalData(){
		return approvalService.getShow();
	}
}
