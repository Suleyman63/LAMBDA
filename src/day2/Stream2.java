package day2;

import java.util.ArrayList;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();

        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(-9);

        tekKareYazdir(list);
        ciftKareYazdir(list);
        tekKareYazdir(list);
        System.out.println(tekKupTop(list));
        System.out.println(ciftKupTopl(list));
        System.out.println(top(list));
        System.out.println(buyukBul(list));
        System.out.println(kucukBul(list));
    }
    public static void tekKareYazdir(List <Integer> l){
        System.out.println("\n========TEKKAREYAZDIR============");
        l.stream().filter(t-> t%2!=0).map(t->t*t).forEach(Stream1::yazdir);

    }
    public static void ciftKareYazdir(List<Integer> l){
        System.out.println("\n========CIFTKAREYAZDIR============");
        l.stream().filter(t->t%2==0).map(t->t*t).forEach(Stream1::yazdir);

    }
   public static int tekKupTop(List<Integer> l){
       System.out.println("\n========TEKKUPTOPLAM============");
       return l.stream().filter(Stream1::tekMI).map(t->t*t*t).reduce(0,(x,y)-> (x+y));

   }
   public static int ciftKupTopl(List<Integer> l){
       System.out.println("\n========CIFTKUPTOP============");
       return l.stream().filter(t->t%2==0).map(t->t*t*t).reduce(0,(a,b)->(a+b));

    }
    public static int top(List<Integer> l){
        System.out.println("\n========TOP============");
       return l.stream().reduce(0,(a,b)->(a+b));

    }
    public static int buyukBul(List<Integer> list){
        System.out.println("\n========BUYUKBUL============");
        //return list.stream().reduce(0, (x,y)-> x>y ? x:y);
        return list.stream().reduce(0,Math::max);
    }
    public static int kucukBul(List<Integer> list){
        System.out.println("\n========KUCUKBUL============");
        return list.stream().reduce(0, (x,y)-> x<y ? x:y);
       // return list.stream().reduce(0, Math::min);

    }

}
