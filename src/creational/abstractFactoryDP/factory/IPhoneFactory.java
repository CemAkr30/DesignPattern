package creational.abstractFactoryDP.factory;

import creational.abstractFactoryDP.model.IPhone;

public interface IPhoneFactory {
    IPhone getIPhone(String model, String battery, int width, int height);
}
