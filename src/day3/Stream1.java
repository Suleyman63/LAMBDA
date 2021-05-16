package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(8);
        liste.add(9);
        liste.add(3);
        liste.add(12);
        liste.add(33);
        liste.add(6);
        liste.add(9);
        liste.add(9);
        liste.add(-7);
        liste.add(-2);

        System.out.println(carpimBul(liste));
        System.out.println(dokuzSay(liste));
        System.out.println(adetSay(liste));
        System.out.println(negatifBul(liste));
        System.out.println(pozitifBul(liste));
        System.out.println(tekKareSirTekrarsiz(liste));
        System.out.println(ciftKareSirTekrarsiz(liste));


    }
    public static int carpimBul(List<Integer> liste) {
        System.out.println("\n========CARPIMBUL============");
        return liste.stream().reduce(1, (x, z) -> x * z);

    }
    // kac adet 9 sayisi oldugunu bulan metod
    public static long dokuzSay(List<Integer> liste) {
        System.out.println("\n========DOKUZSAY============");
        return liste.stream().filter(t -> t == 9).count();

    }
    // kac adet sayi oldugunu bulan rakamlar
    public static long adetSay(List<Integer> liste) {
        System.out.println("\n========ADETSAY============");
        return liste.stream().count();

    }
    // listedeki negatif sayilari bulan method
    public static List<Integer> negatifBul(List<Integer> liste) {
        System.out.println("\n========NEGATIFBUL============");
        return liste.stream().filter(x -> x < 0).collect(Collectors.toList());

    }
    // listedeki negatif sayilari bulan method
    public static List<Integer> pozitifBul(List<Integer> liste) {
        System.out.println("\n========POZITIFIFBUL============");
        return liste.stream().filter(x -> x > 0).collect(Collectors.toList());

    }
    // listedki tek elemanlarin karelerini sirali ve tekrarsiz bir sekilde listeye kaydeden methodu yaziniz.
    public static List<Integer> tekKareSirTekrarsiz(List<Integer> liste) {
        System.out.println("\n=========TEKKARESIRALILISTELE===========");
        return liste.stream().filter(t -> t % 2 != 0).map(t -> t * t).distinct().sorted().collect(Collectors.toList());

    }
    // listedki cift elemanlarin karelerini sirali ve tekrarsiz bir sekilde listeye kaydede
    public static List<Integer> ciftKareSirTekrarsiz(List<Integer> liste) {
        System.out.println("\n========CIFTKARESIRALILISTELE============");
        return liste.stream().filter(x -> x % 2 == 0).map(t -> t * t).distinct().sorted().collect(Collectors.toList());

        // NOT: sorted(Comparator.reverseOrder()); yaparak tersten siralayabiliriz
        // (int) Math.pow(x, 2) methodunu kullanarak da kare almamiz mumkun
}
}