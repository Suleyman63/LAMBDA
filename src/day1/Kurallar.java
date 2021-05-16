package day1;

import java.util.Arrays;
import java.util.List;

public class Kurallar {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 5, 6, 7, 8, 9);

        // Listenin elemanlarini 2 artirarak yazdiralim
        list.forEach(x -> System.out.print(x + 2 + " "));


        // eger satir sayisi 2 den fazla ise {} suslu parentez kullanilir.
        System.out.println("");
        list.forEach(t -> {
            int miktar = 2;
            System.out.print(t + miktar + " ");
        });

        System.out.println(" ");
        System.out.println("Veri tipi kullanilirsa Excplicit");

        list.forEach((Integer x) -> System.out.print(x + 2 + " "));


        System.out.println(" ");
        // bir dis degisken kullanlirsa
        int deger = 5;
        list.forEach(t -> System.out.print(t + deger + " "));


        // metot referansi ====> class adi :: metot adi
        System.out.println("\nMetot referansi kullanimi");
        list.forEach(Kurallar::yazdir);

    }
    public static void yazdir(int x){
            System.out.print(x + " ");
        }
    }

