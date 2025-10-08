package com.testing.Store;

import java.util.Random;

public class RamSpeedTest {
    public static void main(String[] args) {
        final int SIZE_MB = 1024; // 1 GB
        final int SIZE = SIZE_MB * 1024 * 1024;
        byte[] memory = new byte[SIZE];
        Random random = new Random();

        // Write test
        long writeStart = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            memory[i] = (byte) random.nextInt(256);
        }
        long writeEnd = System.nanoTime();
        double writeTimeSec = (writeEnd - writeStart) / 1e9;
        double writeSpeed = SIZE_MB / writeTimeSec;

        // Read test
        long sum = 0;
        long readStart = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            sum += memory[i];
        }
        long readEnd = System.nanoTime();
        double readTimeSec = (readEnd - readStart) / 1e9;
        double readSpeed = SIZE_MB / readTimeSec;

        System.out.printf("Write speed: %.2f MB/s\n", writeSpeed);
        System.out.printf("Read speed: %.2f MB/s\n", readSpeed);
        System.out.println("Checksum: " + sum);
    }
}
