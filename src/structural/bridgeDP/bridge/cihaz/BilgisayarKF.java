package structural.bridgeDP.bridge.cihaz;


import structural.bridgeDP.bridge.Muzik;
import structural.bridgeDP.bridge.muzikCalar.Fizy;
import structural.bridgeDP.bridge.sesCihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {

    public BilgisayarKF() {
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }


    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar çalışıyor...");
        super.muzikCal(muzik);
    }
}
