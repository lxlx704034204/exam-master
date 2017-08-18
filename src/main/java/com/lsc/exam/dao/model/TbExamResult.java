package com.lsc.exam.dao.model;

import java.io.Serializable;

public class TbExamResult implements Serializable {
    private Integer id;

    private Integer questionid;

    private String answer;

    private Integer score;

    private String studentid;

    private String studentname;

    private String teachid;

    private String teachname;

    private Integer taotiid;

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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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

    public String getTeachid() {
        return teachid;
    }

    public void setTeachid(String teachid) {
        this.teachid = teachid;
    }

    public String getTeachname() {
        return teachname;
    }

    public void setTeachname(String teachname) {
        this.teachname = teachname;
    }

    public Integer getTaotiid() {
        return taotiid;
    }

    public void setTaotiid(Integer taotiid) {
        this.taotiid = taotiid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionid=").append(questionid);
        sb.append(", answer=").append(answer);
        sb.append(", score=").append(score);
        sb.append(", studentid=").append(studentid);
        sb.append(", studentname=").append(studentname);
        sb.append(", teachid=").append(teachid);
        sb.append(", teachname=").append(teachname);
        sb.append(", taotiid=").append(taotiid);
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
        TbExamResult other = (TbExamResult) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getQuestionid() == null ? other.getQuestionid() == null : this.getQuestionid().equals(other.getQuestionid()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getStudentid() == null ? other.getStudentid() == null : this.getStudentid().equals(other.getStudentid()))
            && (this.getStudentname() == null ? other.getStudentname() == null : this.getStudentname().equals(other.getStudentname()))
            && (this.getTeachid() == null ? other.getTeachid() == null : this.getTeachid().equals(other.getTeachid()))
            && (this.getTeachname() == null ? other.getTeachname() == null : this.getTeachname().equals(other.getTeachname()))
            && (this.getTaotiid() == null ? other.getTaotiid() == null : this.getTaotiid().equals(other.getTaotiid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestionid() == null) ? 0 : getQuestionid().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getStudentid() == null) ? 0 : getStudentid().hashCode());
        result = prime * result + ((getStudentname() == null) ? 0 : getStudentname().hashCode());
        result = prime * result + ((getTeachid() == null) ? 0 : getTeachid().hashCode());
        result = prime * result + ((getTeachname() == null) ? 0 : getTeachname().hashCode());
        result = prime * result + ((getTaotiid() == null) ? 0 : getTaotiid().hashCode());
        return result;
    }
}