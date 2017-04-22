package com.liupeng.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by mythsand on 22/04/2017.
 */
@Entity
@Table(name = "student", schema = "liupeng")
public class StudentEntity implements Serializable {
    private String name;
    private String passwd;
    private int id;
    private String stuNo;
    private String college;
    private int memberByTeamId;
    private Collection<TeamEntity> teamByLeader;
//    private Collection<TeamEntity> teamByMember;
//    @ManyToMany(mappedBy = "memberByTeam")
//    public Collection<TeamEntity> getTeamByMember() {
//        return teamByMember;
//    }
//
//    public void setTeamByMember(Collection<TeamEntity> teamByMember) {
//        this.teamByMember = teamByMember;
//    }
//    private TeamEntity teamByMember;

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
    @Column(name = "stu_no", nullable = true, length = 11)
    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    @Basic
    @Column(name = "college", nullable = true, length = 2)
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Basic
    @Column(name = "memberByTeam_id", nullable = false)
    public int getMemberByTeamId() {
        return memberByTeamId;
    }

    public void setMemberByTeamId(int memberByTeamId) {
        this.memberByTeamId = memberByTeamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (id != that.id) return false;
        if (memberByTeamId != that.memberByTeamId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (passwd != null ? !passwd.equals(that.passwd) : that.passwd != null) return false;
        if (stuNo != null ? !stuNo.equals(that.stuNo) : that.stuNo != null) return false;
        if (college != null ? !college.equals(that.college) : that.college != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (stuNo != null ? stuNo.hashCode() : 0);
        result = 31 * result + (college != null ? college.hashCode() : 0);
        result = 31 * result + memberByTeamId;
        return result;
    }

    @OneToMany(mappedBy = "leaderByTeam")
    @JsonIgnore
    public Collection<TeamEntity> getTeamByLeader() {
        return teamByLeader;
    }

    public void setTeamByLeader(Collection<TeamEntity> teamByLeader) {
        this.teamByLeader = teamByLeader;
    }

//    @ManyToOne
//    @JoinColumn(name = "stu_no", referencedColumnName = "member_no", insertable = false, updatable = false)
//    public TeamEntity getTeamByMember() {
//        return teamByMember;
//    }
//
//    public void setTeamByMember(TeamEntity teamByMember) {
//        this.teamByMember = teamByMember;
//    }
}
