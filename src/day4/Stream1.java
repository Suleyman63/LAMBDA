package day4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        System.out.println(topladondur(6));
        topla1(7);
        System.out.println(tekTop(9));
        System.out.println(faktoryel(6));
        System.out.println(doubleDiziCevirList());

    }
    // birden belirtilen degere kadar olan tam sayilari toplayan ve sonucu donduren methodu yaziniz
    public static int topladondur(int deger) {
        System.out.println("\n=======TOPLADONDUR==========");
        return IntStream.range(1, deger).sum();

    }
    public static void topla1(int deger){
        System.out.println("\n=======TOPLA1==========");
         IntStream.rangeClosed(1, deger).forEach(System.out::print);

        }
        // tek sayilarin toplami NOT: istenen ust limiti kendimiz veriyoruz
    public static int tekTop(int deger){
        System.out.println("\n=======TEKTOP==========");
        return IntStream.rangeClosed(1, deger).filter(t->t%2!=0).sum();

    }
    // belirtilen sayinin faktoryelini hesaplayan yaziniz
    public static int faktoryel(int sayi){
        System.out.println("\n=======FAKTORYEL==========");
         return IntStream.rangeClosed(1, sayi).reduce(1,(x,y) ->x*y);

    }
    // bir double diziyi (notlar) stream nesnesine donusturerek bu dizi icerisinde bulunan sayilarin
    // 50 den buyuk olanlarini ayri bir listeye kaydederek yazdiran methodu tanimlayiniz
    public static List<Double> doubleDiziCevirList(){
        System.out.println("\n=======DOUBLEDIZICEVIRLIST==========");
        Double [] notlar = {88.5, 89.7, 65.3, 100.0, 45.2};
        Stream<Double> streamNotlar = Stream.of(notlar);
            return streamNotlar.filter(t -> t > 50.0).collect(Collectors.toList());
        }
    }




