package creational.prototypeDP;

public class GenelEntityService {

    // Sadece simülasyon amaçlı bir servis sınıfıdır.

    public BelgeTuru belgeTuruGetir(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        BelgeTuru belgeTuru = new BelgeTuru();
        belgeTuru.setId(id);
        String adi;
        if (id.compareTo(1L) == 0) {
            adi = "Kişisel";
        } else if (id.compareTo(2L) == 0) {
            adi = "Kurumsal";
        } else {
            adi = "Genel";
        }

        belgeTuru.setBelgeAdi(adi);
        return belgeTuru;
    }


    public Kategori kategoriGetir(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        Kategori kategori = new Kategori();
        kategori.setId(id);
        String adi;
        if (id.compareTo(1L) == 0) {
            adi = "Özel";
        } else if (id.compareTo(2L) == 0) {
            adi = "İş";
        } else {
            adi = "Genel";
        }

        kategori.setKategoriAdi(adi);
        return kategori;
    }


    public Belge belgeGetir(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Belge belge = new Belge();
        belge.setId(id);
        belge.setBelgeAdi("Belge Adı");
        belge.setBelgeTuru(belgeTuruGetir(1L));
        belge.setKategori(kategoriGetir(1L));


        String veri;
        String adi;

        if (id.compareTo(1L)==0){
            adi="Mektup";
            veri="Sevigili dostum Ahmet...";
        }else if (id.compareTo(2L)==0){
            adi="Fatura";
            veri="Fatura detayları...";
        }else if (id.compareTo(3L)==0){
            adi="Sözleşme";
            veri="Sözleşme detayları...";
        }else {
            adi="Genel";
            veri="Genel belge detayları...";
        }


        belge.setBelgeAdi(adi);
        belge.setVeri(veri);

        return belge;
    }

}
