package creational.singletonDP;

import java.util.HashMap;
import java.util.Map;


// Lazy Loading Singleton Pattern  nesneye ihtiyaç duyulduğunda oluşturulur.
// Eager Loading Singleton Pattern nesne oluşturulurken oluşturulur.
public class
Singleton {

    /**
     *
     Singleton Tasarım Deseni nedir?
     Singleton bir nesnenin sadece bir örneğinin olduğundan emin olmak ve bu
     nesneye ihtiyacınız olduğunda kodunuzda her yerde aynı (ve tek örneğin) çağırılmasını sağlamak için kullanılır.
     */

    // Volatile anahtar kelimesi, INSTANCE değişkeninin değişikliklerinin tüm thread'lere anında görünmesini sağlar.
    // Bu anahtar kelime olmadan da thread safe hale getirilebilir.
    private static volatile Singleton INSTANCE;

    private Map<String, Object> usersMap = null;


    /**Constructor alanını private yaparak dışarıdan erişimi engelledik.
     *Böylece sadece bu sınıf içerisinden nesne oluşturulabilir ve kullanılabilir.
     *Global bir nesne oluşturulmuş oldu.
     */
    private Singleton() {
    }


    /**getInstance() metodu ile global nesneye erişim sağlanır.
     *Eğer global nesne null ise yeni bir nesne oluşturulur.
     *Eğer global nesne null değilse zaten oluşturulmuş olan nesne döndürülür.
     */

    public static
    Singleton
    getInstance(

    ) {
        if (INSTANCE == null) {
            // synchronized threadleri kuyruğa alır ve tek tek işleme alır. Bu yüzden de thread safe hale getirir.
           synchronized (Singleton.class) {
               if (INSTANCE == null) {
                   INSTANCE = new Singleton();
                   INSTANCE.usersMap = new HashMap<>();
               }
           }
            System.out.println("Singleton instance created");
            // sychronized block ile thread safe hale getirildi. Ama bu haliyle de thread safe değil.
            // Çünkü bu haliyle de iki thread aynı anda bu bloğa girebilir ve iki nesne oluşturulabilir.
            // Bu yüzden de double check locking yapılmalıdır.

        }
        return INSTANCE;
    }

    /**Global nesneye erişim sağlayan metot.
     *Bu metot ile global nesne üzerinde işlemler yapılabilir.
     */

    public  void
    addUser(
            String key,
            Object user
    ) {
        getInstance().usersMap.put(key, user);
    }

    public
    Object
    getUser(
            String key
    ) {
        return getInstance().usersMap.get(key);
    }


    public void
    removeUser(
            String key
    ) {
        getInstance().usersMap.remove(key);
    }


    public void
    removeAllUsers(
    ) {
        getInstance().usersMap.clear();
    }

    public void
    logAllUsers(
    ) {
        for (Map.Entry<String, Object> entry : getInstance().usersMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

}
