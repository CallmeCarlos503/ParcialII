package com.example.parcialii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private EmpleadoAdapter empleadoAdapter;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            ArrayList<empleados> empleados = new ArrayList<>();
        empleados.add(new empleados(R.drawable.imagen1,"Alexander Pierrot","CEO", "Insures S.O."));
        empleados.add(new empleados(R.drawable.imagen2,"Carlos Lopez","Asistente", "Hospital Blue"));
        empleados.add(new empleados(R.drawable.imagen3,"Sara Bonz","Directora de Marketing", "Electrical Parts Itd"));
        empleados.add(new empleados(R.drawable.imagen4,"Liliana Clarence","Diseñadora de producto", "Creativa App"));
        empleados.add(new empleados(R.drawable.imagen5,"Benito Peralta","Supervisor de ventas", "Neumaticos Press"));
        empleados.add(new empleados(R.drawable.imagen6,"Juan Jaramillo", "CEO", "Banco Nacional"));
        empleados.add(new empleados(R.drawable.imagen7,"Cristian Steps","CTO", "Cooperativa Verde"));
        empleados.add(new empleados(R.drawable.imagen8,"Alexa Giraldo","Lead Programer", "Frutysofy"));
        empleados.add(new empleados(R.drawable.imagen9,"Linda Murillo","Directora de Marketing", "Seguros Boliver"));
        empleados.add(new empleados(R.drawable.imagen10,"Lizeth Astrada","CEO", "Consecionario Molotox"));

            
        EmpleadoAdapter empleadoAdapter = new EmpleadoAdapter(this, R.layout.activity_layoutempleado,empleados);

            listView = (ListView) findViewById(R.id.list_view);
            listView.setAdapter(empleadoAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, persona.class);


                intent.putExtra("idEmpleado", position);


                startActivity(intent);
            }
        });
    }
}