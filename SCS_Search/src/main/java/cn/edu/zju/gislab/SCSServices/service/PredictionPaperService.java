package cn.edu.zju.gislab.SCSServices.service;

import com.alibaba.fastjson.JSONObject;

public interface PredictionPaperService {
    /**
     *  查询海区预报单条件：年、月、日、预报单名称
     * @return
     */
    public JSONObject getSeaAreaForecastConditon(String year, String month, String day);

    /**
     *  查询执法预报单条件：年、月、日、时，预报单名称
     * @return
     */
    public JSONObject getLawAreaForecastConditon(String year, String month, String day, String hour);

    /**
     *  查询台风预报单条件：台风编号、预报次数、发布时间
     * @return
     */
    public JSONObject getTyphoonForecastConditon(String num, String releaseNum, String releaseDate);

    /**
     *  查询热带低压预报单条件：台风编号、预报时间、发布时间
     * @return
     */
    public JSONObject getTropicsForecastConditon(String typhNum, String releaseNum, String releaseDate);

    /**
     *  未来十天预报单：年、月、日
     * @return
     */
    public JSONObject getNextTenDaysForecastConditon(String year, String month, String day);

    /**
     *  海冰预报单：年、编号、周期
     * @return
     */
    public JSONObject getSeaIceForecastConditon(String year, String iceNum, String cycle);
}
