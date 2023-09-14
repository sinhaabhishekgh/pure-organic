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
@Table("customer")
public class Customer {

    @Id
    private Long id;

    private String mobileNo;

    private String countryCode;

    private String name;

    private String email;

    private LocalDateTime joinedOn;

    private Boolean isActive;

    private String homeCity;

    private LocalDateTime modifiedAt;
}
