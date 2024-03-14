package structural.bridgeDP.bridge.muzikCalar;

import structural.bridgeDP.bridge.Muzik;

public class Fizy implements MuzikCalar {
    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Fizy " + muzik.getAdi() + " şarkısını çalıyor.");
        return muzik.getSes();
    }
}
