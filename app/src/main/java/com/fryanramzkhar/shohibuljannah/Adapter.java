package com.fryanramzkhar.shohibuljannah;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    Context context;
    String[] namaShohib,detailShohib;

    public Adapter(Context context, String[] namaShohib, String[] detailShohib) {
        this.context = context;
        this.namaShohib = namaShohib;
        this.detailShohib = detailShohib;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_shohib, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        viewHolder.txtNama.setText(namaShohib[i]);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, DetailShohib.class);
                pindah.putExtra("ns", namaShohib[i]);
                pindah.putExtra("ds",detailShohib[i]);
                context.startActivity(pindah);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaShohib.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
