package com.prasun.casket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CasketLoginPage extends AppCompatActivity {

    Button logbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casket_login_page);
        logbutton=findViewById(R.id.loginbutton);
        logbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(CasketLoginPage.this,MainScreen.class);
                startActivity(in1);
            }
        });
    }
}