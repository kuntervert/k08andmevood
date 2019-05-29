import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;


public class Andmed{

    public static int pikkus(String s){
        return Integer.parseInt(s.split(",")[1]);
    }


    public static void main(String[] args) throws Exception{

        PrintWriter writer = new PrintWriter(new FileWriter("pikkusedOut.txt"));
        Files.readAllLines(Paths.get("C:\\Users\\Inimene\\Desktop\\pikkusedsisse.txt")).stream().sorted(Comparator.comparingInt(Andmed::pikkus)).collect(Collectors.toList()).forEach(writer::println);
        writer.close();
        
        Files.readAllLines(Paths.get("C:\\Users\\Inimene\\Desktop\\pikkusedsisse.txt")).stream().
                filter(s -> Integer.parseInt(s.split(",")[1])>=183).forEach(System.out::println);

    }

}