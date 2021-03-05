package cn.edu.zju.gislab.SCSServices.service.impl;

import cn.edu.zju.gislab.SCSServices.mapper.*;
import cn.edu.zju.gislab.SCSServices.po.*;
import cn.edu.zju.gislab.SCSServices.service.TyphoonInfoHome;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Aauthor:zjh
 */

public class TyphoonInfoHomeImp implements TyphoonInfoHome {

    @Autowired
    private TyphInfoMapper typhInfoMapper;

    @Autowired
    private TyphMonitorWebMapper typhMonitorWebMapper;

    @Autowired
    private TyphForecastWebMapper typhForecastWebMapper;

    @Autowired
    private TyphModelMapper typhModelMapper;

    @Autowired
    private TepoMapper tepoMapper;


    // 获取特定年份的所有台风
    @Override
    public List<TyphInfo> getTyphoonList(long Year) {
        List<TyphInfo> result;
        try {
            TyphInfoExample typhInfoExample = new TyphInfoExample();
            TyphInfoExample.Criteria criteria = typhInfoExample.createCriteria();
            criteria.andTyphNumBetween(Year * 100, Year * 100 + 100);

            typhInfoExample.setOrderByClause("TYPH_NUM DESC");
            List<TyphInfo> typhInfoList = typhInfoMapper.selectByExample(typhInfoExample);
            if (typhInfoList != null && typhInfoList.size() > 0) {
                result = typhInfoList;
            } else {
                return null;
            }
        } catch (Error e) {
            return null;
        }
        return result;
    }

    // 获取正在进行的台风
    @Override
    public TyphInfo getTyphoonOnGoing() {
        TyphInfo result;
        try {
            TyphInfoExample typhInfoExample = new TyphInfoExample();
            TyphInfoExample.Criteria criteria = typhInfoExample.createCriteria();
            criteria.andIsongoingEqualTo("1");
            typhInfoExample.setOrderByClause("TYPH_NUM DESC");
            List<TyphInfo> typhInfoList = typhInfoMapper.selectByExample(typhInfoExample);

            for (int i = 0; i < typhInfoList.size(); i++) {
                TyphInfo typhInfo = typhInfoList.get(i);
                if (typhInfo.getTyphNum() != null) {
                    return typhInfo;
                }
            }

        } catch (Error e) {
            return null;
        }
        return null;
    }

    // 获取现有台风的所有年份
    @Override
    public List<String> getTyphoonYears() {
        List<String> result;
        try {
            TyphInfoExample typhInfoExample = new TyphInfoExample();
            typhInfoExample.setOrderByClause("TYPH_NUM DESC");
            List<TyphInfo> typhInfoList = typhInfoMapper.selectByExample(typhInfoExample);

            if (typhInfoList.size() > 0) {
                result = new ArrayList<String>();
                for (int i = 0; i < typhInfoList.size(); i++) {
                    String typhNum = String.valueOf(typhInfoList.get(i).getTyphNum());
                    String year = typhNum.substring(0, 4);
                    if (!result.contains(year)) {
                        result.add(year);
                    }
                }
                if (result.size() <= 0) {
                    return null;
                }
            } else {
                return null;
            }
        } catch (Error e) {
            return null;
        }
        return result;
    }

    // 获取Ongoing或所选择的台风的行进路线
    @Override
    public List<TyphMonitorWeb> getTyphoonRoute(long typhNum) {
        List<TyphMonitorWeb> result;
        try {
            TyphMonitorWebExample typhMonitorWebExample = new TyphMonitorWebExample();
            TyphMonitorWebExample.Criteria criteria = typhMonitorWebExample.createCriteria();
            criteria.andTyphNumEqualTo(typhNum);

            result = typhMonitorWebMapper.selectByExample(typhMonitorWebExample);
            if (result.size() <= 0) result = null;
        } catch (Error e) {
            return null;
        }

        return result;
    }

    @Override
    public JSONObject getTyphoonRouteTableClick(String typhNum, String routeTime) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(routeTime);
        JSONObject jsonObject = new JSONObject();

        TyphMonitorWebExample typhMonitorWebExample = new TyphMonitorWebExample();
        TyphMonitorWebExample.Criteria criteria = typhMonitorWebExample.createCriteria();
        criteria.andTyphNumEqualTo(Long.valueOf(typhNum));
        criteria.andRouteTimeEqualTo(date);
        List<TyphMonitorWeb> typhMonitorWebs = typhMonitorWebMapper.selectByExample(typhMonitorWebExample);
        if (typhMonitorWebs.isEmpty()) {
            return new JSONObject();
        }
        TyphMonitorWeb typhMonitorWeb = typhMonitorWebs.get(0);

