package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;

public class TyphMonitorWeb extends TyphMonitorWebKey {
    private BigDecimal lat;

    private BigDecimal lon;

    private BigDecimal windSpeed;

    private String strength;

    private Long radius7;

    private Long radius10;

    private BigDecimal centPres;

    private String radiusJson;

    private String moveSpeed;

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

    public BigDecimal getCentPres() {
        return centPres;
    }

    public void setCentPres(BigDecimal centPres) {
        this.centPres = centPres;
    }

    public String getRadiusJson() {
        return radiusJson;
    }

    public void setRadiusJson(String radiusJson) {
        this.radiusJson = radiusJson == null ? null : radiusJson.trim();
    }

    public String getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(String moveSpeed) {
        this.moveSpeed = moveSpeed == null ? null : moveSpeed.trim();
    }
}