package com.liupeng.repository;

import com.liupeng.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mythsand on 03/05/2017.
 */
@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer> {
}
