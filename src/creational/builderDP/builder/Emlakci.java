package creational.builderDP.builder;

public class Emlakci {

    // Böylece builder pattern ile nesne oluşturmak daha kolay ve daha okunabilir hale geliyor.
    // Ayrıca constructor çakışmalarını da önlemiş oluyoruz.


    public static void main(String[] args) {

        // Builder Pattern kullanmadan önce
        Ev ev1 = new Ev();
        ev1.setIl("İstanbul");
        ev1.setIlce("Kadıköy");
        ev1.setMahalle("Caddebostan");
        ev1.setOdaSayisi(3);
        ev1.setBanyoSayisi(1);
        ev1.setTuvaletSayisi(1);
        ev1.setBalkonSayisi(1);
        ev1.setHasHavuz(false);
        ev1.setHasOtopark(true);
        ev1.setHasKlima(true);


        Ev ev2 = new Ev("İstanbul", "Ümraniye","Tatlısu",2008,2,3,2,0,false,false,false,true,true,false);



        printEv(ev1);
        printEv(ev2);


        // Builder Pattern kullanarak
        // Ev sınıfı için 3 farklı constructor oluşturmak zorunda kalıyorduk.
        // Builder Pattern ile bu durumun önüne geçebiliyoruz. Aynı zamanda constructorların sırasını da önemsemiyoruz.
        // Builder Pattern ile nesne oluşturmak daha kolay ve daha okunabilir hale geliyor.
        // Ayrıca constructor çakışmalarını da önlemiş oluyoruz.

        System.out.println("-------------------Builder Pattern-------------------");

        printEv(EvBuilder.builder()
                .setIl("İstanbul")
                .setIlce("Kadıköy")
                .setMahalle("Caddebostan")
                .setOdaSayisi(3)
                .setBanyoSayisi(1)
                .setTuvaletSayisi(1)
                .setBalkonSayisi(1)
                .setHasHavuz(false)
                .setHasOtopark(true)
                .setHasKlima(true)
                .build()
                );


        printEv(EvBuilder.builder()
                .setIl("İstanbul")
                .setIlce("Ümraniye")
                .setMahalle("Tatlısu")
                .setBinaYili(2008)
                .setOdaSayisi(2)
                .setBanyoSayisi(3)
                .setTuvaletSayisi(2)
                .setBalkonSayisi(0)
                .setDublex(false)
                .setEsyali(false)
                .setHasOtopark(false)
                .setHasCocukParki(true)
                .setHasKlima(true)
                .setHasHavuz(false)
                .build()
        );






    }


    private static void printEv(Ev ev){
        System.out.println();

        System.out.println("Ev eklendi -> " + ev.toString());
    }
}
