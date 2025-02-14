package com.trailsbuddy.trailservices.service;

import com.trailsbuddy.trailservices.controller.CommentController;
import com.trailsbuddy.trailservices.dto.CommentRequest;
import com.trailsbuddy.trailservices.model.Comment;
import com.trailsbuddy.trailservices.repository.CommentRepository;
import com.trailsbuddy.trailservices.security.JwtService;
import com.trailsbuddy.trailservices.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final JwtService jwtService;
    private final UserRepository userRepository;

    public CommentService(CommentRepository commentRepository, JwtService jwtService, UserRepository userRepository) {
        this.commentRepository = commentRepository;
        this.jwtService = jwtService;
        this.userRepository = userRepository;
    }

    public Comment createComment(CommentRequest request, String token) {
        String email = jwtService.extractUsername(token.replace("Bearer ", ""));
        String userId = userRepository.findByEmail(email).orElseThrow().getId();

        Comment comment = new Comment();
        comment.setTrailId(request.getTrailId());
        comment.setUserId(userId);
        comment.setText(request.getText());
        comment.setCreatedAt(LocalDateTime.now());

        return commentRepository.save(comment);
    }

    public List<Comment> getComments(String trailId) {
        return commentRepository.findByTrailId(trailId);
    }
}