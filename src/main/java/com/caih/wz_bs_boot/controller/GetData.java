package com.caih.wz_bs_boot.controller;

import com.caih.wz_bs_boot.service.*;
import com.caih.wz_bs_boot.vo.*;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/wz_ihome")
@Api(tags = "DemoController", description = "DemoController描述")
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

	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getIhomeData.action")
    @ResponseBody
    public IhomeShow getIhomeData(){
		return ihomeService.getShow();
	}
	
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getTrafficData.action")
	@ResponseBody
	public TrafficShow getTrafficData(){
		return trafficService.getShow();
	}
	
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getMedicalData.action")
	@ResponseBody
	public MedicalShow getMedicalData(){
		return medicalService.getShow();
	}
	
	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getTravelData.action")
	@ResponseBody
	public TravelShow getTravelData(){
		return travelService.getShow();
	}

	@CrossOrigin(origins={"*"}, methods={RequestMethod.GET, RequestMethod.POST})
	@RequestMapping("/getApprovalData.action")
	@ResponseBody
	public ApprovalShow getApprovalData(){
		return approvalService.getShow();
	}
}
