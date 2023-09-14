package com.pureorg.order.process.dao.dto;

import com.pureorg.order.process.model.Role;
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
@Table("app_user")
public class AppUser {

    @Id
    private Long id;

    private String name;

    private String firstContactNo;

    private String secondContactNo;

    private Role role;

    private Boolean isActive;

    private String base64Password;

    private LocalDateTime lastLoginAt;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;



}
