package com.example.isabelle.givemeahome_mirandilla_paragas_lab7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_cara_gallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_gallery);
    }

    public void back(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btnBackCara) {
            i = new Intent(this, activity_cara.class);
            startActivity(i);
        }
    }
}
