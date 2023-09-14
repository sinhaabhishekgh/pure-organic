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
@Table("address")
public class Address {

    @Id
    private Long id;

    private Society society;

    private Customer customer;

    private String blockNo;

    private String flatNo;

    private String wing;

    private String floorNo;

    private Boolean isActive;

    private Boolean isDefault;

    private String contactNo;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;
}
