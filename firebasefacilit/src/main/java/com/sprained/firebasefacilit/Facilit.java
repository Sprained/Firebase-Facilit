package com.sprained.firebasefacilit;

import android.app.Activity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;


public class Facilit {
    public FirebaseDatabase firebaseDatabase;
    public DatabaseReference databaseReference;

    public void initializeDatabase(Activity activity){
        FirebaseApp.initializeApp(activity);
        firebaseDatabase = firebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    public void insert(String child, String id, Map values){
        databaseReference.child(child).child(id).setValue(values);
    }
}
