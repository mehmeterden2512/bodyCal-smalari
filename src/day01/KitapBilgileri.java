package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapBilgileri {
    static Scanner scan = new Scanner(System.in);

    int kitapNo = 1000;
    String kitapAdi;
    String yazarAdi;
    double kitapFiyati;

    List<KitapBilgileri> kitapListesi = new ArrayList<>();

    public KitapBilgileri() {
    }

    public static void main(String[] args) {

        KitapBilgileri k = new KitapBilgileri();
        k.kitapBilgileri();
    }

    public void kitapBilgileri() {

        {

            int secim = 0;
            Scanner scan = new Scanner(System.in);
            do {
                System.out.println("Lutfen bir seçenek seçiniz:?\n1- Kitap Ekle \n2- Numara Ile Kitap Goruntule\n3- Bilgi Ile Kitap Goruntule"
                        + "\n4- Numara Ile Kitap Sil\n5- Tum Kitaplari Listele\n6- Cikis");

                secim = scan.nextInt();

                switch (secim) {
                    case 1:
                        kitapEkle();
                        break;
                    case 2:
                        noIleListele();
                        break;

                    case 3:
                        bilgiIleKitapListele();
                        break;

                    case 4:
                        numaraIleKitapSil();
                        break;
                    case 5:
                        kitaplariListele();
                        break;
                    case 6:
                        System.out.println("Gorusmek Uzere!");
                        break;

                    default:
                        System.out.println("Gecerli bir islem seciniz!");
                        break;
                }
            } while (secim != 6);
        }

    }

    public KitapBilgileri(int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyati) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyati = kitapFiyati;
    }

    @Override
    public String toString() {
        return "\nKitap Adi \t" + kitapAdi + "\nYazar Adi \t" + yazarAdi + "\nFiyat \t\t" + kitapFiyati
                + "\nKitap No \t" + kitapNo + "\n";
    }

    private void kitapEkle() {
        kitapNo++;
        System.out.println("Lutfen kitap adını giriniz");
        kitapAdi = scan.nextLine();
        System.out.println("Lutfen yazar adını giriniz");
        yazarAdi = scan.nextLine();
        System.out.println("Lutfen kitap fiyatını  giriniz");
        kitapFiyati = scan.nextDouble();
        scan.nextLine();

        KitapBilgileri kitap = new KitapBilgileri(kitapNo, kitapAdi, yazarAdi, kitapFiyati);
        kitapListesi.add(kitap);
        System.out.println("Kitaplar başarıyla eklendi");


    }

    private void noIleListele() {
        System.out.println("Lutfen listelemek istediğiniz numarayı giriniz");
        int girilenKitapNo = scan.nextInt();

        for (KitapBilgileri ktp : kitapListesi
        ) {
            if (ktp.kitapNo == girilenKitapNo) {
                System.out.println("Aranan kitap:" + ktp);
                kitapBilgileri();
            }
        }
        System.out.println("Aradığınız kitap bulunamadı");
        kitapBilgileri();
    }

    private void bilgiIleKitapListele() {

        System.out.println("Lutfen kitap adını giriniz");
        String girilenkitapAdi = scan.nextLine();
        System.out.println("Lutfen yazar adını giriniz");
        String girilenyazarAdi = scan.nextLine();
        int count = 0;
        for (KitapBilgileri ktp : kitapListesi
        ) {
            if (girilenkitapAdi.equals(ktp.kitapAdi) && girilenyazarAdi.equals(ktp.yazarAdi)) {
                System.out.println("Aradığınız kitap bilgileri: " + ktp);
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Aradığınız kitap listede bulunamadı");
        }
    }

    private void numaraIleKitapSil() {
        System.out.println("Lutfen silinmesini istediginiz kitap numarasini giriniz: ");
        int silNo = scan.nextInt();
        scan.nextLine();

        for (KitapBilgileri ktp : kitapListesi
        ) {
            if (ktp.kitapNo == silNo) {

                kitapListesi.remove(ktp);

                System.out.println("Kitap listeden silinmiştir");
                kitaplariListele();
            }
        }
        System.out.println("Aradığınız kitap listede bulunamamıştır");
    }

    private void kitaplariListele() {
        if (kitapListesi.isEmpty()) {

            System.out.println("Listenizde kitap bulunmamaktadir.");
            kitapBilgileri();
        } else {

            for (int i = 0; i < kitapListesi.size(); i++) {

                System.out.println(kitapListesi.get(i));
            }


        }
    }
}