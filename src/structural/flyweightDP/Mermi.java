package structural.flyweightDP;

public class Mermi
{
    private EnumMermiBoyutu mermiBoyutu;

    public Mermi(EnumMermiBoyutu mermiBoyutu)
    {
        this.mermiBoyutu = mermiBoyutu;

        System.out.println(mermiBoyutu.getBoyut() + " mm mermi oluşturuldu.");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void atesle()
    {
        System.out.println(mermiBoyutu.getBoyut() + " mm mermi atıldı.");
    }
}
