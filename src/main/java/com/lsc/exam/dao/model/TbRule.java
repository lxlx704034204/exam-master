package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TbRule implements Serializable {
    private Integer id;

    private Integer taotiid;

    private Integer totalmark;

    private Double difficulty;

    private Integer singlenum;

    private Integer singlescore;

    private Integer multiplescore;

    private Integer multiplenum;

    private Integer completenum;

    private Integer completescore;

    private Integer calculationnum;

    private Integer calculationscore;

    private Integer subjectivenum;

    private Integer subjectivescore;

    private Date createtime;

    private Integer status;

    private String rulename;

    private String pointids;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaotiid() {
        return taotiid;
    }

    public void setTaotiid(Integer taotiid) {
        this.taotiid = taotiid;
    }

    public Integer getTotalmark() {
        return totalmark;
    }

    public void setTotalmark(Integer totalmark) {
        this.totalmark = totalmark;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getSinglenum() {
        return singlenum;
    }

    public void setSinglenum(Integer singlenum) {
        this.singlenum = singlenum;
    }

    public Integer getSinglescore() {
        return singlescore;
    }

    public void setSinglescore(Integer singlescore) {
        this.singlescore = singlescore;
    }

    public Integer getMultiplescore() {
        return multiplescore;
    }

    public void setMultiplescore(Integer multiplescore) {
        this.multiplescore = multiplescore;
    }

    public Integer getMultiplenum() {
        return multiplenum;
    }

    public void setMultiplenum(Integer multiplenum) {
        this.multiplenum = multiplenum;
    }

    public Integer getCompletenum() {
        return completenum;
    }

    public void setCompletenum(Integer completenum) {
        this.completenum = completenum;
    }

    public Integer getCompletescore() {
        return completescore;
    }

    public void setCompletescore(Integer completescore) {
        this.completescore = completescore;
    }

    public Integer getCalculationnum() {
        return calculationnum;
    }

    public void setCalculationnum(Integer calculationnum) {
        this.calculationnum = calculationnum;
    }

    public Integer getCalculationscore() {
        return calculationscore;
    }

    public void setCalculationscore(Integer calculationscore) {
        this.calculationscore = calculationscore;
    }

    public Integer getSubjectivenum() {
        return subjectivenum;
    }

    public void setSubjectivenum(Integer subjectivenum) {
        this.subjectivenum = subjectivenum;
    }

    public Integer getSubjectivescore() {
        return subjectivescore;
    }

    public void setSubjectivescore(Integer subjectivescore) {
        this.subjectivescore = subjectivescore;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRulename() {
        return rulename;
    }

    public void setRulename(String rulename) {
        this.rulename = rulename;
    }

    public String getPointids() {
        return pointids;
    }

    public void setPointids(String pointids) {
        this.pointids = pointids;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taotiid=").append(taotiid);
        sb.append(", totalmark=").append(totalmark);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", singlenum=").append(singlenum);
        sb.append(", singlescore=").append(singlescore);
        sb.append(", multiplescore=").append(multiplescore);
        sb.append(", multiplenum=").append(multiplenum);
        sb.append(", completenum=").append(completenum);
        sb.append(", completescore=").append(completescore);
        sb.append(", calculationnum=").append(calculationnum);
        sb.append(", calculationscore=").append(calculationscore);
        sb.append(", subjectivenum=").append(subjectivenum);
        sb.append(", subjectivescore=").append(subjectivescore);
        sb.append(", createtime=").append(createtime);
        sb.append(", status=").append(status);
        sb.append(", rulename=").append(rulename);
        sb.append(", pointids=").append(pointids);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbRule other = (TbRule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaotiid() == null ? other.getTaotiid() == null : this.getTaotiid().equals(other.getTaotiid()))
            && (this.getTotalmark() == null ? other.getTotalmark() == null : this.getTotalmark().equals(other.getTotalmark()))
            && (this.getDifficulty() == null ? other.getDifficulty() == null : this.getDifficulty().equals(other.getDifficulty()))
            && (this.getSinglenum() == null ? other.getSinglenum() == null : this.getSinglenum().equals(other.getSinglenum()))
            && (this.getSinglescore() == null ? other.getSinglescore() == null : this.getSinglescore().equals(other.getSinglescore()))
            && (this.getMultiplescore() == null ? other.getMultiplescore() == null : this.getMultiplescore().equals(other.getMultiplescore()))
            && (this.getMultiplenum() == null ? other.getMultiplenum() == null : this.getMultiplenum().equals(other.getMultiplenum()))
            && (this.getCompletenum() == null ? other.getCompletenum() == null : this.getCompletenum().equals(other.getCompletenum()))
            && (this.getCompletescore() == null ? other.getCompletescore() == null : this.getCompletescore().equals(other.getCompletescore()))
            && (this.getCalculationnum() == null ? other.getCalculationnum() == null : this.getCalculationnum().equals(other.getCalculationnum()))
            && (this.getCalculationscore() == null ? other.getCalculationscore() == null : this.getCalculationscore().equals(other.getCalculationscore()))
            && (this.getSubjectivenum() == null ? other.getSubjectivenum() == null : this.getSubjectivenum().equals(other.getSubjectivenum()))
            && (this.getSubjectivescore() == null ? other.getSubjectivescore() == null : this.getSubjectivescore().equals(other.getSubjectivescore()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRulename() == null ? other.getRulename() == null : this.getRulename().equals(other.getRulename()))
            && (this.getPointids() == null ? other.getPointids() == null : this.getPointids().equals(other.getPointids()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaotiid() == null) ? 0 : getTaotiid().hashCode());
        result = prime * result + ((getTotalmark() == null) ? 0 : getTotalmark().hashCode());
        result = prime * result + ((getDifficulty() == null) ? 0 : getDifficulty().hashCode());
        result = prime * result + ((getSinglenum() == null) ? 0 : getSinglenum().hashCode());
        result = prime * result + ((getSinglescore() == null) ? 0 : getSinglescore().hashCode());
        result = prime * result + ((getMultiplescore() == null) ? 0 : getMultiplescore().hashCode());
        result = prime * result + ((getMultiplenum() == null) ? 0 : getMultiplenum().hashCode());
        result = prime * result + ((getCompletenum() == null) ? 0 : getCompletenum().hashCode());
        result = prime * result + ((getCompletescore() == null) ? 0 : getCompletescore().hashCode());
        result = prime * result + ((getCalculationnum() == null) ? 0 : getCalculationnum().hashCode());
        result = prime * result + ((getCalculationscore() == null) ? 0 : getCalculationscore().hashCode());
        result = prime * result + ((getSubjectivenum() == null) ? 0 : getSubjectivenum().hashCode());
        result = prime * result + ((getSubjectivescore() == null) ? 0 : getSubjectivescore().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRulename() == null) ? 0 : getRulename().hashCode());
        result = prime * result + ((getPointids() == null) ? 0 : getPointids().hashCode());
        return result;
    }
}