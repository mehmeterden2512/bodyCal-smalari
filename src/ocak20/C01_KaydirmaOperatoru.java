package ocak20;

public class C01_KaydirmaOperatoru {
    public static void main(String[] args) {
        /*
        5<<4 yazıldiğinda 5 sayısını 2 nin 4 uncu kuvveti ile carp demek
        5>>4 yazıldıgunda 5 sayısını 2 nin 4 uncu kuvettine bol demek
         */

        System.out.println("5(000011)<<4: "+(5<<4));
        System.out.println("5(000011)<<3: "+(5<<3));
        System.out.println("5(000011)<<2: "+(5<<2));
        System.out.println("5(000011)<<1: "+(5<<1));
        System.out.println("5(000011)>>4: "+(5>>4));
        System.out.println("5(000011)>>3: "+(5>>3));
        System.out.println("5(000011)>>2: "+(5>>2));
        System.out.println("5(000011)>>1: "+(5>>1));
       int m=-12;
       int n=-5;
     // System.out.println(m%n);
        /*
         ****
         ** *
         **
         *
         */
        //aklıma geldi ek kaynak sorusu cozerken
        System.out.println("==========1.Yol============");
        System.out.println("****\n** *\n**\n*");
        System.out.println("==========2.Yol============");
        for (int i = 1; i <=4 ; i++) {
            for (int j = 4; j >=i ; j--) {

                System.out.print("*");
                if (j==3&&i==2){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("==========================");
        System.out.print("****\n***\n**\n*");
    }
}
