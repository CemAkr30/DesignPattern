package structural.facadeDP;


import structural.facadeDP.borc.Borc;
import structural.facadeDP.borc.EnumBorcTuru;
import structural.facadeDP.borc.OdemeBilgileriDto;

import java.math.BigDecimal;
import java.util.Date;

public class App {

    /***
     * Facade tasarım deseni, bir alt sistemin karmaşık arayüzünü basitleştirmek için kullanılır.
     * Structural Design Pattern grubuna aittir.
     * Daha ziyade karışık sistemleri kullanıcıya yaptırmak yerine bir facede sarmalayarak kullanıcıya sunmak için kullanılır.
     * Tek method ile alt sistemlerin methodları çağırılır. Buna göre bütün orkestrasyonu yapan bir method yazılır.
     * @param args
     */


    public static void main(String[] args) {

        TahsilatFacade tahsilatFacade = new TahsilatFacade();

        Long id = 1L;
        BigDecimal borcTutar = new BigDecimal(10);
        EnumBorcTuru borcTuru = EnumBorcTuru.NORMAL;
        Date vadeTarihi = DateUtil.tarihOlustur("01.01.2020");

        Borc borc = new Borc(id, borcTuru, borcTutar, vadeTarihi);

        OdemeBilgileriDto odemeBilgileriDto = new OdemeBilgileriDto("Sadık Bahadır Memiş", "12345456", 01L, 2023L, 123L);

        boolean isSuccess = tahsilatFacade.tahsilatYap(borc, odemeBilgileriDto);

        if (isSuccess){
            System.out.println("Tahsilat Yapıldı");
        } else {
            System.out.println("Tahsilat Yapılamadı");
        }
    }
}
