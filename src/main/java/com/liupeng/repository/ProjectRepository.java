package com.liupeng.repository;

import com.liupeng.model.ProjectEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;


/**
 * Created by mythsand on 12/04/2017.
 */
@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer>{
    // 修改博文操作
    @Modifying
    @Transactional
    //管理员根据项目编号修改项目信息
    @Query("update ProjectEntity  project set project.title=:title,project.teamNo=:teamNo,project.startDate=:startDate,project.endDate=:endDate," +
            "project.description=:description where project.projectNo=:projectNo")
    void adminUpdateProject(@Param("projectNo") String projectNo, @Param("title") String title, @Param("teamNo") String teamNo, @Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("description") String description);

}
