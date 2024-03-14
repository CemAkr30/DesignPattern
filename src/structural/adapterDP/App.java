package structural.adapterDP;

import structural.adapterDP.adapter.FaxAdapter;

public class App {


    /***
     * Adapter Pattern
     * -------------------
     * Adapter design pattern, structural design pattern kategorisindedir.
     *
     * Kullanım amacı;
     *
     * İki uyumsuz interface’i beraber kullanmamızı sağlar.
     * Daha önce yazılmış olan kodları düzenlemek zorunda kalmayız. Sonuçta ilgili kodun daha önce çalıştığını kabul ediyoruz.
     * Adapte edeceğimiz class üzerinde değişiklik yapmadığımız için uygulama içerisinde kullanılmış olduğu herhangi bir yerde değişiklik yapmamız gerekmez.
     *
     * Örneğin; bir uygulamada hata yönetimi için IError interface’i kullanılmış olsun.
     * Bu interface’i implemente eden ServiceError ve DbError class’ları olsun.
     * Bu class’lar hata yönetimi için kullanılmaktadır.
     * Fakat bir gün hata yönetimi için yeni bir class yazılmış olsun ve bu class IError interface’ini implemente etmemiş olsun.
     * Bu durumda yeni yazılan class’ı da hata yönetimi için kullanmak istediğimizde adapter aracılığıyla convert etmek için IError interface’ini implemente etmesi gerekmektedir.
     * Bu durumda adapter design pattern kullanılabilir.
     * @param args
     */


    public static void main(String[] args) {
        System.out.println("Adapter Pattern");
        System.out.println("-------------------");

        IError serviceError = new ServiceError();
        IError faxError = new FaxAdapter(new FaxError("FAX-001","Fax Error"));
        IError dbError = new DbError();


        IError[] errors = {serviceError,faxError,dbError};

        for (IError error : errors) {
            error.sendEmail();
        }


    }
}
