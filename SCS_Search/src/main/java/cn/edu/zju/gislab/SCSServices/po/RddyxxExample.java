package cn.edu.zju.gislab.SCSServices.po;

import java.util.ArrayList;
import java.util.List;

public class RddyxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RddyxxExample() {
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

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andReleaseNumIsNull() {
            addCriterion("RELEASE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andReleaseNumIsNotNull() {
            addCriterion("RELEASE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseNumEqualTo(Short value) {
            addCriterion("RELEASE_NUM =", value, "releaseNum");
            return (Criteria) this;
        }

        public Criteria andReleaseNumNotEqualTo(Short value) {
            addCriterion("RELEASE_NUM <>", value, "releaseNum");
            return (Criteria) this;
        }

        public Criteria andReleaseNumGreaterThan(Short value) {
            addCriterion("RELEASE_NUM >", value, "releaseNum");
            return (Criteria) this;
        }

        public Criteria andReleaseNumGreaterThanOrEqualTo(Short value) {
            addCriterion("RELEASE_NUM >=", value, "releaseNum");
            return (Criteria) this;
        }

        public Criteria andReleaseNumLessThan(Short value) {
            addCriterion("RELEASE_NUM <", value, "releaseNum");
            return (Criteria) this;
        }

        public Criteria andReleaseNumLessThanOrEqualTo(Short value) {
            addCriterion("RELEASE_NUM <=", value, "releaseNum");
            return (Criteria) this;
        }

        public Criteria andReleaseNumIn(List<Short> values) {
            addCriterion("RELEASE_NUM in", values, "releaseNum");
            return (Criteria) this;
        }

        public Criteria andReleaseNumNotIn(List<Short> values) {
            addCriterion("RELEASE_NUM not in", values, "releaseNum");
            return (Criteria) this;
        }

        public Criteria andReleaseNumBetween(Short value1, Short value2) {
            addCriterion("RELEASE_NUM between", value1, value2, "releaseNum");
            return (Criteria) this;
        }

        public Criteria andReleaseNumNotBetween(Short value1, Short value2) {
            addCriterion("RELEASE_NUM not between", value1, value2, "releaseNum");
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

        public Criteria andDateTimeEqualTo(String value) {
            addCriterion("DATE_TIME =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(String value) {
            addCriterion("DATE_TIME <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(String value) {
            addCriterion("DATE_TIME >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_TIME >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(String value) {
            addCriterion("DATE_TIME <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(String value) {
            addCriterion("DATE_TIME <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLike(String value) {
            addCriterion("DATE_TIME like", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotLike(String value) {
            addCriterion("DATE_TIME not like", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<String> values) {
            addCriterion("DATE_TIME in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<String> values) {
            addCriterion("DATE_TIME not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(String value1, String value2) {
            addCriterion("DATE_TIME between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(String value1, String value2) {
            addCriterion("DATE_TIME not between", value1, value2, "dateTime");
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