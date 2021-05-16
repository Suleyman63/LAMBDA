package day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class File {

    public static void main(String[] args) throws IOException {

        String path = "/Users/apple/LAMBDA/src/day5/Mars";

        //Stream<String> satirlar =  Files.lines(Path.of(path));

        //satirlar.forEach(System.out::println);

        System.out.println("====================================");

        // bir dosyadan okunan satirlari buyuk harf olarak konsola yazdiralim
        Files.lines(Path.of(path)).
                map(t->t.toUpperCase()).forEach(System.out::println);

        System.out.println("====================================");


        // dosyadan ilk satiri ve buyuk harf olarak aliniz
        Files.lines(Path.of(path)).
                limit(5).map(t->t.toUpperCase()).forEach(System.out::println);

        System.out.println("====================================");

        // dosyadan 3 ve 4 uncu satirlari aliniz
        Files.lines(Path.of(path)).
                map(String::toUpperCase).skip(2).limit(2).forEach(System.out::println);

        System.out.println("====================================");

        // benim kelimesi string icinde kac defa kullanilmis bulunuz
        System.out.println(Files.lines(Path.of(path)).
                filter(t -> t.contains("Benim")).count());

        System.out.println("====================================");

        // dosya icindeki tum farkli kelimeleri yazdiralim
        Files.lines(Path.of(path)).map(t->t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).distinct().forEach(System.out::println);


        System.out.println("====================================");

        // dosya icinde kac tane m harfi oldugunu bulunuz
        System.out.println(Files.lines(Path.of(path)).
                map(t -> t.toLowerCase().split(" ")).flatMap(Arrays::stream).
                filter(t -> t.contains("m")).count());


        System.out.println("====================================");

        // bosluk ve noktalama isaretleri haric dosyada kac adet karekter kullanildigini yaziniz
        System.out.println(Files.lines(Path.of(path)).
                map(t -> t.replace(" ", "").replaceAll("\\W", "").
                        split("")).flatMap(Arrays::stream).count());

    }
}
