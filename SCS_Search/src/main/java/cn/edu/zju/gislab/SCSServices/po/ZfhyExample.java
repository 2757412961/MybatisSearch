package cn.edu.zju.gislab.SCSServices.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZfhyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZfhyExample() {
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

        public Criteria andHymcIsNull() {
            addCriterion("HYMC is null");
            return (Criteria) this;
        }

        public Criteria andHymcIsNotNull() {
            addCriterion("HYMC is not null");
            return (Criteria) this;
        }

        public Criteria andHymcEqualTo(String value) {
            addCriterion("HYMC =", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotEqualTo(String value) {
            addCriterion("HYMC <>", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcGreaterThan(String value) {
            addCriterion("HYMC >", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcGreaterThanOrEqualTo(String value) {
            addCriterion("HYMC >=", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcLessThan(String value) {
            addCriterion("HYMC <", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcLessThanOrEqualTo(String value) {
            addCriterion("HYMC <=", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcLike(String value) {
            addCriterion("HYMC like", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotLike(String value) {
            addCriterion("HYMC not like", value, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcIn(List<String> values) {
            addCriterion("HYMC in", values, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotIn(List<String> values) {
            addCriterion("HYMC not in", values, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcBetween(String value1, String value2) {
            addCriterion("HYMC between", value1, value2, "hymc");
            return (Criteria) this;
        }

        public Criteria andHymcNotBetween(String value1, String value2) {
            addCriterion("HYMC not between", value1, value2, "hymc");
            return (Criteria) this;
        }

        public Criteria andYbtcIsNull() {
            addCriterion("YBTC is null");
            return (Criteria) this;
        }

        public Criteria andYbtcIsNotNull() {
            addCriterion("YBTC is not null");
            return (Criteria) this;
        }

        public Criteria andYbtcEqualTo(Long value) {
            addCriterion("YBTC =", value, "ybtc");
            return (Criteria) this;
        }

        public Criteria andYbtcNotEqualTo(Long value) {
            addCriterion("YBTC <>", value, "ybtc");
            return (Criteria) this;
        }

        public Criteria andYbtcGreaterThan(Long value) {
            addCriterion("YBTC >", value, "ybtc");
            return (Criteria) this;
        }

        public Criteria andYbtcGreaterThanOrEqualTo(Long value) {
            addCriterion("YBTC >=", value, "ybtc");
            return (Criteria) this;
        }

        public Criteria andYbtcLessThan(Long value) {
            addCriterion("YBTC <", value, "ybtc");
            return (Criteria) this;
        }

        public Criteria andYbtcLessThanOrEqualTo(Long value) {
            addCriterion("YBTC <=", value, "ybtc");
            return (Criteria) this;
        }

        public Criteria andYbtcIn(List<Long> values) {
            addCriterion("YBTC in", values, "ybtc");
            return (Criteria) this;
        }

        public Criteria andYbtcNotIn(List<Long> values) {
            addCriterion("YBTC not in", values, "ybtc");
            return (Criteria) this;
        }

        public Criteria andYbtcBetween(Long value1, Long value2) {
            addCriterion("YBTC between", value1, value2, "ybtc");
            return (Criteria) this;
        }

        public Criteria andYbtcNotBetween(Long value1, Long value2) {
            addCriterion("YBTC not between", value1, value2, "ybtc");
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

        public Criteria andTqqkIsNull() {
            addCriterion("TQQK is null");
            return (Criteria) this;
        }

        public Criteria andTqqkIsNotNull() {
            addCriterion("TQQK is not null");
            return (Criteria) this;
        }

        public Criteria andTqqkEqualTo(String value) {
            addCriterion("TQQK =", value, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkNotEqualTo(String value) {
            addCriterion("TQQK <>", value, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkGreaterThan(String value) {
            addCriterion("TQQK >", value, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkGreaterThanOrEqualTo(String value) {
            addCriterion("TQQK >=", value, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkLessThan(String value) {
            addCriterion("TQQK <", value, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkLessThanOrEqualTo(String value) {
            addCriterion("TQQK <=", value, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkLike(String value) {
            addCriterion("TQQK like", value, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkNotLike(String value) {
            addCriterion("TQQK not like", value, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkIn(List<String> values) {
            addCriterion("TQQK in", values, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkNotIn(List<String> values) {
            addCriterion("TQQK not in", values, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkBetween(String value1, String value2) {
            addCriterion("TQQK between", value1, value2, "tqqk");
            return (Criteria) this;
        }

        public Criteria andTqqkNotBetween(String value1, String value2) {
            addCriterion("TQQK not between", value1, value2, "tqqk");
            return (Criteria) this;
        }

        public Criteria andFxIsNull() {
            addCriterion("FX is null");
            return (Criteria) this;
        }

        public Criteria andFxIsNotNull() {
            addCriterion("FX is not null");
            return (Criteria) this;
        }

        public Criteria andFxEqualTo(String value) {
            addCriterion("FX =", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxNotEqualTo(String value) {
            addCriterion("FX <>", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxGreaterThan(String value) {
            addCriterion("FX >", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxGreaterThanOrEqualTo(String value) {
            addCriterion("FX >=", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxLessThan(String value) {
            addCriterion("FX <", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxLessThanOrEqualTo(String value) {
            addCriterion("FX <=", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxLike(String value) {
            addCriterion("FX like", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxNotLike(String value) {
            addCriterion("FX not like", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxIn(List<String> values) {
            addCriterion("FX in", values, "fx");
            return (Criteria) this;
        }

        public Criteria andFxNotIn(List<String> values) {
            addCriterion("FX not in", values, "fx");
            return (Criteria) this;
        }

        public Criteria andFxBetween(String value1, String value2) {
            addCriterion("FX between", value1, value2, "fx");
            return (Criteria) this;
        }

        public Criteria andFxNotBetween(String value1, String value2) {
            addCriterion("FX not between", value1, value2, "fx");
            return (Criteria) this;
        }

        public Criteria andFsIsNull() {
            addCriterion("FS is null");
            return (Criteria) this;
        }

        public Criteria andFsIsNotNull() {
            addCriterion("FS is not null");
            return (Criteria) this;
        }

        public Criteria andFsEqualTo(String value) {
            addCriterion("FS =", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotEqualTo(String value) {
            addCriterion("FS <>", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsGreaterThan(String value) {
            addCriterion("FS >", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsGreaterThanOrEqualTo(String value) {
            addCriterion("FS >=", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsLessThan(String value) {
            addCriterion("FS <", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsLessThanOrEqualTo(String value) {
            addCriterion("FS <=", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsLike(String value) {
            addCriterion("FS like", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotLike(String value) {
            addCriterion("FS not like", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsIn(List<String> values) {
            addCriterion("FS in", values, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotIn(List<String> values) {
            addCriterion("FS not in", values, "fs");
            return (Criteria) this;
        }

        public Criteria andFsBetween(String value1, String value2) {
            addCriterion("FS between", value1, value2, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotBetween(String value1, String value2) {
            addCriterion("FS not between", value1, value2, "fs");
            return (Criteria) this;
        }

        public Criteria andScfwIsNull() {
            addCriterion("SCFW is null");
            return (Criteria) this;
        }

        public Criteria andScfwIsNotNull() {
            addCriterion("SCFW is not null");
            return (Criteria) this;
        }

        public Criteria andScfwEqualTo(String value) {
            addCriterion("SCFW =", value, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwNotEqualTo(String value) {
            addCriterion("SCFW <>", value, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwGreaterThan(String value) {
            addCriterion("SCFW >", value, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwGreaterThanOrEqualTo(String value) {
            addCriterion("SCFW >=", value, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwLessThan(String value) {
            addCriterion("SCFW <", value, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwLessThanOrEqualTo(String value) {
            addCriterion("SCFW <=", value, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwLike(String value) {
            addCriterion("SCFW like", value, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwNotLike(String value) {
            addCriterion("SCFW not like", value, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwIn(List<String> values) {
            addCriterion("SCFW in", values, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwNotIn(List<String> values) {
            addCriterion("SCFW not in", values, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwBetween(String value1, String value2) {
            addCriterion("SCFW between", value1, value2, "scfw");
            return (Criteria) this;
        }

        public Criteria andScfwNotBetween(String value1, String value2) {
            addCriterion("SCFW not between", value1, value2, "scfw");
            return (Criteria) this;
        }

        public Criteria andFlIsNull() {
            addCriterion("FL is null");
            return (Criteria) this;
        }

        public Criteria andFlIsNotNull() {
            addCriterion("FL is not null");
            return (Criteria) this;
        }

        public Criteria andFlEqualTo(String value) {
            addCriterion("FL =", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotEqualTo(String value) {
            addCriterion("FL <>", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThan(String value) {
            addCriterion("FL >", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThanOrEqualTo(String value) {
            addCriterion("FL >=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThan(String value) {
            addCriterion("FL <", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThanOrEqualTo(String value) {
            addCriterion("FL <=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLike(String value) {
            addCriterion("FL like", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotLike(String value) {
            addCriterion("FL not like", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlIn(List<String> values) {
            addCriterion("FL in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotIn(List<String> values) {
            addCriterion("FL not in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlBetween(String value1, String value2) {
            addCriterion("FL between", value1, value2, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotBetween(String value1, String value2) {
            addCriterion("FL not between", value1, value2, "fl");
            return (Criteria) this;
        }

        public Criteria andYlIsNull() {
            addCriterion("YL is null");
            return (Criteria) this;
        }

        public Criteria andYlIsNotNull() {
            addCriterion("YL is not null");
            return (Criteria) this;
        }

        public Criteria andYlEqualTo(String value) {
            addCriterion("YL =", value, "yl");
            return (Criteria) this;
        }

        public Criteria andYlNotEqualTo(String value) {
            addCriterion("YL <>", value, "yl");
            return (Criteria) this;
        }

        public Criteria andYlGreaterThan(String value) {
            addCriterion("YL >", value, "yl");
            return (Criteria) this;
        }

        public Criteria andYlGreaterThanOrEqualTo(String value) {
            addCriterion("YL >=", value, "yl");
            return (Criteria) this;
        }

        public Criteria andYlLessThan(String value) {
            addCriterion("YL <", value, "yl");
            return (Criteria) this;
        }

        public Criteria andYlLessThanOrEqualTo(String value) {
            addCriterion("YL <=", value, "yl");
            return (Criteria) this;
        }

        public Criteria andYlLike(String value) {
            addCriterion("YL like", value, "yl");
            return (Criteria) this;
        }

        public Criteria andYlNotLike(String value) {
            addCriterion("YL not like", value, "yl");
            return (Criteria) this;
        }

        public Criteria andYlIn(List<String> values) {
            addCriterion("YL in", values, "yl");
            return (Criteria) this;
        }

        public Criteria andYlNotIn(List<String> values) {
            addCriterion("YL not in", values, "yl");
            return (Criteria) this;
        }

        public Criteria andYlBetween(String value1, String value2) {
            addCriterion("YL between", value1, value2, "yl");
            return (Criteria) this;
        }

        public Criteria andYlNotBetween(String value1, String value2) {
            addCriterion("YL not between", value1, value2, "yl");
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