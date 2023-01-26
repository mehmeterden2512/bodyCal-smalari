package laptopYeni;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public  class Magaza {
   static Map<Integer,String> magazaMap=new HashMap<>();
      Scanner scan=new Scanner(System.in);

    public void magaza(){
        System.out.println("kac adet bilgisayar uretmek istiyorsunuz");
        int bilgisayarSayisi= scan.nextInt();
        int bilgisayarId=10001;
        Data y=new Data();
        for (int i = 0; i <=bilgisayarSayisi ; i++) {
            magazaMap.put(bilgisayarId++, y.bilgisayarUret());
        }
        Set<Map.Entry<Integer, String>> entrySet = magazaMap.entrySet();
        for (Map.Entry<Integer,String> each:entrySet
             ) {
            System.out.println(each);
        }
    }

}
