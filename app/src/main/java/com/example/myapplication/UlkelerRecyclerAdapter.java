package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.UlkelerRvsatirBinding;
import java.util.ArrayList;


public class UlkelerRecyclerAdapter extends
        RecyclerView.Adapter<UlkelerRecyclerAdapter.UlkelerRecyclerViewHolder>

{
    ArrayList<Ulke> ulkeler;
    public UlkelerRecyclerAdapter(ArrayList<Ulke> ulkeler){
        this.ulkeler=ulkeler;
    }

public class UlkelerRecyclerViewHolder extends RecyclerView.ViewHolder{


    private final UlkelerRvsatirBinding binding;

    private UlkelerRecyclerViewHolder(UlkelerRvsatirBinding binding){
    super(binding.getRoot());
    this.binding = binding;
    }
}
@NonNull
@Override
public UlkelerRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

UlkelerRvsatirBinding binding =
        UlkelerRvsatirBinding.inflate(LayoutInflater.from(parent.getContext()));
return new UlkelerRecyclerViewHolder(binding);
}
@Override
public void onBindViewHolder(@NonNull UlkelerRecyclerViewHolder holder,int position){

    holder.binding.tvUlkeAdi.setText(ulkeler.get(position).getUlkeadi());
    holder.binding.tvUlkeBaskent.setText(ulkeler.get(position).getBaskent());
    holder.binding.imgBayrak.setImageResource(ulkeler.get(position).getBayrak());
    }
    @Override
    public int getItemCount(){
        return ulkeler.size();
    }
}