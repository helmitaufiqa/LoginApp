package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PemilikActivity extends AppCompatActivity {

    private Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemilik);

        initObject();
        toHomeActivity();
    }

    private void toHomeActivity() {
        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PemilikActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initObject() {
        btnKembali = (Button) findViewById(R.id.buttonKembali);
    }
}
