package structural.decoratorDP;

public  class DuzRapor implements Rapor {

    private String metin;
    public DuzRapor(String metin) {
        this.metin = metin;
    }
    @Override
    public String getMetin() {
        return metin;
    }
}
