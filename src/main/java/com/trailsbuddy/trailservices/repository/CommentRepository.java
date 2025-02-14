package com.trailsbuddy.trailservices.repository;

import com.trailsbuddy.trailservices.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findByTrailId(String trailId);
}