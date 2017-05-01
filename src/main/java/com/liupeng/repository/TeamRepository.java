package com.liupeng.repository;

import com.liupeng.model.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mythsand on 22/04/2017.
 */
@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Integer> {

    List<?> findById(int id);

    List<TeamEntity> findByTeaNo(String tea_no);

}
