package com.example.katalogsmartphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnInfinix,btnPixel,btnSony;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnInfinix= findViewById(R.id.btn_buka_nama_infinix);
        btnPixel= findViewById(R.id.btn_buka_nama_pixel);
        btnSony= findViewById(R.id.btn_buka_nama_sony);
        btnInfinix.setOnClickListener(view -> bukaGaleri("Infinix"));
        btnPixel.setOnClickListener(view -> bukaGaleri("Pixel"));
        btnSony.setOnClickListener(view -> bukaGaleri("Sony"));
    }

    private void bukaGaleri(String merekHp) {
        Log.d("MAIN","Buka activity Infinix");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, merekHp);
        startActivity(intent);
    }

}