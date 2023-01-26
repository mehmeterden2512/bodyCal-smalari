package ocak20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapBilgileri {
    /*
     *
     * Bir kitapci icin program yapalim Kitap no 1000'den baslayarak sirali no olsun
     * Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
     *
     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini
     * sorsun 1- kitap ekle 2- numara ile kitap goruntule 3- bilgi ile kitap
     * goruntule 4- numara ile kitap sil 5- Tum kitaplari listele 6- çıkış
     */
    String kitapAdi;
    String yazarAdi;
    double fiyat;
    int numara=1000;
    Scanner scan=new Scanner(System.in);
    List<KitapBilgileri> kitapListesi=new ArrayList<>();

    @Override
    public String toString() {
        return
                "kitapAdi= " + kitapAdi +
                " yazarAdi= " + yazarAdi +
                " fiyat= " + fiyat +
                " numara= " + numara ;

    }

    public KitapBilgileri() {
    }

    public KitapBilgileri(String kitapAdi, String yazarAdi, double fiyat, int numara) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.fiyat = fiyat;
        this.numara = numara;
    }

    public static void main(String[] args) {
        KitapBilgileri k=new KitapBilgileri();
        k.menu();
    }

    private  void menu() {



        do {
            System.out.println("1- kitap ekle \n2- numara ile kitap goruntule \n3- bilgi ile kitapgoruntule " +
                    "\n4- numara ile kitap sil\n5-Tum kitaplari listele \n6- çıkış"+"\nlutfen seciminizi girin");
            String secim=scan.nextLine();

            switch (secim){
                case "1": kitapEkle();break;
                case "2": numaraIleKitapGoruntule();break;
                case "3": bilgiIleKitapGoruntule();break;
                case "4": numaraKitapSil();break;
                case "5": kitapListele();break;
                case  "6":
                    System.out.println("cıkıs yapılıyor");
                    System.exit(0);
                default:
                    System.out.println("hatalı islem tercihi");
                    menu();
            }
        } while (!scan.nextLine().equals("6"));


    }

    private void numaraKitapSil() {
        System.out.println("silmek iistediğimniz kitap no giriniz");
        int silinecekKitapNo=scan.nextInt();
        boolean kitapSilindimi=false;
        for (KitapBilgileri eachKitap:kitapListesi
             ) {
            if (eachKitap.numara==silinecekKitapNo){
                kitapListesi.remove(eachKitap);
                kitapSilindimi=true;

            }
        }
       if (!kitapSilindimi){
           System.out.println("silmek istenilen numaraya ait kitap bulunamadi");
      ;
       }
    }

    private void bilgiIleKitapGoruntule() {
        System.out.println("aranan kiatap adi giriniz");
        String girilenKitapAdi=scan.nextLine();
        System.out.println("aranan kitap yazar adini giriniz");
        String girilenYazarAdi=scan.nextLine();
        boolean kontrol=false;
        for (KitapBilgileri eachKitap:kitapListesi
             ) {
            if (girilenKitapAdi.equalsIgnoreCase(eachKitap.kitapAdi)&& girilenYazarAdi.equalsIgnoreCase(eachKitap.yazarAdi)){
                System.out.println(eachKitap);
                kontrol=true;

            }
        }
            if (!kontrol){
                System.out.println("aranan kiritetrlerde kitap bulunamadi");
            }

    }

    private void numaraIleKitapGoruntule() {
        System.out.println("goruntulemek istediginiz kitap no giriniz");
        int girilenNo=scan.nextInt();
        boolean kitapVarmi=false;
        for (KitapBilgileri eachKitap:kitapListesi
             ) {
            if (girilenNo==eachKitap.numara){
                System.out.println("aranan kitap"+eachKitap);
                kitapVarmi =true;
            }
        }
            if (!kitapVarmi){
                System.out.println("aranan kiatap bulunamadi ");
            }

    }

    private List<KitapBilgileri> kitapListele() {

            return kitapListesi;

    }

    private void kitapEkle() {
        //Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
        System.out.println("Kitap adi: ");
        kitapAdi=scan.nextLine();
        System.out.println("yazar adi: ");
        yazarAdi=scan.nextLine();
        System.out.println("fiyat: ");
        fiyat=scan.nextDouble();
        KitapBilgileri kitap=new KitapBilgileri( kitapAdi, yazarAdi,fiyat,numara++);
        kitapListesi.add(kitap);
        System.out.println("kitap basarıyla kaydedildi..");


    }
}
