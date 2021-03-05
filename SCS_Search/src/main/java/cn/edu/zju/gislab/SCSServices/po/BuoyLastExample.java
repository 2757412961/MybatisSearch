package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuoyLastExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuoyLastExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNull() {
            addCriterion("DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(Date value) {
            addCriterion("DATE_TIME =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(Date value) {
            addCriterion("DATE_TIME <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(Date value) {
            addCriterion("DATE_TIME >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_TIME >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(Date value) {
            addCriterion("DATE_TIME <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DATE_TIME <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<Date> values) {
            addCriterion("DATE_TIME in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<Date> values) {
            addCriterion("DATE_TIME not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(Date value1, Date value2) {
            addCriterion("DATE_TIME between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DATE_TIME not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andTideHeigIsNull() {
            addCriterion("TIDE_HEIG is null");
            return (Criteria) this;
        }

        public Criteria andTideHeigIsNotNull() {
            addCriterion("TIDE_HEIG is not null");
            return (Criteria) this;
        }

        public Criteria andTideHeigEqualTo(BigDecimal value) {
            addCriterion("TIDE_HEIG =", value, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andTideHeigNotEqualTo(BigDecimal value) {
            addCriterion("TIDE_HEIG <>", value, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andTideHeigGreaterThan(BigDecimal value) {
            addCriterion("TIDE_HEIG >", value, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andTideHeigGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIDE_HEIG >=", value, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andTideHeigLessThan(BigDecimal value) {
            addCriterion("TIDE_HEIG <", value, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andTideHeigLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIDE_HEIG <=", value, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andTideHeigIn(List<BigDecimal> values) {
            addCriterion("TIDE_HEIG in", values, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andTideHeigNotIn(List<BigDecimal> values) {
            addCriterion("TIDE_HEIG not in", values, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andTideHeigBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIDE_HEIG between", value1, value2, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andTideHeigNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIDE_HEIG not between", value1, value2, "tideHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigIsNull() {
            addCriterion("WAVE_HEIG is null");
            return (Criteria) this;
        }

        public Criteria andWaveHeigIsNotNull() {
            addCriterion("WAVE_HEIG is not null");
            return (Criteria) this;
        }

        public Criteria andWaveHeigEqualTo(BigDecimal value) {
            addCriterion("WAVE_HEIG =", value, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigNotEqualTo(BigDecimal value) {
            addCriterion("WAVE_HEIG <>", value, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigGreaterThan(BigDecimal value) {
            addCriterion("WAVE_HEIG >", value, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAVE_HEIG >=", value, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigLessThan(BigDecimal value) {
            addCriterion("WAVE_HEIG <", value, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAVE_HEIG <=", value, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigIn(List<BigDecimal> values) {
            addCriterion("WAVE_HEIG in", values, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigNotIn(List<BigDecimal> values) {
            addCriterion("WAVE_HEIG not in", values, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAVE_HEIG between", value1, value2, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveHeigNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAVE_HEIG not between", value1, value2, "waveHeig");
            return (Criteria) this;
        }

        public Criteria andWaveDirIsNull() {
            addCriterion("WAVE_DIR is null");
            return (Criteria) this;
        }

        public Criteria andWaveDirIsNotNull() {
            addCriterion("WAVE_DIR is not null");
            return (Criteria) this;
        }

        public Criteria andWaveDirEqualTo(String value) {
            addCriterion("WAVE_DIR =", value, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirNotEqualTo(String value) {
            addCriterion("WAVE_DIR <>", value, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirGreaterThan(String value) {
            addCriterion("WAVE_DIR >", value, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirGreaterThanOrEqualTo(String value) {
            addCriterion("WAVE_DIR >=", value, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirLessThan(String value) {
            addCriterion("WAVE_DIR <", value, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirLessThanOrEqualTo(String value) {
            addCriterion("WAVE_DIR <=", value, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirLike(String value) {
            addCriterion("WAVE_DIR like", value, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirNotLike(String value) {
            addCriterion("WAVE_DIR not like", value, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirIn(List<String> values) {
            addCriterion("WAVE_DIR in", values, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirNotIn(List<String> values) {
            addCriterion("WAVE_DIR not in", values, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirBetween(String value1, String value2) {
            addCriterion("WAVE_DIR between", value1, value2, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveDirNotBetween(String value1, String value2) {
            addCriterion("WAVE_DIR not between", value1, value2, "waveDir");
            return (Criteria) this;
        }

        public Criteria andWaveCycleIsNull() {
            addCriterion("WAVE_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andWaveCycleIsNotNull() {
            addCriterion("WAVE_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andWaveCycleEqualTo(BigDecimal value) {
            addCriterion("WAVE_CYCLE =", value, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWaveCycleNotEqualTo(BigDecimal value) {
            addCriterion("WAVE_CYCLE <>", value, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWaveCycleGreaterThan(BigDecimal value) {
            addCriterion("WAVE_CYCLE >", value, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWaveCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAVE_CYCLE >=", value, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWaveCycleLessThan(BigDecimal value) {
            addCriterion("WAVE_CYCLE <", value, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWaveCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAVE_CYCLE <=", value, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWaveCycleIn(List<BigDecimal> values) {
            addCriterion("WAVE_CYCLE in", values, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWaveCycleNotIn(List<BigDecimal> values) {
            addCriterion("WAVE_CYCLE not in", values, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWaveCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAVE_CYCLE between", value1, value2, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWaveCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAVE_CYCLE not between", value1, value2, "waveCycle");
            return (Criteria) this;
        }

        public Criteria andWindPowerIsNull() {
            addCriterion("WIND_POWER is null");
            return (Criteria) this;
        }

        public Criteria andWindPowerIsNotNull() {
            addCriterion("WIND_POWER is not null");
            return (Criteria) this;
        }

        public Criteria andWindPowerEqualTo(BigDecimal value) {
            addCriterion("WIND_POWER =", value, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindPowerNotEqualTo(BigDecimal value) {
            addCriterion("WIND_POWER <>", value, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindPowerGreaterThan(BigDecimal value) {
            addCriterion("WIND_POWER >", value, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WIND_POWER >=", value, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindPowerLessThan(BigDecimal value) {
            addCriterion("WIND_POWER <", value, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WIND_POWER <=", value, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindPowerIn(List<BigDecimal> values) {
            addCriterion("WIND_POWER in", values, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindPowerNotIn(List<BigDecimal> values) {
            addCriterion("WIND_POWER not in", values, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIND_POWER between", value1, value2, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WIND_POWER not between", value1, value2, "windPower");
            return (Criteria) this;
        }

        public Criteria andWindDirIsNull() {
            addCriterion("WIND_DIR is null");
            return (Criteria) this;
        }

        public Criteria andWindDirIsNotNull() {
            addCriterion("WIND_DIR is not null");
            return (Criteria) this;
        }

        public Criteria andWindDirEqualTo(String value) {
            addCriterion("WIND_DIR =", value, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirNotEqualTo(String value) {
            addCriterion("WIND_DIR <>", value, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirGreaterThan(String value) {
            addCriterion("WIND_DIR >", value, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirGreaterThanOrEqualTo(String value) {
            addCriterion("WIND_DIR >=", value, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirLessThan(String value) {
            addCriterion("WIND_DIR <", value, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirLessThanOrEqualTo(String value) {
            addCriterion("WIND_DIR <=", value, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirLike(String value) {
            addCriterion("WIND_DIR like", value, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirNotLike(String value) {
            addCriterion("WIND_DIR not like", value, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirIn(List<String> values) {
            addCriterion("WIND_DIR in", values, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirNotIn(List<String> values) {
            addCriterion("WIND_DIR not in", values, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirBetween(String value1, String value2) {
            addCriterion("WIND_DIR between", value1, value2, "windDir");
            return (Criteria) this;
        }

        public Criteria andWindDirNotBetween(String value1, String value2) {
            addCriterion("WIND_DIR not between", value1, value2, "windDir");
            return (Criteria) this;
        }

        public Criteria andGustIsNull() {
            addCriterion("GUST is null");
            return (Criteria) this;
        }

        public Criteria andGustIsNotNull() {
            addCriterion("GUST is not null");
            return (Criteria) this;
        }

        public Criteria andGustEqualTo(BigDecimal value) {
            addCriterion("GUST =", value, "gust");
            return (Criteria) this;
        }

        public Criteria andGustNotEqualTo(BigDecimal value) {
            addCriterion("GUST <>", value, "gust");
            return (Criteria) this;
        }

        public Criteria andGustGreaterThan(BigDecimal value) {
            addCriterion("GUST >", value, "gust");
            return (Criteria) this;
        }

        public Criteria andGustGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUST >=", value, "gust");
            return (Criteria) this;
        }

        public Criteria andGustLessThan(BigDecimal value) {
            addCriterion("GUST <", value, "gust");
            return (Criteria) this;
        }

        public Criteria andGustLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUST <=", value, "gust");
            return (Criteria) this;
        }

        public Criteria andGustIn(List<BigDecimal> values) {
            addCriterion("GUST in", values, "gust");
            return (Criteria) this;
        }

        public Criteria andGustNotIn(List<BigDecimal> values) {
            addCriterion("GUST not in", values, "gust");
            return (Criteria) this;
        }

        public Criteria andGustBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUST between", value1, value2, "gust");
            return (Criteria) this;
        }

        public Criteria andGustNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUST not between", value1, value2, "gust");
            return (Criteria) this;
        }

        public Criteria andSeaTempIsNull() {
            addCriterion("SEA_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andSeaTempIsNotNull() {
            addCriterion("SEA_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andSeaTempEqualTo(BigDecimal value) {
            addCriterion("SEA_TEMP =", value, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andSeaTempNotEqualTo(BigDecimal value) {
            addCriterion("SEA_TEMP <>", value, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andSeaTempGreaterThan(BigDecimal value) {
            addCriterion("SEA_TEMP >", value, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andSeaTempGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEA_TEMP >=", value, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andSeaTempLessThan(BigDecimal value) {
            addCriterion("SEA_TEMP <", value, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andSeaTempLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEA_TEMP <=", value, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andSeaTempIn(List<BigDecimal> values) {
            addCriterion("SEA_TEMP in", values, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andSeaTempNotIn(List<BigDecimal> values) {
            addCriterion("SEA_TEMP not in", values, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andSeaTempBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEA_TEMP between", value1, value2, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andSeaTempNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEA_TEMP not between", value1, value2, "seaTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempIsNull() {
            addCriterion("AT_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andAtTempIsNotNull() {
            addCriterion("AT_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andAtTempEqualTo(BigDecimal value) {
            addCriterion("AT_TEMP =", value, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempNotEqualTo(BigDecimal value) {
            addCriterion("AT_TEMP <>", value, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempGreaterThan(BigDecimal value) {
            addCriterion("AT_TEMP >", value, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AT_TEMP >=", value, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempLessThan(BigDecimal value) {
            addCriterion("AT_TEMP <", value, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AT_TEMP <=", value, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempIn(List<BigDecimal> values) {
            addCriterion("AT_TEMP in", values, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempNotIn(List<BigDecimal> values) {
            addCriterion("AT_TEMP not in", values, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AT_TEMP between", value1, value2, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtTempNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AT_TEMP not between", value1, value2, "atTemp");
            return (Criteria) this;
        }

        public Criteria andAtPressIsNull() {
            addCriterion("AT_PRESS is null");
            return (Criteria) this;
        }

        public Criteria andAtPressIsNotNull() {
            addCriterion("AT_PRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAtPressEqualTo(BigDecimal value) {
            addCriterion("AT_PRESS =", value, "atPress");
            return (Criteria) this;
        }

        public Criteria andAtPressNotEqualTo(BigDecimal value) {
            addCriterion("AT_PRESS <>", value, "atPress");
            return (Criteria) this;
        }

        public Criteria andAtPressGreaterThan(BigDecimal value) {
            addCriterion("AT_PRESS >", value, "atPress");
            return (Criteria) this;
        }

        public Criteria andAtPressGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AT_PRESS >=", value, "atPress");
            return (Criteria) this;
        }

        public Criteria andAtPressLessThan(BigDecimal value) {
            addCriterion("AT_PRESS <", value, "atPress");
            return (Criteria) this;
        }

        public Criteria andAtPressLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AT_PRESS <=", value, "atPress");
            return (Criteria) this;
        }

        public Criteria andAtPressIn(List<BigDecimal> values) {
            addCriterion("AT_PRESS in", values, "atPress");
            return (Criteria) this;
        }

        public Criteria andAtPressNotIn(List<BigDecimal> values) {
            addCriterion("AT_PRESS not in", values, "atPress");
            return (Criteria) this;
        }

        public Criteria andAtPressBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AT_PRESS between", value1, value2, "atPress");
            return (Criteria) this;
        }

        public Criteria andAtPressNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AT_PRESS not between", value1, value2, "atPress");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}