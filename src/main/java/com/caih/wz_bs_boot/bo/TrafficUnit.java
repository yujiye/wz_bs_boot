package com.caih.wz_bs_boot.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "TrafficUnit", description = "TrafficUnit描述")
public class TrafficUnit {
    @ApiModelProperty(required = true, example = "1.5", value = "实时拥堵指数")
    private String current_index;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "指数波动")
    private String week_rate;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "高速/快速路道路拥堵指数")
    private String highway_index;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "主干道路道路拥堵指数")
    private String general_way_index;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "高速/快速路道路平均速度")
    private String highway_speed;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "主干路平均速度")
    private String general_way_speed;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "高速/快速路指数波动")
    private String highway_week_rate;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "主干路指数波动")
    private String general_way_week_rate;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "实时缓行里程")
    private String slowly;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "实时拥堵里程")
    private String congest;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "实时严重拥堵里程")
    private String serious;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "通勤日/节假日平均值缓行里程")
    private String avg_slowly;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "通勤日/节假日平均值拥堵里程")
    private String avg_congest;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "通勤日/节假日平均值严重拥堵里程")
    private String avg_serious;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "早高峰时间段")
    private String morning_hour;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "早高峰拥堵指数")
    private String morning_index;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "晚高峰时间段")
    private String evening_hour;

    @ApiModelProperty(required = true, example = "TravelTouristUnit列表", value = "晚高峰拥堵指数")
    private String evening_index;

    public String getCurrent_index() {
        return current_index;
    }

    public void setCurrent_index(String current_index) {
        this.current_index = current_index;
    }

    public String getWeek_rate() {
        return week_rate;
    }

    public void setWeek_rate(String week_rate) {
        this.week_rate = week_rate;
    }

    public String getHighway_index() {
        return highway_index;
    }

    public void setHighway_index(String highway_index) {
        this.highway_index = highway_index;
    }

    public String getGeneral_way_index() {
        return general_way_index;
    }

    public void setGeneral_way_index(String general_way_index) {
        this.general_way_index = general_way_index;
    }

    public String getHighway_speed() {
        return highway_speed;
    }

    public void setHighway_speed(String highway_speed) {
        this.highway_speed = highway_speed;
    }

    public String getGeneral_way_speed() {
        return general_way_speed;
    }

    public void setGeneral_way_speed(String general_way_speed) {
        this.general_way_speed = general_way_speed;
    }

    public String getHighway_week_rate() {
        return highway_week_rate;
    }

    public void setHighway_week_rate(String highway_week_rate) {
        this.highway_week_rate = highway_week_rate;
    }

    public String getGeneral_way_week_rate() {
        return general_way_week_rate;
    }

    public void setGeneral_way_week_rate(String general_way_week_rate) {
        this.general_way_week_rate = general_way_week_rate;
    }

    public String getSlowly() {
        return slowly;
    }

    public void setSlowly(String slowly) {
        this.slowly = slowly;
    }

    public String getCongest() {
        return congest;
    }

    public void setCongest(String congest) {
        this.congest = congest;
    }

    public String getSerious() {
        return serious;
    }

    public void setSerious(String serious) {
        this.serious = serious;
    }

    public String getAvg_slowly() {
        return avg_slowly;
    }

    public void setAvg_slowly(String avg_slowly) {
        this.avg_slowly = avg_slowly;
    }

    public String getAvg_congest() {
        return avg_congest;
    }

    public void setAvg_congest(String avg_congest) {
        this.avg_congest = avg_congest;
    }

    public String getAvg_serious() {
        return avg_serious;
    }

    public void setAvg_serious(String avg_serious) {
        this.avg_serious = avg_serious;
    }

    public String getMorning_hour() {
        return morning_hour;
    }

    public void setMorning_hour(String morning_hour) {
        this.morning_hour = morning_hour;
    }

    public String getMorning_index() {
        return morning_index;
    }

    public void setMorning_index(String morning_index) {
        this.morning_index = morning_index;
    }

    public String getEvening_hour() {
        return evening_hour;
    }

    public void setEvening_hour(String evening_hour) {
        this.evening_hour = evening_hour;
    }

    public String getEvening_index() {
        return evening_index;
    }

    public void setEvening_index(String evening_index) {
        this.evening_index = evening_index;
    }
}
