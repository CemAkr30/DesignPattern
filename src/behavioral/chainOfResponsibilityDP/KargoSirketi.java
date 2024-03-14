package behavioral.chainOfResponsibilityDP;

public abstract class KargoSirketi {

    private EnumIl enumIl;
    private KargoSirketi sonrakiKargoSirketi;

    public KargoSirketi(EnumIl enumIl) {
        this.enumIl = enumIl;
    }

    public EnumIl getEnumIl() {
        return enumIl;
    }
    public KargoSirketi getSonrakiKargoSirketi() {
        return sonrakiKargoSirketi;
    }

    public void setSonrakiKargoSirketi(KargoSirketi sonrakiKargoSirketi) {
        this.sonrakiKargoSirketi = sonrakiKargoSirketi;
    }

    public abstract void kargola(EnumIl il);


}
