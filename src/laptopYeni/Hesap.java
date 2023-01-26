package laptopYeni;

import java.util.HashMap;
import java.util.Map;

public class Hesap {
    public Map<String,String> magaza(){
        Map<String,String> magaza=new HashMap<>();
        Data d=new Data();
        d.bilgisayarUret();
        return magaza;
    }
}
