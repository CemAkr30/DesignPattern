package creational.prototypeDP;

public class Belge
    implements Cloneable {

    private Long id;
    private String belgeAdi;
    private BelgeTuru belgeTuru;
    private Kategori kategori;
    private String veri;


    public Belge() {
    }

    public Belge(Long id, String belgeAdi, BelgeTuru belgeTuru, Kategori kategori, String veri) {
        this.id = id;
        this.belgeAdi = belgeAdi;
        this.belgeTuru = belgeTuru;
        this.kategori = kategori;
        this.veri = veri;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBelgeAdi() {
        return belgeAdi;
    }

    public void setBelgeAdi(String belgeAdi) {
        this.belgeAdi = belgeAdi;
    }

    public BelgeTuru getBelgeTuru() {
        return belgeTuru;
    }

    public void setBelgeTuru(BelgeTuru belgeTuru) {
        this.belgeTuru = belgeTuru;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getVeri() {
        return veri;
    }

    public void setVeri(String veri) {
        this.veri = veri;
    }

    @Override
    public String toString() {
        return "Belge{" +
                "\nid=" + id +
                "\n, belgeAdi='" + belgeAdi + '\'' +
                "\n, belgeTuru=" + belgeTuru +
                "\n, kategori=" + kategori +
                "\n, veri='" + veri + '\'' +
                '}';
    }



    /***
     * Shallow copy yapıyoruz burda bir nesne üzerinde alt nesneleri yani relationları kopyalamıyoruz. Böyle bir durumda
     * şu sorun olabilir belge nesnesinin oluşmuş bir instance'ı var ve bu instance'ın belgeTuru ve kategori nesneleri
     * var. Bu nesnelerin de instance'ları var. Böylece clone edildiğinde yeni bir belge nesnesi oluşacak ancak bu nesnede
     * alt sınıflarda yani relationlarda bir değişiklik yapıldığında ilk prototype nesnesi de değişecektir. Çünkü
     * bu nesnelerin referansları aynı olacaktır. Bu durumda da deep copy yapmamız gerekiyor.
     * @return
     * @throws CloneNotSupportedException
     *
     *   @Override
     *     protected Object clone() throws CloneNotSupportedException {
     *         return super.clone();
     *     }
     */


    /***
     * Deep copy yapıyoruz burda bir nesne üzerinde alt nesneleri yani relationları kopyalıyoruz. Böyle bir durumda
     * şu sorun olabilir belge nesnesinin oluşmuş bir instance'ı var ve bu instance'ın belgeTuru ve kategori nesneleri
        * var. Bu nesnelerin de instance'ları var. Böylece clone edildiğinde yeni bir belge nesnesi oluşacak ve bu nesnede
     * alt sınıflarda yani relationlarda bir değişiklik yapıldığında ilk prototype nesnesi de değişmeyecektir. Çünkü
     * bu nesnelerin referansları farklı olacaktır. Bu durumda da deep copy yapmamız gerekiyor.
     */

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Belge belge = (Belge) super.clone();
        belge.setBelgeTuru((BelgeTuru) belgeTuru.clone());
        belge.setKategori((Kategori) kategori.clone());
        return belge;
    }

}
