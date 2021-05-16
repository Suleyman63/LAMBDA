package day3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Stream2 {
    public static void main(String[] args) {

        List<String> str=new ArrayList<>();
         str.add("ali");
         str.add("Mark");
         str.add("JacKson");
         str.add("Mariano");
         str.add("Cris");
         str.add("Tucker");
         str.add("AlbErto");


         aileBas(str);
         onileBit(str);
         buyukHarfeCevir(str);
         uzunGoreYaz(str, 5);
        System.out.println(belirUzunluk(str, 4));
        System.out.println(baslamayanHarfVarMi(str, "B"));
        System.out.println(varMi(str, "M"));
        System.out.println(bitenVarMi(str, "c"));
        aileobiten(str);
        uzunYaz(str);
        yazdir(str);

    }

    // listede adi a ile baslayanlari yazdir
    public static void aileBas(List<String> str){
        System.out.println("=======AILEBASLAYANLAR==========");
        str.stream().filter(h->h.startsWith("A")).forEach(System.out::println);
    }
    // sonu on ile bitenleri yazdir
    public static void onileBit(List<String> str){
        System.out.println("=======ONILEBASLAYANLAR==========");
        str.stream().filter(h->h.endsWith("on")).forEach(System.out::println);
    }
    // buyuk harfe cevir methodu
    public static void buyukHarfeCevir(List<String> str) {
        System.out.println("=======BUYUKHARFECEVIR==========");
        str.stream().map(h -> h.toUpperCase()).forEach(System.out::println);

     }
     // listedki tum elemanlarin uzunluklari belirtilen uzunluktan fazla ise bunlari yazdiran methodu bulunuz
     public static void uzunGoreYaz(List<String> str, int uzunluk){
        System.out.println("=======UZUNGOREYAZ==========");
        str.stream().filter(t->t.length()> uzunluk).forEach(System.out::println);

    }
    // listedeki tum elemanlarin uzunluklari belirtilen uzunluktan kucuk mu diye kontrol eden methodu yaziniz
    public static boolean belirUzunluk(List<String> str, int uzunluk){
        System.out.println("=======BELIUZUNLUK==========");
        return str.stream().allMatch(h->h.length() < uzunluk); //false

    }
    // LISTEDKI ELEMANLARIN BELIRTILEN HARF ILE BASLAMADIGINI KONTROL EDEN METHODU BULUNUZ
    public static boolean baslamayanHarfVarMi(List<String> str, String harf){
        System.out.println("=======BASLAMAYANHARFVARMI==========");
        return str.stream().noneMatch(t->t.startsWith(harf)); //true

    }
    // listede belirtilen eleman var mi diye kontrol eden methodu yaziniz
    public static boolean varMi(List<String> str, String harf){
        System.out.println("=======VARMI==========");
        return str.stream().anyMatch(t->t.startsWith(harf)); // TRUE

    }
    // listede belirtilen harf ile biten var mi
    public static boolean bitenVarMi(List<String> str, String harf){
        System.out.println("=======BITENVARMI==========");
        return str.stream().anyMatch(t->t.endsWith(harf)); // false

    }
    // a ile baslayan o ile bitenleri yazdirin
    public static void aileobiten(List<String> str){
        System.out.println("=======AILEOBITEN==========");
        str.stream().filter(t -> t.startsWith("A")).filter(t -> t.endsWith("o")).
                forEach(System.out::println);

    }
    // listedeki her bir elemanin uzunlugunu bulunuz
    public static void uzunYaz(List<String> str){
        System.out.println("=======UZUNYAZ==========");
        str.stream().sorted(Comparator.comparing(String::length)).
                map(t->t + " : " + t.length()).
                forEach(System.out::println);

    }
    // buyuk kucuk harf duyarsiz
    public static void yazdir(List<String> str){
        System.out.println("=======YAZDIR==========");
        str.stream().map(String::toLowerCase).
                filter(t->t.startsWith("a")).forEach(System.out::println);
    }
}
