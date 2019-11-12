package com.example.breedsearcherhomework3.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.breedsearcherhomework3.R;

public class FavouriteBreedFragment extends Fragment {

    public FavouriteBreedFragment() {
        // Required empty public constructor iuhkvlfkjhgfd
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fav_breed_recycler_view, container, false);
        return view;

    }
}
