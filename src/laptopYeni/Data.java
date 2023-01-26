package laptopYeni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Data {
    private String marka;
    private String cpu;
    private String boyut;
    private String renk;
    private  String ram;

    public String getRam() {
        for (int i = 0; i <ramList.size() ; i++) {
            System.out.println((i+1)+"="+ramList.get(i));
        }
        System.out.println("lutfen bir ram seciniz");
        String secim=scan.next();
        if (secim.equalsIgnoreCase("1"))      {ram=ramList.get(0);}
        else if (secim.equalsIgnoreCase("2")) {ram=ramList.get(1);}
        else if (secim.equalsIgnoreCase("3")) {ram=ramList.get(2);}
        else if (secim.equalsIgnoreCase("4")) {ram=ramList.get(3);}
        else {
            System.out.println("hatalı secim tekrar secim yapin");
            getMarka();
        }



        return ram;
    }

    List<String> ramList = new ArrayList<>(Arrays.asList("32GB", "16GB", "8GB", "4GB"));
    List<String> cpuList = new ArrayList<>(Arrays.asList("i3", "i5", "i7"));
    List<String> boyutList = new ArrayList<>(Arrays.asList("Mini", "Middle", "Max"));
    List<String> renkList = new ArrayList<>(Arrays.asList("red", "silver", "black", "dark"));
    List<String> markaList = new ArrayList<>(Arrays.asList("Apple", "Lenova", "Sony", "Asus", "Hp"));
    Scanner scan = new Scanner(System.in);

    public String getMarka() {
        for (int i = 0; i < markaList.size(); i++) {
            System.out.println((i + 1) + "=" + markaList.get(i));
        }
        System.out.println("lutfen bir marka seciniz");
        String secim = scan.next();
        if (secim.equalsIgnoreCase("1")) {
            marka = markaList.get(0);
        } else if (secim.equalsIgnoreCase("2")) {
            marka = markaList.get(1);
        } else if (secim.equalsIgnoreCase("3")) {
            marka = markaList.get(2);
        } else if (secim.equalsIgnoreCase("4")) {
            marka = markaList.get(3);
        } else {
            System.out.println("hatalı secim tekrar secim yapin");
            getMarka();
        }


        return marka;
    }

    public String getCpu() {
        for (int i = 0; i < cpuList.size(); i++) {
            System.out.println((i + 1) + "=" + cpuList.get(i));
        }
        System.out.println("lutfen bir işlemci seciniz");
        String secim = scan.next();
        if (secim.equalsIgnoreCase("1")) {
            cpu = cpuList.get(0);
        } else if (secim.equalsIgnoreCase("2")) {
            cpu = cpuList.get(1);
        } else if (secim.equalsIgnoreCase("3")) {
            cpu = cpuList.get(2);
        } else {
            System.out.println("hatalı secim tekrar secim yapin");
            getCpu();
        }
        return cpu;
    }

    public String getBoyut() {
        for (int i = 0; i < boyutList.size(); i++) {
            System.out.println((i + 1) + "=" + boyutList.get(i));
        }
        System.out.println("lutfen bir boyut seciniz");
        String secim = scan.next();
        if (secim.equalsIgnoreCase("1")) {
            boyut = boyutList.get(0);
        } else if (secim.equalsIgnoreCase("2")) {
            boyut = boyutList.get(1);
        } else if (secim.equalsIgnoreCase("3")) {
            boyut = boyutList.get(2);
        } else {
            System.out.println("hatalı secim tekrar secim yapin");
            getBoyut();
        }

        return boyut;
    }

    public String getRenk() {
        for (int i = 0; i < renkList.size(); i++) {
            System.out.println((i + 1) + "=" + renkList.get(i));
        }
        System.out.println("lutfen bir renk seciniz");
        String secim = scan.next();
        if (secim.equalsIgnoreCase("1")) {
            renk = renkList.get(0);
        } else if (secim.equalsIgnoreCase("2")) {
            renk = renkList.get(1);
        } else if (secim.equalsIgnoreCase("3")) {
            renk = renkList.get(2);
        } else if (secim.equalsIgnoreCase("4")) {
            renk = renkList.get(3);
        } else {
            System.out.println("hatalı secim tekrar secim yapin");
            getRenk();
        }


        return renk;
    }
    public String bilgisayarUret() {
        String bilgisayar = "";
        bilgisayar += getMarka()+"-"+ getRam()+ "-" + getBoyut() + "-" + getCpu() + "-" + getRenk();
        return bilgisayar;
    }
}
