package com.example.boris.spring_media_apps;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by boris on 21/10/2015.
 */
public class LoginActivity extends ActionBarActivity{


    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_signup_layout);

        button = (Button) findViewById(R.id.loginButton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, AuthActivity.class);
                LoginActivity.this.startActivity(myIntent);
            }
        });

        button = (Button) findViewById(R.id.signupButton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, InscriptionActivity.class);
                LoginActivity.this.startActivity(myIntent);
            }
        });

    }

}
