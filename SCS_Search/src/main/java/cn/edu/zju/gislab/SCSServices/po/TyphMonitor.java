package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;

public class TyphMonitor extends TyphMonitorKey {
    private BigDecimal lat;

    private BigDecimal lon;

    private BigDecimal windSpeed;

    private String strength;

    private Long radius7;

    private Long radius10;

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public BigDecimal getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(BigDecimal windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength == null ? null : strength.trim();
    }

    public Long getRadius7() {
        return radius7;
    }

    public void setRadius7(Long radius7) {
        this.radius7 = radius7;
    }

    public Long getRadius10() {
        return radius10;
    }

    public void setRadius10(Long radius10) {
        this.radius10 = radius10;
    }
}