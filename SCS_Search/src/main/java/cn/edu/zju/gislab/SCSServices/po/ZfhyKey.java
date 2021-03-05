package cn.edu.zju.gislab.SCSServices.po;

public class ZfhyKey {
    private String hymc;

    private Long ybtc;

    public String getHymc() {
        return hymc;
    }

    public void setHymc(String hymc) {
        this.hymc = hymc == null ? null : hymc.trim();
    }

    public Long getYbtc() {
        return ybtc;
    }

    public void setYbtc(Long ybtc) {
        this.ybtc = ybtc;
    }
}