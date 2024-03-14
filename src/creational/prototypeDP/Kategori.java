package creational.prototypeDP;

public class Kategori
    implements Cloneable {

    private Long id;
    private String kategoriAdi;

    public Kategori() {
    }

    public Kategori(Long id, String kategoriAdi) {
        this.id = id;
        this.kategoriAdi = kategoriAdi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    @Override
    public String toString() {
        return kategoriAdi;
    }

    @Override
    protected Kategori clone() throws CloneNotSupportedException {
        return (Kategori) super.clone();
    }
}
