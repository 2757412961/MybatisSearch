package cn.edu.zju.gislab.SCSServices.controller;

import cn.edu.zju.gislab.SCSServices.po.Figuredetail;
import cn.edu.zju.gislab.SCSServices.service.ProductImgsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class ProductImgsController {

    @Autowired
    private ProductImgsService productImgsService;

    @RequestMapping("/getProductImgsLatestDate")
    @ResponseBody
    public List<Figuredetail> queryProductImgsLatestDate() {
        List<Figuredetail> results = productImgsService.getProductImgsLatestDate();

        return results;
    }

    @RequestMapping("/getProductImgs")
    @ResponseBody
    public List<Figuredetail> queryProductImgs(long timestamp, BigDecimal time, String type) {
        List<Figuredetail> results = productImgsService.getProductImgs(timestamp, time, type);

        return results;
    }
}
