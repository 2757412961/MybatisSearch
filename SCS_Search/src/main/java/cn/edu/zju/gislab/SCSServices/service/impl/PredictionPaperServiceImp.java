/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: PredictionPaperServiceImp
 * Author:   zhangzhe
 * Date:     2020/9/27 18:18
 * Description: 预报单服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.edu.zju.gislab.SCSServices.service.impl;

import cn.edu.zju.gislab.SCSServices.mapper.*;
import cn.edu.zju.gislab.SCSServices.service.PredictionPaperService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 〈预报单服务〉
 *
 * @author zhangzhe
 * @create 2020/9/27
 * @since 1.0.0
 */
public class PredictionPaperServiceImp implements PredictionPaperService {

    @Autowired
    private HqybdMapper hqybdMapper;

    @Autowired
    private ZfybdMapper zfybdMapper;

    @Autowired
    private TfybdMapper tfybdMapper;

    @Autowired
    private RddyxxMapper rddyxxMapper;

    @Autowired
    private WlstybdMapper wlstybdMapper;

    @Autowired
    private HbybdMapper hbybdMapper;

    /**
     * 海区预报单
     * 只有初始化的时候，yea、month、day、会同时为空
     * 只有day不为空，才会查询fileName
     * <p>
     * 同时 为空，返回 {year:xx, month: xx , day: xx, ho ur:xx }
     * year 不为空，返回 { month: xx , day: xx, hour:xx }
     * year month 不为空，返回 {day : xx, hour:xx}
     * year month day 不为空，返回 {fileName:xx}
     */
    @Override
    public JSONObject getSeaAreaForecastConditon(String year, String month, String day) {
        // 如果year为空，检索所有年份
        JSONObject result = new JSONObject();
        if ("".equals(year)) {
            String sqlStr = "select distinct YEAR from HQYBD order by year ASC";
            List<String> yearStrList = hqybdMapper.selectSingleStringList(sqlStr);
            result.put("year", yearStrList); //添加year 集合
            year = yearStrList.get(yearStrList.size() - 1); // 获取最新的一年
        }
        // 如果月也为空，就根据year检索 month
        if ("".equals(month)) {
            String sqlStr = "select distinct MONTH from HQYBD WHERE ( YEAR = " + year + " ) order by month ASC";
            List<String> monthStrList = hqybdMapper.selectSingleStringList(sqlStr);
            result.put("month", monthStrList); //添加year 集合
            month = monthStrList.get(monthStrList.size() - 1); // 获取最新的月份
        }
        // 根据 year 和 month 检索 day
        if ("".equals(day)) {
            String sqlStr = "select distinct DAY from HQYBD WHERE ( YEAR = " + year + " and MONTH = " + month + " ) order by day ASC";
            List<String> dayStrList = hqybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("day", dayStrList); //添加year 集合
        }
        // 如果year month day都不为空,检索文件名
        if (!("".equals(day)) && null != day) {
            String sqlStr = "select FILENAME from HQYBD WHERE ( YEAR = " + year + " and MONTH = " + month + " and DAY = " + day + " )";
            List<String> fileName = hqybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("fileName", fileName); //添加year 集合
        }
        return result;
    }

