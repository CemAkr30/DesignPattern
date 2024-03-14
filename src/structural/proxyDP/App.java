package structural.proxyDP;

import java.util.Scanner;

public class App {

    /**
     * Proxy tasarim deseni, bir nesneye erisimi kontrol etmek icin kullanilir.
     * Bu ornekte, yonetici olmayan kullanicilarin sirket ciro bilgisine erismesi engellenmektedir.
     * A remote ( uzak ) proxy : uzak sunucuya erisimi kontrol eder. Örneğin bir web servisine erişim sağlanırken
     * bir proxy kullanılabilir.
     *
     * A virtual proxy : bir nesneye erişim sağlanırken, nesnenin yaratılması geciktirilebilir. Örneğin bir resmin
     * yüklenmesi geciktirilebilir. Lazy loading olarak da bilinir.
     *
     * A protection ( koruma ) proxy : bir nesneye erişim sağlanırken, nesneye erişimi kontrol eden bir proxy kullanılabilir.
     * Örneğin bir nesneye erişim sağlanırken, kullanıcının yetkisi kontrol edilebilir.
     *
     * A smart reference ( akıllı referans ) proxy : bir nesneye erişim sağlanırken, nesneye erişimi kontrol eden bir proxy kullanılabilir.
     * Örneğin bir nesneye erişim sağlanırken, nesnenin kullanımı ile ilgili istatistikler tutulabilir. O ara proxy katmanında çeşitli işlemler
     * yapılabilir.
     * @param args
     */

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kullanici adi giriniz: ");
            String kullaniciAdi = scanner.nextLine();
            System.out.println("Sifre giriniz: ");
            String sifre = scanner.nextLine();

            SirketBilgileri yoneticiProxy = new YoneticiProxy(kullaniciAdi, sifre);

            try {
                System.out.println("Ciro: " + yoneticiProxy.getCiro());
            } catch (IllegalAccessException e) {
                System.out.println("Kullanici yonetici degil");
            }
    }
}
