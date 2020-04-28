package com.sprained.firebasefacilit;

import com.google.firebase.database.annotations.Nullable;

public class Teste {
    private String id;
    private String name;
    private String pass;

    public Teste(){}

    public Teste(String id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    @Nullable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
