package com.example.sportcardviewrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.ViewHolder>{

    ArrayList<Sport> sportList;

    public ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public MyCustomAdapter(ArrayList<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout,
                        parent,
                        false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Sport sport = sportList.get(position);
        holder.sportImage.setImageResource(sport.getSportImage());
        holder.sportTitle.setText(sport.getSportTitle());
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView sportTitle;
        ImageView sportImage;

        public ViewHolder(@NonNull View itemView) {
           super(itemView);
           sportTitle = itemView.findViewById(R.id.sportTitle);
           sportImage = itemView.findViewById(R.id.sportImage);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(itemClickListener!=null){
                itemClickListener.onCLick(v,getAdapterPosition());
            }
        }
    }
}