    /**
     * 执法预报单
     * 只有初始化的时候，yea、month、day、会同时为空
     * 只有hour不为空，才会查询fileName
     * <p>
     * year 为空，返回 {year:xx, month: xx , day: xx, ho ur:xx }
     * year 不为空，返回 { month: xx , day: xx, hour:xx }
     * year month 不为空，返回 {day : xx, hour:xx}
     * year month day 不为空，返回 {hour:xx}
     * year month day hour 不为空，返回 {fileName:xx}
     */
    @Override
    public JSONObject getLawAreaForecastConditon(String year, String month, String day, String hour) {
        // 如果year为空，检索所有年份
        JSONObject result = new JSONObject();
        if ("".equals(year)) {
            String sqlStr = "select distinct YEAR from Zfybd order by year ASC";
            List<String> yearStrList = zfybdMapper.selectSingleStringList(sqlStr);
            result.put("year", yearStrList); //添加 集合
            year = yearStrList.get(yearStrList.size() - 1); // 获取最新的一年
        }
        // 如果月也为空，就根据year检索 month
        if ("".equals(month)) {
            String sqlStr = "select distinct MONTH from Zfybd WHERE ( YEAR = " + year + " ) order by month ASC";
            List<String> monthStrList = zfybdMapper.selectSingleStringList(sqlStr);
            result.put("month", monthStrList); //添加 集合
            month = monthStrList.get(monthStrList.size() - 1); // 获取最新的月份
        }
        // 根据 year 和 month 检索 day
        if ("".equals(day)) {
            String sqlStr = "select distinct DAY from Zfybd WHERE ( YEAR = " + year + " and MONTH = " + month + " ) order by day ASC";
            List<String> dayStrList = zfybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("day", dayStrList); //添加 集合
            day = dayStrList.get(dayStrList.size() - 1); // 获取最新的日
        }

        // 根据 year month day 检索 hour
        if ("".equals(hour)) {
            String sqlStr = "select distinct HOUR from Zfybd WHERE ( YEAR = " + year + " and MONTH = " + month
                    + " and DAY = " + day + " ) order by HOUR ASC";
            List<String> dayStrList = zfybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("hour", dayStrList); //添加year 集合
        }
        // 如果year month day hour都不为空,检索文件名
        if (!("".equals(hour)) && null != hour) {
            String sqlStr = "select FILENAME from Zfybd WHERE ( YEAR = " + year + " and MONTH = " + month + " and DAY = " +
                    day + " and HOUR = " + hour + " )";
            List<String> fileName = zfybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("fileName", fileName); //添加year 集合
        }
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
    @Override
    public JSONObject getTyphoonForecastConditon(String typhNum, String releaseNum, String releaseDate) {
        JSONObject result = new JSONObject();
        if ("".equals(typhNum)) {
            String sqlStr = "select distinct TYPH_NUM from Tfybd order by TYPH_NUM ASC";
            List<String> typhoonNumStrList = tfybdMapper.selectSingleStringList(sqlStr);
            result.put("typhNum", typhoonNumStrList); //添加 集合
            typhNum = typhoonNumStrList.get(typhoonNumStrList.size() - 1); // 获取最新的num
        }
        if ("".equals(releaseNum)) {
            String sqlStr = "select distinct RELEASE_NUM from Tfybd WHERE ( TYPH_NUM = " + typhNum + " ) order by RELEASE_NUM ASC";
            List<String> releaseNumStrList = tfybdMapper.selectSingleStringList(sqlStr);
            result.put("releaseNum", releaseNumStrList); //添加 集合
            releaseNum = releaseNumStrList.get(releaseNumStrList.size() - 1); // 获取最新releaseNum
        }
        if ("".equals(releaseDate)) {
            String sqlStr = "select distinct DATE_TIME from Tfybd WHERE ( TYPH_NUM = " + typhNum + " and RELEASE_NUM = " + releaseNum + " ) order by DATE_TIME ASC";
            List<String> releaseDateStrList = tfybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("releaseDate", releaseDateStrList); //添加 集合
            //releaseDate = releaseDateStrList.get(releaseDateStrList.size() - 1); // 获取最新的releaseDate
        }

        // 如果都不为空,检索文件名
        if (!("".equals(releaseDate)) && null != releaseDate) {
            String sqlStr = "select FILENAME from Tfybd WHERE ( TYPH_NUM = " + typhNum + " and RELEASE_NUM = " + releaseNum + " and DATE_TIME = " +
                    releaseDate + " )";
            List<String> fileName = tfybdMapper.selectSingleStringList(sqlStr);
            result.put("fileName", fileName); //添加预报单名称
        }
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
    @Override
    public JSONObject getTropicsForecastConditon(String typhNum, String releaseNum, String releaseDate) {
        JSONObject result = new JSONObject();
        if ("".equals(typhNum)) {
            String sqlStr = "select distinct TYPH_NUM from Rddyxx order by TYPH_NUM ASC";
            List<String> typhoonNumStrList = rddyxxMapper.selectSingleStringList(sqlStr);
            result.put("typhNum", typhoonNumStrList); //添加 集合
            typhNum = typhoonNumStrList.get(typhoonNumStrList.size() - 1); // 获取最新的num
        }
        if ("".equals(releaseNum)) {
            String sqlStr = "select distinct RELEASE_NUM from Rddyxx WHERE ( TYPH_NUM = " + typhNum + " ) order by RELEASE_NUM ASC";
            List<String> releaseNumStrList = rddyxxMapper.selectSingleStringList(sqlStr);
            result.put("releaseNum", releaseNumStrList); //添加 集合
            releaseNum = releaseNumStrList.get(releaseNumStrList.size() - 1); // 获取最新releaseNum
        }
        if ("".equals(releaseDate)) {
            String sqlStr = "select distinct DATE_TIME from Rddyxx WHERE ( TYPH_NUM = " + typhNum + " and RELEASE_NUM = " + releaseNum + " ) order by DATE_TIME ASC";
            List<String> releaseDateStrList = rddyxxMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("releaseDate", releaseDateStrList); //添加 集合
            //releaseDate = releaseDateStrList.get(releaseDateStrList.size() - 1); // 获取最新的releaseDate
        }

        // 如果都不为空,检索文件名
        if (!("".equals(releaseDate)) && null != releaseDate) {
            String sqlStr = "select FILENAME from Rddyxx WHERE ( TYPH_NUM = " + typhNum + " and RELEASE_NUM = " + releaseNum + " and DATE_TIME = " +
                    releaseDate + " )";
            List<String> fileName = rddyxxMapper.selectSingleStringList(sqlStr);
            result.put("fileName", fileName); //添加预报单名称
        }
        return result;
    }

    /**
     * 未来十天预报单
     * 只有初始化的时候，yea、month、day、会同时为空
     * 只有day不为空，才会查询fileName
     * <p>
     * 同时 为空，返回 {year:xx, month: xx , day: xx, ho ur:xx }
     * year 不为空，返回 { month: xx , day: xx, hour:xx }
     * year month 不为空，返回 {day : xx, hour:xx}
     * year month day 不为空，返回 {fileName:xx}
     */
    @Override
    public JSONObject getNextTenDaysForecastConditon(String year, String month, String day) {
        // 如果year为空，检索所有年份
        JSONObject result = new JSONObject();
        if ("".equals(year)) {
            String sqlStr = "select distinct YEAR from Wlstybd order by year ASC";
            List<String> yearStrList = wlstybdMapper.selectSingleStringList(sqlStr);
            result.put("year", yearStrList); //添加year 集合
            year = yearStrList.get(yearStrList.size() - 1); // 获取最新的一年
        }
        // 如果月也为空，就根据year检索 month
        if ("".equals(month)) {
            String sqlStr = "select distinct MONTH from Wlstybd WHERE ( YEAR = '" + year + "' ) order by month ASC";
            List<String> monthStrList = wlstybdMapper.selectSingleStringList(sqlStr);
            result.put("month", monthStrList); //添加year 集合
            month = monthStrList.get(monthStrList.size() - 1); // 获取最新的月份
        }
        // 根据 year 和 month 检索 day
        if ("".equals(day)) {
            String sqlStr = "select distinct DAY from Wlstybd WHERE ( YEAR = " + year + " and MONTH = " + month + " ) order by day ASC";
            List<String> dayStrList = wlstybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("day", dayStrList); //添加year 集合
        }
        // 如果year month day都不为空,检索文件名
        if (!("".equals(day)) && null != day) {
            String sqlStr = "select FILENAME from Wlstybd WHERE ( YEAR = " + year + " and MONTH = " + month + " and DAY = " + day + " )";
            List<String> fileName = wlstybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("fileName", fileName); //添加year 集合
        }
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
    @Override
    public JSONObject getSeaIceForecastConditon(String year, String iceNum, String cycle) {
        JSONObject result = new JSONObject();
        if ("".equals(year)) {
            String sqlStr = "select distinct YEAR from Hbybd order by YEAR ASC";
            List<String> yearStrList = hbybdMapper.selectSingleStringList(sqlStr);
            result.put("year", yearStrList); //添加year 集合
            year = yearStrList.get(yearStrList.size() - 1); // 获取最新的一年
        }
        // 如果月也为空，就根据year检索 month
        if ("".equals(iceNum)) {
            String sqlStr = "select distinct NUM from Hbybd WHERE ( YEAR = " + year + " ) order by NUM ASC";
            List<String> iceNumStrList = hbybdMapper.selectSingleStringList(sqlStr);
            result.put("iceNum", iceNumStrList); //添加year 集合
            iceNum = iceNumStrList.get(iceNumStrList.size() - 1); // 获取最新的月份
        }
        // 根据 year 和 month 检索 day
        if ("".equals(cycle)) {
            String sqlStr = "select distinct CYCLE from Hbybd WHERE ( YEAR = " + year + " and NUM = " + iceNum + " ) order by CYCLE ASC";
            List<String> cycleStrList = hbybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("cycle", cycleStrList); //添加year 集合
        }
        // 如果year month day都不为空,检索文件名
        if (!("".equals(cycle)) && null != cycle) {
            String sqlStr = "select FILENAME from Hbybd WHERE ( YEAR = " + year + " and NUM = " + iceNum + " and CYCLE = '" + cycle + "' )";
            List<String> fileName = hbybdMapper.selectSingleStringList(sqlStr);
            // 获取单独的海区预报 day List
            result.put("fileName", fileName); //添加year 集合
        }
        return result;
    }
}
