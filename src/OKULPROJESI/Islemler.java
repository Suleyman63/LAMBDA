package OKULPROJESI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    private List <Kisi> ogrenciListesi = new ArrayList<>();
    private List <Kisi> ogretmenListesi = new ArrayList<>();
    private String kisiTuru;

    public void anaMenu(){

        Scanner scan = new Scanner(System.in);
        System.out.println("OGRENCI VE OGRETMEN YONETIM PANELI");
        System.out.println("===================================");
        System.out.println("1- OGRENCI ISLEMLERI");
        System.out.println("2- OGRETMEN ISLEMLERI");
        System.out.println("Q- CIKIS");
        String secim = scan.next().toUpperCase();

        if(secim.equals("1")){
            kisiTuru = "OGRENCI";
            islemMenusu();
        }
        else if(secim.equals("2")){
            kisiTuru = "OGRETMEN";
            islemMenusu();
        }
        else if (secim.equals("Q")){
            cikis();
        }
        else{
            System.out.println("Yanlis secim yaptiniz");
            anaMenu();
            System.out.println();
        }
    }
    private void islemMenusu() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("YAPMAK ISTEDIGINIZ ISLEMI SECINIZ");
        System.out.println("===================================");
        System.out.println("1- EKLEME\n2- ARAMA\n3- LISTELE\n4- SIL\n5- ANA MENU\nQ- CIKIS");
        String tercih = scan.next().toUpperCase();

        switch (tercih){
            case "1": ekle();
            break;
            case "2": ara();
            break;
            case "3": listele();
            break;
            case "4": sil();
            break;
            case "5": anaMenu();
            break;
            case "Q": cikis();
            break;
            default:
                System.out.println("Yanlis Giris Yaptiniz...");
                anaMenu();
                break;
        }
    }
    private void sil() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Silmek Istediginiz "+kisiTuru+" Kisinin Kimlik Numarasi");
        String kimlikNo = scan.next();

        if(kisiTuru.equals("OGRENCI")){
            kisiSil(kimlikNo, ogrenciListesi);
        }else{
            kisiSil(kimlikNo, ogretmenListesi);
        }
       anaMenu();


    }
    private void kisiSil(String kimlikNo, List <Kisi> liste) {


        for(Kisi w : liste){
            if(kimlikNo.equals(w.getKimlikNo())){
                System.out.println(kimlikNo + "lu" + kisiTuru + "Kisi Silindi");
                return;
            }
        }
        System.out.println(kimlikNo + "lu" + kisiTuru + "Kayit bulunamadi");
    }
    private void listele() {

        List <Kisi> liste;
        if(kisiTuru.equals("OGRENCI")){
            liste = ogrenciListesi;
        }else{
            liste = ogretmenListesi;
        }
        if(liste.isEmpty()){
            System.out.println("Listede kayit bulunamadi");
        }else{
            System.out.println("==========="+ kisiTuru + " LISTESI======");
            for(Kisi w : liste){
                System.out.println(w);
            }
        }
      anaMenu();

    }
    private void ara() {

        Scanner scan = new Scanner(System.in);
        System.out.println("===="+kisiTuru+"==BILGILERI");
        System.out.println("Aradiginiz kisinin kimlik numarasiniz giriniz");
        String kimlikNo = scan.next();

        if(kisiTuru.equals("OGRENCI")){
            kimlikNoIleKisiAra(kimlikNo, ogrenciListesi);
        }else{
            kimlikNoIleKisiAra(kimlikNo, ogretmenListesi);
        }
       anaMenu();

    }
    private void kimlikNoIleKisiAra(String kimlikNo, List<Kisi> liste) {

        for(Kisi w : liste){
            if(w.getKimlikNo().equals(kimlikNo)){
                System.out.println(w);
                return;
            }
        }
        System.out.println("Aradiginiz kisi bulunamamistir");

    }
    private void ekle() {

        Scanner scan = new Scanner(System.in);
        System.out.println("======="+kisiTuru+"=======");
        System.out.println("Eklemek istediginiz kisinin bilgilerini giriniz");
        System.out.println("Ad Soyad");
        String adSoyad = scan.nextLine();
        System.out.println("Kimlik No");
        String kimlikNo = scan.next();
        System.out.println("Yas");
        int yas = scan.nextInt();


        if(kisiTuru.equals("OGRENCI")){
            System.out.println("Sinif");
            String sinif = scan.next();
            System.out.println("Ogrenci No");
            String numara = scan.next();

            Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, sinif, numara);
            kisiEkle(ogrenci, ogrenciListesi);
        }
        else{
            System.out.println("Sicil No");
            String sicilNo = scan.next();
            System.out.println("Bolum");
            String bolum = scan.next();
        }
       anaMenu();


    }
    private void kisiEkle(Kisi kisi,  List<Kisi> liste) {

    for(Kisi w : liste){
        if(kisi.getKimlikNo().equals(w.getKimlikNo())){
            System.out.println(kisi.getKimlikNo() + "No' lu Kisi Sisteme Kayitli");
            islemMenusu();
        }
        else{
            liste.add(kisi);
            System.out.println(kisi.getAdSoyad() + "Sisteme Eklendi...");
        }
    }
    }
    private void cikis() {
        System.out.println("CIKIS YAPTINIZ!!! GULE GULE...");


    }
    public void testKisiOlustur() {

        Ogrenci ogr1 = new Ogrenci("Ahmet Kaya", "12345", 14, "1234566", "9A");
        Ogrenci ogr2 = new Ogrenci("Aysel Kaya", "12346", 14, "1234567", "9A");
        Ogrenci ogr3 = new Ogrenci("Ali Kaya", "12347", 14, "1234568", "9A");

        Ogretmen ogrt1 = new Ogretmen("Selim Kel", "12348", 40,  "Fen", "123");
        Ogretmen ogrt2 = new Ogretmen("Selma Kel", "12349", 42,  "Matematik", "124");


        ogrenciListesi.add(ogr1);
        ogrenciListesi.add(ogr2);
        ogrenciListesi.add(ogr3);

        ogretmenListesi.add(ogrt1);
        ogretmenListesi.add(ogrt2);

    }
}
