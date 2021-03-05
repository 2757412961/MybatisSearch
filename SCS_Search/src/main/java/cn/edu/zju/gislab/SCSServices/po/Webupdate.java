package cn.edu.zju.gislab.SCSServices.po;

public class Webupdate {
    private String typhCenter;

    private String satellitePict;

    private String weatherKorea;

    private String satelliteAns;

    private String satelliteRedgif;

    public String getTyphCenter() {
        return typhCenter;
    }

    public void setTyphCenter(String typhCenter) {
        this.typhCenter = typhCenter == null ? null : typhCenter.trim();
    }

    public String getSatellitePict() {
        return satellitePict;
    }

    public void setSatellitePict(String satellitePict) {
        this.satellitePict = satellitePict == null ? null : satellitePict.trim();
    }

    public String getWeatherKorea() {
        return weatherKorea;
    }

    public void setWeatherKorea(String weatherKorea) {
        this.weatherKorea = weatherKorea == null ? null : weatherKorea.trim();
    }

    public String getSatelliteAns() {
        return satelliteAns;
    }

    public void setSatelliteAns(String satelliteAns) {
        this.satelliteAns = satelliteAns == null ? null : satelliteAns.trim();
    }

    public String getSatelliteRedgif() {
        return satelliteRedgif;
    }

    public void setSatelliteRedgif(String satelliteRedgif) {
        this.satelliteRedgif = satelliteRedgif == null ? null : satelliteRedgif.trim();
    }
}