package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TyphForecastExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TyphForecastExample() {
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

        public Criteria andTyphNumIsNull() {
            addCriterion("TYPH_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTyphNumIsNotNull() {
            addCriterion("TYPH_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTyphNumEqualTo(Long value) {
            addCriterion("TYPH_NUM =", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumNotEqualTo(Long value) {
            addCriterion("TYPH_NUM <>", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumGreaterThan(Long value) {
            addCriterion("TYPH_NUM >", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumGreaterThanOrEqualTo(Long value) {
            addCriterion("TYPH_NUM >=", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumLessThan(Long value) {
            addCriterion("TYPH_NUM <", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumLessThanOrEqualTo(Long value) {
            addCriterion("TYPH_NUM <=", value, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumIn(List<Long> values) {
            addCriterion("TYPH_NUM in", values, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumNotIn(List<Long> values) {
            addCriterion("TYPH_NUM not in", values, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumBetween(Long value1, Long value2) {
            addCriterion("TYPH_NUM between", value1, value2, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTyphNumNotBetween(Long value1, Long value2) {
            addCriterion("TYPH_NUM not between", value1, value2, "typhNum");
            return (Criteria) this;
        }

        public Criteria andTmIsNull() {
            addCriterion("TM is null");
            return (Criteria) this;
        }

        public Criteria andTmIsNotNull() {
            addCriterion("TM is not null");
            return (Criteria) this;
        }

        public Criteria andTmEqualTo(String value) {
            addCriterion("TM =", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotEqualTo(String value) {
            addCriterion("TM <>", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThan(String value) {
            addCriterion("TM >", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmGreaterThanOrEqualTo(String value) {
            addCriterion("TM >=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThan(String value) {
            addCriterion("TM <", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLessThanOrEqualTo(String value) {
            addCriterion("TM <=", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmLike(String value) {
            addCriterion("TM like", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotLike(String value) {
            addCriterion("TM not like", value, "tm");
            return (Criteria) this;
        }

        public Criteria andTmIn(List<String> values) {
            addCriterion("TM in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotIn(List<String> values) {
            addCriterion("TM not in", values, "tm");
            return (Criteria) this;
        }

        public Criteria andTmBetween(String value1, String value2) {
            addCriterion("TM between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andTmNotBetween(String value1, String value2) {
            addCriterion("TM not between", value1, value2, "tm");
            return (Criteria) this;
        }

        public Criteria andQbsjIsNull() {
            addCriterion("QBSJ is null");
            return (Criteria) this;
        }

        public Criteria andQbsjIsNotNull() {
            addCriterion("QBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andQbsjEqualTo(Date value) {
            addCriterion("QBSJ =", value, "qbsj");
            return (Criteria) this;
        }

        public Criteria andQbsjNotEqualTo(Date value) {
            addCriterion("QBSJ <>", value, "qbsj");
            return (Criteria) this;
        }

        public Criteria andQbsjGreaterThan(Date value) {
            addCriterion("QBSJ >", value, "qbsj");
            return (Criteria) this;
        }

        public Criteria andQbsjGreaterThanOrEqualTo(Date value) {
            addCriterion("QBSJ >=", value, "qbsj");
            return (Criteria) this;
        }

        public Criteria andQbsjLessThan(Date value) {
            addCriterion("QBSJ <", value, "qbsj");
            return (Criteria) this;
        }

        public Criteria andQbsjLessThanOrEqualTo(Date value) {
            addCriterion("QBSJ <=", value, "qbsj");
            return (Criteria) this;
        }

        public Criteria andQbsjIn(List<Date> values) {
            addCriterion("QBSJ in", values, "qbsj");
            return (Criteria) this;
        }

        public Criteria andQbsjNotIn(List<Date> values) {
            addCriterion("QBSJ not in", values, "qbsj");
            return (Criteria) this;
        }

        public Criteria andQbsjBetween(Date value1, Date value2) {
            addCriterion("QBSJ between", value1, value2, "qbsj");
            return (Criteria) this;
        }

        public Criteria andQbsjNotBetween(Date value1, Date value2) {
            addCriterion("QBSJ not between", value1, value2, "qbsj");
            return (Criteria) this;
        }

        public Criteria andYbsjIsNull() {
            addCriterion("YBSJ is null");
            return (Criteria) this;
        }

        public Criteria andYbsjIsNotNull() {
            addCriterion("YBSJ is not null");
            return (Criteria) this;
        }

        public Criteria andYbsjEqualTo(Date value) {
            addCriterion("YBSJ =", value, "ybsj");
            return (Criteria) this;
        }

        public Criteria andYbsjNotEqualTo(Date value) {
            addCriterion("YBSJ <>", value, "ybsj");
            return (Criteria) this;
        }

        public Criteria andYbsjGreaterThan(Date value) {
            addCriterion("YBSJ >", value, "ybsj");
            return (Criteria) this;
        }

        public Criteria andYbsjGreaterThanOrEqualTo(Date value) {
            addCriterion("YBSJ >=", value, "ybsj");
            return (Criteria) this;
        }

        public Criteria andYbsjLessThan(Date value) {
            addCriterion("YBSJ <", value, "ybsj");
            return (Criteria) this;
        }

        public Criteria andYbsjLessThanOrEqualTo(Date value) {
            addCriterion("YBSJ <=", value, "ybsj");
            return (Criteria) this;
        }

        public Criteria andYbsjIn(List<Date> values) {
            addCriterion("YBSJ in", values, "ybsj");
            return (Criteria) this;
        }

        public Criteria andYbsjNotIn(List<Date> values) {
            addCriterion("YBSJ not in", values, "ybsj");
            return (Criteria) this;
        }

        public Criteria andYbsjBetween(Date value1, Date value2) {
            addCriterion("YBSJ between", value1, value2, "ybsj");
            return (Criteria) this;
        }

        public Criteria andYbsjNotBetween(Date value1, Date value2) {
            addCriterion("YBSJ not between", value1, value2, "ybsj");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("LON is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("LON is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(BigDecimal value) {
            addCriterion("LON =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(BigDecimal value) {
            addCriterion("LON <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(BigDecimal value) {
            addCriterion("LON >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LON >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(BigDecimal value) {
            addCriterion("LON <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LON <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<BigDecimal> values) {
            addCriterion("LON in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<BigDecimal> values) {
            addCriterion("LON not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LON between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LON not between", value1, value2, "lon");
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

        public Criteria andZxfsIsNull() {
            addCriterion("ZXFS is null");
            return (Criteria) this;
        }

        public Criteria andZxfsIsNotNull() {
            addCriterion("ZXFS is not null");
            return (Criteria) this;
        }

        public Criteria andZxfsEqualTo(Integer value) {
            addCriterion("ZXFS =", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsNotEqualTo(Integer value) {
            addCriterion("ZXFS <>", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsGreaterThan(Integer value) {
            addCriterion("ZXFS >", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXFS >=", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsLessThan(Integer value) {
            addCriterion("ZXFS <", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsLessThanOrEqualTo(Integer value) {
            addCriterion("ZXFS <=", value, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsIn(List<Integer> values) {
            addCriterion("ZXFS in", values, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsNotIn(List<Integer> values) {
            addCriterion("ZXFS not in", values, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsBetween(Integer value1, Integer value2) {
            addCriterion("ZXFS between", value1, value2, "zxfs");
            return (Criteria) this;
        }

        public Criteria andZxfsNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXFS not between", value1, value2, "zxfs");
            return (Criteria) this;
        }

        public Criteria andStrengthIsNull() {
            addCriterion("STRENGTH is null");
            return (Criteria) this;
        }

        public Criteria andStrengthIsNotNull() {
            addCriterion("STRENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andStrengthEqualTo(String value) {
            addCriterion("STRENGTH =", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotEqualTo(String value) {
            addCriterion("STRENGTH <>", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthGreaterThan(String value) {
            addCriterion("STRENGTH >", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthGreaterThanOrEqualTo(String value) {
            addCriterion("STRENGTH >=", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLessThan(String value) {
            addCriterion("STRENGTH <", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLessThanOrEqualTo(String value) {
            addCriterion("STRENGTH <=", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthLike(String value) {
            addCriterion("STRENGTH like", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotLike(String value) {
            addCriterion("STRENGTH not like", value, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthIn(List<String> values) {
            addCriterion("STRENGTH in", values, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotIn(List<String> values) {
            addCriterion("STRENGTH not in", values, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthBetween(String value1, String value2) {
            addCriterion("STRENGTH between", value1, value2, "strength");
            return (Criteria) this;
        }

        public Criteria andStrengthNotBetween(String value1, String value2) {
            addCriterion("STRENGTH not between", value1, value2, "strength");
            return (Criteria) this;
        }

        public Criteria andRadius7IsNull() {
            addCriterion("RADIUS_7 is null");
            return (Criteria) this;
        }

        public Criteria andRadius7IsNotNull() {
            addCriterion("RADIUS_7 is not null");
            return (Criteria) this;
        }

        public Criteria andRadius7EqualTo(Long value) {
            addCriterion("RADIUS_7 =", value, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius7NotEqualTo(Long value) {
            addCriterion("RADIUS_7 <>", value, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius7GreaterThan(Long value) {
            addCriterion("RADIUS_7 >", value, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius7GreaterThanOrEqualTo(Long value) {
            addCriterion("RADIUS_7 >=", value, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius7LessThan(Long value) {
            addCriterion("RADIUS_7 <", value, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius7LessThanOrEqualTo(Long value) {
            addCriterion("RADIUS_7 <=", value, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius7In(List<Long> values) {
            addCriterion("RADIUS_7 in", values, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius7NotIn(List<Long> values) {
            addCriterion("RADIUS_7 not in", values, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius7Between(Long value1, Long value2) {
            addCriterion("RADIUS_7 between", value1, value2, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius7NotBetween(Long value1, Long value2) {
            addCriterion("RADIUS_7 not between", value1, value2, "radius7");
            return (Criteria) this;
        }

        public Criteria andRadius10IsNull() {
            addCriterion("RADIUS_10 is null");
            return (Criteria) this;
        }

        public Criteria andRadius10IsNotNull() {
            addCriterion("RADIUS_10 is not null");
            return (Criteria) this;
        }

        public Criteria andRadius10EqualTo(Long value) {
            addCriterion("RADIUS_10 =", value, "radius10");
            return (Criteria) this;
        }

        public Criteria andRadius10NotEqualTo(Long value) {
            addCriterion("RADIUS_10 <>", value, "radius10");
            return (Criteria) this;
        }

        public Criteria andRadius10GreaterThan(Long value) {
            addCriterion("RADIUS_10 >", value, "radius10");
            return (Criteria) this;
        }

        public Criteria andRadius10GreaterThanOrEqualTo(Long value) {
            addCriterion("RADIUS_10 >=", value, "radius10");
            return (Criteria) this;
        }

        public Criteria andRadius10LessThan(Long value) {
            addCriterion("RADIUS_10 <", value, "radius10");
            return (Criteria) this;
        }

        public Criteria andRadius10LessThanOrEqualTo(Long value) {
            addCriterion("RADIUS_10 <=", value, "radius10");
            return (Criteria) this;
        }

        public Criteria andRadius10In(List<Long> values) {
            addCriterion("RADIUS_10 in", values, "radius10");
            return (Criteria) this;
        }

        public Criteria andRadius10NotIn(List<Long> values) {
            addCriterion("RADIUS_10 not in", values, "radius10");
            return (Criteria) this;
        }

        public Criteria andRadius10Between(Long value1, Long value2) {
            addCriterion("RADIUS_10 between", value1, value2, "radius10");
            return (Criteria) this;
        }

        public Criteria andRadius10NotBetween(Long value1, Long value2) {
            addCriterion("RADIUS_10 not between", value1, value2, "radius10");
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