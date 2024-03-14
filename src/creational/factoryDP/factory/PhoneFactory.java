package creational.factoryDP.factory;

import creational.factoryDP.model.IPhone;
import creational.factoryDP.model.Note8;
import creational.factoryDP.model.S8;

public class PhoneFactory {

    // Factory method : Şu işe yarıyor: Sınıfları new'lemek yerine, factory method çağırılarak nesne oluşturuluyor.
    // Örneğin, S8 ve Note8 modelleri için ayrı ayrı factory methodlar yazılabilir.
    // Bu durumda, PhoneFactory sınıfı abstract olmalı ve S8Factory ve Note8Factory
    // sınıfları PhoneFactory sınıfından türetilmelidir.
    // Ancak bu olay abstract factory pattern ile ilgilidir.
    // Daha ziyade if else if blokları yazmak bir dezavantaj bundan dolayı da abstaract factory pattern kullanılır.
    public static
    IPhone
    getPhone(
            String model,
            String battery,
            int width,
            int height
    ) {
        if ("S8".equalsIgnoreCase(model)) {
            return new S8(model, battery, width, height);
        } else if ("Note8".equalsIgnoreCase(model)) {
            return new Note8(model, battery, width, height);
        }else {
            throw new RuntimeException("Invalid phone model: " + model);
        }
    }
}
