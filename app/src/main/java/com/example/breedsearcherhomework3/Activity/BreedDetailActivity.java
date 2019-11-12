package com.example.breedsearcherhomework3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.breedsearcherhomework3.Database.BreedDatabase;
import com.example.breedsearcherhomework3.Model.Breed;
import com.example.breedsearcherhomework3.R;


public class BreedDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breed_detail_view);

        Intent intent = getIntent();
        String intentID = intent.getStringExtra("id");

        Breed breed = BreedDatabase.getBreedByID(intentID);

        TextView name = findViewById(R.id.name);

        name.setText(breed.getName());

    }

}
