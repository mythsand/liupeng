package com.liupeng.repository;

import com.liupeng.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mythsand on 22/04/2017.
 */
@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {

    List<?> findById(int id);

    List<TeamEntity> findByTeaNo(String tea_no);

    @Query("select team from TeamEntity team join team.leaderByTeam lea join team.teacherByTeam teacher join team.projectByTeam project")
    List<?> findAllTeam();

    @Transactional
    @Modifying
    int deleteByTeamNo(String teamNo);
}
