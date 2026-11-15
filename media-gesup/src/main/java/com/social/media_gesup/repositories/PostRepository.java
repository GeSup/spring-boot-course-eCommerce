package com.social.media_gesup.repositories;

import com.social.media_gesup.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
