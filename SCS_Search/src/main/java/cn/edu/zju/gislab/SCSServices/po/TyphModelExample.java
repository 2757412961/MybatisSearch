package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TyphModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TyphModelExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andIdxIsNull() {
            addCriterion("IDX is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("IDX is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(String value) {
            addCriterion("IDX =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(String value) {
            addCriterion("IDX <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(String value) {
            addCriterion("IDX >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(String value) {
            addCriterion("IDX >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(String value) {
            addCriterion("IDX <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(String value) {
            addCriterion("IDX <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLike(String value) {
            addCriterion("IDX like", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotLike(String value) {
            addCriterion("IDX not like", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<String> values) {
            addCriterion("IDX in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<String> values) {
            addCriterion("IDX not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(String value1, String value2) {
            addCriterion("IDX between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(String value1, String value2) {
            addCriterion("IDX not between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andStTimeIsNull() {
            addCriterion("ST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStTimeIsNotNull() {
            addCriterion("ST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStTimeEqualTo(String value) {
            addCriterion("ST_TIME =", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeNotEqualTo(String value) {
            addCriterion("ST_TIME <>", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeGreaterThan(String value) {
            addCriterion("ST_TIME >", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ST_TIME >=", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeLessThan(String value) {
            addCriterion("ST_TIME <", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeLessThanOrEqualTo(String value) {
            addCriterion("ST_TIME <=", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeLike(String value) {
            addCriterion("ST_TIME like", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeNotLike(String value) {
            addCriterion("ST_TIME not like", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeIn(List<String> values) {
            addCriterion("ST_TIME in", values, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeNotIn(List<String> values) {
            addCriterion("ST_TIME not in", values, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeBetween(String value1, String value2) {
            addCriterion("ST_TIME between", value1, value2, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeNotBetween(String value1, String value2) {
            addCriterion("ST_TIME not between", value1, value2, "stTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeIsNull() {
            addCriterion("FC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFcTimeIsNotNull() {
            addCriterion("FC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFcTimeEqualTo(Integer value) {
            addCriterion("FC_TIME =", value, "fcTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeNotEqualTo(Integer value) {
            addCriterion("FC_TIME <>", value, "fcTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeGreaterThan(Integer value) {
            addCriterion("FC_TIME >", value, "fcTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FC_TIME >=", value, "fcTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeLessThan(Integer value) {
            addCriterion("FC_TIME <", value, "fcTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeLessThanOrEqualTo(Integer value) {
            addCriterion("FC_TIME <=", value, "fcTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeIn(List<Integer> values) {
            addCriterion("FC_TIME in", values, "fcTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeNotIn(List<Integer> values) {
            addCriterion("FC_TIME not in", values, "fcTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeBetween(Integer value1, Integer value2) {
            addCriterion("FC_TIME between", value1, value2, "fcTime");
            return (Criteria) this;
        }

        public Criteria andFcTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("FC_TIME not between", value1, value2, "fcTime");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("LAT is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LAT not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("LNG is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("LNG is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("LNG =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("LNG <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("LNG >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LNG >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("LNG <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LNG <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("LNG in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("LNG not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LNG between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LNG not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNull() {
            addCriterion("SPEED is null");
            return (Criteria) this;
        }

        public Criteria andSpeedIsNotNull() {
            addCriterion("SPEED is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedEqualTo(BigDecimal value) {
            addCriterion("SPEED =", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotEqualTo(BigDecimal value) {
            addCriterion("SPEED <>", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThan(BigDecimal value) {
            addCriterion("SPEED >", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPEED >=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThan(BigDecimal value) {
            addCriterion("SPEED <", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPEED <=", value, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedIn(List<BigDecimal> values) {
            addCriterion("SPEED in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotIn(List<BigDecimal> values) {
            addCriterion("SPEED not in", values, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPEED between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andSpeedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPEED not between", value1, value2, "speed");
            return (Criteria) this;
        }

        public Criteria andPressureIsNull() {
            addCriterion("PRESSURE is null");
            return (Criteria) this;
        }

        public Criteria andPressureIsNotNull() {
            addCriterion("PRESSURE is not null");
            return (Criteria) this;
        }

        public Criteria andPressureEqualTo(BigDecimal value) {
            addCriterion("PRESSURE =", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotEqualTo(BigDecimal value) {
            addCriterion("PRESSURE <>", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThan(BigDecimal value) {
            addCriterion("PRESSURE >", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESSURE >=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThan(BigDecimal value) {
            addCriterion("PRESSURE <", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESSURE <=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureIn(List<BigDecimal> values) {
            addCriterion("PRESSURE in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotIn(List<BigDecimal> values) {
            addCriterion("PRESSURE not in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESSURE between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESSURE not between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andTrakIdxIsNull() {
            addCriterion("TRAK_IDX is null");
            return (Criteria) this;
        }

        public Criteria andTrakIdxIsNotNull() {
            addCriterion("TRAK_IDX is not null");
            return (Criteria) this;
        }

        public Criteria andTrakIdxEqualTo(String value) {
            addCriterion("TRAK_IDX =", value, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxNotEqualTo(String value) {
            addCriterion("TRAK_IDX <>", value, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxGreaterThan(String value) {
            addCriterion("TRAK_IDX >", value, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxGreaterThanOrEqualTo(String value) {
            addCriterion("TRAK_IDX >=", value, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxLessThan(String value) {
            addCriterion("TRAK_IDX <", value, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxLessThanOrEqualTo(String value) {
            addCriterion("TRAK_IDX <=", value, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxLike(String value) {
            addCriterion("TRAK_IDX like", value, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxNotLike(String value) {
            addCriterion("TRAK_IDX not like", value, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxIn(List<String> values) {
            addCriterion("TRAK_IDX in", values, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxNotIn(List<String> values) {
            addCriterion("TRAK_IDX not in", values, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxBetween(String value1, String value2) {
            addCriterion("TRAK_IDX between", value1, value2, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andTrakIdxNotBetween(String value1, String value2) {
            addCriterion("TRAK_IDX not between", value1, value2, "trakIdx");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("RADIUS is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("RADIUS is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(Integer value) {
            addCriterion("RADIUS =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(Integer value) {
            addCriterion("RADIUS <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(Integer value) {
            addCriterion("RADIUS >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(Integer value) {
            addCriterion("RADIUS >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(Integer value) {
            addCriterion("RADIUS <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(Integer value) {
            addCriterion("RADIUS <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<Integer> values) {
            addCriterion("RADIUS in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<Integer> values) {
            addCriterion("RADIUS not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(Integer value1, Integer value2) {
            addCriterion("RADIUS between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(Integer value1, Integer value2) {
            addCriterion("RADIUS not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andModelTypeIsNull() {
            addCriterion("MODEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andModelTypeIsNotNull() {
            addCriterion("MODEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andModelTypeEqualTo(String value) {
            addCriterion("MODEL_TYPE =", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeNotEqualTo(String value) {
            addCriterion("MODEL_TYPE <>", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeGreaterThan(String value) {
            addCriterion("MODEL_TYPE >", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_TYPE >=", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeLessThan(String value) {
            addCriterion("MODEL_TYPE <", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeLessThanOrEqualTo(String value) {
            addCriterion("MODEL_TYPE <=", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeLike(String value) {
            addCriterion("MODEL_TYPE like", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeNotLike(String value) {
            addCriterion("MODEL_TYPE not like", value, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeIn(List<String> values) {
            addCriterion("MODEL_TYPE in", values, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeNotIn(List<String> values) {
            addCriterion("MODEL_TYPE not in", values, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeBetween(String value1, String value2) {
            addCriterion("MODEL_TYPE between", value1, value2, "modelType");
            return (Criteria) this;
        }

        public Criteria andModelTypeNotBetween(String value1, String value2) {
            addCriterion("MODEL_TYPE not between", value1, value2, "modelType");
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