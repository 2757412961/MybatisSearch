package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;

public class TyphForecast extends TyphForecastKey {
    private BigDecimal lon;

    private BigDecimal lat;

    private Integer zxfs;

    private String strength;

    private Long radius7;

    private Long radius10;

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public Integer getZxfs() {
        return zxfs;
    }

    public void setZxfs(Integer zxfs) {
        this.zxfs = zxfs;
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