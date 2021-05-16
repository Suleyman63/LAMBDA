package okulprojesi1;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int yas;
    private double diplomanotu;
    private String cinsiyet;

    public Ogrenci(String ad, String soyad, int yas, double diplomanotu, String cinsiyet) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.diplomanotu = diplomanotu;
        this.cinsiyet = cinsiyet;

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getDiplomanotu() {
        return diplomanotu;
    }

    public void setDiplomanotu(double diplomanotu) {
        this.diplomanotu = diplomanotu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", diplomanotu=" + diplomanotu +
                ", cinsiyet='" + cinsiyet + '\'' + '}';
    }
}
