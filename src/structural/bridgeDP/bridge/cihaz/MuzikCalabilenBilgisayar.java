package structural.bridgeDP.bridge.cihaz;

import structural.bridgeDP.bridge.Muzik;
import structural.bridgeDP.bridge.muzikCalar.MuzikCalar;
import structural.bridgeDP.bridge.sesCihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {

    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    public MuzikCalabilenBilgisayar() {
    }


    void muzikCal(Muzik muzik) {
        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);
    }
}
