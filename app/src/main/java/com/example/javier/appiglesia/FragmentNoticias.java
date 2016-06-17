package com.example.javier.appiglesia;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Javier Moreno on 18/11/2015.
 */
public class FragmentNoticias extends Fragment {

    TextView tituloNoticia, textoNoticia, titulo;
    Button leerMasNoticia;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.noticias_layout, container, false);

        Typeface roboto = Typeface.createFromAsset(getActivity().getAssets(),
                "font/RobotoCondensed-Bold.ttf");

        tituloNoticia = (TextView) view.findViewById(R.id.titulo_noticias);
        tituloNoticia.setTypeface(roboto);

        tituloNoticia = (TextView) view.findViewById(R.id.titulo_noticia);
        tituloNoticia.setText("Maecenas felis erat, laoreet ut ut mauris at, malesuada porttitor orci.");
        tituloNoticia.setTypeface(roboto);

        textoNoticia = (TextView) view.findViewById(R.id.texto_noticia);
        textoNoticia.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla sit amet velit et est fermentum blandit sagittis eu erat. Nulla posuere tempor tincidunt. Phasellus porta, nisi vitae laoreet fermentum, ante lorem egestas turpis, facilisis fringilla turpis justo a lorem. Aenean vitae justo posuere, tristique urna non, interdum dui.");
        textoNoticia.setTypeface(roboto);

        leerMasNoticia = (Button) view.findViewById(R.id.leer_mas_noticia);
        leerMasNoticia.setTypeface(roboto);

        return view;
    }
}