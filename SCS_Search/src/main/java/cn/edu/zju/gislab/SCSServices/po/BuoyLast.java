package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;

public class BuoyLast extends BuoyLastKey {
    private BigDecimal tideHeig;

    private BigDecimal waveHeig;

    private String waveDir;

    private BigDecimal waveCycle;

    private BigDecimal windPower;

    private String windDir;

    private BigDecimal gust;

    private BigDecimal seaTemp;

    private BigDecimal atTemp;

    private BigDecimal atPress;

    public BigDecimal getTideHeig() {
        return tideHeig;
    }

    public void setTideHeig(BigDecimal tideHeig) {
        this.tideHeig = tideHeig;
    }

    public BigDecimal getWaveHeig() {
        return waveHeig;
    }

    public void setWaveHeig(BigDecimal waveHeig) {
        this.waveHeig = waveHeig;
    }

    public String getWaveDir() {
        return waveDir;
    }

    public void setWaveDir(String waveDir) {
        this.waveDir = waveDir == null ? null : waveDir.trim();
    }

    public BigDecimal getWaveCycle() {
        return waveCycle;
    }

    public void setWaveCycle(BigDecimal waveCycle) {
        this.waveCycle = waveCycle;
    }

    public BigDecimal getWindPower() {
        return windPower;
    }

    public void setWindPower(BigDecimal windPower) {
        this.windPower = windPower;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir == null ? null : windDir.trim();
    }

    public BigDecimal getGust() {
        return gust;
    }

    public void setGust(BigDecimal gust) {
        this.gust = gust;
    }

    public BigDecimal getSeaTemp() {
        return seaTemp;
    }

    public void setSeaTemp(BigDecimal seaTemp) {
        this.seaTemp = seaTemp;
    }

    public BigDecimal getAtTemp() {
        return atTemp;
    }

    public void setAtTemp(BigDecimal atTemp) {
        this.atTemp = atTemp;
    }

    public BigDecimal getAtPress() {
        return atPress;
    }

    public void setAtPress(BigDecimal atPress) {
        this.atPress = atPress;
    }
}