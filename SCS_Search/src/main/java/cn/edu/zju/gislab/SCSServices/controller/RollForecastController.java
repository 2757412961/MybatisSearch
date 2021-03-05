/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: RollForecastController
 * Author:   zhangzhe
 * Date:     2020/9/22 10:58
 * Description: 滚动预报控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.edu.zju.gislab.SCSServices.controller;

import cn.edu.zju.gislab.SCSServices.po.Hqtqyb;
import cn.edu.zju.gislab.SCSServices.po.ZfhyWlst;
import cn.edu.zju.gislab.SCSServices.service.RollForecastService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈滚动预报控制器〉
 *
 * @author zhangzhe
 * @create 2020/9/22
 * @since 1.0.0
 */
@Controller
public class RollForecastController {
    @Autowired
    RollForecastService rollForecastService;

    // 获取近海海区预报信息
    @RequestMapping("/getOffShoreArea")
    @ResponseBody
    public JSONArray getAllOffshoreArea() {
        List<Hqtqyb> result = rollForecastService.getAllOffshoreArea();
        //每6个一组，返回近海海区所有预报信息
        JSONArray allOffshoreArea = new JSONArray();
        for (int i = 0; i < result.size() / 6; i += 1) {
            Hqtqyb temp = result.get(i * 6);
            JSONObject tempJb = new JSONObject();
            tempJb.put("areaName", temp.getHqmc());
            JSONArray tempJa = new JSONArray();
            for (int j = 0; j < 6; j++) {
                tempJa.add(result.get(i * 6 + j));
            }
            tempJb.put("data", tempJa);
            allOffshoreArea.add(tempJb);
        }
        return allOffshoreArea;
    }

    // 获取执法海域预报信息
    @RequestMapping("/getLawEnforceArea")
    @ResponseBody
    public JSONArray getAllLawEnforceArea() {
        List<ZfhyWlst> result = rollForecastService.getAllLawEnforceArea();
        //每10个一组，返回执法海域所有预报信息
        JSONArray allLowEnforceArea = new JSONArray();
        for (int i = 0; i < result.size() / 14; i += 1) {
            ZfhyWlst temp = result.get(i * 14);
            JSONObject tempJb = new JSONObject();
            tempJb.put("areaName", temp.getHymc());
            JSONArray tempJa = new JSONArray();
            for (int j = 0; j < 14; j++) {
                tempJa.add(result.get(i * 14 + j));
            }
            tempJb.put("data", tempJa);
            allLowEnforceArea.add(tempJb);
        }
        return allLowEnforceArea;
    }
}
