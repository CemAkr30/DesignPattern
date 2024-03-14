package structural.compositeDP.compositeSON.utils;

import structural.compositeDP.compositeSON.Paket;
import structural.compositeDP.compositeSON.Urun;

import java.math.BigDecimal;
import java.util.List;

public class
    FiyatHesaplamaUtil {

    public static BigDecimal
        getToplamUrunFiyati(
                List<Urun> uruns
    ) {

        BigDecimal toplamFiyat = BigDecimal.ZERO;

        for (Urun urun : uruns) {
            toplamFiyat = toplamFiyat.add(urun.getFiyat());
        }

        return toplamFiyat;
    }


    public static BigDecimal
    getToplamPaketFiyat(
            List<Paket> pakets
    ) {

        BigDecimal toplamFiyat = BigDecimal.ZERO;

        for (Paket paket : pakets) {
            toplamFiyat = toplamFiyat.add(paket.getFiyat());
        }

        return toplamFiyat;
    }
}
