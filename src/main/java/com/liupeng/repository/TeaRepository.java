package com.liupeng.repository;

import com.liupeng.model.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mythsand on 12/04/2017.
 */
@Repository
public interface TeaRepository extends JpaRepository<TeacherEntity, Integer>{
    TeacherEntity findByTeaNo(String tea_no);
//    更改教师信息
    @Transactional
    @Modifying
    @Query("update TeacherEntity teacher set teacher.name=?2,teacher.passwd=?3,teacher.college=?4 where teacher.teaNo=?1")
    int updateByTeaNo(String teaNo,String name,String passwd,String college);
}
