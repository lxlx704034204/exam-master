package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TbChapter implements Serializable {
    private Integer id;

    private Integer lessonid;

    private String chaptername;

    private Date jointime;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public String getChaptername() {
        return chaptername;
    }

    public void setChaptername(String chaptername) {
        this.chaptername = chaptername;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", lessonid=").append(lessonid);
        sb.append(", chaptername=").append(chaptername);
        sb.append(", jointime=").append(jointime);
        sb.append(", status=").append(status);
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
        TbChapter other = (TbChapter) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLessonid() == null ? other.getLessonid() == null : this.getLessonid().equals(other.getLessonid()))
            && (this.getChaptername() == null ? other.getChaptername() == null : this.getChaptername().equals(other.getChaptername()))
            && (this.getJointime() == null ? other.getJointime() == null : this.getJointime().equals(other.getJointime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLessonid() == null) ? 0 : getLessonid().hashCode());
        result = prime * result + ((getChaptername() == null) ? 0 : getChaptername().hashCode());
        result = prime * result + ((getJointime() == null) ? 0 : getJointime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}