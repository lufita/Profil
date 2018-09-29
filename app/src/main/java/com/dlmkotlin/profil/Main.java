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
        //it.setData(Uri.parse("tel:"+phone));
        startActivity(it);
        //dengan input no tersebut
    }
    public void alamat(View view){
        Uri webpage = (Uri.parse("http://bit.ly/2xHSYaN"));
        Intent it = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(it);

    }
    public void email(View view){
        //Uri webpage = (Uri.parse("http://bit.ly/2xHSYaN"));
        Intent it = new Intent(Intent.ACTION_SEND);
        startActivity(it);

    }
}
