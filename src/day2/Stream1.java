package day2;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {


        List<Integer> rakamlar= new ArrayList<>();

        rakamlar.add(5);
        rakamlar.add(6);
        rakamlar.add(7);
        rakamlar.add(3);
        rakamlar.add(2);
        rakamlar.add(9);
        rakamlar.add(-1);
        rakamlar.add(-100);
        rakamlar.add(4);

        System.out.println("\n========TUM SAYILAR============");
        rakamlar.forEach(x-> System.out.print(x + " "));

        System.out.println("\n========TEK SAYILAR============");
        rakamlar.stream().filter(t-> t%2!=0).forEach(System.out::print);

        System.out.println("\n=========CIFT SAYILAR=============== ");
        rakamlar.stream().filter(t-> t%2==0).forEach(System.out::print);

        System.out.println("\n=======POZITIF SAYILAR==========");
        rakamlar.stream().filter(t-> t>0).forEach(System.out::print);

        System.out.println("\n======CIFT SAYILAR===========");
        rakamlar.stream().filter(t-> t%2==0).forEach(Stream1::yazdir);

        System.out.println("\n========TEK SAYILAR=========");
        rakamlar.stream().filter(Stream1::tekMI).forEach(Stream1::yazdir);

        // istersek return yapip metod disinda yazdirabiliriz
        System.out.println("\n========NEGATIF SAYILAR=========");
        rakamlar.stream().filter(Stream1::negatifMi).forEach(Stream1::yazdir);

        // Istersek metodd icinde yazdirabiliriz
        System.out.println("\n========TEKLERIYAZDIR=========");
        tekleriYazdir(rakamlar);

    }
    public static void yazdir(int x) {
        System.out.print(x + " ");

    }
    public static boolean tekMI(int x){

        return x%2!=0;

    }
    public static boolean negatifMi(int x){

        return x<0;
    }
    public static void tekleriYazdir(List<Integer> liste){

        liste.stream().filter(x-> x%2!=0).forEach(x-> System.out.print(x));

    }
}
