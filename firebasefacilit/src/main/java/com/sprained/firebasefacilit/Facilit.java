package com.sprained.firebasefacilit;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Constructor;


public class Facilit {
    public FirebaseDatabase firebaseDatabase;
    public DatabaseReference databaseReference;

    public void initializeDatabase(Activity activity){
        FirebaseApp.initializeApp(activity);
        firebaseDatabase = firebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    public void insert(String child, String id, Class classe){
        databaseReference.child(child).child(id).setValue(classe);
    }

    /*public String loginRealTime(DatabaseReference reference, final String childUser, final String childPassowrd , final String userName, final String userPass){
        reference.addValueEventListener(new ValueEventListener() {
            private String valor;
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String[] userId = new String[1];
                for(DataSnapshot postSnapshot:dataSnapshot.getChildren()){
                    String value = postSnapshot.getKey();
                    Object user = postSnapshot.child(childUser).getValue();
                    Object pass = postSnapshot.child(childPassowrd).getValue();
                    if(user.equals(userName) && pass.equals(userPass)){
                        userId[0] = value;
                        Log.i("Teste", userId[0]);
                        this.valor = userId[0];
                        break;
                    }
                }

                Log.i("Teste2", valor);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return valor;
    }*/
}
