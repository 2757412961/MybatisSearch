package cn.edu.zju.gislab.SCSServices.controller;

import cn.edu.zju.gislab.SCSServices.mapper.ZfhyMapper;
import cn.edu.zju.gislab.SCSServices.po.Zfhy;
import cn.edu.zju.gislab.SCSServices.service.LawAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * author:zjh
 */

@Controller
public class LawAreaController {

    @Autowired
    private LawAreaService lawAreaService;

    @RequestMapping("/getZfhyByName")
    @ResponseBody
    public List<Zfhy> queryZfhyByName(String areaName) {
        List<Zfhy> results = lawAreaService.getZfhyByName(areaName);

        return results;
    }

    @RequestMapping("/queryZfhyAll")
    @ResponseBody
    public List<Zfhy> queryZfhyAll() {
        List<Zfhy> results = lawAreaService.getZfhyAll();

        return results;
    }

}
