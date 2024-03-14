package structural.flyweightDP;

public abstract class Asker
{
    private EnumMermiBoyutu mermiBoyutu;


    public Asker(EnumMermiBoyutu mermiBoyutu)
    {
        this.mermiBoyutu = mermiBoyutu;
    }

    public void atesEt()
    {
       MermiFactory.mermiUret(mermiBoyutu).atesle();
    }


    public void tara(){
        for (int i = 0; i < 5; i++) {
            atesEt();
        }
    }


}
