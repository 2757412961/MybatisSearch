package cn.edu.zju.gislab.SCSServices.po;

import java.util.ArrayList;
import java.util.List;

public class WebupdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebupdateExample() {
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

        public Criteria andTyphCenterIsNull() {
            addCriterion("TYPH_CENTER is null");
            return (Criteria) this;
        }

        public Criteria andTyphCenterIsNotNull() {
            addCriterion("TYPH_CENTER is not null");
            return (Criteria) this;
        }

        public Criteria andTyphCenterEqualTo(String value) {
            addCriterion("TYPH_CENTER =", value, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterNotEqualTo(String value) {
            addCriterion("TYPH_CENTER <>", value, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterGreaterThan(String value) {
            addCriterion("TYPH_CENTER >", value, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterGreaterThanOrEqualTo(String value) {
            addCriterion("TYPH_CENTER >=", value, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterLessThan(String value) {
            addCriterion("TYPH_CENTER <", value, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterLessThanOrEqualTo(String value) {
            addCriterion("TYPH_CENTER <=", value, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterLike(String value) {
            addCriterion("TYPH_CENTER like", value, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterNotLike(String value) {
            addCriterion("TYPH_CENTER not like", value, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterIn(List<String> values) {
            addCriterion("TYPH_CENTER in", values, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterNotIn(List<String> values) {
            addCriterion("TYPH_CENTER not in", values, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterBetween(String value1, String value2) {
            addCriterion("TYPH_CENTER between", value1, value2, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andTyphCenterNotBetween(String value1, String value2) {
            addCriterion("TYPH_CENTER not between", value1, value2, "typhCenter");
            return (Criteria) this;
        }

        public Criteria andSatellitePictIsNull() {
            addCriterion("SATELLITE_PICT is null");
            return (Criteria) this;
        }

        public Criteria andSatellitePictIsNotNull() {
            addCriterion("SATELLITE_PICT is not null");
            return (Criteria) this;
        }

        public Criteria andSatellitePictEqualTo(String value) {
            addCriterion("SATELLITE_PICT =", value, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictNotEqualTo(String value) {
            addCriterion("SATELLITE_PICT <>", value, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictGreaterThan(String value) {
            addCriterion("SATELLITE_PICT >", value, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictGreaterThanOrEqualTo(String value) {
            addCriterion("SATELLITE_PICT >=", value, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictLessThan(String value) {
            addCriterion("SATELLITE_PICT <", value, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictLessThanOrEqualTo(String value) {
            addCriterion("SATELLITE_PICT <=", value, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictLike(String value) {
            addCriterion("SATELLITE_PICT like", value, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictNotLike(String value) {
            addCriterion("SATELLITE_PICT not like", value, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictIn(List<String> values) {
            addCriterion("SATELLITE_PICT in", values, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictNotIn(List<String> values) {
            addCriterion("SATELLITE_PICT not in", values, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictBetween(String value1, String value2) {
            addCriterion("SATELLITE_PICT between", value1, value2, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andSatellitePictNotBetween(String value1, String value2) {
            addCriterion("SATELLITE_PICT not between", value1, value2, "satellitePict");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaIsNull() {
            addCriterion("WEATHER_KOREA is null");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaIsNotNull() {
            addCriterion("WEATHER_KOREA is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaEqualTo(String value) {
            addCriterion("WEATHER_KOREA =", value, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaNotEqualTo(String value) {
            addCriterion("WEATHER_KOREA <>", value, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaGreaterThan(String value) {
            addCriterion("WEATHER_KOREA >", value, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaGreaterThanOrEqualTo(String value) {
            addCriterion("WEATHER_KOREA >=", value, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaLessThan(String value) {
            addCriterion("WEATHER_KOREA <", value, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaLessThanOrEqualTo(String value) {
            addCriterion("WEATHER_KOREA <=", value, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaLike(String value) {
            addCriterion("WEATHER_KOREA like", value, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaNotLike(String value) {
            addCriterion("WEATHER_KOREA not like", value, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaIn(List<String> values) {
            addCriterion("WEATHER_KOREA in", values, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaNotIn(List<String> values) {
            addCriterion("WEATHER_KOREA not in", values, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaBetween(String value1, String value2) {
            addCriterion("WEATHER_KOREA between", value1, value2, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andWeatherKoreaNotBetween(String value1, String value2) {
            addCriterion("WEATHER_KOREA not between", value1, value2, "weatherKorea");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsIsNull() {
            addCriterion("SATELLITE_ANS is null");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsIsNotNull() {
            addCriterion("SATELLITE_ANS is not null");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsEqualTo(String value) {
            addCriterion("SATELLITE_ANS =", value, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsNotEqualTo(String value) {
            addCriterion("SATELLITE_ANS <>", value, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsGreaterThan(String value) {
            addCriterion("SATELLITE_ANS >", value, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsGreaterThanOrEqualTo(String value) {
            addCriterion("SATELLITE_ANS >=", value, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsLessThan(String value) {
            addCriterion("SATELLITE_ANS <", value, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsLessThanOrEqualTo(String value) {
            addCriterion("SATELLITE_ANS <=", value, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsLike(String value) {
            addCriterion("SATELLITE_ANS like", value, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsNotLike(String value) {
            addCriterion("SATELLITE_ANS not like", value, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsIn(List<String> values) {
            addCriterion("SATELLITE_ANS in", values, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsNotIn(List<String> values) {
            addCriterion("SATELLITE_ANS not in", values, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsBetween(String value1, String value2) {
            addCriterion("SATELLITE_ANS between", value1, value2, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteAnsNotBetween(String value1, String value2) {
            addCriterion("SATELLITE_ANS not between", value1, value2, "satelliteAns");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifIsNull() {
            addCriterion("SATELLITE_REDGIF is null");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifIsNotNull() {
            addCriterion("SATELLITE_REDGIF is not null");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifEqualTo(String value) {
            addCriterion("SATELLITE_REDGIF =", value, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifNotEqualTo(String value) {
            addCriterion("SATELLITE_REDGIF <>", value, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifGreaterThan(String value) {
            addCriterion("SATELLITE_REDGIF >", value, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifGreaterThanOrEqualTo(String value) {
            addCriterion("SATELLITE_REDGIF >=", value, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifLessThan(String value) {
            addCriterion("SATELLITE_REDGIF <", value, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifLessThanOrEqualTo(String value) {
            addCriterion("SATELLITE_REDGIF <=", value, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifLike(String value) {
            addCriterion("SATELLITE_REDGIF like", value, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifNotLike(String value) {
            addCriterion("SATELLITE_REDGIF not like", value, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifIn(List<String> values) {
            addCriterion("SATELLITE_REDGIF in", values, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifNotIn(List<String> values) {
            addCriterion("SATELLITE_REDGIF not in", values, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifBetween(String value1, String value2) {
            addCriterion("SATELLITE_REDGIF between", value1, value2, "satelliteRedgif");
            return (Criteria) this;
        }

        public Criteria andSatelliteRedgifNotBetween(String value1, String value2) {
            addCriterion("SATELLITE_REDGIF not between", value1, value2, "satelliteRedgif");
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