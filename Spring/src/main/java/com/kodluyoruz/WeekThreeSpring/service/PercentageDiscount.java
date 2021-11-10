package com.kodluyoruz.WeekThreeSpring.service;

import com.kodluyoruz.WeekThreeSpring.properties.DiscountProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PercentageDiscount implements DiscountService {
    private final DiscountProperties discountProperties;

    public PercentageDiscount(DiscountProperties discountProperties) {
        this.discountProperties = discountProperties;
    }

    @Override
    public void discount() {
        System.out.printf("PercentageDiscount Percentage: %s Max Amount: %s \n"
                , discountProperties.getPercentage(), discountProperties.getMaxAmount());
        System.out.println(discountProperties);
    }
}
