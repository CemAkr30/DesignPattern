package structural.facadeDP.tahsilat;

import structural.facadeDP.borc.Borc;
import structural.facadeDP.borc.EnumBorcTuru;
import structural.facadeDP.hukuksal.HukuksalKontrolService;
import structural.facadeDP.yapilandirma.YapilandirmaKontrolService;

public class TahsilatKontrolService {

    private YapilandirmaKontrolService yapilandirmaKontrolService;
    private HukuksalKontrolService hukuksalKontrolService;

    public TahsilatKontrolService() {
        yapilandirmaKontrolService = new YapilandirmaKontrolService();
        hukuksalKontrolService = new HukuksalKontrolService();
    }

    public boolean isTahsilataUygun(Borc borc){

        boolean yapilandirmaBozulmali = false;
        if (EnumBorcTuru.YAPILANDIRMA.equals(borc.getBorcTuru())){
            yapilandirmaBozulmali = yapilandirmaKontrolService.isYapilandirmaBozulmali(borc.getVadeTarihi());
        }

        boolean hukuksalIslemde = hukuksalKontrolService.isHukuksalIslemde(borc.getId());

        boolean isBorcTahsilataUygun = !(yapilandirmaBozulmali || hukuksalIslemde);

        return isBorcTahsilataUygun;

    }
}
