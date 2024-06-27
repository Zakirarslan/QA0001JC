package d39Lambda;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Lambda15 {
    public static void main(String[] args) throws IOException {

        // Example 1: Write the code that prints the text in the given text file to the console.
        // lines= is a method of the file class. And it returns Stream<String> for reading data line by line....
        //From a specified file path, this alllows you perform stream operations on each line in the file....


        //Paths.get is a static method of the Paths class. It returns a path object representing the given file path string....

       // Files.lines(Paths.get("src/main/java/d39Lambda/File.txt")).forEach(System.out:: println);

        Path path = Paths.get("src/main/java/d39Lambda/File");

        Files.lines(path).forEachOrdered(System.out::println);


        //Example 2 write code that prints the text in the given file to the console in uppercase....

        //1ST WAY
        String path1 = Files.readString(Paths.get("src/main/java/d39Lambda/File")).toUpperCase();
        System.out.println("path1 = " + path1);

        System.out.println("===============================================================================");

        //2ND WAY

        Files.lines(Paths.get("src/main/java/d39Lambda/File")).map(String::toUpperCase).forEach(System.out::println);

        //Example; return the different words used in the texts in the given text file as a list...

        List<String> differentWords = Files.lines(Paths.get("src/main/java/d39Lambda/File")).
                map(t-> t.replaceAll("\\p{Punct}" , "")).
                map(t-> t.split(" ")).flatMap(t-> Arrays.stream(t)).distinct().collect(Collectors.toList());


        System.out.println("differentWords = " + differentWords);




    }
}