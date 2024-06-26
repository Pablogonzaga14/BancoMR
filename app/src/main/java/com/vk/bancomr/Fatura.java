package com.vk.bancomr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;
import com.vk.bancomr.databinding.ActivityFaturaBinding;

public class Fatura extends AppCompatActivity {
    private ActivityFaturaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        binding =ActivityFaturaBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getSupportActionBar().hide();

        binding.toolbarFatura.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navegarTelaPrincipal = new Intent(Fatura.this,MainActivity.class);
                startActivity(navegarTelaPrincipal);
            }
        });

        CreditCardView cartaoDeCredito = binding.CardCredit;
        cartaoDeCredito.setCardNumber("4235 6477 2802 5682");
        cartaoDeCredito.setCardName("Pablo G Carvalho");
        cartaoDeCredito.setExpiryDate("11/30");
        cartaoDeCredito.setType(CardType.MASTERCARD);
    }
}