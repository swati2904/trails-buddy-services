package com.trailsbuddy.trailservices.service;

import com.trailsbuddy.trailservices.dto.CommentRequest;
import com.trailsbuddy.trailservices.model.Comment;
import com.trailsbuddy.trailservices.model.User;
import com.trailsbuddy.trailservices.repository.CommentRepository;
import com.trailsbuddy.trailservices.repository.UserRepository;
import com.trailsbuddy.trailservices.security.JwtService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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
        User user = userRepository.findByEmail(email).orElseThrow();
        String userId = user.getId();
        String username = user.getUsername();

        Comment comment = new Comment();
        comment.setTrailId(request.getTrailId());
        comment.setUserId(userId);
        comment.setUsername(username);
        comment.setComment(request.getComment());
        comment.setRatings(request.getRatings());
        comment.setLiked(request.getLiked());
        comment.setLevel(request.getLevel());
        comment.setAccess(request.getAccess());
        comment.setParkingCost(request.getParkingCost());
        comment.setParkingLotSize(request.getParkingLotSize());
        comment.setConditions(request.getConditions());
        comment.setActivityType(request.getActivityType());
        comment.setActivityDate(request.getActivityDate());
        comment.setCreatedAt(LocalDateTime.now());

        return commentRepository.save(comment);
    }

    public Page<Comment> getComments(String trailId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return commentRepository.findByTrailId(trailId, pageable);
    }
}