package com.example.fadelmuhammadrizki.fadel_1202153369_modul3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Daftarmenu extends AppCompatActivity {
    RecyclerView recv;
    Adaptermenu adptr;
    List<menulist> daftarmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftarmenu);
        //set title bar menjadi Dafter Air Mineral
        setTitle("Daftar Air Mineral");

        //membuat array list baru dengan nama daftarmenu
        daftarmenu = new ArrayList<>();
        //mendapat penanganan recycler view
        recv = findViewById(R.id.rvmenu);
        recv.setHasFixedSize(true);
        //kondisi ketika orientasi menjadi landscape
        if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            //maka akan menampilkan 2 grid
            recv.setLayoutManager(new GridLayoutManager(Daftarmenu.this, 2));
            //jika orientasi menjadi portrait
        }else {
            //maka akan menampilkan satu grid saja
            recv.setLayoutManager(new GridLayoutManager(Daftarmenu.this, 1));
        }
        //menjalankan fungsi input data
        inputdata();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
            recv.setLayoutManager(new GridLayoutManager(Daftarmenu.this, 2));
        }else {
            recv.setLayoutManager(new GridLayoutManager(Daftarmenu.this, 1));
        }
    }

    public void inputdata(){
        //memasukkan data ke dalam array
        daftarmenu.add(new menulist(R.drawable.ades, "Ades", "air mineral Ades. \nAdes is a brand of mineral water or bottled water produced by PT. Coca-Cola Bottling Indonesia, Bekasi."));
        daftarmenu.add(new menulist(R.drawable.amidis,"Amidis", "air mineral Amidis. \nAMIDIS is a health drinking water that is processed through a distillation system or it can be called evaporation, through a process of heating up to a few degrees Celsius so as to produce pure drinking water."));
        daftarmenu.add(new menulist(R.drawable.aqua, "Aqua", "air mineral Aqua. \nAqua yang diproduksi di Indonesia sejak tahun 1973."));
        daftarmenu.add(new menulist(R.drawable.cleo, "Cleo", "air mineral Cleo. \nAir Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter."));
        daftarmenu.add(new menulist(R.drawable.club, "Club", "air mineral Club. \nClub air mineral berasal dari Indonesia. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986."));
        daftarmenu.add(new menulist(R.drawable.equil, "Equil", "air mineral Equil. \nEquil  air mineral anorganik yang di produksi oleh PT Equilindo Asri. Sedang pemilik PT Equilindo Asri adalah Morgen Sutanto."));
        daftarmenu.add(new menulist(R.drawable.evian, "Evian", "air mineral Evian. \nEvian air mineral alami berasal dari satu sumber di puncak pegunungan Alpen, Perancis. Pembentukan mineral terjadi selama proses alami tersebut, melewati lapisan es dan bebatuan, dalam komposisi yang unik. "));
        daftarmenu.add(new menulist(R.drawable.leminerale, "leMinerale", "air mineral leMinerale. \nLe Minerale air mineral baru dari Mayora,Le Minerale, diolah dari sumber mata air pegunungan terpilih,memiliki kesegaran khas yang ditandai dengan sedikit rasa manis seperti di iklannya."));
        daftarmenu.add(new menulist(R.drawable.nestle, "Nestle", "air mineral Nestle. \n Nestlé Pure Life Mineral Water yang berasal dari segala kemurnian mata air pilihan."));
        daftarmenu.add(new menulist(R.drawable.pristine, "Pristine", "air mineral Pristine. \nAir minum pristine adalah air minum kemasan praktis dan ekonomis dan higienis."));
        daftarmenu.add(new menulist(R.drawable.vit, "Vit", "air mineral Vit. \nVIT yang diproduksi oleh PT Tirta Investama di Indonesia."));
        //membuat adapter baru yang menghubungkan kelas ini dengan data yang ingin ditampilkan
        adptr = new Adaptermenu(this,daftarmenu);
        //menguhubungkan recycler view dengan adapter
        recv.setAdapter(adptr);
    }
}
