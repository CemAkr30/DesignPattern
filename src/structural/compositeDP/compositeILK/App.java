package structural.compositeDP.compositeILK;

import structural.compositeDP.compositeILK.model.Paket;
import structural.compositeDP.compositeILK.model.Sepet;
import structural.compositeDP.compositeILK.model.Urun;

import java.math.BigDecimal;

public class App {

    /***
     * Composite Design Pattern
     * 1) Bir nesnenin kendi içinde aynı tipten başka nesneleri barındırmasını istiyorsak kullanırız.
     * 2) Composite Design Pattern, Structural Design Pattern grubuna aittir.
     * 3) Hiyerarşik bir yapı oluşturmak istediğimizde kullanırız.
     * @param CA
     */

    //psvm
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



        Sepet sepet = new Sepet("Ali'nin Sepeti");
        sepet.getPaketList().add(sebzePaketi);
        sepet.getPaketList().add(elektronikPaketi);

        sepet.getUrunList().add(futbolTopu);
        sepet.getUrunList().add(basketbolTopu);

        System.out.println(sepet.getToplamTutar() + " TL");

        //Bu tasarım yanlış bir tasarımdır. Çünkü sepete paket ve ürün eklemek için iki farklı metod kullanılmıştır.
        // Kumanya gibi bir ürünü sepete eklemek istediğimizde bu tasarımı değiştirmek zorunda kalırız.
    }
}
