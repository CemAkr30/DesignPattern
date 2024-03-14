package creational.abstractFactoryDP;

import creational.abstractFactoryDP.factory.IPhoneFactory;
import creational.abstractFactoryDP.factory.Note8Factory;
import creational.abstractFactoryDP.factory.S8Factory;

public class App {

    public static void main(String[] args) {

        // Abstract Factory Pattern
        /*
        *
        * Factory method bir sınıfın nesnesini oluşturmak için kullanılırken, Ayrıca tek method ile bir sınıfın nesnesini oluşturmak için kullanılır.
        *
        * Abstract Factory Pattern ise birbirleriyle ilişkili veya bağımlı nesnelerin oluşturulması için kullanılır. Burda ise sınıf hiyerarşisi oluşturulur. İf else gerek kalmadan soyut fabrika sınıfı ile nesne oluşturulur.
        *
        * */

        System.out.println("Abstract Factory Pattern");

        IPhoneFactory s8Factory = new S8Factory();
        s8Factory.getIPhone("S8", "3000Mah", 5, 12);

        IPhoneFactory note8Factory = new Note8Factory();
        note8Factory.getIPhone("Note8", "5000Mah", 5, 12);


        System.out.println("S8 Configurations");
        System.out.println(s8Factory.getIPhone("S8", "3000Mah", 5, 12));


        System.out.println("Note8 Configurations");
        System.out.println(note8Factory.getIPhone("Note8", "5000Mah", 5, 12));

    }
}
