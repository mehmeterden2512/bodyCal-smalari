package laptop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        Map<Integer, List> alisVerisMap=new HashMap<>();
        Calculation obj =new Calculation();
        for (int i = 0; i <=2 ; i++) {
            obj.alisveris();
              alisVerisMap.put(i,obj.bilgisayar);
        }
        System.out.println(alisVerisMap);
    }
}



