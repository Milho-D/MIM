package com.example.mim.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mim.R;
import com.example.mim.model.Agence;

import java.util.List;

public class AgenceAdapter extends RecyclerView.Adapter<AgenceAdapter.AgenceViewHolder> {

    class AgenceViewHolder extends RecyclerView.ViewHolder {
        private final TextView agenceTextView;

        private AgenceViewHolder(View itemView) {
            super(itemView);
            agenceTextView = itemView.findViewById(R.id.textView);
        }
    }

    private final LayoutInflater agenceInflater;
    private List<Agence> agenceList; // une copie en cache des agences

    public AgenceAdapter(Context context) {
        agenceInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AgenceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = agenceInflater.inflate(R.layout.activity_ajout_agence, viewGroup, false);

        return new AgenceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AgenceViewHolder agenceViewHolder, int position) {
        if (agenceList != null) {
            Agence agenceCourant = agenceList.get(position);
            agenceViewHolder.agenceTextView.setText(agenceCourant.getNom());
            agenceViewHolder.agenceTextView.setText(agenceCourant.getAdresse());
            agenceViewHolder.agenceTextView.setText(agenceCourant.getIdGerant());
        }
    }

    void setAgenceList(List<Agence> agences){
        agenceList = agences;

        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (agenceList != null) {
            return agenceList.size();
        } else {
            return 0;
        }
    }
}
