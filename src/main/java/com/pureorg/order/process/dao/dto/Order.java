package com.pureorg.order.process.dao.dto;

import com.pureorg.order.process.model.OrderStatus;
import com.pureorg.order.process.model.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("order")
public class Order {

    @Id
    private Long id;

    private String mainOrderNumber;

    private Customer customer;

    private LocalDateTime createdAt;

    private OrderStatus orderStatus;

    private LocalDate expectedDelivery;

    private Boolean isFullyDelivered;
}
