package com.example.imtiazaminsajid.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri.parse("http://google.map.com");

        startActivity(intent);
    }
}
