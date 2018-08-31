package com.example.estudiante.listasavanzadasjerry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private ListView lv_noticias;
    NoticiaAdapter customAdapter;
    private Button btn_generar;
    private EditText et_ingresarnoti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_noticias= findViewById(R.id.lv_noticias);

        btn_generar= findViewById(R.id.btn_generar);
        et_ingresarnoti= findViewById(R.id.et_ingresarnoti);

        customAdapter= new com.example.estudiante.listasavanzadasjerry.NoticiaAdapter(this);

        lv_noticias.setAdapter(customAdapter);





        Noticia noticia1;

        noticia1=  new Noticia("Hoy es diseño", "Se cambia el logo lks", "30/08/2018");

        customAdapter.agregar(noticia1);

        lv_noticias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Noticia noticia_click = (Noticia) customAdapter.getItem(position);
                Toast.makeText( MainActivity.this,noticia_click.getDescripcion(), Toast.LENGTH_SHORT).show();
            }
        });

        btn_generar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Calendar c = Calendar.getInstance();
                int year= c.get(Calendar.YEAR);
                int month= c.get(Calendar.MONTH);
                month++;
                int day= c.get(Calendar.DAY_OF_MONTH);

                String fecha= day+"/"+month+"/"+year;




                String titulo = et_ingresarnoti.getText().toString() ;
                Noticia newNoticia = new Noticia(titulo, "aqui va la descripcion", fecha);
                customAdapter.agregar(newNoticia);
                et_ingresarnoti.setText("");
            }
        });
    }
}
