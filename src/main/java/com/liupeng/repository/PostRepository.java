package com.liupeng.repository;

import com.liupeng.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mythsand on 03/05/2017.
 */
@Repository
public interface PostRepository extends JpaRepository<PostEntity, Integer> {
    @Transactional
    @Modifying
    @Query("delete from PostEntity post where post.title=?1")
    int deletePost(String title);
}
