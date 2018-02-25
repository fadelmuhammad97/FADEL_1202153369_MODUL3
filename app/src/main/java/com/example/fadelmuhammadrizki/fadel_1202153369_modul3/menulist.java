package com.example.fadelmuhammadrizki.fadel_1202153369_modul3;

/**
 * Created by fadel on 25/02/18.
 */

public class menulist {
    //deklarasi variable yang digunakan

    int gambar;
    String nama;
    String desc;

    //method setter

    public menulist(int gambar, String nama, String desc){
        this.gambar=gambar;
        this.nama=nama;
        this.desc=desc;
    }

    //method getter untuk get gambar
    public int getGambar() {
        return gambar;
    }

    //method getter untuk get nama
    public String getNama() {
        return nama;
    }

    //method getter untuk get detail
    public String getDesc() {
        return desc;
    }

}


