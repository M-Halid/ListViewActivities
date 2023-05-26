package com.ewig.highactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ewig.highactivities.databinding.ActivityDetailsBinding;

public class Details extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        LandMark clickedLandmark = (LandMark) intent.getSerializableExtra("landmark");

        binding.Name.setText(clickedLandmark.name);
        binding.CityAndCountry.setText(clickedLandmark.city + ", "+ clickedLandmark.country);
        binding.Image.setImageResource(clickedLandmark.image);

    }
}