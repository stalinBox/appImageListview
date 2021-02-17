package com.example.flora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MenuEspecies extends AppCompatActivity {


    private Button bntRegistrarEspecie;
    private Button bntListarEspecies;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bntRegistrarEspecie = findViewById(R.id.btnRegistrarEspecie);
        bntListarEspecies = findViewById(R.id.btnListarEspecies);

    }

    public void irActivityRegistrarEspecie(View view){
        Intent inten = new Intent(this, MainActivity.class);
        startActivity(inten);
    }

    public void irActivityListarEspecies (View view){
        Intent inten = new Intent(this, ListarEspecies.class);
        startActivity(inten);

    }


}