        TyphInfoExample typhInfoExample = new TyphInfoExample();
        TyphInfoExample.Criteria criteriaInfo = typhInfoExample.createCriteria();
        criteriaInfo.andTyphNumEqualTo(typhMonitorWeb.getTyphNum());
        List<TyphInfo> typhInfos = typhInfoMapper.selectByExample(typhInfoExample);
        if (typhInfos.isEmpty()) {
            return new JSONObject();
        }
        TyphInfo typhInfo = typhInfos.get(0);

        jsonObject.put("typhMonitorWeb", JSON.toJSON(typhMonitorWeb));
        jsonObject.put("typhInfo", JSON.toJSON(typhInfo));

        return jsonObject;
    }

    @Override
    public TyphInfo getTyphoonInfo(long typhNum) {
        TyphInfo result = null;

        TyphInfoExample typhInfoExample = new TyphInfoExample();
        TyphInfoExample.Criteria criteria = typhInfoExample.createCriteria();
        criteria.andTyphNumEqualTo(typhNum);
        List<TyphInfo> typhInfoList = typhInfoMapper.selectByExample(typhInfoExample);

        if (typhInfoList.size() > 0) result = typhInfoList.get(0);

        return result;
    }

    @Override
    public List<String> getTyphTEPOTimes(String idx) {
        List<String> results = new ArrayList<>();

        List<Tepo> tepoList = tepoMapper.selectSingleStringList(
                "SELECT DISTINCT ST_TIME " +
                        " FROM TEPO " +
                        " WHERE IDX = " + idx +
                        " ORDER BY ST_TIME DESC");
        if (tepoList.remove(null) || tepoList.isEmpty()) {
            return results;
        }

        for (Tepo tepo : tepoList) {
            results.add(tepo.getStTime());
        }

        return results;
    }

    @Override
    public List<Tepo> getTyphTEPOTable(String idx, String stTime, int predictNum) {
        List<Tepo> results = new ArrayList<>();

        TepoExample tepoExample = new TepoExample();
        TepoExample.Criteria criteria = tepoExample.createCriteria();
        criteria.andIdxEqualTo(idx);
        criteria.andStTimeEqualTo(stTime);
        criteria.andPredictNumEqualTo(predictNum);
        List<Tepo> tepoList = tepoMapper.selectByExample(tepoExample);

        if (tepoList.remove(null) || tepoList.isEmpty()) {
            return results;
        }
        results = tepoList;

        return results;
    }

    @Override
    public List<TyphForecastWeb> getTyphForecastChinaJapan(long typhNum, String staTime) {
        List<TyphForecastWeb> results = null;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date staDate = sdf.parse(staTime);
            Date last48staDate = new Date(staDate.getTime() - 48 * 60 * 60 * 1000);

            // 找到最近的日期
            String sqlStr = "select max(qbsj) as qbsj from typh_forecast_web " +
                    " WHERE typh_num = " + typhNum +
                    " and qbsj <= to_date('" + sdf.format(staDate) + "','yyyy-mm-dd hh24:mi:ss')" +
                    " and qbsj >= to_date('" + sdf.format(last48staDate) + "','yyyy-mm-dd hh24:mi:ss')";
            List<TyphForecastWeb> typhForecastWebListLast = typhForecastWebMapper.selectSingleStringList(sqlStr);
            if (typhForecastWebListLast.remove(null) || typhForecastWebListLast.isEmpty()) return results;
            Date maxStaDate = typhForecastWebListLast.get(0).getQbsj();

            TyphForecastWebExample typhForecastWebExample = new TyphForecastWebExample();
            TyphForecastWebExample.Criteria criteria = typhForecastWebExample.createCriteria();
            criteria.andTyphNumEqualTo(typhNum);
            criteria.andQbsjEqualTo(maxStaDate);
            List<TyphForecastWeb> typhForecastWebList = typhForecastWebMapper.selectByExample(typhForecastWebExample);

            if (typhForecastWebList.size() > 0) results = typhForecastWebList;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return results;
    }

    @Override
    public List<TyphModel> getTyphForecastUSAEurope(long typhModelNum, String staTime, String modelType) {
        List<TyphModel> results = null;
        SimpleDateFormat sdfLocal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdfSimple = new SimpleDateFormat("yyyyMMddHH");

        try {
            Date staDateChina = sdfLocal.parse(staTime);
            Date staDateWorld = new Date(staDateChina.getTime() - 18 * 60 * 60 * 1000);
            Date last48staDateWorld = new Date(staDateWorld.getTime() - 58 * 60 * 60 * 1000);

            // 找到最近的日期
            String sqlStr = "select max(st_time) as st_time from typh_model " +
                    " WHERE st_time <= " + sdfSimple.format(staDateWorld) +
                    " and st_time >= " + sdfSimple.format(last48staDateWorld);
            List<TyphModel> typhModelListLast = typhModelMapper.selectSingleStringList(sqlStr);
            if (typhModelListLast.remove(null) || typhModelListLast.isEmpty()) return results;
            String maxStTime = typhModelListLast.get(0).getStTime();
            Date maxStaDateWorld = sdfSimple.parse(maxStTime);

            // Group 取平均值 操作
            int staHour = (int) (staDateChina.getTime() - maxStaDateWorld.getTime()) / 60 / 60 / 1000 - 8;
            String sqlStrGroup = "select idx, st_time, fc_time, model_type, radius, " +
                    "   AVG(case when (lng<0) then (lng+3600) else lng end)/10 as lng, " +
                    "   AVG(lat)/10 as lat, AVG(speed) as speed, AVG(pressure) as pressure " +
                    " from typh_model " +
                    " WHERE st_time = " + maxStTime +
                    "   and idx = " + typhModelNum +
                    "   and model_type = '" + modelType + "'" +
                    "   and fc_time <= " + 120 +
                    "   and fc_time >= " + staHour +
                    "   and radius = " + 34 +
                    " Group by idx, st_time, model_type, fc_time, radius " +
                    " Order by fc_time";
            List<TyphModel> typhModelList = typhModelMapper.selectSingleStringList(sqlStrGroup);
            if (typhModelList.remove(null) || typhModelList.isEmpty()) return results;

            // 合并
            if (typhModelList.size() > 0) {
                results = new ArrayList<>();
                Date staDate = new Date(maxStaDateWorld.getTime() + 8 * 60 * 60 * 1000);
                for (int i = 0; i < typhModelList.size(); i++) {
                    TyphModel model = typhModelList.get(i);
                    Date endDate = new Date(staDate.getTime() + model.getFcTime() * 60 * 60 * 1000);

                    model.setStTime(sdfLocal.format(staDate));
                    model.setLocation(sdfLocal.format(endDate));
                    model.setLng(model.getLng().setScale(1, RoundingMode.HALF_UP));
                    model.setLat(model.getLat().setScale(1, RoundingMode.HALF_UP));
                    model.setSpeed(model.getSpeed().setScale(0, RoundingMode.HALF_UP));
                    model.setPressure(model.getPressure().setScale(0, RoundingMode.HALF_UP));

                    results.add(model);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return results;
    }

    @Override
    public List<Tepo> getTyphForecastTEPO(long typhModelNum, String staTime) {
        List<Tepo> results = null;
        SimpleDateFormat sdfLocal = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdfSimple = new SimpleDateFormat("yyyyMMddHH");

        try {
            Date staDateChina = sdfLocal.parse(staTime);
            Date staDateWorld = new Date(staDateChina.getTime() - 18 * 60 * 60 * 1000);
            Date last48staDateWorld = new Date(staDateWorld.getTime() - 58 * 60 * 60 * 1000);

            String sqlStr = "select distinct st_time, predict_num from TEPO " +
                    " WHERE st_time <= " + sdfSimple.format(staDateWorld) +
                    " and st_time >= " + sdfSimple.format(last48staDateWorld);
            List<Tepo> tepoListLast = tepoMapper.selectSingleStringList(sqlStr);
            if (tepoListLast.remove(null) || tepoListLast.isEmpty()) return results;

            // 找到最近的日期
            Date maxStaDateChina = new Date();
            Date maxStaDateWorld = new Date();
            int predict_num = 0;
            for (int i = 0; i < tepoListLast.size(); i++) {
                Tepo tepo = tepoListLast.get(i);
                Date stDateChina = sdfSimple.parse(tepo.getStTime());
                if (tepo.getPredictNum() == 1) {
                    stDateChina = new Date(stDateChina.getTime() + 18 * 60 * 60 * 1000);
                } else if (tepo.getPredictNum() == 2) {
                    stDateChina = new Date(stDateChina.getTime() + 20 * 60 * 60 * 1000);
                } else if (tepo.getPredictNum() == 3) {
                    stDateChina = new Date(stDateChina.getTime() + 26 * 60 * 60 * 1000);
                }

                if (stDateChina.compareTo(staDateChina) <= 0) {
                    if (predict_num == 0 || stDateChina.compareTo(maxStaDateChina) > 0) {
                        predict_num = tepo.getPredictNum();
                        maxStaDateChina = stDateChina;
                        maxStaDateWorld = sdfSimple.parse(tepo.getStTime());
                    }
                }
            }

            int staHour = (int) (staDateChina.getTime() - maxStaDateWorld.getTime()) / 60 / 60 / 1000 - 8;
            TepoExample tepoExample = new TepoExample();
            TepoExample.Criteria criteria = tepoExample.createCriteria();
            criteria.andIdxEqualTo(String.valueOf(typhModelNum));
            criteria.andStTimeEqualTo(sdfSimple.format(maxStaDateWorld));
            criteria.andPredictNumEqualTo(predict_num);
            criteria.andFcTimeBetween(staHour, 120);
            tepoExample.setOrderByClause("fc_time");
            List<Tepo> tepoList = tepoMapper.selectByExample(tepoExample);

            // 合并
            results = new ArrayList<>();
            if (tepoList.size() > 0) {
                Date staDate = new Date(maxStaDateWorld.getTime() + 8 * 60 * 60 * 1000);
                BigDecimal zero = new BigDecimal(0);
                for (int i = 0; i < tepoList.size(); i++) {
                    Tepo tepo = tepoList.get(i);
                    int fctime = tepo.getFcTime();
                    Date endDate = new Date(staDate.getTime() + fctime * 60 * 60 * 1000);

                    tepo.setStTime(sdfLocal.format(staDate));
                    tepo.setLocation(sdfLocal.format(endDate));
                    tepo.setLng((tepo.getLng().compareTo(zero) >= 0 ? tepo.getLng() : tepo.getLng().add(new BigDecimal(3600)))
                            .divide(new BigDecimal(10), 1, RoundingMode.HALF_UP));
                    tepo.setLat(tepo.getLat().divide(new BigDecimal(10), 1, RoundingMode.HALF_UP));
                    tepo.setSpeed(tepo.getSpeed().setScale(0, RoundingMode.HALF_UP));
                    tepo.setPressure(tepo.getPressure().setScale(0, RoundingMode.HALF_UP));
                    results.add(tepo);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return results;
    }


    // 2020/10/19 加入新的四个中心
    @Override
    public List<TyphForecastWeb> getTyphForecastByTable(long typhNum, String staTime, String tableName) {
        List<TyphForecastWeb> results = null;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date staDate = sdf.parse(staTime);
            Date last48staDate = new Date(staDate.getTime() - 48 * 60 * 60 * 1000);

            // 找到最近的日期
            String sqlStrLast = "select max(qbsj) as qbsj" +
                    " from " + tableName +
                    " WHERE typh_num = " + typhNum +
                    " and qbsj <= to_date('" + sdf.format(staDate) + "','yyyy-mm-dd hh24:mi:ss')" +
                    " and qbsj >= to_date('" + sdf.format(last48staDate) + "','yyyy-mm-dd hh24:mi:ss')";
            List<TyphForecastWeb> typhTablrWebListLast = typhForecastWebMapper.selectSingleStringList(sqlStrLast);
            if (typhTablrWebListLast.remove(null) || typhTablrWebListLast.isEmpty()) return results;
            Date maxStaDate = typhTablrWebListLast.get(0).getQbsj();

            String sqlStr = "select * " +
                    " FROM " + tableName +
                    " WHERE typh_num = " + typhNum +
                    "   and qbsj = to_date('" + sdf.format(maxStaDate) + "','yyyy-mm-dd hh24:mi:ss')";
            List<TyphForecastWeb> typhTableWebList = typhForecastWebMapper.selectSingleStringList(sqlStr);
            if (typhTableWebList.size() > 0) results = typhTableWebList;

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return results;
    }


}
