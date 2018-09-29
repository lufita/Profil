package com.dlmkotlin.profil;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    Button telepon,alamat,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telepon=(Button)findViewById(R.id.satu);
        alamat=(Button)findViewById(R.id.dua);
        email=(Button)findViewById(R.id.tiga);

    }
    public void telepon(View view){
        Intent it = new Intent(Intent.ACTION_DIAL);
        it.setData(Uri.parse("tel: 087733154411"));
        startActivity(it);
    }
    public void alamat(View view){
        Uri webpage = (Uri.parse("http://bit.ly/2xHSYaN"));
        Intent it = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(it);

    }
    public void email(View view){
        Intent it = new Intent(Intent.ACTION_SEND);
        //startActivity(it);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_EMAIL, new String[]{"lufita.m98@gmail.com"});
        it.putExtra(Intent.EXTRA_SUBJECT, "Email dari Lufita");

        try {
            startActivity(Intent.createChooser(it, "Mengirimkan E-mail ?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }

    }
}
