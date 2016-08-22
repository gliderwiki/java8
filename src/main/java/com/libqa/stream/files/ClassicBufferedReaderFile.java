package com.libqa.stream.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author : yion
 * @Date : 2016. 8. 22.
 * @Description :
 */
public class ClassicBufferedReaderFile {
    public static void main(String args[]) {

        String fileName = "/Users/yion/line.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
