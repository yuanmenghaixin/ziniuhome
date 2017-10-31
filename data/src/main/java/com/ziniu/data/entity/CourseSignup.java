package com.ziniu.data.entity;

import java.util.List;

/**
 * 课程报名类
 * Created by yeoman on 2017/10/25.
 */
public class CourseSignup extends Course {

    protected List<Signup> signups;

    public List<Signup> getSignups() {
        return signups;
    }

    public void setSignups(List<Signup> signups) {
        this.signups = signups;
    }

    @Override
    public String toString() {
        return "CourseSignup{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", descrip='" + descrip + '\'' +
                ", lecturer=" + lecturer +
                ", lecturerName='" + lecturerName + '\'' +
                ", audience='" + audience + '\'' +
                ", gmtLecture=" + gmtLecture +
                ", addr='" + addr + '\'' +
                ", stage=" + stage +
                ", ruleCode=" + ruleCode +
                ", cover=" + cover +
                ", gmtModify=" + gmtModify +
                ", signups=" + signups +
                '}';
    }
}