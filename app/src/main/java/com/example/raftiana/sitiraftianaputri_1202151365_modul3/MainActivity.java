package com.example.raftiana.sitiraftianaputri_1202151365_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Raftiana on 23/02/2018.
 */

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private GridLayoutManager mmLayoutManager;
    private ArrayList<String> Judul;
    private ArrayList<Integer> Gambar;
    private ArrayList<String> Deskripsi;

    //Daftar Judul
    private String[] judul = {"Aqua", "Pristine", "Le Minerale", "Cleo", "Evian Water", "Ades", "Amidis", "Equil", "nestle"};
    //Daftar Harga
    private String[] deskripsi = {"Air mata pegunungan", "Air mata buaya", "Air ada manis manisnya", "Air gak terkenal", "Air buat muka", "Air bening"
            , "Air bening", "Air gaenak", "Air airan", "Air beneran"};
    //Daftar Gambar
    private int[] gambar = {R.drawable.aqua, R.drawable.pristine, R.drawable.leminerale,
            R.drawable.cleo, R.drawable.evian, R.drawable.ades, R.drawable.amidis, R.drawable.equil, R.drawable.nestle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pembuatan objek arraylist
        Judul = new ArrayList<>();
        Deskripsi = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        DaftarItem();

        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(Judul, Deskripsi, Gambar);

        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);

        //pendeklarasian agar saat di landscape layout manager akan mengambil data dari grid_column_count yang ada di folder integers.xml
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem() {
        for (int w = 0; w < judul.length; w++) {
            Gambar.add(gambar[w]);
            Judul.add(judul[w]);
            Deskripsi.add(deskripsi[w]);
        }
    }
}