package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CocktailDuJourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktail_du_jour);

        getSupportActionBar().setTitle("Cocktail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}