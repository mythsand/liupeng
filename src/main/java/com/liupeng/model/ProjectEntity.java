package com.liupeng.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by mythsand on 12/04/2017.
 */
@Entity
@Table(name = "project", schema = "liupeng", catalog = "")
public class ProjectEntity {
    private int id;
    private String name;
    private Date date;
    private String path;
    private Integer grade;
    private String judge;
    private int projectId;
    private StudentEntity projectByStu;
//    private Collection<TeacherEntity> ProjectByTea;
    private int stuNum;
    private int teaNum;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "path", nullable = false, length = 100)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "grade", nullable = true)
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "judge", nullable = true, length = 255)
    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    @Basic
    @Column(name = "project_id", nullable = false)
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (id != that.id) return false;
        if (projectId != that.projectId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;
        if (judge != null ? !judge.equals(that.judge) : that.judge != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (judge != null ? judge.hashCode() : 0);
        result = 31 * result + projectId;
        return result;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "stu_num", referencedColumnName = "num", nullable = false, insertable=false, updatable=false)
    public StudentEntity getProjectByStu() {
        return projectByStu;
    }

    public void setProjectByStu(StudentEntity projectByStu) {
        this.projectByStu = projectByStu;
    }

//    @OneToMany(mappedBy = "TeacherByProject")
//    public Collection<TeacherEntity> getProjectByTea() {
//        return ProjectByTea;
//    }
//
//    public void setProjectByTea(Collection<TeacherEntity> projectByTea) {
//        ProjectByTea = projectByTea;
//    }

    @Basic
    @Column(name = "stu_num", nullable = false)
    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    @Basic
    @Column(name = "tea_num", nullable = false)
    public int getTeaNum() {
        return teaNum;
    }

    public void setTeaNum(int teaNum) {
        this.teaNum = teaNum;
    }
}
