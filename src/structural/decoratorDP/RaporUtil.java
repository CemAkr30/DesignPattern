package structural.decoratorDP;

import java.util.LinkedList;
import java.util.List;

public class RaporUtil {


    public static String getCizgiliMetin(String metin) {
        String[] satirList = metin.split("\n");


        String cizgiliMetin = "";
        for (String satir : satirList) {
            String cizgiliSatir = herSatirBirCizgiEkle(satir);

            cizgiliMetin += cizgiliSatir;
        }

        return cizgiliMetin;
    }

    private static String herSatirBirCizgiEkle(String satir) {

        String yeniSatir;

        if (satir.trim().length()==0){
            yeniSatir = "\n";
        }else{
            satir = "\n- " + satir;
        }

        return satir;
    }

    public static String metniSigdir(String metin,int genislik) {

        String kucukSatirliMetin = "";

        String[] satirList = metin.split("\n");

        for (String satir : satirList) {

            if (satir.length()<=genislik){

                kucukSatirliMetin = ekleVeYeniSatiraGec(kucukSatirliMetin, satir);
            }else{

                List<String> parcalanmısList = parcala(satir,genislik);

                for (String parcalanmisSatir : parcalanmısList) {
                    kucukSatirliMetin = ekleVeYeniSatiraGec(kucukSatirliMetin, parcalanmisSatir);
                }
            }
        }

        return kucukSatirliMetin;
    }


    /**
     * Bu metod satiri genislik degerine gore parcalar.
     *
     * @param satir
     * @param genislik
     * @return
     */
    private static List<String> parcala(String satir, int genislik) {

        List<String> parcalanmisList = new LinkedList<>();
        for ( int i =0 ; i<=satir.length() / genislik;i++){
            int ilkhane = i * genislik;
            int sonHane = ilkhane + genislik;

            if (sonHane>satir.length()){
                sonHane = satir.length();
            }

            String paracaliSatir = satir.substring(ilkhane,sonHane);

            if (paracaliSatir.trim().length()>0){
                parcalanmisList.add(paracaliSatir);
            }
        }

        return parcalanmisList;
    }

    private static String ekleVeYeniSatiraGec(String kucukSatirliMetin, String satir) {
        return kucukSatirliMetin + satir + "\n";
    }

    public static String sonaImzaliMetinEkle(String metin) {

        String imza = "\n\n  \t\t\t\t\t  İmza:  ";

        return metin + imza;
    }
}
