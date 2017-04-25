package com.liupeng.repository;

import com.liupeng.model.StudentEntity;
import com.liupeng.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mythsand on 12/04/2017.
 */
@Repository
public interface StuRepository extends JpaRepository<StudentEntity, Integer>{

    @Transactional
    @Modifying
    @Query("update ProjectEntity project set project.filePath = ?1, project.file = ?2 where project.projectNo = ?3")
    int saveFile(String file, String fileName, String projectId);

    StudentEntity findByName(String name);


    @Query("select student from StudentEntity student  where student.stuNo = ?1")
    List<StudentEntity> findByTeammem(String stuNO);
}
