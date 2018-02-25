package com.example.raftiana.sitiraftianaputri_1202151365_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Raftiana on 23/02/2018.
 */

public class DetailActivity extends AppCompatActivity {
    //deklarasi variabel
    ImageView battery;
    TextView ukuran;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //membuat button back pada action bar muncul

        //menerima nilai yang dilempar dari activity menu sebelumnya
        String Judul = getIntent().getStringExtra("judul");
        String Deskripsi = getIntent().getStringExtra("deskripsi");
        String Penjelasan = getIntent().getStringExtra("penjelasan");
        Integer Gambar = getIntent().getIntExtra("gambar", 0);

        //mendefinisikan semua kompenen berdasarkan id
        TextView judul = findViewById(R.id.judul);
        TextView deskripsi = findViewById(R.id.deskripsi);
        TextView penjelasan = findViewById(R.id.penjelasan);
        ImageView gambar = findViewById(R.id.gambar);

        //menyimpan nilai yang sudah ditangkap kedalam kompenen yang sudah di definisikan
        judul.setText(Judul);
        deskripsi.setText(Deskripsi);
        penjelasan.setText(Penjelasan);
        gambar.setImageResource(Gambar);

        //deklarasi variabel berdasaarkan ID
        battery = findViewById(R.id.battery);
        ukuran = findViewById(R.id.ukuran);

        //setting nilai awal
        battery.setImageLevel(i);
        ukuran.setText(i + "L");
    }

    @Override
    public boolean onSupportNavigateUp() {
        //function ketika button back di klik maka akan kembali ke view sebelumnya
        onBackPressed();
        return true;
    }

    //method jika tombol plus ditekan
    public void tambah(View v) {
        i++;
        if (i == 1) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
            Toast.makeText(this, "Air Sedikit", Toast.LENGTH_LONG).show();
        } else if (i == 2) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 3) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 4) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 5) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 6) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 7) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
            Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_LONG).show();
        }
    }

    //method jika tombol minus ditekan
    public void kurang(View v) {
        i--;
        if (i == 1) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
            Toast.makeText(this, "Air Sedikit", Toast.LENGTH_LONG).show();
        } else if (i == 2) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 3) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 4) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 5) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 6) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 7) {
            battery.setImageLevel(i);
            ukuran.setText(i + "L");
            Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_LONG).show();
        }
    }
}
