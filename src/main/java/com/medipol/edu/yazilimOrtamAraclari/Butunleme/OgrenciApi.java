package com.medipol.edu.yazilimOrtamAraclari.Butunleme;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;*/

 @RestController
 @RequestMapping("/Ogrenci")

public class OgrenciApi {

        /*
         * http://localhost:8080/Ogrenci/listele
         */

        @GetMapping("/listele")
        public List<Ogrenci> listele() {
            return OgrenciVeriServisi.ogrencileriGetir();
        }

        @PostMapping("/ekle")
        public Ogrenci Ekle(@RequestBody Ogrenci ogrenci) {
            OgrenciVeriServisi.ogrenciEkle(ogrenci);
            return ogrenci;
        }

        @GetMapping("/ekle2")
        public Ogrenci ogrenciEkle(@RequestParam String isim, @RequestParam String numara) {
            Ogrenci ogrenci = new Ogrenci(isim, numara);
            OgrenciVeriServisi.ogrenciEkle(ogrenci);
            return ogrenci;
        }
        
       
        /*@DeleteMapping("/silme2/{numara}")
        public Ogrenci  ogrenciSil(@PathVariable String numara) {
        	 OgrenciVeriServisi.ogrenciSilme(numara);
        }*/
    }

