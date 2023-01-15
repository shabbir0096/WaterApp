package com.example.waterapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waterapp.databinding.ActivityTankOrderBinding;

public class TankOrder extends AppCompatActivity {

    ActivityTankOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTankOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.freezeNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TankOrder.this, "Your order has been freeze. Tap Unfreeze button to UnFreeze your order", Toast.LENGTH_SHORT).show();
                binding.unfreezeNow.setVisibility(View.VISIBLE);
                binding.orderFinal.setVisibility(View.GONE);
            }
        });
        binding.unfreezeNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TankOrder.this, "Your order has been unfreezed successfully.", Toast.LENGTH_SHORT).show();
                binding.unfreezeNow.setVisibility(View.GONE);
                binding.orderFinal.setVisibility(View.VISIBLE);
            }
        });
        binding.orderFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TankOrder.this, "Your order places successfully", Toast.LENGTH_SHORT).show();
            }
        });
        binding.cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TankOrder.this, MainActivity.class));
            }
        });
    }
}