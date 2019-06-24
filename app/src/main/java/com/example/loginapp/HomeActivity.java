package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPemilik;
    private Button btnPekerja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        initObject();
        toPemilikActivity();
    }

    private void toPemilikActivity() {
        btnPemilik.setOnClickListener(this);
    }

    private void initObject() {
        btnPemilik = (Button) findViewById(R.id.buttonPemilik);
        btnPekerja = (Button) findViewById(R.id.buttonPekerja);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(HomeActivity.this,PemilikActivity.class);
        startActivity(intent);
    }
}
