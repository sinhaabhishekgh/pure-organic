package com.pureorg.order.process.dao.dto;

import com.pureorg.order.process.model.PaymentMethod;
import io.r2dbc.spi.Blob;
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
@Table("delivery_info")
public class Delivery {

    @Id
    private Long id;

    private AppUser deliveryGuy;

    private Order mainOrder;

    private LocalDateTime deliveredOn;

    //private Blob pod;

    private Boolean isFullyDelivered;

    private String carryForwardOrderNo;

    private PaymentMethod paymentMethod;

    private Double totalAmountPayable;

    private Double totalAmountReceived;

    private String paymentReferenceNo;

}
