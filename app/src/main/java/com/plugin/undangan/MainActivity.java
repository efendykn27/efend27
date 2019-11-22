package com.plugin.undangan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signin,signup,signupbwh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisial tombol
        signup = (Button) findViewById(R.id.signup);
        signin = (Button) findViewById(R.id.signin);
        signupbwh = (Button) findViewById(R.id.signinbwh);

        //function tombol
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(MainActivity.this,Signup2.class);
                startActivity(signup);
            }
        });


    }
}
