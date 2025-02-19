package com.trailsbuddy.trailservices.controller;

import com.trailsbuddy.trailservices.dto.CommentRequest;
import com.trailsbuddy.trailservices.model.Comment;
import com.trailsbuddy.trailservices.service.CommentService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Page<Comment>> getComments(
            @PathVariable String trailId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size) {
        return ResponseEntity.ok(commentService.getComments(trailId, page, size));
    }
}