package com.plugin.undangan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Signup2 extends AppCompatActivity {

    private Button signup3,signin3,signupbwh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        //inisial
        signin3 = (Button) findViewById(R.id.signin3);
        signup3 = (Button) findViewById(R.id.signup3);
        signupbwh = (Button) findViewById(R.id.signupbwh);

        //functiom
        signin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signin3 = new Intent(Signup2.this,MainActivity.class);
                startActivity(signin3);
            }
        });
    }
}
