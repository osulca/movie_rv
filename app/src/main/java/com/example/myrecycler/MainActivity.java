package com.example.myrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Libro> libros = new ArrayList();
        libros.add(new Libro("Tormenta de Espadas", "George R.R. Martin"));
        libros.add(new Libro("La Casa de los Espiritus", "Isabel Allende"));
        libros.add(new Libro("Paco Yunque", "Cesar Vallejo"));
        libros.add(new Libro("El caballero carmelo", "Abraham Valdelomar"));
        libros.add(new Libro("Tormenta de Espadas", "George R.R. Martin"));
        libros.add(new Libro("La Casa de los Espiritus", "Isabel Allende"));
        libros.add(new Libro("Tormenta de Espadas", "George R.R. Martin"));
        libros.add(new Libro("La Casa de los Espiritus", "Isabel Allende"));
        libros.add(new Libro("Tormenta de Espadas", "George R.R. Martin"));
        libros.add(new Libro("La Casa de los Espiritus", "Isabel Allende"));
        libros.add(new Libro("Tormenta de Espadas", "George R.R. Martin"));
        libros.add(new Libro("La Casa de los Espiritus", "Isabel Allende"));
        libros.add(new Libro("Paco Yunque", "Cesar Vallejo"));
        libros.add(new Libro("El caballero carmelo", "Abraham Valdelomar"));

        ListAdapter adapter = new ListAdapter(libros, this);
        RecyclerView miRecycler = findViewById(R.id.myRecycler);
        miRecycler.setLayoutManager(new LinearLayoutManager(this));
        miRecycler.setAdapter(adapter);
    }
}