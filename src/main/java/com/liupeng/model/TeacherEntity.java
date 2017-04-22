package com.liupeng.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by mythsand on 22/04/2017.
 */
@Entity
@Table(name = "teacher", schema = "liupeng")
public class TeacherEntity implements Serializable {
    private String name;
    private String passwd;
    private int id;
    private String teaNo;
    private String college;
    private Collection<TeamEntity> teamByTeacher;

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "passwd", nullable = true, length = 11)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tea_no", nullable = true, length = 11)
    public String getTeaNo() {
        return teaNo;
    }

    public void setTeaNo(String teaNo) {
        this.teaNo = teaNo;
    }

    @Basic
    @Column(name = "college", nullable = true, length = 2)
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (passwd != null ? !passwd.equals(that.passwd) : that.passwd != null) return false;
        if (teaNo != null ? !teaNo.equals(that.teaNo) : that.teaNo != null) return false;
        if (college != null ? !college.equals(that.college) : that.college != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (teaNo != null ? teaNo.hashCode() : 0);
        result = 31 * result + (college != null ? college.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "teacherByTeam")
    @JsonIgnore
    public Collection<TeamEntity> getTeamByTeacher() {
        return teamByTeacher;
    }

    public void setTeamByTeacher(Collection<TeamEntity> teamByTeacher) {
        this.teamByTeacher = teamByTeacher;
    }
}
