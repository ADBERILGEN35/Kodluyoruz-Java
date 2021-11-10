package com.kodluyoruz.WeekThreeSpring;

import com.kodluyoruz.WeekThreeSpring.service.DiscountService;
import com.kodluyoruz.WeekThreeSpring.service.InputService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;


@Component
@RequiredArgsConstructor
public class Demo implements CommandLineRunner {
    private final Scanner scanner;
    private final InputService service;
    private final List<DiscountService> discountServices;


    @Override
    public void run(String... args) throws Exception {


//        System.out.println("Lütfen input giriniz");
//        String input = scanner.nextLine();
//        System.out.println("Input: " + input);
//
//        inputTaker();
        service.testInput();

        discountServices.forEach(DiscountService::discount);

    }

    private void inputTaker() {
        System.out.println("Input 2: ");
        String input = scanner.nextLine();
        System.out.println("Input2: " + input);
    }
}
