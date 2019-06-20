package com.example.mim.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mim.R;
import com.example.mim.model.ContratLocation;

import java.util.List;

public class ContratLocationListAdapter extends RecyclerView.Adapter<ContratLocationListAdapter.ContratLocationViewHolder> {

    class ContratLocationViewHolder extends RecyclerView.ViewHolder {
        private final TextView contratLocItemView;

        private ContratLocationViewHolder(View itemView) {
            super(itemView);
            contratLocItemView = itemView.findViewById(R.id.textView);
        }

    }

    private final LayoutInflater mInflater;

    private List<ContratLocation> mContratLoc;

    ContratLocationListAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public ContratLocationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.activity_contratlocation_form, parent, false);
        return new ContratLocationViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ContratLocationViewHolder holder, int position) {
        if (mContratLoc != null) {
            ContratLocation current = mContratLoc.get(position);
            holder.contratLocItemView.setText(current.getId());
        } else {
            // Covers the case of data not being ready yet.
            holder.contratLocItemView.setText("Pas de Contrat");
        }
    }

    void setWords(List<ContratLocation> contratLocations) {
        mContratLoc = contratLocations;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mContratLoc != null)
            return mContratLoc.size();
        else return 0;
    }
}