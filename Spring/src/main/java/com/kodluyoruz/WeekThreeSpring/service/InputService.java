package com.kodluyoruz.WeekThreeSpring.service;

//import com.kodluyoruz.WeekThreeSpring.properties.InputProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class InputService {
    private final Scanner scanner;
    @Value("${input.limit}")
    private int limit;

//    public InputService(Scanner inScanner,InputProperties inputProperties) {
//        this.scanner = inScanner;
//        this.inputProperties = inputProperties;
//    }

    public void testInput() {
        System.out.println("Test Input: ");
        String input = scanner.nextLine();
        System.out.println("Test Input: " + input);

        System.out.println(limit);
    }

}
