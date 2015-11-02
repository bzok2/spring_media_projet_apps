package com.example.boris.spring_media_apps;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by boris on 22/10/2015.
 */
public class AuthActivity extends ActionBarActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.authentification_layout);

        button = (Button) findViewById(R.id.loginAuthButton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(AuthActivity.this, MapsActivity.class);
                AuthActivity.this.startActivity(myIntent);
            }
        });
    }
}
