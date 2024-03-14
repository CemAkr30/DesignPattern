package structural.compositeDP.compositeSON;

import structural.compositeDP.compositeSON.utils.FiyatHesaplamaUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Kumanya
    implements IFiyatlanabilir {


    private String adi;
    private List<Urun> urunList;

    private List<Paket> paketList;

    public Kumanya(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<>();
        this.paketList = new ArrayList<>();
    }

    @Override
    public BigDecimal getFiyat() {
        BigDecimal toplamUrunFiyati = FiyatHesaplamaUtil.getToplamUrunFiyati(urunList);
        BigDecimal toplamPaketFiyat = FiyatHesaplamaUtil.getToplamPaketFiyat(paketList);
        return toplamUrunFiyati.add(toplamPaketFiyat);
    }


    public Kumanya(String adi, List<Urun> urunList, List<Paket> paketList) {
        this.adi = adi;
        this.urunList = urunList;
        this.paketList = paketList;
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

    public List<Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<Paket> paketList) {
        this.paketList = paketList;
    }
}
