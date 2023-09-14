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
@Table("order_item")
public class OrderItem {

    @Id
    private Long id;

    private String orderNumber;

    private Long inventoryId;

    private Double quantityOrdered;

    private Double pendingQuantity;

    private Boolean isFullyDelivered;

    private LocalDateTime orderedAt;

    private LocalDateTime deliveredAt;

}
