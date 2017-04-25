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
//    @Modifying
//    @Transactional
//    @Query("update ProjectEntity project set project.teamNo=:qTeamNo,project.title=:qTitle," +
//            "project.startDate=:qStartDate,project.endDate=:qEndDate,project.description=:qDescription where project.projectNo=:qProjectNo")
//    void updateProjectByProjectNo(@Param("qTeamNo") String teamNo, @Param("qTitle") String title, @Param("qstartDate")Date startDate,
//    @Param("qEndDate") Date endDate,@Param("qDescription") String description,@Param("qProjectNo") String projectNo);
//    void updateByProjectNo(String projectNo,String teamNo,String title,Date startDate,Date endDate,String description);
}
