package structural.bridgeDP.bridge.cihaz;

import structural.bridgeDP.bridge.Muzik;
import structural.bridgeDP.bridge.muzikCalar.MuzikCalar;
import structural.bridgeDP.bridge.sesCihazi.SesCihazi;
import structural.bridgeDP.notUseBridge.Hoparlor;
import structural.bridgeDP.notUseBridge.Spotify;

public class Telefon extends MuzikCalabilenBilgisayar {


    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon çalışıyor...");
        super.muzikCal(muzik);
    }
}
