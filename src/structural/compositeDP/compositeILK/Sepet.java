package structural.compositeDP.compositeILK.model;


import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class
Sepet {

    private String adi;
    private List<structural.compositeDP.compositeILK.model.Urun> urunList;

    private List<structural.compositeDP.compositeILK.model.Paket> paketList;


    private List<structural.compositeDP.compositeILK.model.Kumanya> kumanyaList;

    public Sepet(String adi) {
        this.adi = adi;
        this.urunList = new LinkedList<>();
        this.paketList = new LinkedList<>();
        this.kumanyaList = new LinkedList<>();
    }


    public BigDecimal
    getToplamTutar(

    ){
        BigDecimal toplamTutar = BigDecimal.ZERO;

        for (structural.compositeDP.compositeILK.model.Urun urun : urunList) {
            toplamTutar = toplamTutar.add(urun.getFiyat());
        }

        for (structural.compositeDP.compositeILK.model.Paket paket : paketList) {
            for (structural.compositeDP.compositeILK.model.Urun urun : paket.getUrunList()) {
                toplamTutar = toplamTutar.add(urun.getFiyat());
            }
        }


        for (structural.compositeDP.compositeILK.model.Kumanya kumanya : kumanyaList) {
            List<structural.compositeDP.compositeILK.model.Paket> paketList = kumanya.getPaketList();
            List<structural.compositeDP.compositeILK.model.Urun> urunList = kumanya.getUrunList();

            for (structural.compositeDP.compositeILK.model.Urun urun : urunList) {
                toplamTutar = toplamTutar.add(urun.getFiyat());
            }

            for (structural.compositeDP.compositeILK.model.Paket paket : paketList) {
                for (structural.compositeDP.compositeILK.model.Urun urun : paket.getUrunList()) {
                    toplamTutar = toplamTutar.add(urun.getFiyat());
                }
            }
        }

        return toplamTutar;
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public List<structural.compositeDP.compositeILK.model.Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(List<structural.compositeDP.compositeILK.model.Urun> urunList) {
        this.urunList = urunList;
    }

    public List<structural.compositeDP.compositeILK.model.Paket> getPaketList() {
        return paketList;
    }

    public void setPaketList(List<structural.compositeDP.compositeILK.model.Paket> paketList) {
        this.paketList = paketList;
    }
}
