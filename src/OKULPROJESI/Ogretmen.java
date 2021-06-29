package OKULPROJESI;

public class Ogretmen extends Kisi{

    private String sicilNo;
    private String bolum;

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo){
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }


    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "AdSoyad:" + getAdSoyad() + ", KimlikNo:" + getKimlikNo() +
                ", " + ", Yas" + getYas() + ", Bolum" + ",sicilNo:" + sicilNo;

    }
}
