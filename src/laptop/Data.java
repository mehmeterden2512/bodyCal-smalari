package laptop;

import java.util.ArrayList;
import java.util.List;

public class Data {
    String marka;

    public Data() {
    }



    int size;
    int ram;
    int cpu;
    int renk;

    public List<Object> pc(int id){
        Calculation o=new Calculation();
        List<Object>bilgiList=new ArrayList<>();
        Data bilgisayar=new Data();
        bilgiList.add(bilgisayar);
        return bilgiList;
    }
    public Data(String marka, int size, int ram, int cpu, int renk) {
        this.marka = marka;
        this.size = size;
        this.ram = ram;
        this.cpu = cpu;
        this.renk = renk;
    }

}
