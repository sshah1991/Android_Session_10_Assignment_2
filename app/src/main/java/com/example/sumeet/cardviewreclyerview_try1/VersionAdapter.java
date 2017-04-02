package com.example.sumeet.cardviewreclyerview_try1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sumeet on 03-04-2017.
 */

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.VersionViewHolder> {

    private String[] version = {"Alpha", "Beta", "CupCake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow", "Nougat", "O"};

    @Override
    public VersionAdapter.VersionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.each_row, parent, false);
        VersionViewHolder viewHolder = new VersionViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(VersionAdapter.VersionViewHolder holder, int position) {
        holder.text.setText(version[position]);
    }

    @Override
    public int getItemCount() {
        return version.length;
    }

    public static class VersionViewHolder extends RecyclerView.ViewHolder {
        private TextView text;

        public VersionViewHolder(View itemView) {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.textview_card);
        }
    }
}
