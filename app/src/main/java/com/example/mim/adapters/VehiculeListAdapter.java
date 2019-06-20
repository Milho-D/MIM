package com.example.mim.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mim.R;
import com.example.mim.model.Vehicule;

import java.util.List;

public class VehiculeListAdapter extends RecyclerView.Adapter<VehiculeListAdapter.VehiculeViewHolder> {

    class VehiculeViewHolder extends RecyclerView.ViewHolder {

        private final TextView vehiculeItemView;

        private VehiculeViewHolder(View itemView) {
            super(itemView);
            vehiculeItemView = itemView.findViewById(R.id.textView);
        }
    }

    private final LayoutInflater layoutInflater;
    private List<Vehicule> lesVehicules; //cached copy of words

    public VehiculeListAdapter(Context context) {
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public VehiculeListAdapter.VehiculeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = layoutInflater.inflate(R.layout.vehicule_list_item, parent, false);
        return new VehiculeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull VehiculeViewHolder holder, int position) {
        if (lesVehicules != null) {
            Vehicule current = lesVehicules.get(position);
            holder.vehiculeItemView.setText(current.getNumeroSerie());
            holder.vehiculeItemView.setText(current.getImmatriculation());
            holder.vehiculeItemView.setText(String.valueOf(current.getPrixJour()));
        } else {
            // covers the case of data not being ready yet
            holder.vehiculeItemView.setText("Pas de véhicule");
        }
    }

    void setVehicules(List<Vehicule> listeVehicules) {
        lesVehicules = listeVehicules;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (lesVehicules != null) {
            return lesVehicules.size();
        } else {
            return 0;
        }
    }
}
