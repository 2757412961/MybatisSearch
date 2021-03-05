package cn.edu.zju.gislab.SCSServices.controller;

import cn.edu.zju.gislab.SCSServices.po.*;
import cn.edu.zju.gislab.SCSServices.service.TyphoonInfoHome;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.List;

@Controller
public class TyphoonController {

    @Autowired
    private TyphoonInfoHome typhoonInfoHome;

    // 获取特定年份的所有台风
    @RequestMapping("/typhoonList")
    public @ResponseBody
    List<TyphInfo> queryTyphoonList(long year) {
        List<TyphInfo> result = typhoonInfoHome.getTyphoonList(year);
        return result;
    }

    // 获取现有台风的所有年份
    @RequestMapping("/typhoonYear")
    public @ResponseBody
    List<String> queryTyphoonYears() {
        List<String> result = typhoonInfoHome.getTyphoonYears();
        return result;
    }

    // 获取正在进行的台风
    @RequestMapping("/typhoonOngoing")
    public @ResponseBody
    TyphInfo queryTyphoonOngoing() {
        TyphInfo result = typhoonInfoHome.getTyphoonOnGoing();
        return result;
    }

    // 获取Ongoing或所选择的台风的行进路线
    @RequestMapping("/typhoonRoute")
    public @ResponseBody
    List<TyphMonitorWeb> queryTyphoonRoute(long typhNum) {
        List<TyphMonitorWeb> result = typhoonInfoHome.getTyphoonRoute(typhNum);
        return result;
    }

    // 获取台风路径表格点击，所选择日期的台风信息
    @RequestMapping("/typhoonRouteTableClick")
    @ResponseBody
    public JSONObject queryTyphoonRouteTableClick(String typhNum, String routeTime) throws ParseException {
        return typhoonInfoHome.getTyphoonRouteTableClick(typhNum, routeTime);
    }

    // 获取特定年份的所有台风
    @RequestMapping("/queryTyphoonInfo")
    public @ResponseBody
    TyphInfo queryTyphoonInfo(long typhNum) {
        TyphInfo result = typhoonInfoHome.getTyphoonInfo(typhNum);
        return result;
    }

    // 获取 TEPO 特定年份 特定台风 的所有预报时间
    @RequestMapping("/queryTyphTEPOTimes")
    @ResponseBody
    public List<String> queryTyphTEPOTimes(String idx) {
        return typhoonInfoHome.getTyphTEPOTimes(idx);
    }

    // tepo 特定时间下的轨迹信息
    @RequestMapping("/queryTyphTEPOTable")
    @ResponseBody
    public List<Tepo> queryTyphTEPOTable(String idx, String stTime, int predictNum) {
        return typhoonInfoHome.getTyphTEPOTable(idx, stTime, predictNum);
    }

    // 获取中国/日本 台风预测点
    @RequestMapping("/getTyphForecastChinaJapan")
    public @ResponseBody
    List<TyphForecastWeb> queryTyphForecastChinaJapan(long typhNum, String staTime) {
        List<TyphForecastWeb> result = typhoonInfoHome.getTyphForecastChinaJapan(typhNum, staTime);
        return result;
    }

    // 获取 欧洲/美国 台风预测点
    @RequestMapping("/getTyphForecastUSAEurope")
    public @ResponseBody
    List<TyphModel> queryTyphForecastUSAEurope(long typhNum, String staTime, String modelType) {
        List<TyphModel> result = typhoonInfoHome.getTyphForecastUSAEurope(typhNum, staTime, modelType);
        return result;
    }

    // 获取 欧洲/美国 台风预测点
    @RequestMapping("/getTyphForecastTEPO")
    public @ResponseBody
    List<Tepo> queryTyphForecastUSAEurope(long typhNum, String staTime) {
        List<Tepo> result = typhoonInfoHome.getTyphForecastTEPO(typhNum, staTime);
        return result;
    }

    // 获取日本 台风预测点
    @RequestMapping("/getTyphForecastJapan")
    public @ResponseBody
    List<TyphForecastWeb> queryTyphForecastJapan(long typhNum, String staTime) {
        List<TyphForecastWeb> result = typhoonInfoHome.getTyphForecastByTable(typhNum, staTime, "TYPH_JP_WEB");
        return result;
    }

    // 获取韩国 台风预测点
    @RequestMapping("/getTyphForecastKorea")
    public @ResponseBody
    List<TyphForecastWeb> queryTyphForecastKorea(long typhNum, String staTime) {
        List<TyphForecastWeb> result = typhoonInfoHome.getTyphForecastByTable(typhNum, staTime, "TYPH_KR_WEB");
        return result;
    }

    // 获取香港 台风预测点
    @RequestMapping("/getTyphForecastHongKong")
    public @ResponseBody
    List<TyphForecastWeb> queryTyphForecastHongKong(long typhNum, String staTime) {
        List<TyphForecastWeb> result = typhoonInfoHome.getTyphForecastByTable(typhNum, staTime, "TYPH_HK_WEB");
        return result;
    }

    // 获取台湾 台风预测点
    @RequestMapping("/getTyphForecastTaiwan")
    public @ResponseBody
    List<TyphForecastWeb> queryTyphForecastTaiwan(long typhNum, String staTime) {
        List<TyphForecastWeb> result = typhoonInfoHome.getTyphForecastByTable(typhNum, staTime, "TYPH_TW_WEB");
        return result;
    }


}
