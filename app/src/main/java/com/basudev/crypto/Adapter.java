package com.basudev.crypto;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Data> userList;
    private OnRecyclerViewClickListener listener;
    Context context;

    public Adapter(List<Data> userList) {

        this.userList = userList;
    }

    public interface OnRecyclerViewClickListener {
        void OnItemClick(int position);
    }

    public void OnRecyclerViewClickListener(OnRecyclerViewClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        return new ViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String price = String.valueOf(userList.get(position).quote.getUSD().getPrice());
        String name = userList.get(position).getName();
        String symbol = userList.get(position).getSymbol();
        String percentage = String.valueOf(userList.get(position).quote.getUSD().getPercent_change_24h());
        String ID = String.valueOf(userList.get(position).getId());
        Picasso.get().load("https://s2.coinmarketcap.com/static/img/coins/64x64/"+ userList.get(position).getId()+".png").into(holder.icon);
        Picasso.get().load("https://s3.coinmarketcap.com/generated/sparklines/web/7d/usd/"+userList.get(position).getId()+".png").into(holder.chart);
        holder.price.setText("$ "+price);
        holder.name.setText(name);
        holder.symbol.setText(symbol);
        holder.percent.setText(percentage);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView price;
        private TextView symbol;
        private TextView percent;
        private ImageView icon;
        private ImageView chart;

        public ViewHolder(@NonNull View itemView, OnRecyclerViewClickListener listener) {
            super(itemView);
            name = itemView.findViewById(R.id.currencyNameTextView);
            price = itemView.findViewById(R.id.currencyPriceTextView);
            symbol = itemView.findViewById(R.id.currencySymbolTextView);
            percent = itemView.findViewById(R.id.currencyChangeTextView);
            icon = itemView.findViewById(R.id.currencyImageView);
            chart = itemView.findViewById(R.id.currencyChartImageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null && getLayoutPosition() != RecyclerView.NO_POSITION) {
                        listener.OnItemClick(getLayoutPosition());
                    }
                }
            });

        }
    }
}