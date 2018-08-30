package com.example.estudiante.listasavanzadasjerry;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.estudiante.listasavanzadasjerry.Noticia;

import java.util.ArrayList;

public class NoticiaAdapter extends BaseAdapter {


    ArrayList<Noticia> noticias;
    Activity activity;

    public NoticiaAdapter(Activity activity) {
        this.activity = activity;

        noticias= new ArrayList<Noticia>();
    }


    //el tamaño de la lista
    @Override
    public int getCount() {
        return noticias.size();
    }


    //obtener el objeto de la lista
    @Override
    public Object getItem(int i) {
        return noticias.get(i);
    }

    //el id de cada objeto, tiene que ser unico por cada objeto
    @Override
    public long getItemId(int i) {
        return i;
    }

    //generar un reglon por objeto
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //pasa un XML a View
        LayoutInflater inflater= activity.getLayoutInflater();

        View renglon= inflater.inflate(R.layout.renglon, null, false);

        TextView item_titulo = renglon.findViewById(R.id.item_titulo);
        TextView item_fecha = renglon.findViewById(R.id.item_fecha);
        TextView item_descripcion= renglon.findViewById(R.id.item_descripcion);

        item_descripcion.setText(noticias.get(position).getDescripcion());
        item_fecha.setText(noticias.get(position).getFecha());
        item_titulo.setText(noticias.get(position).getTitulo());

        return renglon;
    }


    public void agregar(Noticia noticia){
        noticias.add(noticia);
        notifyDataSetChanged();

    }
}
