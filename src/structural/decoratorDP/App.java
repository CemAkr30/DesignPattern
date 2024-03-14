package structural.decoratorDP;

public class App {

    /**
     * Decorator Design Pattern
     * Runtime'da nesnelere dinamik olarak yeni sorumluluklar eklemek için kullanılır.
     * Structural Design Pattern grubuna aittir.
     * Decorator Design Pattern, nesnelerin hiyerarşisini oluşturmak için kullanılır.
     * Örneğin : Bir araba nesnesi oluşturmak istediğimizde arabanın markası, modeli, rengi gibi özelliklerini
     * dinamik olarak eklemek isteyebiliriz. Bu durumda Decorator Design Pattern kullanılabilir.
     */


    public static void main(String[] args) {
        String icerik = getIcerik();


        // Manipüle etmeden var olduğu gibi basıldı ancak duzRapor nesnesine runtime sırasında yeni sorumluluklar eklenebilir.

        Rapor duzRapor = new DuzRapor(icerik);

        String metin = duzRapor.getMetin();

        System.out.println(metin);

        // Manipüle etmeden var olduğu gibi basıldı ancak duzRapor nesnesine runtime sırasında yeni sorumluluklar eklenebilir.


        System.out.println("---------------------------------------------------\n\n\n\n\n");

        // Yeni sorumluluklar eklendi. Örneğin ÇizgiliRaporDecorator sınıfı duzRapor nesnesine yeni sorumluluklar ekledi.

        cizgiliRaporuBas(duzRapor);

        // Yeni sorumluluklar eklendi. Örneğin ÇizgiliRaporDecorator sınıfı duzRapor nesnesine yeni sorumluluklar ekledi.

        System.out.println("---------------------------------------------------\n\n\n\n\n");

        // Yeni sorumluluklar eklendi. Örneğin ImzaliRaporDecorator sınıfı duzRapor nesnesine yeni sorumluluklar ekledi.

        imzaliRaporuBas(duzRapor);

        // Yeni sorumluluklar eklendi. Örneğin ImzaliRaporDecorator sınıfı duzRapor nesnesine yeni sorumluluklar ekledi.


        System.out.println("---------------------------------------------------\n\n\n\n\n");


        // Yeni Sorumluluklar eklendi. Örneğin KücükRaporDecorator sınıfı duzRapor nesnesine yeni sorumluluklar ekledi.

        kucukRaporuBas(duzRapor);

        // Yeni Sorumluluklar eklendi. Örneğin KücükRaporDecorator sınıfı duzRapor nesnesine yeni sorumluluklar ekledi.


        System.out.println("---------------------------------------------------\n\n\n\n\n");


        // TODO Aynı zamanda hem imzalı hem de çizgili rapor basılabilir. Bu durumda ImzaliRaporDecorator sınıfı içerisindeki getMetin() metodunda


        Rapor obj = new DuzRapor(getIcerik());

        Rapor raporObj = new ImzaliRaporDecorator(new CizgiliRaporDecorator(new KucukRaporDecorator(obj)));

        System.out.println(raporObj.getMetin());

        // TODO Aynı zamanda hem imzalı hem de çizgili rapor basılabilir. Bu durumda ImzaliRaporDecorator sınıfı içerisindeki getMetin() metodunda




    }


    private static void imzaliRaporuBas(Rapor duzRapor) {
        Rapor imzaliRapor = new ImzaliRaporDecorator(duzRapor);

        String metin = imzaliRapor.getMetin();

        System.out.println(metin);
    }

    private static void cizgiliRaporuBas(Rapor duzRapor) {
        Rapor cizgiliRapor = new CizgiliRaporDecorator(duzRapor);

        String metin = cizgiliRapor.getMetin();

        System.out.println(metin);
    }

    private static void kucukRaporuBas(Rapor duzRapor) {
        Rapor kucukRapor = new KucukRaporDecorator(duzRapor);

        String metin = kucukRapor.getMetin();

        System.out.println(metin);
    }

    private static String getIcerik() {
        return "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "\nLorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an" +
                "\nunknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "\nIt has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged." +
                "\nIt was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently " +
                "\nwith desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    }
}
