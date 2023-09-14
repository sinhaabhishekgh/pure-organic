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
@Table("inventory")
public class Inventory {

    @Id
    private Long id;

    private Double totalQuantity;

    private LocalDateTime harvestedAt;

    private Boolean isAvailableForSale;

    private Long itemId;

    private LocalDateTime updatedAt;

    private Double availableQty;

}
