package structural.compositeDP.compositeSON;


import java.math.BigDecimal;

public class App {

    /**
     * Composite Design Pattern
     * Kullanım senaryosu:
     * Bir nesnenin içerisinde kendinden türeyen nesneleri tutması ve bu nesnelerin de aynı interface'i implemente etmesi durumunda
     * Composite Design Pattern kullanılabilir.
     * <p>
     *     Örneğin bir sepet nesnesi içerisinde hem ürün hem de paket nesneleri tutulabilir.
     *     Sepet nesnesi içerisindeki ürün ve paket nesneleri IFiyatlanabilir interface'ini implemente ettiği için
     *     sepet nesnesi içerisindeki ürün ve paket nesneleri için aynı metodlar kullanılabilir.
     *     Bu sayede sepet nesnesi içerisindeki ürün ve paket nesneleri için aynı işlemler yapılabilir.
     *     Örneğin sepet nesnesi içerisindeki ürün ve paket nesnelerinin toplam fiyatları hesaplanabilir.
     *     Bu hesaplama işlemi için sepet nesnesi içerisindeki ürün ve paket nesneleri için ayrı ayrı metodlar yazmak yerine
     *     sepet nesnesi içerisindeki ürün ve paket nesneleri için aynı metod kullanılabilir.
     *     Bu sayede kod tekrarı önlenmiş olur.
     * @param args
     */

    public static void main(String[] args) {
        Urun domates = new Urun("Domates", BigDecimal.TEN);
        Urun patates = new Urun("Patates", BigDecimal.ONE);
        Urun elma = new Urun("Elma", BigDecimal.ONE);

        Paket sebzePaketi = new Paket("Sebze Paketi");
        sebzePaketi.getUrunList().add(domates);
        sebzePaketi.getUrunList().add(patates);
        sebzePaketi.getUrunList().add(elma);


        Urun sesSistemi = new Urun("Ses Sistemi", BigDecimal.valueOf(5000));
        Urun bilgisayar = new Urun("Bilgisayar", BigDecimal.valueOf(10000));


        Paket elektronikPaketi = new Paket("Elektronik Paketi");
        elektronikPaketi.getUrunList().add(sesSistemi);
        elektronikPaketi.getUrunList().add(bilgisayar);


        Urun futbolTopu = new Urun("Futbol Topu", BigDecimal.valueOf(100));
        Urun basketbolTopu = new Urun("Basketbol Topu", BigDecimal.valueOf(100));



        Kumanya kumanya = new Kumanya("Kumanya");

        Urun kumanyaYag = new Urun("Yağ", BigDecimal.valueOf(50));
        Urun kumanyaPirinc = new Urun("Pirinç", BigDecimal.valueOf(50));

        kumanya.getPaketList().add(sebzePaketi);
        kumanya.getUrunList().add(kumanyaYag);
        kumanya.getUrunList().add(kumanyaPirinc);



        Sepet sepet = new Sepet("Ali'nin Sepeti");
        sepet.getFiyatlanabilirList().add(sebzePaketi);
        sepet.getFiyatlanabilirList().add(elektronikPaketi);
        sepet.getFiyatlanabilirList().add(futbolTopu);
        sepet.getFiyatlanabilirList().add(basketbolTopu);
        sepet.getFiyatlanabilirList().add(kumanya);


        BigDecimal toplamTutar = sepet.toplamOdenecekTutar();

        System.out.println(toplamTutar + " TL");
    }
}
