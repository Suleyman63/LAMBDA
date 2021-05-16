package okulprojesi1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Ogrenci> ogrenciListesi = new ArrayList<>();

    public static void main(String[] args) {

        testOgrenciolustur();
        ismeGoreListele("Ahmet");
        ismeGoreListele("Ayse");


    }
    private static void ismeGoreListele(String isim) {
   ogrenciListesi.stream().filter(t->t.getAd().equalsIgnoreCase(isim)).forEach(System.out::println);

    ogrenciListesi.stream().filter(t->t.getAd().equalsIgnoreCase(isim)).forEach(System.out::println);




    }
    private static void testOgrenciolustur(){
        ogrenciListesi.add(new Ogrenci("Ahmet", "Can", 15, 88.4, "erkek"));
        ogrenciListesi.add(new Ogrenci("Fatih", "Baki", 16, 89.4, "erkek"));
        ogrenciListesi.add(new Ogrenci("Mehmet", "Eski", 17, 82.4, "erkek"));
        ogrenciListesi.add(new Ogrenci("Ali", "Kurt", 14, 78.4, "erkek"));
        ogrenciListesi.add(new Ogrenci("Arda", "Lek", 19, 98.4, "erkek"));
        ogrenciListesi.add(new Ogrenci("Arif", "Cur", 12, 68.4, "erkek"));
        ogrenciListesi.add(new Ogrenci("Ayse", "Ceyhan", 14, 58.4, "kadin"));
        ogrenciListesi.add(new Ogrenci("Alev", "Canan", 16, 86.4, "kadin"));
        ogrenciListesi.add(new Ogrenci("Aliye", "Cile", 15, 81.4, "kadin"));


    }
}
