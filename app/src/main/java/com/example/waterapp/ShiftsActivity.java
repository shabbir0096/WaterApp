package com.example.waterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waterapp.databinding.ActivityShiftsBinding;

public class ShiftsActivity extends AppCompatActivity {

    ActivityShiftsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShiftsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ShiftsActivity.this, TankOrder.class));
            }
        });
    }
}