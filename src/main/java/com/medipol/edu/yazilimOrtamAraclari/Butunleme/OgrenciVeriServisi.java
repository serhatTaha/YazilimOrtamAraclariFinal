package com.medipol.edu.yazilimOrtamAraclari.Butunleme;

import java.util.ArrayList;
import java.util.List;


public class OgrenciVeriServisi {

    private static final List<Ogrenci> OGRENCILER = new ArrayList<>();

    static {
        OGRENCILER.add(new Ogrenci("ali", "hr1345"));
        OGRENCILER.add(new Ogrenci("veli", "hr13456"));
        OGRENCILER.add(new Ogrenci("ahmet", "hr13756"));
        OGRENCILER.add(new Ogrenci("orhan", "hr13458"));
    }

    public static List<Ogrenci> ogrencileriGetir() {
        return OGRENCILER;
    }

    public static void ogrenciEkle(Ogrenci ogrenci) {
        OGRENCILER.add(ogrenci);
    }

	/*public static Ogrenci ogrenciSilme(Ogrenci ogrenci) {
          OGRENCILER.remove(ogrenci);
          return ogrenci;

    }*/
}
