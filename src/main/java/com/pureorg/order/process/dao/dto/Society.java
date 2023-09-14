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
@Table("society")
public class Society {

    @Id
    private Long id;

    private String name;

    private String description;

    private String address;

    private String areaPinCode;

    private String city;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;
}
