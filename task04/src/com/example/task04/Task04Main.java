package com.example.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        double sum = 0;
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                try {
                    double number = Double.parseDouble(token);
                    sum += number;
                } catch (NumberFormatException e) {
                }
            }
        }
        System.out.printf(Locale.US,"%.6f%n", sum);
    }
}
