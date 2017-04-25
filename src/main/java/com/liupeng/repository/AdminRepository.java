package com.liupeng.repository;

import com.liupeng.model.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mythsand on 12/04/2017.
 */
@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{
    @Transactional
    @Modifying
    //测试语句
    @Query("update AdminEntity admin set admin.passwd=:qPasswd where admin.name=:qName")
    void updatePasswd(@Param("qPasswd") String passwd,@Param("qName") String name);
}
