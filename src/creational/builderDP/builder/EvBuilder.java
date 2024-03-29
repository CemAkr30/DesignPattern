package creational.builderDP.builder;

public class EvBuilder {

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


    public static EvBuilder builder(){
        // Buraya tabi zorunlu alanlar da eklenebilir ama bu örnekte zorunlu alanlar olmadığı için boş bıraktım.
       return new EvBuilder();
    }

    public Ev build(){
        return new Ev(il, ilce, mahalle, odaSayisi, banyoSayisi, tuvaletSayisi, balkonSayisi, binaYili, isDublex, isEsyali, hasOtopark, hasCocukParki, hasKlima, hasHavuz);
    }

    public EvBuilder setIl(String il) {
        this.il = il;
        return this;
    }

    public EvBuilder setIlce(String ilce) {
        this.ilce = ilce;
        return this;
    }

    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public EvBuilder setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public EvBuilder setBinaYili(int binaYili) {
        this.binaYili = binaYili;
        return this;
    }

    public EvBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public EvBuilder setEsyali(boolean esyali) {
        isEsyali = esyali;
        return this;
    }

    public EvBuilder setHasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public EvBuilder setHasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;
    }
}
