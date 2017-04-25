package com.liupeng.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

/**
 * Created by mythsand on 22/04/2017.
 */
@Entity
@Table(name = "project", schema = "liupeng", catalog = "")
public class ProjectEntity implements Serializable {
    private int id;
    private String projectNo;
    private String teamNo;
    private String title;
    private Date startDate;
    private Date endDate;
    private String description;
    private Collection<TeamEntity> teamByProject;
    private String file;
    private String filePath;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "project_no", nullable = false, length = 11)
    public String getProjectNo() {
        return projectNo;
    }

    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo;
    }

    @Basic
    @Column(name = "team_no", nullable = true, length = 11)
    public String getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(String teamNo) {
        this.teamNo = teamNo;
    }

    @Basic
    @Column(name = "title", nullable = false, length = 220)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "start_date", nullable = true)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date", nullable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "description", nullable = true, length = -1)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (id != that.id) return false;
        if (projectNo != null ? !projectNo.equals(that.projectNo) : that.projectNo != null) return false;
        if (teamNo != null ? !teamNo.equals(that.teamNo) : that.teamNo != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (projectNo != null ? projectNo.hashCode() : 0);
        result = 31 * result + (teamNo != null ? teamNo.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "projectByTeam")
    @JsonIgnore
    public Collection<TeamEntity> getTeamByProject() {
        return teamByProject;
    }

    public void setTeamByProject(Collection<TeamEntity> teamByProject) {
        this.teamByProject = teamByProject;
    }

    @Basic
    @Column(name = "file", nullable = true, length = 255)
    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Basic
    @Column(name = "file_path", nullable = true, length = 255)
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
