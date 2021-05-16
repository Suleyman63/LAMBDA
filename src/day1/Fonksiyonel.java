package day1;

import java.util.Arrays;
import java.util.List;

public class Fonksiyonel {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.forEach(x-> System.out.print(x + ","));

        List<Integer> sayilar= Arrays.asList(1,2,3,4);

        System.out.println();
        sayilar.forEach(a-> System.out.print(a +","));

        System.out.println();
        sayilar.forEach(a->{
          a+=2;
            System.out.print(a + ",");
        });

        System.out.println();
        sayilar.forEach((Integer a)
    ->{a+=2;
            System.out.print(a + ",");
            });
    }

}
