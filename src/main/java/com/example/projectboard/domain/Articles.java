package com.example.projectboard.domain;

import java.time.LocalDateTime;

public class Articles {
    private Long id;
    private String title;
    private String content;
    private String hasgtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
