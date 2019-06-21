package com.example.mim.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mim.R;
import com.example.mim.model.ContratLocation;
import com.example.mim.model.EtatDesLieux;

import java.util.List;

public class EtatDesLieuxListAdapter extends RecyclerView.Adapter<EtatDesLieuxListAdapter.EtatDesLieuxViewHolder> {

    class EtatDesLieuxViewHolder extends RecyclerView.ViewHolder {
        private final TextView etatDesLieuxItemView;

        private EtatDesLieuxViewHolder(View itemView) {
            super(itemView);
            etatDesLieuxItemView = itemView.findViewById(R.id.textView);
        }

    }

    private final LayoutInflater mInflater;

    private List<EtatDesLieux> mEtatDesLieux;

    EtatDesLieuxListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public EtatDesLieuxViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.activity_etatdeslieux_form, parent, false);
        return new EtatDesLieuxViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EtatDesLieuxListAdapter.EtatDesLieuxViewHolder holder, int position) {
        if (mEtatDesLieux != null) {
            EtatDesLieux current = mEtatDesLieux.get(position);
            holder.etatDesLieuxItemView.setText(current.getId());
        } else {
            // Covers the case of data not being ready yet.
            holder.etatDesLieuxItemView.setText("Pas de Fiche");
        }
    }

    void setWords(List<EtatDesLieux> etatDesLieuxes) {
        mEtatDesLieux = etatDesLieuxes;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mEtatDesLieux != null)
            return mEtatDesLieux.size();
        else return 0;
    }
}
