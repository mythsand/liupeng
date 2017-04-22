package com.liupeng.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by mythsand on 22/04/2017.
 */
@Entity
@Table(name = "team", schema = "liupeng")
public class TeamEntity implements Serializable {
    private int id;
    private String teamNo;
    private String teaNo;
    private String leaderNo;
    private String memberNo;
    private ProjectEntity projectByTeam;
    private StudentEntity leaderByTeam;
//    private Collection<StudentEntity> memberByTeam;
    private TeacherEntity teacherByTeam;
//    private Collection<StudentEntity> memberByTeam;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "team_no", nullable = false, length = 11)
    public String getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(String teamNo) {
        this.teamNo = teamNo;
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
    @Column(name = "leader_no", nullable = true, length = 11)
    public String getLeaderNo() {
        return leaderNo;
    }

    public void setLeaderNo(String leaderNo) {
        this.leaderNo = leaderNo;
    }

    @Basic
    @Column(name = "member_no", nullable = true, length = 11)
    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamEntity that = (TeamEntity) o;

        if (id != that.id) return false;
        if (teamNo != null ? !teamNo.equals(that.teamNo) : that.teamNo != null) return false;
        if (teaNo != null ? !teaNo.equals(that.teaNo) : that.teaNo != null) return false;
        if (leaderNo != null ? !leaderNo.equals(that.leaderNo) : that.leaderNo != null) return false;
        if (memberNo != null ? !memberNo.equals(that.memberNo) : that.memberNo != null) return false;

        return true;
    }
//
//    @ManyToOne
//    @JoinColumn(name = "team_no", referencedColumnName = "team_no", nullable = false)
//    public ProjectEntity getProjectByTeamNo() {
//        return projectByTeamNo;
//    }
//
//    public void setProjectByTeamNo(ProjectEntity projectByTeamNo) {
//        this.projectByTeamNo = projectByTeamNo;
//    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (teamNo != null ? teamNo.hashCode() : 0);
        result = 31 * result + (teaNo != null ? teaNo.hashCode() : 0);
        result = 31 * result + (leaderNo != null ? leaderNo.hashCode() : 0);
        result = 31 * result + (memberNo != null ? memberNo.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "team_no", referencedColumnName = "team_no", nullable = false, insertable = false, updatable = false)
    public ProjectEntity getProjectByTeam() {
        return projectByTeam;
    }

    public void setProjectByTeam(ProjectEntity projectByTeam) {
        this.projectByTeam = projectByTeam;
    }

    @ManyToOne
    @JoinColumn(name = "leader_no", referencedColumnName = "stu_no", insertable = false, updatable = false)
    public StudentEntity getLeaderByTeam() {
        return leaderByTeam;
    }

//    @ManyToMany
//    @JoinTable(name = "student", schema = "liupeng", joinColumns = @JoinColumn(name = "memberByTeam_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "memberByTeam_id", referencedColumnName = "id", nullable = false))
//    public Collection<StudentEntity> getMemberByTeam() {
//        return memberByTeam;
//    }
//
//    public void setMemberByTeam(Collection<StudentEntity> memberByTeam) {
//        this.memberByTeam = memberByTeam;
//    }

    public void setLeaderByTeam(StudentEntity leaderByTeam) {
        this.leaderByTeam = leaderByTeam;
    }

    @ManyToOne
    @JoinColumn(name = "tea_no", referencedColumnName = "tea_no", insertable = false, updatable = false)
    public TeacherEntity getTeacherByTeam() {
        return teacherByTeam;
    }

    public void setTeacherByTeam(TeacherEntity teacherByTeam) {
        this.teacherByTeam = teacherByTeam;
    }

//    @OneToMany(mappedBy = "teamByMember")
//    public Collection<StudentEntity> getMemberByTeam() {
//        return memberByTeam;
//    }
//
//    public void setMemberByTeam(Collection<StudentEntity> memberByTeam) {
//        this.memberByTeam = memberByTeam;
//    }
}
