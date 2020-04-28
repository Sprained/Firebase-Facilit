package com.sprained.firebasefacilit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Facilit facilit = new Facilit();
    private Teste teste = new Teste();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facilit.initializeDatabase(this);

        teste.setId("003");
        teste.setName("nome");
        teste.setPass("444");
        facilit.insert("alunos", teste.getId(), Teste.class);
    }
}
