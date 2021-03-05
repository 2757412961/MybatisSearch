package cn.edu.zju.gislab.SCSServices.service;

import cn.edu.zju.gislab.SCSServices.po.*;
import com.alibaba.fastjson.JSONObject;

import java.text.ParseException;
import java.util.List;

public interface TyphoonInfoHome {
    // 获取所有台风列表
    List<TyphInfo> getTyphoonList(long Year);

    TyphInfo getTyphoonOnGoing();

    List<String> getTyphoonYears();

    List<TyphMonitorWeb> getTyphoonRoute(long typhNum);

    JSONObject getTyphoonRouteTableClick(String typhNum, String routeTime) throws ParseException;

    TyphInfo getTyphoonInfo(long typhNum);

    List<String> getTyphTEPOTimes(String idx);

    List<Tepo> getTyphTEPOTable(String idx, String stTime, int predictNum);

    // 台风预测中心数据
    List<TyphForecastWeb> getTyphForecastChinaJapan(long typhNum, String staTime);

    List<TyphModel> getTyphForecastUSAEurope(long typhModelNum, String staTime, String modelType);

    List<Tepo> getTyphForecastTEPO(long typhModelNum, String staTime);

    // 2020/10/19 加入新的四个中心
    List<TyphForecastWeb> getTyphForecastByTable(long typhNum, String staTime, String tableName);


}
