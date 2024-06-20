package com.example.projectboard.domain;

import java.time.LocalDateTime;

public class ArticlesComments {
    private Long id;
    private Articles articles; // 게시글 ID
    private String content;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
