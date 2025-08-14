package com.example.salaruyuni.activity;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.salaruyuni.R;
import com.example.salaruyuni.adapters.UsuarioAdapterListView;
import com.example.salaruyuni.models.Usuario;

import java.util.ArrayList;

public class list_viewActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        boolean carlos = usuarios.add(new Usuario("Carlos", "", "carlos@gmail.com"));
        usuarios.add(new Usuario("Karla", "", "karla@gmail.com"));
        usuarios.add(new Usuario("Marta", "", "marta@gmail.com"));

        //vincular cuentas
        listViewUsuarios = findViewById(R.id.lvUsuarios);
        tvMenuPrincipal = findViewById(R.id.tvMenuPrincipal);

        //configurar adaptador personalizado
        UsuarioAdapterListView  adapter = new UsuarioAdapterListView(this, usuarios);
        list_viewUsuarios.setAdapter(adapter);

        //evento para volver al menu personalizado
        tvMenuPrincipal.setOnClickListener(new View.OnClickListener()) {
            @override
            public void onClick(view v){
                Intent intentMenuPrincipal = new Intent(ListviewActivity.this.MainActivity.class);
                startActivity(IntentMenuPrincipal);
            }
        }
    }
}