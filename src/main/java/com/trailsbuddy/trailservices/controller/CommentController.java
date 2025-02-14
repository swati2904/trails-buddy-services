package com.trailsbuddy.trailservices.controller;

import com.trailsbuddy.trailservices.dto.CommentRequest;
import com.trailsbuddy.trailservices.model.Comment;
import com.trailsbuddy.trailservices.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping
    public ResponseEntity<Comment> createComment(
            @RequestBody CommentRequest request,
            @RequestHeader("Authorization") String token) {
        return ResponseEntity.ok(commentService.createComment(request, token));
    }

    @GetMapping("/{trailId}")
    public ResponseEntity<List<Comment>> getComments(@PathVariable String trailId) {
        return ResponseEntity.ok(commentService.getComments(trailId));
    }
}