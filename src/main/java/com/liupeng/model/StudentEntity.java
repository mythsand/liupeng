package com.liupeng.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by mythsand on 12/04/2017.
 */
@Entity
@Table(name = "student", schema = "liupeng", catalog = "")
public class StudentEntity {
    private int num;
    private String name;
    private String passwd;
    private Collection<ProjectEntity> StudentByProject;

    @Id
    @Column(name = "num", nullable = false)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 11)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "passwd", nullable = false, length = 25)
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (num != that.num) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (passwd != null ? !passwd.equals(that.passwd) : that.passwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = num;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "projectByStu")
    public Collection<ProjectEntity> getStudentByProject() {
        return StudentByProject;
    }

    public void setStudentByProject(Collection<ProjectEntity> studentByProject) {
        StudentByProject = studentByProject;
    }
}
