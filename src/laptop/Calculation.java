package laptop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculation {
    Scanner scan=new Scanner(System.in);
    List<String> bilgisayar=new ArrayList<>();
    String marka="";
    public static String getRam() {
        int ramFiyat=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Rami seciniz:\n" +
                "1- 32 gb, fiyati 300\n"+
                "2- 16 gb, fiyati 200\n"+
                "3- 8 gb, fiyati 100\n"+
                "4- 4 gb, fiyati 50\n");
        String secimRam= scan.nextLine();
        String secilenRam="";
        switch(secimRam){
            case "1":  secilenRam="32GB-300"; break;
            case "2":  secilenRam="16GB-200"; break;
            case "3":  secilenRam= "8GB-100";break;
            case "4":  secilenRam="4GB-50";break;
            default:
                System.out.println("yanlis secim. tekrar secim yapiniz");
                getRam();

        }return secilenRam;
    }

    public static String getCPU() {
        int CPUFiyat=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("CPU seciniz:\n" +
                "1- i3, fiyati 200\n"+
                "2- i5, fiyati 300\n"+
                "3- i7, fiyati 500\n");

        String secimCPU= scan.nextLine();
        String secilenCpu="";
        switch(secimCPU){
            case "1": secilenCpu="i3-200"; break;
            case "2": secilenCpu="i5-300"; break;
            case "3": secilenCpu="i7-500"; break;
            default:
                System.out.println("yanlis secim. tekrar secim yapiniz");
                getCPU();

        }return secilenCpu;
    }

    public static String getSize() {
        int sizeFiyat=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Size seciniz:\n" +
                "1- Mini, fiyati 100\n"+
                "2- Middle, fiyati 200\n"+
                "3- Max, fiyati 300\n");

        String secimSize= scan.nextLine();
        String secilenSize="";
        switch(secimSize){
            case "1":secilenSize= " Mini-100";break;
            case "2":secilenSize= " Middle-200"; break;
            case "3":secilenSize= " Max-300"; break;
            default:
                System.out.println("yanlis secim. tekrar secim yapiniz");
                getSize();

        }return secilenSize;
    }

    public static String getRenk() {
        int renkFiyat=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Renk seciniz:\n" +
                "1- Red, fiyati 400\n"+
                "2- Orange, fiyati 300\n"+
                "3- Silver, fiyati 200\n"+
                "4- Black, fiyati 150\n");

        String secimRenk= scan.nextLine();
        String secilenRenk="";
        switch(secimRenk){
            case "1": secilenRenk="Red-400";break;
            case "2": secilenRenk="Orange-300"; break;
            case "3": secilenRenk="Silver-200"; break;
            case "4": secilenRenk="Black-150"; break;
            default:
                System.out.println("yanlis secim. tekrar secim yapiniz");
                getRenk();

        }return secilenRenk;
    }



    public void alisveris() {
        System.out.println("Marka seciniz:\n" +
                "1- Asus"+
                "\n2- HP\n"+
                "3- Casper\n"+
                "4- LG\n");
        String tercih=scan.nextLine();
        switch (tercih){
            case "1" :marka="Asus";asus();

            case "2" :marka="HP";hp();
            case "3" :marka="Casper";casper();
            case "4" :marka="LG";lg();

    }
}

    private void lg() {
        ozellik();
    }

    private void casper() {
        ozellik();
    }

    private void hp() {
        ozellik();
    }

    private void asus() {
        ozellik();
    }

    private void ozellik() {
        String ram=getRam();
        String cPu =getCPU();
        String renk=getRenk();
        String size=getSize();

        bilgisayar.add(ram);
        bilgisayar.add(cPu);
        bilgisayar.add(renk);
        bilgisayar.add(size);
        System.out.println("alışverişe devam etmek istiyor musunuz?E/H");
        String yanit=scan.next();
        if (yanit.equalsIgnoreCase("E")){
            alisveris();
        }else if (yanit.equalsIgnoreCase("h")){
            fiyat(bilgisayar);

        }else {
            System.exit(0);
        }
    }

    private void fiyat(List<String> a) {
        a=bilgisayar;
        int toplamFiyat=0;
        for (int i = 0; i <a.size() ; i++) {

            int para=Integer.parseInt(a.get(i).substring(a.get(i).indexOf("-")+1));
            toplamFiyat+=para;
        }
        System.out.println("secilen bilgisayar:"+marka+"\nbilgisayr ozellikleri "+bilgisayar+"\n"+"odenecek tutar= " + toplamFiyat+" TL");
        System.exit(0);
    }
}
