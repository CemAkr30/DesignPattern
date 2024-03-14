package creational.factoryDP;

import creational.factoryDP.factory.PhoneFactory;
import creational.factoryDP.model.IPhone;

// Yapılan iş bayiler yerine fabrikalar üreticek telefonları
public class App {

    public static void main(String[] args) {
        IPhone s8 = PhoneFactory.getPhone("s8","2500mah",4,7);
        IPhone note8 = PhoneFactory.getPhone("note8","3000mah",5,8);

        System.out.println("S8 için telefon özellikleri");
        System.out.println(s8.toString());


        System.out.println("Note8 için telefon özellikleri");
        System.out.println(note8.toString());
    }
}
