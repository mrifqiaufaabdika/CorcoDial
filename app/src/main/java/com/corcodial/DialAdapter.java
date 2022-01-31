package com.corcodial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class DialAdapter extends RecyclerView.Adapter<DialAdapter.ListViewHolder> {
    //private ArrayList<Rute> sampleData;
    private int id_layout,size;


    public DialAdapter(int size){
        this.id_layout = id_layout;
        this.size = size;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_dial, parent, false);


        return  new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(view.getContext(), "ok", Toast.LENGTH_SHORT).show();
                if (voice.getVisibility() == view.VISIBLE){
                    voice.setVisibility(view.GONE);
                    //Toast.makeText(view.getContext(), "harus hide", Toast.LENGTH_SHORT).show();

                }else {
                    voice.setVisibility(view.VISIBLE);
                    
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public ConstraintLayout voice;


    public class ListViewHolder extends RecyclerView.ViewHolder{
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            voice = (ConstraintLayout) itemView.findViewById(R.id.lyt_voice);
        }
    }
}
