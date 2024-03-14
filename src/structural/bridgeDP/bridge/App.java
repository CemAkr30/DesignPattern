package structural.bridgeDP.bridge;

import structural.bridgeDP.bridge.cihaz.BilgisayarKF;
import structural.bridgeDP.bridge.cihaz.Telefon;
import structural.bridgeDP.bridge.muzikCalar.Fizy;
import structural.bridgeDP.bridge.sesCihazi.Kulaklik;

public class App {

    /***
     * Bridge Design Pattern
     * 1) Birbirinden farklı iki yapıyı birbirine bağlamak için kullanılır.
     * 2) Bridge Design Pattern, Structural Design Pattern grubuna aittir.
     * Ve kullanım anında yapısal olarak değişiklik yapılmasını sağlar.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Bridge Design Pattern");
        Muzik muzik = new Muzik("Sezen Aksu", "Gülümse");
        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);


        System.out.println(
                "--------------------------------------------------"
        );

        Telefon telefon = new Telefon(new Kulaklik(),new Fizy());
        telefon.muzikCal(muzik);
    }
}
