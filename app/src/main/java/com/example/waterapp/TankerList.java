package com.example.waterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waterapp.databinding.ActivityTankerListBinding;

public class TankerList extends AppCompatActivity {

    ActivityTankerListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTankerListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.orderNowTankerList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TankerList.this, ShiftsActivity.class));
            }
        });
    }
}