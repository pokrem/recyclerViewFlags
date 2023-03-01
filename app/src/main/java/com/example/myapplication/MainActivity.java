package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
ArrayList<Ulke>ulkeListesi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ulkeListesi=new ArrayList<>();
       ulkeListesi.add(new Ulke("Türkiye","Ankara",R.drawable.r1));
       ulkeListesi.add(new Ulke("Arjantin","Buenos Aires",R.drawable.r2));
       ulkeListesi.add(new Ulke("Meksika","Mexico City",R.drawable.r3));
       ulkeListesi.add(new Ulke("Japonya","Tokyo",R.drawable.r4));
       ulkeListesi.add(new Ulke("Sudan","Hartum",R.drawable.r5));
       ulkeListesi.add(new Ulke("Avusturalya","Kanberra",R.drawable.r6));

        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerview.addItemDecoration(new DividerItemDecoration(binding.recyclerview.getContext(),DividerItemDecoration.VERTICAL));
        UlkelerRecyclerAdapter adapter =new UlkelerRecyclerAdapter(ulkeListesi);
        binding.recyclerview.setAdapter(adapter);
        getSupportActionBar().setTitle("Ülke Bayrakları");
    }

}