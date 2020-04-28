package com.sprained.firebasefacilit;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Facilit {
    private String valor;
    public String loginRealTime(DatabaseReference reference, final String childUser, final String childPassowrd , final String userName, final String userPass){
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot postSnapshot:dataSnapshot.getChildren()){
                    String value = postSnapshot.getKey();
                    Object user = postSnapshot.child(childUser).getValue();
                    Object pass = postSnapshot.child(childPassowrd).getValue();
                    if(user.equals(userName) && pass.equals(userPass)){
                        String[] userId = new String[1];
                        userId[0] = value;
                        valor = value;
                        Log.i("Teste", valor);
                        break;
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return valor;
    }
}
