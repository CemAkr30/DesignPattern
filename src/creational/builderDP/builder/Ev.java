package creational.builderDP.builder;

public class Ev {

    private String il;
    private String ilce;
    private String mahalle;


    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int balkonSayisi;
    private int binaYili;


    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;
    private boolean hasKlima;
    private boolean hasHavuz;

    public Ev() {
    }

    public Ev(String il, String ilce, String mahalle, int odaSayisi, int banyoSayisi, int tuvaletSayisi, int balkonSayisi, int binaYili, boolean isDublex, boolean isEsyali, boolean hasOtopark, boolean hasCocukParki, boolean hasKlima, boolean hasHavuz) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.odaSayisi = odaSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.balkonSayisi = balkonSayisi;
        this.binaYili = binaYili;
        this.isDublex = isDublex;
        this.isEsyali = isEsyali;
        this.hasOtopark = hasOtopark;
        this.hasCocukParki = hasCocukParki;
        this.hasKlima = hasKlima;
        this.hasHavuz = hasHavuz;
    }


    // zorunlu alanlar
/*    public Ev(String il, String ilce, String mahalle, int odaSayisi, int binaYili) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.odaSayisi = odaSayisi;
        this.binaYili = binaYili;
    }

    public Ev(String il, String ilce, String mahalle, int odaSayisi) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.odaSayisi = odaSayisi;
    }

   TODO::Aslında ben 5 tane cosntructor yazmak isteidim örneğin 2tane zorunlu alan 3 tane zorunlu olmayan alan için
   TODO::ancak bu durumda 5 tane constructor yazmak yerine 1 tane constructor yazıp zorunlu olmayan alanları null olarak
   TODO:: atayabiliriz. Bu durumda da builder pattern kullanmak daha mantıklı olacaktır.
   TODO:: Ve ayrıca int int boolean boolean farklı fieldarı kapsayan constructor oluşturdum ancak
   TODO::4 adet aynı tipte başka fieldları kapsayan constructor create edemiyorum bundan dolayı
   TODO:: builder pattern kullanmak daha mantıklı olacaktır.
 */



    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }

    public int getBinaYili() {
        return binaYili;
    }

    public void setBinaYili(int binaYili) {
        this.binaYili = binaYili;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isEsyali() {
        return isEsyali;
    }

    public void setEsyali(boolean esyali) {
        isEsyali = esyali;
    }

    public boolean isHasOtopark() {
        return hasOtopark;
    }

    public void setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
    }

    public boolean isHasCocukParki() {
        return hasCocukParki;
    }

    public void setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
    }

    public boolean isHasKlima() {
        return hasKlima;
    }

    public void setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
    }

    public boolean isHasHavuz() {
        return hasHavuz;
    }

    public void setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
    }

    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", odaSayisi=" + odaSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", balkonSayisi=" + balkonSayisi +
                ", binaYili=" + binaYili +
                ", isDublex=" + isDublex +
                ", isEsyali=" + isEsyali +
                ", hasOtopark=" + hasOtopark +
                ", hasCocukParki=" + hasCocukParki +
                ", hasKlima=" + hasKlima +
                ", hasHavuz=" + hasHavuz +
                '}';
    }
}
