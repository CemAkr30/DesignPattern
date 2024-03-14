package structural.compositeDP.compositeSON;

import structural.compositeDP.compositeSON.utils.FiyatHesaplamaUtil;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Paket
    implements IFiyatlanabilir {


    private String adi;
    private List<Urun> urunList;


    public Paket(String adi) {
        this.adi = adi;
        this.urunList = new LinkedList<>();
    }

    @Override
    public BigDecimal getFiyat() {
        return FiyatHesaplamaUtil.getToplamUrunFiyati(urunList);
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<Urun> urunList) {
        this.urunList = urunList;
    }
}
