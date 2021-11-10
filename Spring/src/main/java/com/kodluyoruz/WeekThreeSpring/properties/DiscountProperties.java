package com.kodluyoruz.WeekThreeSpring.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "discount")
@Data
public class DiscountProperties {
    private double percentage;
    private int maxAmount;
}
