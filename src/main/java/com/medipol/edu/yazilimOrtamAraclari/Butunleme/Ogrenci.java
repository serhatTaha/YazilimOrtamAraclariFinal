package com.medipol.edu.yazilimOrtamAraclari.Butunleme;

public class Ogrenci {

    private String isim;
    private String numara;

    public Ogrenci(String isim, String numara) {
        this.isim = isim;
        this.numara = numara;
    }

	public String getIsim() {
        return isim;
    }
    
    public String getNumara() {
        return numara;
    }

}
