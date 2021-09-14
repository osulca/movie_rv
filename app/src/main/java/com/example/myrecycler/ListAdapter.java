package com.example.myrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<Libro> misDatos;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListAdapter(List<Libro> misDatos, Context context) {
        this.misDatos = misDatos;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.contenido, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.juntarData(misDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return misDatos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView titulo, subtitulo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.rc_titulo);
            subtitulo = itemView.findViewById(R.id.rc_subtitulo);
        }

        public void juntarData(Libro item){
            titulo.setText(item.getTitulo());
            subtitulo.setText(item.getSubtitulo());
        }
    }

}
