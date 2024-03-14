package structural.proxyDP;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CalisanUtil
{

    public static List<Calisan> getCalisanlar(){
        Calisan calisan = new Calisan("admin", "admin", true);
        Calisan calisan2 = new Calisan("user", "user", false);
        Calisan calisan3 = new Calisan("user2", "user2", true);
        Calisan calisan4 = new Calisan("user3", "user3", false);

        List<Calisan> calisanlar = new LinkedList<>();

        calisanlar.add(calisan);
        calisanlar.add(calisan2);
        calisanlar.add(calisan3);
        calisanlar.add(calisan4);

        return calisanlar;
    }

    public static Map<String,Calisan> getKullaniciAdiCalisanMap(){
        Map<String,Calisan> map = new HashMap<>();
        for (Calisan calisan : getCalisanlar()) {
            map.put(calisan.getKullaniciAdi(),calisan);
        }

        return map;
    }

    public static Calisan getCalisanByKullaniciAdi(String kullaniciAdi){
        return getKullaniciAdiCalisanMap().get(kullaniciAdi);
    }


    public static boolean isKullaniciValid(String kullaniciAdi, String sifre) {
        boolean isKullaniciValid = false;
        Calisan calisan = getCalisanByKullaniciAdi(kullaniciAdi);

        if (calisan != null && calisan.getSifre().equals(sifre)){
            isKullaniciValid = true;
        }

        return isKullaniciValid;
    }
}
