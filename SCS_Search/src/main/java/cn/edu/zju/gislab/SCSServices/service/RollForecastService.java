package cn.edu.zju.gislab.SCSServices.service;

import cn.edu.zju.gislab.SCSServices.po.Hqtqyb;
import cn.edu.zju.gislab.SCSServices.po.ZfhyWlst;

import java.util.List;

public interface RollForecastService {
    List<Hqtqyb> getAllOffshoreArea();
    List<ZfhyWlst> getAllLawEnforceArea();
}
