package cn.edu.zju.gislab.SCSServices.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZfhyWlstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZfhyWlstExample() {
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

        public Criteria andYbrqIsNull() {
            addCriterion("YBRQ is null");
            return (Criteria) this;
        }

        public Criteria andYbrqIsNotNull() {
            addCriterion("YBRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYbrqEqualTo(Date value) {
            addCriterion("YBRQ =", value, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbrqNotEqualTo(Date value) {
            addCriterion("YBRQ <>", value, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbrqGreaterThan(Date value) {
            addCriterion("YBRQ >", value, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbrqGreaterThanOrEqualTo(Date value) {
            addCriterion("YBRQ >=", value, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbrqLessThan(Date value) {
            addCriterion("YBRQ <", value, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbrqLessThanOrEqualTo(Date value) {
            addCriterion("YBRQ <=", value, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbrqIn(List<Date> values) {
            addCriterion("YBRQ in", values, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbrqNotIn(List<Date> values) {
            addCriterion("YBRQ not in", values, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbrqBetween(Date value1, Date value2) {
            addCriterion("YBRQ between", value1, value2, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbrqNotBetween(Date value1, Date value2) {
            addCriterion("YBRQ not between", value1, value2, "ybrq");
            return (Criteria) this;
        }

        public Criteria andYbscIsNull() {
            addCriterion("YBSC is null");
            return (Criteria) this;
        }

        public Criteria andYbscIsNotNull() {
            addCriterion("YBSC is not null");
            return (Criteria) this;
        }

        public Criteria andYbscEqualTo(String value) {
            addCriterion("YBSC =", value, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscNotEqualTo(String value) {
            addCriterion("YBSC <>", value, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscGreaterThan(String value) {
            addCriterion("YBSC >", value, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscGreaterThanOrEqualTo(String value) {
            addCriterion("YBSC >=", value, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscLessThan(String value) {
            addCriterion("YBSC <", value, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscLessThanOrEqualTo(String value) {
            addCriterion("YBSC <=", value, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscLike(String value) {
            addCriterion("YBSC like", value, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscNotLike(String value) {
            addCriterion("YBSC not like", value, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscIn(List<String> values) {
            addCriterion("YBSC in", values, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscNotIn(List<String> values) {
            addCriterion("YBSC not in", values, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscBetween(String value1, String value2) {
            addCriterion("YBSC between", value1, value2, "ybsc");
            return (Criteria) this;
        }

        public Criteria andYbscNotBetween(String value1, String value2) {
            addCriterion("YBSC not between", value1, value2, "ybsc");
            return (Criteria) this;
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

        public Criteria andZfIsNull() {
            addCriterion("ZF is null");
            return (Criteria) this;
        }

        public Criteria andZfIsNotNull() {
            addCriterion("ZF is not null");
            return (Criteria) this;
        }

        public Criteria andZfEqualTo(String value) {
            addCriterion("ZF =", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotEqualTo(String value) {
            addCriterion("ZF <>", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfGreaterThan(String value) {
            addCriterion("ZF >", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfGreaterThanOrEqualTo(String value) {
            addCriterion("ZF >=", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLessThan(String value) {
            addCriterion("ZF <", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLessThanOrEqualTo(String value) {
            addCriterion("ZF <=", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfLike(String value) {
            addCriterion("ZF like", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotLike(String value) {
            addCriterion("ZF not like", value, "zf");
            return (Criteria) this;
        }

        public Criteria andZfIn(List<String> values) {
            addCriterion("ZF in", values, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotIn(List<String> values) {
            addCriterion("ZF not in", values, "zf");
            return (Criteria) this;
        }

        public Criteria andZfBetween(String value1, String value2) {
            addCriterion("ZF between", value1, value2, "zf");
            return (Criteria) this;
        }

        public Criteria andZfNotBetween(String value1, String value2) {
            addCriterion("ZF not between", value1, value2, "zf");
            return (Criteria) this;
        }

        public Criteria andLgIsNull() {
            addCriterion("LG is null");
            return (Criteria) this;
        }

        public Criteria andLgIsNotNull() {
            addCriterion("LG is not null");
            return (Criteria) this;
        }

        public Criteria andLgEqualTo(String value) {
            addCriterion("LG =", value, "lg");
            return (Criteria) this;
        }

        public Criteria andLgNotEqualTo(String value) {
            addCriterion("LG <>", value, "lg");
            return (Criteria) this;
        }

        public Criteria andLgGreaterThan(String value) {
            addCriterion("LG >", value, "lg");
            return (Criteria) this;
        }

        public Criteria andLgGreaterThanOrEqualTo(String value) {
            addCriterion("LG >=", value, "lg");
            return (Criteria) this;
        }

        public Criteria andLgLessThan(String value) {
            addCriterion("LG <", value, "lg");
            return (Criteria) this;
        }

        public Criteria andLgLessThanOrEqualTo(String value) {
            addCriterion("LG <=", value, "lg");
            return (Criteria) this;
        }

        public Criteria andLgLike(String value) {
            addCriterion("LG like", value, "lg");
            return (Criteria) this;
        }

        public Criteria andLgNotLike(String value) {
            addCriterion("LG not like", value, "lg");
            return (Criteria) this;
        }

        public Criteria andLgIn(List<String> values) {
            addCriterion("LG in", values, "lg");
            return (Criteria) this;
        }

        public Criteria andLgNotIn(List<String> values) {
            addCriterion("LG not in", values, "lg");
            return (Criteria) this;
        }

        public Criteria andLgBetween(String value1, String value2) {
            addCriterion("LG between", value1, value2, "lg");
            return (Criteria) this;
        }

        public Criteria andLgNotBetween(String value1, String value2) {
            addCriterion("LG not between", value1, value2, "lg");
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