package com.pureorg.order.process.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.DayOfWeek;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("society_delivery_schedule")
public class SocietyDeliverySchedule {

    @Id
    private Long id;

    private Society society;

    private DayOfWeek scheduledDelivery;

    private String preferredTime;
}
