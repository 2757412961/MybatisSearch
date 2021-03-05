package cn.edu.zju.gislab.SCSServices.po;

import java.util.Date;

public class TyphMonitorKey {
    private Long typhNum;

    private Date routeTime;

    public Long getTyphNum() {
        return typhNum;
    }

    public void setTyphNum(Long typhNum) {
        this.typhNum = typhNum;
    }

    public Date getRouteTime() {
        return routeTime;
    }

    public void setRouteTime(Date routeTime) {
        this.routeTime = routeTime;
    }
}