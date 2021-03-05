package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;

public class Tepo {
    private Long id;

    private String location;

    private String idx;

    private String stTime;

    private Integer fcTime;

    private BigDecimal lat;

    private BigDecimal lng;

    private BigDecimal speed;

    private BigDecimal pressure;

    private Integer predictNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx == null ? null : idx.trim();
    }

    public String getStTime() {
        return stTime;
    }

    public void setStTime(String stTime) {
        this.stTime = stTime == null ? null : stTime.trim();
    }

    public Integer getFcTime() {
        return fcTime;
    }

    public void setFcTime(Integer fcTime) {
        this.fcTime = fcTime;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public BigDecimal getPressure() {
        return pressure;
    }

    public void setPressure(BigDecimal pressure) {
        this.pressure = pressure;
    }

    public Integer getPredictNum() {
        return predictNum;
    }

    public void setPredictNum(Integer predictNum) {
        this.predictNum = predictNum;
    }
}