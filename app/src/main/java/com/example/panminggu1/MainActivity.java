package com.example.panminggu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText hasil;
    Button tambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        et1 = findViewById(R.id.masukan1);
        et2 = findViewById(R.id.masukan2);
        tambah = findViewById(R.id.tambah);
        hasil = findViewById(R.id.Hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String masukanPertama = et1.getText().toString();
                String masukanKedua = et2.getText().toString();
                int a = Integer.parseInt(masukanPertama);
                int b = Integer.parseInt(masukanKedua);
                int hasilTambah = a+b;
                hasil.setText(hasilTambah+"");

            }
        });
//    }}
        findViewById(R.id.kurang).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String masukanPertama = et1.getText().toString();
                String masukanKedua = et2.getText().toString();
                int a = Integer.parseInt(masukanPertama);
                int b = Integer.parseInt(masukanKedua);
                int hasilKurang = a-b;
                hasil.setText(hasilKurang+"");
            }
        });
        findViewById(R.id.Kali).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String masukanPertama = et1.getText().toString();
                String masukanKedua = et2.getText().toString();
                int a = Integer.parseInt(masukanPertama);
                int b = Integer.parseInt(masukanKedua);
                int hasilKali = a*b;
                hasil.setText(hasilKali+"");
            }
        });
        findViewById(R.id.Bagi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String masukanPertama = et1.getText().toString();
                String masukanKedua = et2.getText().toString();
                int a = Integer.parseInt(masukanPertama);
                int b = Integer.parseInt(masukanKedua);
                int hasilBagi = a/b;
                hasil.setText(hasilBagi+"");
            }
        });






    }
}