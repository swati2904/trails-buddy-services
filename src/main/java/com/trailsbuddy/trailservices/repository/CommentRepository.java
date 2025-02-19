package com.trailsbuddy.trailservices.repository;

import com.trailsbuddy.trailservices.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
    Page<Comment> findByTrailId(String trailId, Pageable pageable);
}