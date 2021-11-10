package com.kodluyoruz.WeekThreeSpring.service;

import org.springframework.stereotype.Service;

@Service
public class Buy2Take3DiscountService implements DiscountService{
    @Override
    public void discount() {
        System.out.println("Buy2Take3DiscountService");
    }
}
