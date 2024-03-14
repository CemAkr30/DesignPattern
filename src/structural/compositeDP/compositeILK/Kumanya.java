package structural.compositeDP.compositeILK.model;


import java.util.ArrayList;
import java.util.List;

public class
    Kumanya {

    private String adi;
    private List<structural.compositeDP.compositeILK.model.Urun> urunList;
    private List<structural.compositeDP.compositeILK.model.Paket> paketList;


    public Kumanya(String adi) {
        this.adi = adi;
        this.urunList = new ArrayList<>();
        this.paketList = new ArrayList<>();
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
