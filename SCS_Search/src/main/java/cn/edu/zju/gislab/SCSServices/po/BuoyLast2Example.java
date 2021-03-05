package cn.edu.zju.gislab.SCSServices.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuoyLast2Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuoyLast2Example() {
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

        public Criteria andYxbgIsNull() {
            addCriterion("YXBG is null");
            return (Criteria) this;
        }

        public Criteria andYxbgIsNotNull() {
            addCriterion("YXBG is not null");
            return (Criteria) this;
        }

        public Criteria andYxbgEqualTo(BigDecimal value) {
            addCriterion("YXBG =", value, "yxbg");
            return (Criteria) this;
        }

        public Criteria andYxbgNotEqualTo(BigDecimal value) {
            addCriterion("YXBG <>", value, "yxbg");
            return (Criteria) this;
        }

        public Criteria andYxbgGreaterThan(BigDecimal value) {
            addCriterion("YXBG >", value, "yxbg");
            return (Criteria) this;
        }

        public Criteria andYxbgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YXBG >=", value, "yxbg");
            return (Criteria) this;
        }

        public Criteria andYxbgLessThan(BigDecimal value) {
            addCriterion("YXBG <", value, "yxbg");
            return (Criteria) this;
        }

        public Criteria andYxbgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YXBG <=", value, "yxbg");
            return (Criteria) this;
        }

        public Criteria andYxbgIn(List<BigDecimal> values) {
            addCriterion("YXBG in", values, "yxbg");
            return (Criteria) this;
        }

        public Criteria andYxbgNotIn(List<BigDecimal> values) {
            addCriterion("YXBG not in", values, "yxbg");
            return (Criteria) this;
        }

        public Criteria andYxbgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YXBG between", value1, value2, "yxbg");
            return (Criteria) this;
        }

        public Criteria andYxbgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YXBG not between", value1, value2, "yxbg");
            return (Criteria) this;
        }

        public Criteria andPjbgIsNull() {
            addCriterion("PJBG is null");
            return (Criteria) this;
        }

        public Criteria andPjbgIsNotNull() {
            addCriterion("PJBG is not null");
            return (Criteria) this;
        }

        public Criteria andPjbgEqualTo(BigDecimal value) {
            addCriterion("PJBG =", value, "pjbg");
            return (Criteria) this;
        }

        public Criteria andPjbgNotEqualTo(BigDecimal value) {
            addCriterion("PJBG <>", value, "pjbg");
            return (Criteria) this;
        }

        public Criteria andPjbgGreaterThan(BigDecimal value) {
            addCriterion("PJBG >", value, "pjbg");
            return (Criteria) this;
        }

        public Criteria andPjbgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PJBG >=", value, "pjbg");
            return (Criteria) this;
        }

        public Criteria andPjbgLessThan(BigDecimal value) {
            addCriterion("PJBG <", value, "pjbg");
            return (Criteria) this;
        }

        public Criteria andPjbgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PJBG <=", value, "pjbg");
            return (Criteria) this;
        }

        public Criteria andPjbgIn(List<BigDecimal> values) {
            addCriterion("PJBG in", values, "pjbg");
            return (Criteria) this;
        }

        public Criteria andPjbgNotIn(List<BigDecimal> values) {
            addCriterion("PJBG not in", values, "pjbg");
            return (Criteria) this;
        }

        public Criteria andPjbgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PJBG between", value1, value2, "pjbg");
            return (Criteria) this;
        }

        public Criteria andPjbgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PJBG not between", value1, value2, "pjbg");
            return (Criteria) this;
        }

        public Criteria andQwIsNull() {
            addCriterion("QW is null");
            return (Criteria) this;
        }

        public Criteria andQwIsNotNull() {
            addCriterion("QW is not null");
            return (Criteria) this;
        }

        public Criteria andQwEqualTo(BigDecimal value) {
            addCriterion("QW =", value, "qw");
            return (Criteria) this;
        }

        public Criteria andQwNotEqualTo(BigDecimal value) {
            addCriterion("QW <>", value, "qw");
            return (Criteria) this;
        }

        public Criteria andQwGreaterThan(BigDecimal value) {
            addCriterion("QW >", value, "qw");
            return (Criteria) this;
        }

        public Criteria andQwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QW >=", value, "qw");
            return (Criteria) this;
        }

        public Criteria andQwLessThan(BigDecimal value) {
            addCriterion("QW <", value, "qw");
            return (Criteria) this;
        }

        public Criteria andQwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QW <=", value, "qw");
            return (Criteria) this;
        }

        public Criteria andQwIn(List<BigDecimal> values) {
            addCriterion("QW in", values, "qw");
            return (Criteria) this;
        }

        public Criteria andQwNotIn(List<BigDecimal> values) {
            addCriterion("QW not in", values, "qw");
            return (Criteria) this;
        }

        public Criteria andQwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QW between", value1, value2, "qw");
            return (Criteria) this;
        }

        public Criteria andQwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QW not between", value1, value2, "qw");
            return (Criteria) this;
        }

        public Criteria andQyIsNull() {
            addCriterion("QY is null");
            return (Criteria) this;
        }

        public Criteria andQyIsNotNull() {
            addCriterion("QY is not null");
            return (Criteria) this;
        }

        public Criteria andQyEqualTo(BigDecimal value) {
            addCriterion("QY =", value, "qy");
            return (Criteria) this;
        }

        public Criteria andQyNotEqualTo(BigDecimal value) {
            addCriterion("QY <>", value, "qy");
            return (Criteria) this;
        }

        public Criteria andQyGreaterThan(BigDecimal value) {
            addCriterion("QY >", value, "qy");
            return (Criteria) this;
        }

        public Criteria andQyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QY >=", value, "qy");
            return (Criteria) this;
        }

        public Criteria andQyLessThan(BigDecimal value) {
            addCriterion("QY <", value, "qy");
            return (Criteria) this;
        }

        public Criteria andQyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QY <=", value, "qy");
            return (Criteria) this;
        }

        public Criteria andQyIn(List<BigDecimal> values) {
            addCriterion("QY in", values, "qy");
            return (Criteria) this;
        }

        public Criteria andQyNotIn(List<BigDecimal> values) {
            addCriterion("QY not in", values, "qy");
            return (Criteria) this;
        }

        public Criteria andQyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QY between", value1, value2, "qy");
            return (Criteria) this;
        }

        public Criteria andQyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QY not between", value1, value2, "qy");
            return (Criteria) this;
        }

        public Criteria andBcswIsNull() {
            addCriterion("BCSW is null");
            return (Criteria) this;
        }

        public Criteria andBcswIsNotNull() {
            addCriterion("BCSW is not null");
            return (Criteria) this;
        }

        public Criteria andBcswEqualTo(BigDecimal value) {
            addCriterion("BCSW =", value, "bcsw");
            return (Criteria) this;
        }

        public Criteria andBcswNotEqualTo(BigDecimal value) {
            addCriterion("BCSW <>", value, "bcsw");
            return (Criteria) this;
        }

        public Criteria andBcswGreaterThan(BigDecimal value) {
            addCriterion("BCSW >", value, "bcsw");
            return (Criteria) this;
        }

        public Criteria andBcswGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BCSW >=", value, "bcsw");
            return (Criteria) this;
        }

        public Criteria andBcswLessThan(BigDecimal value) {
            addCriterion("BCSW <", value, "bcsw");
            return (Criteria) this;
        }

        public Criteria andBcswLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BCSW <=", value, "bcsw");
            return (Criteria) this;
        }

        public Criteria andBcswIn(List<BigDecimal> values) {
            addCriterion("BCSW in", values, "bcsw");
            return (Criteria) this;
        }

        public Criteria andBcswNotIn(List<BigDecimal> values) {
            addCriterion("BCSW not in", values, "bcsw");
            return (Criteria) this;
        }

        public Criteria andBcswBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BCSW between", value1, value2, "bcsw");
            return (Criteria) this;
        }

        public Criteria andBcswNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BCSW not between", value1, value2, "bcsw");
            return (Criteria) this;
        }

        public Criteria andZdbgIsNull() {
            addCriterion("ZDBG is null");
            return (Criteria) this;
        }

        public Criteria andZdbgIsNotNull() {
            addCriterion("ZDBG is not null");
            return (Criteria) this;
        }

        public Criteria andZdbgEqualTo(BigDecimal value) {
            addCriterion("ZDBG =", value, "zdbg");
            return (Criteria) this;
        }

        public Criteria andZdbgNotEqualTo(BigDecimal value) {
            addCriterion("ZDBG <>", value, "zdbg");
            return (Criteria) this;
        }

        public Criteria andZdbgGreaterThan(BigDecimal value) {
            addCriterion("ZDBG >", value, "zdbg");
            return (Criteria) this;
        }

        public Criteria andZdbgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDBG >=", value, "zdbg");
            return (Criteria) this;
        }

        public Criteria andZdbgLessThan(BigDecimal value) {
            addCriterion("ZDBG <", value, "zdbg");
            return (Criteria) this;
        }

        public Criteria andZdbgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDBG <=", value, "zdbg");
            return (Criteria) this;
        }

        public Criteria andZdbgIn(List<BigDecimal> values) {
            addCriterion("ZDBG in", values, "zdbg");
            return (Criteria) this;
        }

        public Criteria andZdbgNotIn(List<BigDecimal> values) {
            addCriterion("ZDBG not in", values, "zdbg");
            return (Criteria) this;
        }

        public Criteria andZdbgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDBG between", value1, value2, "zdbg");
            return (Criteria) this;
        }

        public Criteria andZdbgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDBG not between", value1, value2, "zdbg");
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

        public Criteria andFsEqualTo(BigDecimal value) {
            addCriterion("FS =", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotEqualTo(BigDecimal value) {
            addCriterion("FS <>", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsGreaterThan(BigDecimal value) {
            addCriterion("FS >", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FS >=", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsLessThan(BigDecimal value) {
            addCriterion("FS <", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FS <=", value, "fs");
            return (Criteria) this;
        }

        public Criteria andFsIn(List<BigDecimal> values) {
            addCriterion("FS in", values, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotIn(List<BigDecimal> values) {
            addCriterion("FS not in", values, "fs");
            return (Criteria) this;
        }

        public Criteria andFsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FS between", value1, value2, "fs");
            return (Criteria) this;
        }

        public Criteria andFsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FS not between", value1, value2, "fs");
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

        public Criteria andFxEqualTo(BigDecimal value) {
            addCriterion("FX =", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxNotEqualTo(BigDecimal value) {
            addCriterion("FX <>", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxGreaterThan(BigDecimal value) {
            addCriterion("FX >", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FX >=", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxLessThan(BigDecimal value) {
            addCriterion("FX <", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FX <=", value, "fx");
            return (Criteria) this;
        }

        public Criteria andFxIn(List<BigDecimal> values) {
            addCriterion("FX in", values, "fx");
            return (Criteria) this;
        }

        public Criteria andFxNotIn(List<BigDecimal> values) {
            addCriterion("FX not in", values, "fx");
            return (Criteria) this;
        }

        public Criteria andFxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FX between", value1, value2, "fx");
            return (Criteria) this;
        }

        public Criteria andFxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FX not between", value1, value2, "fx");
            return (Criteria) this;
        }

        public Criteria andYxbzwIsNull() {
            addCriterion("YXBZW is null");
            return (Criteria) this;
        }

        public Criteria andYxbzwIsNotNull() {
            addCriterion("YXBZW is not null");
            return (Criteria) this;
        }

        public Criteria andYxbzwEqualTo(BigDecimal value) {
            addCriterion("YXBZW =", value, "yxbzw");
            return (Criteria) this;
        }

        public Criteria andYxbzwNotEqualTo(BigDecimal value) {
            addCriterion("YXBZW <>", value, "yxbzw");
            return (Criteria) this;
        }

        public Criteria andYxbzwGreaterThan(BigDecimal value) {
            addCriterion("YXBZW >", value, "yxbzw");
            return (Criteria) this;
        }

        public Criteria andYxbzwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YXBZW >=", value, "yxbzw");
            return (Criteria) this;
        }

        public Criteria andYxbzwLessThan(BigDecimal value) {
            addCriterion("YXBZW <", value, "yxbzw");
            return (Criteria) this;
        }

        public Criteria andYxbzwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YXBZW <=", value, "yxbzw");
            return (Criteria) this;
        }

        public Criteria andYxbzwIn(List<BigDecimal> values) {
            addCriterion("YXBZW in", values, "yxbzw");
            return (Criteria) this;
        }

        public Criteria andYxbzwNotIn(List<BigDecimal> values) {
            addCriterion("YXBZW not in", values, "yxbzw");
            return (Criteria) this;
        }

        public Criteria andYxbzwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YXBZW between", value1, value2, "yxbzw");
            return (Criteria) this;
        }

        public Criteria andYxbzwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YXBZW not between", value1, value2, "yxbzw");
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