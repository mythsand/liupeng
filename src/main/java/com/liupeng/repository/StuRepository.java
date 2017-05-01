package com.liupeng.repository;

import com.liupeng.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mythsand on 12/04/2017.
 */
@Repository
public interface StuRepository extends JpaRepository<StudentEntity, Integer>{

    @Transactional
    @Modifying
    @Query("update ProjectEntity project set project.filePath = ?1, project.file = ?2 where project.projectNo = ?3")
    int saveFile(String file, String fileName, String projectId);

    @Transactional
    @Modifying
    @Query("update StudentEntity student set student.name=?1,student.passwd=?2,student.college=?3,student.memberByTeamId=?4 where student.stuNo=?5")
    int upateStudent(String name,String passwd,String college,int team_id,String stu_no);

    @Transactional
    @Modifying
    @Query("delete from StudentEntity student where student.stuNo=?1")
    int deleteByStuNo(String stu_no);

    StudentEntity findByName(String name);
    StudentEntity findByStuNo(String stuNo);


}
