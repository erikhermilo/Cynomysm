package com.cynomex.cynomys.cynomys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
public void loguear(View view){

    Intent intent = new Intent(this,MapsActivity.class);
startActivity(intent);
}
}
