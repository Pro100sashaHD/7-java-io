package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int previousByte = 0;
        int currentByte;

        while ((currentByte = System.in.read()) != -1) {
            if (currentByte == 10 && previousByte == 13){
                System.out.write(currentByte);
                previousByte = 0;
                continue;
            }
            if (previousByte != 0) {
                System.out.write(previousByte);
            }
            previousByte = currentByte;
        }
        if (previousByte != 0) {
            System.out.write(previousByte);
        }
        System.out.flush();
    }
}
