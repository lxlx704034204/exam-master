package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TbExam implements Serializable {
    private Integer id;

    private Integer questionid;

    private Integer taotiid;

    private Integer status;

    private Date jointime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getTaotiid() {
        return taotiid;
    }

    public void setTaotiid(Integer taotiid) {
        this.taotiid = taotiid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionid=").append(questionid);
        sb.append(", taotiid=").append(taotiid);
        sb.append(", status=").append(status);
        sb.append(", jointime=").append(jointime);
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
        TbExam other = (TbExam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getQuestionid() == null ? other.getQuestionid() == null : this.getQuestionid().equals(other.getQuestionid()))
            && (this.getTaotiid() == null ? other.getTaotiid() == null : this.getTaotiid().equals(other.getTaotiid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getJointime() == null ? other.getJointime() == null : this.getJointime().equals(other.getJointime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestionid() == null) ? 0 : getQuestionid().hashCode());
        result = prime * result + ((getTaotiid() == null) ? 0 : getTaotiid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getJointime() == null) ? 0 : getJointime().hashCode());
        return result;
    }
}