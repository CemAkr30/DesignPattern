package creational.prototypeDP;

public class BelgeTuru
    implements Cloneable {

    private Long id;
    private String belgeAdi;

    public BelgeTuru() {
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

    @Override
    public String toString() {
        return belgeAdi;
    }

    @Override
    protected BelgeTuru clone() throws CloneNotSupportedException {
        return (BelgeTuru) super.clone();
    }
}
