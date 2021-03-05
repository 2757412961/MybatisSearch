/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: PredictionPaperController
 * Author:   zhangzhe
 * Date:     2020/9/27 19:26
 * Description: 预报单控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.edu.zju.gislab.SCSServices.controller;

import cn.edu.zju.gislab.SCSServices.service.PredictionPaperService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈预报单控制器〉
 *
 * @author zhangzhe
 * @create 2020/9/27
 * @since 1.0.0
 */
@Controller
public class PredictionPaperController {
    @Autowired
    private PredictionPaperService predictionPaperService;

    // 获取海区预报单 返回 对应的 year month day

    /**
     * 只有初始化的时候，yea、month、day、会同时为空
     * 只有day不为空，才会查询fileName
     * <p>
     * 同时 为空，返回 {year:xx, month: xx , day: xx, ho ur:xx }
     * year 不为空，返回 { month: xx , day: xx, hour:xx }
     * year month 不为空，返回 {day : xx, hour:xx}
     * year month day 不为空，返回 {fileName:xx}
     */
    @RequestMapping("/getSeaAreaPrediction")
    @ResponseBody
    public JSONObject getSeaAreaPrediction(String year, String month, String day) {
        JSONObject result = predictionPaperService.getSeaAreaForecastConditon(year, month, day);
        return result;
    }

    /**
     * 获取执法预报单
     * 只有初始化的时候，yea、month、day、会同时为空
     * 只有hour不为空，才会查询fileName
     * <p>
     * year 为空，返回 {year:xx, month: xx , day: xx, ho ur:xx }
     * year 不为空，返回 { month: xx , day: xx, hour:xx }
     * year month 不为空，返回 {day : xx, hour:xx}
     * year month day 不为空，返回 {hour:xx}
     * year month day hour 不为空，返回 {fileName:xx}
     */
    @RequestMapping("/getLawAreaPrediction")
    @ResponseBody
    public JSONObject getLawAreaPrediction(String year, String month, String day, String hour) {
        JSONObject result = predictionPaperService.getLawAreaForecastConditon(year, month, day, hour);
        return result;
    }
    /**
     * 台风预报单
     * 只有初始化的时候，num、releaseNum、releaseDate、会同时为空
     * 只有releaseDate不为空，才会查询fileName
     * <p>
     * num 为空，返回 {num:xx, releaseNum: xx , releaseDate: xx}
     * num 不为空，返回 { releaseNum: xx , releaseDate: xx }
     * num releaseNum 不为空，返回 {releaseDate : xx}
     * num releaseNum releaseDate 不为空，返回 {fileName:xx}
     */
    @RequestMapping("/getTyphoonPrediction")
    @ResponseBody
    public JSONObject getTyphoonPrediction(String typhNum, String releaseNum, String releaseDate) {
        JSONObject result = predictionPaperService.getTyphoonForecastConditon(typhNum, releaseNum, releaseDate);
        return result;
    }

    /**
     * 热带低压预报单（查询条件与台风预报单一样）
     * 只有初始化的时候，num、releaseNum、releaseDate、会同时为空
     * 只有releaseDate不为空，才会查询fileName
     * <p>
     * num 为空，返回 {num:xx, releaseNum: xx , releaseDate: xx}
     * num 不为空，返回 { releaseNum: xx , releaseDate: xx }
     * num releaseNum 不为空，返回 {releaseDate : xx}
     * num releaseNum releaseDate 不为空，返回 {fileName:xx}
     */
    @RequestMapping("/getTropicsPrediction")
    @ResponseBody
    public JSONObject getTropicsPrediction(String typhNum, String releaseNum, String releaseDate) {
        JSONObject result = predictionPaperService.getTropicsForecastConditon(typhNum, releaseNum, releaseDate);
        return result;
    }


    /**
     * 未来十天预报单
     * 只有初始化的时候，year、month、day、会同时为空
     * 只有day不为空，才会查询fileName
     * <p>
     * 同时 为空，返回 {year:xx, month: xx , day: xx, ho ur:xx }
     * year 不为空，返回 { month: xx , day: xx, hour:xx }
     * year month 不为空，返回 {day : xx, hour:xx}
     * year month day 不为空，返回 {fileName:xx}
     */
    @RequestMapping("/getNextTenDaysPrediction")
    @ResponseBody
    public JSONObject getNextTenDaysPrediction(String year, String month, String day) {
        JSONObject result = predictionPaperService.getNextTenDaysForecastConditon(year, month, day);
        return result;
    }

    /**
     * 海冰预报单
     * 只有初始化的时候，yea、iceNum、iceNum、会同时为空
     * cycle不为空，才会查询fileName
     * 同时 为空，返回 {year:xx, iceNum: xx , cycle: xx}
     * year 不为空，返回 { iceNum: xx , cycle: xx }
     * year iceNum 不为空，返回 {cycle : xx}
     * year iceNum cycle 不为空，返回 {fileName:xx}
     */
    @RequestMapping("/getSeaIcePrediction")
    @ResponseBody
    public JSONObject getSeaIcePrediction(String year, String iceNum, String cycle) {
        JSONObject result = predictionPaperService.getSeaIceForecastConditon(year, iceNum, cycle);
        return result;
    }
}
