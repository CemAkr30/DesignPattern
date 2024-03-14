package structural.bridgeDP.notUseBridge;

public class Spotify {


    public String muzikCal(Muzik muzik){
        System.out.println("Spotify " + muzik.getAdi()+" - "+ muzik.getSes() + " şarkısını çalıyor.");
        return muzik.getSes();
    }
}
