package com.sprained.firebasefacilit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Facilit facilit = new Facilit();
    private Teste teste = new Teste();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facilit.initializeDatabase(this);

        //teste.setId("004");
        teste.setName("nome");
        teste.setPass("445");
        //facilit.insert("alunos", teste.getId(), teste.toMap());
        //facilit.creatUserAuthAndRealtimeWhithId("teste@gmail.com", "teste123", "alunos", teste.toMap());
        //facilit.singInUserAuthAndRealtimeWhithId("teste@gmail.com", "teste123", "alunos", teste.toMap());
        //Log.i("Maps", teste.toMap().get("pass").toString());
    }
}
