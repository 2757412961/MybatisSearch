package cn.edu.zju.gislab.SCSServices.po;

import java.util.ArrayList;
import java.util.List;

public class WebmtsatupdateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebmtsatupdateExample() {
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

        public Criteria andLowlevelIsNull() {
            addCriterion("LOWLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLowlevelIsNotNull() {
            addCriterion("LOWLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLowlevelEqualTo(String value) {
            addCriterion("LOWLEVEL =", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotEqualTo(String value) {
            addCriterion("LOWLEVEL <>", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelGreaterThan(String value) {
            addCriterion("LOWLEVEL >", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelGreaterThanOrEqualTo(String value) {
            addCriterion("LOWLEVEL >=", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelLessThan(String value) {
            addCriterion("LOWLEVEL <", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelLessThanOrEqualTo(String value) {
            addCriterion("LOWLEVEL <=", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelLike(String value) {
            addCriterion("LOWLEVEL like", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotLike(String value) {
            addCriterion("LOWLEVEL not like", value, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelIn(List<String> values) {
            addCriterion("LOWLEVEL in", values, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotIn(List<String> values) {
            addCriterion("LOWLEVEL not in", values, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelBetween(String value1, String value2) {
            addCriterion("LOWLEVEL between", value1, value2, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andLowlevelNotBetween(String value1, String value2) {
            addCriterion("LOWLEVEL not between", value1, value2, "lowlevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelIsNull() {
            addCriterion("MIDUPLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMiduplevelIsNotNull() {
            addCriterion("MIDUPLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMiduplevelEqualTo(String value) {
            addCriterion("MIDUPLEVEL =", value, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelNotEqualTo(String value) {
            addCriterion("MIDUPLEVEL <>", value, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelGreaterThan(String value) {
            addCriterion("MIDUPLEVEL >", value, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelGreaterThanOrEqualTo(String value) {
            addCriterion("MIDUPLEVEL >=", value, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelLessThan(String value) {
            addCriterion("MIDUPLEVEL <", value, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelLessThanOrEqualTo(String value) {
            addCriterion("MIDUPLEVEL <=", value, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelLike(String value) {
            addCriterion("MIDUPLEVEL like", value, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelNotLike(String value) {
            addCriterion("MIDUPLEVEL not like", value, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelIn(List<String> values) {
            addCriterion("MIDUPLEVEL in", values, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelNotIn(List<String> values) {
            addCriterion("MIDUPLEVEL not in", values, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelBetween(String value1, String value2) {
            addCriterion("MIDUPLEVEL between", value1, value2, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andMiduplevelNotBetween(String value1, String value2) {
            addCriterion("MIDUPLEVEL not between", value1, value2, "miduplevel");
            return (Criteria) this;
        }

        public Criteria andWindsheakIsNull() {
            addCriterion("WINDSHEAK is null");
            return (Criteria) this;
        }

        public Criteria andWindsheakIsNotNull() {
            addCriterion("WINDSHEAK is not null");
            return (Criteria) this;
        }

        public Criteria andWindsheakEqualTo(String value) {
            addCriterion("WINDSHEAK =", value, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakNotEqualTo(String value) {
            addCriterion("WINDSHEAK <>", value, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakGreaterThan(String value) {
            addCriterion("WINDSHEAK >", value, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakGreaterThanOrEqualTo(String value) {
            addCriterion("WINDSHEAK >=", value, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakLessThan(String value) {
            addCriterion("WINDSHEAK <", value, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakLessThanOrEqualTo(String value) {
            addCriterion("WINDSHEAK <=", value, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakLike(String value) {
            addCriterion("WINDSHEAK like", value, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakNotLike(String value) {
            addCriterion("WINDSHEAK not like", value, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakIn(List<String> values) {
            addCriterion("WINDSHEAK in", values, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakNotIn(List<String> values) {
            addCriterion("WINDSHEAK not in", values, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakBetween(String value1, String value2) {
            addCriterion("WINDSHEAK between", value1, value2, "windsheak");
            return (Criteria) this;
        }

        public Criteria andWindsheakNotBetween(String value1, String value2) {
            addCriterion("WINDSHEAK not between", value1, value2, "windsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakIsNull() {
            addCriterion("HOURWINDSHEAK is null");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakIsNotNull() {
            addCriterion("HOURWINDSHEAK is not null");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakEqualTo(String value) {
            addCriterion("HOURWINDSHEAK =", value, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakNotEqualTo(String value) {
            addCriterion("HOURWINDSHEAK <>", value, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakGreaterThan(String value) {
            addCriterion("HOURWINDSHEAK >", value, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakGreaterThanOrEqualTo(String value) {
            addCriterion("HOURWINDSHEAK >=", value, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakLessThan(String value) {
            addCriterion("HOURWINDSHEAK <", value, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakLessThanOrEqualTo(String value) {
            addCriterion("HOURWINDSHEAK <=", value, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakLike(String value) {
            addCriterion("HOURWINDSHEAK like", value, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakNotLike(String value) {
            addCriterion("HOURWINDSHEAK not like", value, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakIn(List<String> values) {
            addCriterion("HOURWINDSHEAK in", values, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakNotIn(List<String> values) {
            addCriterion("HOURWINDSHEAK not in", values, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakBetween(String value1, String value2) {
            addCriterion("HOURWINDSHEAK between", value1, value2, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andHourwindsheakNotBetween(String value1, String value2) {
            addCriterion("HOURWINDSHEAK not between", value1, value2, "hourwindsheak");
            return (Criteria) this;
        }

        public Criteria andRelatvortIsNull() {
            addCriterion("RELATVORT is null");
            return (Criteria) this;
        }

        public Criteria andRelatvortIsNotNull() {
            addCriterion("RELATVORT is not null");
            return (Criteria) this;
        }

        public Criteria andRelatvortEqualTo(String value) {
            addCriterion("RELATVORT =", value, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortNotEqualTo(String value) {
            addCriterion("RELATVORT <>", value, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortGreaterThan(String value) {
            addCriterion("RELATVORT >", value, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortGreaterThanOrEqualTo(String value) {
            addCriterion("RELATVORT >=", value, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortLessThan(String value) {
            addCriterion("RELATVORT <", value, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortLessThanOrEqualTo(String value) {
            addCriterion("RELATVORT <=", value, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortLike(String value) {
            addCriterion("RELATVORT like", value, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortNotLike(String value) {
            addCriterion("RELATVORT not like", value, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortIn(List<String> values) {
            addCriterion("RELATVORT in", values, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortNotIn(List<String> values) {
            addCriterion("RELATVORT not in", values, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortBetween(String value1, String value2) {
            addCriterion("RELATVORT between", value1, value2, "relatvort");
            return (Criteria) this;
        }

        public Criteria andRelatvortNotBetween(String value1, String value2) {
            addCriterion("RELATVORT not between", value1, value2, "relatvort");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodIsNull() {
            addCriterion("WINDSHEAKPROD is null");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodIsNotNull() {
            addCriterion("WINDSHEAKPROD is not null");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodEqualTo(String value) {
            addCriterion("WINDSHEAKPROD =", value, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodNotEqualTo(String value) {
            addCriterion("WINDSHEAKPROD <>", value, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodGreaterThan(String value) {
            addCriterion("WINDSHEAKPROD >", value, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodGreaterThanOrEqualTo(String value) {
            addCriterion("WINDSHEAKPROD >=", value, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodLessThan(String value) {
            addCriterion("WINDSHEAKPROD <", value, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodLessThanOrEqualTo(String value) {
            addCriterion("WINDSHEAKPROD <=", value, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodLike(String value) {
            addCriterion("WINDSHEAKPROD like", value, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodNotLike(String value) {
            addCriterion("WINDSHEAKPROD not like", value, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodIn(List<String> values) {
            addCriterion("WINDSHEAKPROD in", values, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodNotIn(List<String> values) {
            addCriterion("WINDSHEAKPROD not in", values, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodBetween(String value1, String value2) {
            addCriterion("WINDSHEAKPROD between", value1, value2, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andWindsheakprodNotBetween(String value1, String value2) {
            addCriterion("WINDSHEAKPROD not between", value1, value2, "windsheakprod");
            return (Criteria) this;
        }

        public Criteria andDivergenceIsNull() {
            addCriterion("DIVERGENCE is null");
            return (Criteria) this;
        }

        public Criteria andDivergenceIsNotNull() {
            addCriterion("DIVERGENCE is not null");
            return (Criteria) this;
        }

        public Criteria andDivergenceEqualTo(String value) {
            addCriterion("DIVERGENCE =", value, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceNotEqualTo(String value) {
            addCriterion("DIVERGENCE <>", value, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceGreaterThan(String value) {
            addCriterion("DIVERGENCE >", value, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceGreaterThanOrEqualTo(String value) {
            addCriterion("DIVERGENCE >=", value, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceLessThan(String value) {
            addCriterion("DIVERGENCE <", value, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceLessThanOrEqualTo(String value) {
            addCriterion("DIVERGENCE <=", value, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceLike(String value) {
            addCriterion("DIVERGENCE like", value, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceNotLike(String value) {
            addCriterion("DIVERGENCE not like", value, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceIn(List<String> values) {
            addCriterion("DIVERGENCE in", values, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceNotIn(List<String> values) {
            addCriterion("DIVERGENCE not in", values, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceBetween(String value1, String value2) {
            addCriterion("DIVERGENCE between", value1, value2, "divergence");
            return (Criteria) this;
        }

        public Criteria andDivergenceNotBetween(String value1, String value2) {
            addCriterion("DIVERGENCE not between", value1, value2, "divergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceIsNull() {
            addCriterion("CONVERGENCE is null");
            return (Criteria) this;
        }

        public Criteria andConvergenceIsNotNull() {
            addCriterion("CONVERGENCE is not null");
            return (Criteria) this;
        }

        public Criteria andConvergenceEqualTo(String value) {
            addCriterion("CONVERGENCE =", value, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceNotEqualTo(String value) {
            addCriterion("CONVERGENCE <>", value, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceGreaterThan(String value) {
            addCriterion("CONVERGENCE >", value, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceGreaterThanOrEqualTo(String value) {
            addCriterion("CONVERGENCE >=", value, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceLessThan(String value) {
            addCriterion("CONVERGENCE <", value, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceLessThanOrEqualTo(String value) {
            addCriterion("CONVERGENCE <=", value, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceLike(String value) {
            addCriterion("CONVERGENCE like", value, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceNotLike(String value) {
            addCriterion("CONVERGENCE not like", value, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceIn(List<String> values) {
            addCriterion("CONVERGENCE in", values, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceNotIn(List<String> values) {
            addCriterion("CONVERGENCE not in", values, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceBetween(String value1, String value2) {
            addCriterion("CONVERGENCE between", value1, value2, "convergence");
            return (Criteria) this;
        }

        public Criteria andConvergenceNotBetween(String value1, String value2) {
            addCriterion("CONVERGENCE not between", value1, value2, "convergence");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7IsNull() {
            addCriterion("ENVSTEER_7 is null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7IsNotNull() {
            addCriterion("ENVSTEER_7 is not null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7EqualTo(String value) {
            addCriterion("ENVSTEER_7 =", value, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7NotEqualTo(String value) {
            addCriterion("ENVSTEER_7 <>", value, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7GreaterThan(String value) {
            addCriterion("ENVSTEER_7 >", value, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7GreaterThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_7 >=", value, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7LessThan(String value) {
            addCriterion("ENVSTEER_7 <", value, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7LessThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_7 <=", value, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7Like(String value) {
            addCriterion("ENVSTEER_7 like", value, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7NotLike(String value) {
            addCriterion("ENVSTEER_7 not like", value, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7In(List<String> values) {
            addCriterion("ENVSTEER_7 in", values, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7NotIn(List<String> values) {
            addCriterion("ENVSTEER_7 not in", values, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7Between(String value1, String value2) {
            addCriterion("ENVSTEER_7 between", value1, value2, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer7NotBetween(String value1, String value2) {
            addCriterion("ENVSTEER_7 not between", value1, value2, "envsteer7");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5IsNull() {
            addCriterion("ENVSTEER_5 is null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5IsNotNull() {
            addCriterion("ENVSTEER_5 is not null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5EqualTo(String value) {
            addCriterion("ENVSTEER_5 =", value, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5NotEqualTo(String value) {
            addCriterion("ENVSTEER_5 <>", value, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5GreaterThan(String value) {
            addCriterion("ENVSTEER_5 >", value, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5GreaterThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_5 >=", value, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5LessThan(String value) {
            addCriterion("ENVSTEER_5 <", value, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5LessThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_5 <=", value, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5Like(String value) {
            addCriterion("ENVSTEER_5 like", value, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5NotLike(String value) {
            addCriterion("ENVSTEER_5 not like", value, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5In(List<String> values) {
            addCriterion("ENVSTEER_5 in", values, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5NotIn(List<String> values) {
            addCriterion("ENVSTEER_5 not in", values, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5Between(String value1, String value2) {
            addCriterion("ENVSTEER_5 between", value1, value2, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andEnvsteer5NotBetween(String value1, String value2) {
            addCriterion("ENVSTEER_5 not between", value1, value2, "envsteer5");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4IsNull() {
            addCriterion("CENVSTEER_4 is null");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4IsNotNull() {
            addCriterion("CENVSTEER_4 is not null");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4EqualTo(String value) {
            addCriterion("CENVSTEER_4 =", value, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4NotEqualTo(String value) {
            addCriterion("CENVSTEER_4 <>", value, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4GreaterThan(String value) {
            addCriterion("CENVSTEER_4 >", value, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4GreaterThanOrEqualTo(String value) {
            addCriterion("CENVSTEER_4 >=", value, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4LessThan(String value) {
            addCriterion("CENVSTEER_4 <", value, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4LessThanOrEqualTo(String value) {
            addCriterion("CENVSTEER_4 <=", value, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4Like(String value) {
            addCriterion("CENVSTEER_4 like", value, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4NotLike(String value) {
            addCriterion("CENVSTEER_4 not like", value, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4In(List<String> values) {
            addCriterion("CENVSTEER_4 in", values, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4NotIn(List<String> values) {
            addCriterion("CENVSTEER_4 not in", values, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4Between(String value1, String value2) {
            addCriterion("CENVSTEER_4 between", value1, value2, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andCenvsteer4NotBetween(String value1, String value2) {
            addCriterion("CENVSTEER_4 not between", value1, value2, "cenvsteer4");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3IsNull() {
            addCriterion("ENVSTEER_3 is null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3IsNotNull() {
            addCriterion("ENVSTEER_3 is not null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3EqualTo(String value) {
            addCriterion("ENVSTEER_3 =", value, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3NotEqualTo(String value) {
            addCriterion("ENVSTEER_3 <>", value, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3GreaterThan(String value) {
            addCriterion("ENVSTEER_3 >", value, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3GreaterThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_3 >=", value, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3LessThan(String value) {
            addCriterion("ENVSTEER_3 <", value, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3LessThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_3 <=", value, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3Like(String value) {
            addCriterion("ENVSTEER_3 like", value, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3NotLike(String value) {
            addCriterion("ENVSTEER_3 not like", value, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3In(List<String> values) {
            addCriterion("ENVSTEER_3 in", values, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3NotIn(List<String> values) {
            addCriterion("ENVSTEER_3 not in", values, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3Between(String value1, String value2) {
            addCriterion("ENVSTEER_3 between", value1, value2, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer3NotBetween(String value1, String value2) {
            addCriterion("ENVSTEER_3 not between", value1, value2, "envsteer3");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25IsNull() {
            addCriterion("ENVSTEER_25 is null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25IsNotNull() {
            addCriterion("ENVSTEER_25 is not null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25EqualTo(String value) {
            addCriterion("ENVSTEER_25 =", value, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25NotEqualTo(String value) {
            addCriterion("ENVSTEER_25 <>", value, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25GreaterThan(String value) {
            addCriterion("ENVSTEER_25 >", value, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25GreaterThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_25 >=", value, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25LessThan(String value) {
            addCriterion("ENVSTEER_25 <", value, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25LessThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_25 <=", value, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25Like(String value) {
            addCriterion("ENVSTEER_25 like", value, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25NotLike(String value) {
            addCriterion("ENVSTEER_25 not like", value, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25In(List<String> values) {
            addCriterion("ENVSTEER_25 in", values, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25NotIn(List<String> values) {
            addCriterion("ENVSTEER_25 not in", values, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25Between(String value1, String value2) {
            addCriterion("ENVSTEER_25 between", value1, value2, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer25NotBetween(String value1, String value2) {
            addCriterion("ENVSTEER_25 not between", value1, value2, "envsteer25");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2IsNull() {
            addCriterion("ENVSTEER_2 is null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2IsNotNull() {
            addCriterion("ENVSTEER_2 is not null");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2EqualTo(String value) {
            addCriterion("ENVSTEER_2 =", value, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2NotEqualTo(String value) {
            addCriterion("ENVSTEER_2 <>", value, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2GreaterThan(String value) {
            addCriterion("ENVSTEER_2 >", value, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2GreaterThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_2 >=", value, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2LessThan(String value) {
            addCriterion("ENVSTEER_2 <", value, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2LessThanOrEqualTo(String value) {
            addCriterion("ENVSTEER_2 <=", value, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2Like(String value) {
            addCriterion("ENVSTEER_2 like", value, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2NotLike(String value) {
            addCriterion("ENVSTEER_2 not like", value, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2In(List<String> values) {
            addCriterion("ENVSTEER_2 in", values, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2NotIn(List<String> values) {
            addCriterion("ENVSTEER_2 not in", values, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2Between(String value1, String value2) {
            addCriterion("ENVSTEER_2 between", value1, value2, "envsteer2");
            return (Criteria) this;
        }

        public Criteria andEnvsteer2NotBetween(String value1, String value2) {
            addCriterion("ENVSTEER_2 not between", value1, value2, "envsteer2");
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