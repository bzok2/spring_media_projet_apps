package com.example.boris.spring_media_apps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by boris on 24/10/2015.
 */
public class InscriptionActivity extends ActionBarActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription_layout);

        button = (Button) findViewById(R.id.nextButton);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent myIntent = new Intent(InscriptionActivity.this, PremiumActivity.class);
                InscriptionActivity.this.startActivity(myIntent);
            }
        });
    }
}
