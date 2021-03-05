package cn.edu.zju.gislab.SCSServices.service.impl;

import cn.edu.zju.gislab.SCSServices.mapper.FiguredetailMapper;
import cn.edu.zju.gislab.SCSServices.po.Figuredetail;
import cn.edu.zju.gislab.SCSServices.po.FiguredetailExample;
import cn.edu.zju.gislab.SCSServices.service.ProductImgsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ProductImgsServiceImp implements ProductImgsService {

    @Autowired
    private FiguredetailMapper figuredetailMapper;

    @Override
    public List<Figuredetail> getProductImgsLatestDate() {
        List<Figuredetail> results = null;

        String sqlStr = "select max(FILEDATE) as FILEDATE from FIGUREDETAIL";
        List<Figuredetail> figuredetailList = figuredetailMapper.selectSingleSQL(sqlStr);
        if (figuredetailList.size() > 0) results = figuredetailList;

        return results;
    }

    @Override
    public List<Figuredetail> getProductImgs(long timestamp, BigDecimal time, String type) {
        List<Figuredetail> results = null;

        Date date = new Date(timestamp);
        FiguredetailExample figuredetailExample = new FiguredetailExample();
        FiguredetailExample.Criteria criteria = figuredetailExample.createCriteria();
        criteria.andFiledateEqualTo(date);
        criteria.andTimeEqualTo(time);
        criteria.andTypeEqualTo(type);
        List<Figuredetail> figuredetailList = figuredetailMapper.selectByExampleWithBLOBs(figuredetailExample);
        if (figuredetailList.size() > 0) results = figuredetailList;

        return results;
    }
}
