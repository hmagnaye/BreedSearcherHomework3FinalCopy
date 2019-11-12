package com.example.breedsearcherhomework3.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.breedsearcherhomework3.Database.BreedDatabase;
import com.example.breedsearcherhomework3.Database.FavBreedsDatabase;
import com.example.breedsearcherhomework3.Model.Breed;
import com.example.breedsearcherhomework3.R;


public class BreedDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breed_detail_view);

        Intent intent = getIntent();
        final String intentID = intent.getStringExtra("id");

        final Breed breed = BreedDatabase.getBreedByID(intentID);

        TextView name = findViewById(R.id.name);
        TextView lifespan = findViewById(R.id.lifespan);
        TextView origin = findViewById(R.id.origin);
        TextView description = findViewById(R.id.description);
        TextView temperament  = findViewById(R.id.temperament);
        TextView wiki = findViewById(R.id.wikipedia);
        TextView textView = findViewById(R.id.textView2);
        Button button = findViewById(R.id.addBreedButton);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FavBreedsDatabase.getFavBreeds().put(intentID, breed);
                System.out.println("breed added");
            }
        });



        setText(breed.getName(), name);
        setText(breed.getLife_span(), lifespan);
        setText(breed.getOrigin(), origin);
        setText(breed.getTemperament(), temperament);
        setText(breed.getDescription(), description);
        setText(breed.getWikipedia_url(), wiki);
        setText(Integer.toString(breed.getDog_friendly()), textView);









    }

    public void setText(String string, TextView textView){
        if(string.equals(null)){
            textView.setText("Not Available");
        }
        else{
            textView.setText(string);
        }

    }

    public void setText(int num, TextView textView){
        if(num != 0){
            textView.setText(num);
        }
        else{
            textView.setText("Not Available");
        }

    }


}
