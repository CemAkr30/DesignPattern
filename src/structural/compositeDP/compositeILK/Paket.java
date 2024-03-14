package structural.compositeDP.compositeILK.model;

import java.util.LinkedList;
import java.util.List;

public class
    Paket {

        private String adi;
        private List<structural.compositeDP.compositeILK.model.Urun> urunList;


    public Paket(String adi) {
        this.adi = adi;
        this.urunList = new LinkedList<>();
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
}
