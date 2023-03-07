package com.example.unitconverter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecylerAdapter extends RecyclerView.Adapter<RecylerAdapter.viewHolder> {
    private ArrayList<String> names ;
    private ArrayList<String> msgs;
    private ArrayList<Integer> imageList;

    private Context context;

    public RecylerAdapter(ArrayList<String> names, ArrayList<String> msgs, ArrayList<Integer> imageList, Context context) {
        this.names = names;
        this.msgs = msgs;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.textnames.setText(names.get(position));
        holder.textmsgs.setText(msgs.get(position));
        holder.image.setImageResource(imageList.get(position));


    }

    @Override
    public int getItemCount() {
        return names.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView textnames,textmsgs;
        private ImageView image;
        public viewHolder(@NonNull View itemView){
            super(itemView);

            textnames = itemView.findViewById(R.id.name);
            textmsgs = itemView.findViewById(R.id.msg);
            image = itemView.findViewById(R.id.profile_image);

        }
    }

}
