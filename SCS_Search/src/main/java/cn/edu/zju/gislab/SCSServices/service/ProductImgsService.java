package cn.edu.zju.gislab.SCSServices.service;

import cn.edu.zju.gislab.SCSServices.po.Figuredetail;

import java.math.BigDecimal;
import java.util.List;

public interface ProductImgsService {

    List<Figuredetail> getProductImgsLatestDate();

    List<Figuredetail> getProductImgs(long timestamp, BigDecimal time, String type);

}
