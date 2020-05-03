package com.sprained.firebasefacilit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Facilit facilit = new Facilit();
    private Teste teste = new Teste();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facilit.initializeDatabase(this);

        teste.setId("005");
        teste.setName("nom");
        teste.setPass("444");
        facilit.insert("alunos", teste.getId(), teste.toMap());
    }
}
