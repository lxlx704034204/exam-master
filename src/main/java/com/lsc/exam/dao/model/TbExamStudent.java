package com.lsc.exam.dao.model;

import java.io.Serializable;

public class TbExamStudent implements Serializable {
    private Integer id;

    private Integer taotiid;

    private String taotiname;

    private String studentid;

    private String studentname;

    private Integer status;

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

    public String getTaotiname() {
        return taotiname;
    }

    public void setTaotiname(String taotiname) {
        this.taotiname = taotiname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
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
        sb.append(", taotiid=").append(taotiid);
        sb.append(", taotiname=").append(taotiname);
        sb.append(", studentid=").append(studentid);
        sb.append(", studentname=").append(studentname);
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
        TbExamStudent other = (TbExamStudent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaotiid() == null ? other.getTaotiid() == null : this.getTaotiid().equals(other.getTaotiid()))
            && (this.getTaotiname() == null ? other.getTaotiname() == null : this.getTaotiname().equals(other.getTaotiname()))
            && (this.getStudentid() == null ? other.getStudentid() == null : this.getStudentid().equals(other.getStudentid()))
            && (this.getStudentname() == null ? other.getStudentname() == null : this.getStudentname().equals(other.getStudentname()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaotiid() == null) ? 0 : getTaotiid().hashCode());
        result = prime * result + ((getTaotiname() == null) ? 0 : getTaotiname().hashCode());
        result = prime * result + ((getStudentid() == null) ? 0 : getStudentid().hashCode());
        result = prime * result + ((getStudentname() == null) ? 0 : getStudentname().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}