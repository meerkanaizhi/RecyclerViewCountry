package com.example.recyclerviewcountry;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private ArrayList<Country> list = new ArrayList<>();
    ;

    public void setList(ArrayList<Country> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_users, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView country1, capital;
        private ImageView flag;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            country1 = itemView.findViewById(R.id.country_name);
            capital = itemView.findViewById(R.id.capital_name);
            flag = itemView.findViewById(R.id.ic_kg);

        }

        public void onBind(Country country) {
            country1.setText(country.getCountry());
            capital.setText(country.getCapital());
            flag.setImageResource(country.getFlag());

        }
    }
}
