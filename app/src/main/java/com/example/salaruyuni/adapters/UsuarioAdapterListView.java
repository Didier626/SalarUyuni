package com.example.salaruyuni.adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.salaruyuni.R;
import com.example.salaruyuni.models.Usuario;

import java.util.List;
public class UsuarioAdapterListView extends ArrayAdapter<Usuario> {
    private Context context;
    private List<Usuario> ListaUsuarios;

    public UsuarioAdapterListView(Context context, int resource, List<Usuario> listaUsuarios) {
        super(context, 0);
        this.context = context;
        this.ListaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_usuario, parent, false);
        }
        //obtener usuario actual
        Usuario usuario = ListaUsuarios.get(position);

        TextView tvNombre = convertView.findViewById(R.id.tvNombre);
        TextView tvEmail = convertView.findViewById(R.id.tvEmail);

        //asignar datos
        tvNombre.setText(usuario.getNombre());
        tvEmail.setText(usuario.getEmail());

        return convertView;
    }
}
