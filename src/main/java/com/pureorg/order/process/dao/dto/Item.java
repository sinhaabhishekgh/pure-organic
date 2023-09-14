package com.pureorg.order.process.dao.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("item")
public class Item {

    @Id
    private Long id;

    private String name;

    private String description;

    private LocalDateTime createdAt;

    private Boolean isPublished;

    private Long categoryId;

    private LocalDateTime updatedAt;

    private String resourceImageUrl;
}
