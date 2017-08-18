package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TbQuestions implements Serializable {
    private Long id;

    private Integer type;

    private Double difficulty;

    private String pointid;

    private String choice1;

    private String choice2;

    private String choice3;

    private String choice4;

    private String answer;

    private String userid;

    private Date createtime;

    private String username;

    private String knowledgename;

    private Integer score;

    private Integer status;

    private Integer lessonid;

    private String stem;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public String getPointid() {
        return pointid;
    }

    public void setPointid(String pointid) {
        this.pointid = pointid;
    }

    public String getChoice1() {
        return choice1;
    }

    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    public String getChoice2() {
        return choice2;
    }

    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    public String getChoice3() {
        return choice3;
    }

    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    public String getChoice4() {
        return choice4;
    }

    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKnowledgename() {
        return knowledgename;
    }

    public void setKnowledgename(String knowledgename) {
        this.knowledgename = knowledgename;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", pointid=").append(pointid);
        sb.append(", choice1=").append(choice1);
        sb.append(", choice2=").append(choice2);
        sb.append(", choice3=").append(choice3);
        sb.append(", choice4=").append(choice4);
        sb.append(", answer=").append(answer);
        sb.append(", userid=").append(userid);
        sb.append(", createtime=").append(createtime);
        sb.append(", username=").append(username);
        sb.append(", knowledgename=").append(knowledgename);
        sb.append(", score=").append(score);
        sb.append(", status=").append(status);
        sb.append(", lessonid=").append(lessonid);
        sb.append(", stem=").append(stem);
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
        TbQuestions other = (TbQuestions) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getDifficulty() == null ? other.getDifficulty() == null : this.getDifficulty().equals(other.getDifficulty()))
            && (this.getPointid() == null ? other.getPointid() == null : this.getPointid().equals(other.getPointid()))
            && (this.getChoice1() == null ? other.getChoice1() == null : this.getChoice1().equals(other.getChoice1()))
            && (this.getChoice2() == null ? other.getChoice2() == null : this.getChoice2().equals(other.getChoice2()))
            && (this.getChoice3() == null ? other.getChoice3() == null : this.getChoice3().equals(other.getChoice3()))
            && (this.getChoice4() == null ? other.getChoice4() == null : this.getChoice4().equals(other.getChoice4()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getKnowledgename() == null ? other.getKnowledgename() == null : this.getKnowledgename().equals(other.getKnowledgename()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLessonid() == null ? other.getLessonid() == null : this.getLessonid().equals(other.getLessonid()))
            && (this.getStem() == null ? other.getStem() == null : this.getStem().equals(other.getStem()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getDifficulty() == null) ? 0 : getDifficulty().hashCode());
        result = prime * result + ((getPointid() == null) ? 0 : getPointid().hashCode());
        result = prime * result + ((getChoice1() == null) ? 0 : getChoice1().hashCode());
        result = prime * result + ((getChoice2() == null) ? 0 : getChoice2().hashCode());
        result = prime * result + ((getChoice3() == null) ? 0 : getChoice3().hashCode());
        result = prime * result + ((getChoice4() == null) ? 0 : getChoice4().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getKnowledgename() == null) ? 0 : getKnowledgename().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLessonid() == null) ? 0 : getLessonid().hashCode());
        result = prime * result + ((getStem() == null) ? 0 : getStem().hashCode());
        return result;
    }
}