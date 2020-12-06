package com.example.algorithm.test1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

/**
 * @author gzj
 * @date 2020/12/6 14:30
 */
public class AgeTempleteGenerate {

    public static void main(String[] args) throws IOException {

        final String fileName = "D://test.txt";
        final Random random = new Random();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "utf-8"));

        for (int i = 0; i < 1400000000; ++i) {
            int age = Math.abs(random.nextInt()) % 180;
            writer.write(age + "\r\n");
        }

        writer.flush();
        writer.close();
    }
}
