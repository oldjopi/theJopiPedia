package com.example.thejopipedia.RecylclerViewAdapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thejopipedia.BiologiaActivity;
import com.example.thejopipedia.R;

import java.util.ArrayList;

public class PerfilRecylclerViewAdapter extends RecyclerView.Adapter<PerfilRecylclerViewAdapter.ViewHolder> {
    ArrayList<Perfil> perfil;
    Context context;

    public PerfilRecylclerViewAdapter(ArrayList<Perfil> perfil, Context context) {
        this.perfil = perfil;
        this.context = context;
    }

    @NonNull
    @Override
    public PerfilRecylclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.perfil_cards_design , parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PerfilRecylclerViewAdapter.ViewHolder holder, int position) {
        holder.image.setImageResource(perfil.get(position).getImage());
        holder.tittle.setText(perfil.get(position).getTittle());
        holder.puntuacion.setText(perfil.get(position).getPuntuacion());
        holder.rltLayout.setBackgroundResource(perfil.get(position).getColor());
    }

    @Override
    public int getItemCount() {
        return perfil.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView tittle, puntuacion;
        RelativeLayout rltLayout;
        LinearLayout parent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {}
            });

            image = itemView.findViewById(R.id.imgmg);
            tittle = itemView.findViewById(R.id.tittle);
            puntuacion = itemView.findViewById(R.id.puntuacion);
            rltLayout = itemView.findViewById(R.id.rltLayout);
            parent = itemView.findViewById(R.id.parent);
        }
    }
}
