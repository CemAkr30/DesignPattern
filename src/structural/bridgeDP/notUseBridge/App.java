package structural.bridgeDP.notUseBridge;

public class App {

    public static void main(String[] args) {
        Muzik muzik = new Muzik("Sezen Aksu", "Gülümse hadi Gülümse");

        Bilgisayar bilgisayar = new Bilgisayar();
        bilgisayar.muzikCal(muzik);
    }
}
