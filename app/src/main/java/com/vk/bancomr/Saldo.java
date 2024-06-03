package com.vk.bancomr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.vk.bancomr.databinding.ActivitySaldoBinding;

public class Saldo extends AppCompatActivity {
    private ActivitySaldoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySaldoBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getSupportActionBar().hide();

        binding.toolbarSaldo.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navegarTelaPrincipal = new Intent(Saldo.this,MainActivity.class);
                startActivity(navegarTelaPrincipal);
            }
        });
    }
}