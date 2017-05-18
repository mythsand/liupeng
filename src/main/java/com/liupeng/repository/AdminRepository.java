package com.liupeng.repository;

import com.liupeng.model.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mythsand on 12/04/2017.
 */
@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Integer>{
    @Transactional
    @Modifying
    //测试语句
    @Query("update AdminEntity admin set admin.passwd=?1 where admin.name=?2")
    int updatePasswd(String passwd, String name);

    @Transactional
    @Modifying
    @Query("update AdminEntity admin set admin.passwd=?2,admin.type=?3,admin.department=?4 where admin.name=?1")
    int updateAdminByName(String name,String passwd,String type,String department);

    @Transactional
    @Modifying
    @Query("delete from AdminEntity admin where admin.name=?1")
    int deleteByName(String name);

    @Query("select admin from AdminEntity admin where admin.name = ?1 and admin.passwd = ?2")
    List<?> findByNameAndPasswd(String name, String passwd);

}
