package com.example.crudprtc3.Repository;

import com.example.crudprtc3.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
