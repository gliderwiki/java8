package com.libqa.stream.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Author : yion
 * @Date : 2016. 8. 22.
 * @Description : https://www.mkyong.com/java8/java-8-stream-read-a-file-line-by-line/ 스트림을 이용한 파일 읽기
 *
 */
public class ReadFileStream {

    public static void main(String[] args) {
        String fileName = "/Users/yion/line.txt";
        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
