package structural.flyweightDP;

import java.util.ArrayList;
import java.util.List;

public class App
{

    /**
     * Flyweight tasarım deseni, nesnelerin tekrar tekrar oluşturulmasını engellemek için kullanılır.
     * Bu tasarım deseni, nesnelerin tekrar tekrar oluşturulmasını engellemek için nesnelerin
     * paylaşılmasını sağlar. Bu sayede nesnelerin oluşturulması için gereken bellek kullanımı
     * azaltılmış olur. Bir havuz oluşturulur ve bu havuzdan nesneler paylaşılır.
     * @param args
     */

    public static void main(String[] args) {
        List<Asker> askerler = new ArrayList<>();

        Yuzbasi yuzbasi = new Yuzbasi();
        askerler.add(yuzbasi);

        for (int i = 0; i < 100; i++) {
            Er er = new Er();
            askerler.add(er);
        }

        for (Asker asker : askerler) {
            asker.atesEt();
        }


        for (Asker asker : askerler) {
            asker.tara();
        }
    }
}
