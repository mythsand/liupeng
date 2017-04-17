package com.liupeng.repository;

import com.liupeng.model.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mythsand on 12/04/2017.
 */
@Repository
public interface TeaRepository extends JpaRepository<TeacherEntity, Integer>{
}
