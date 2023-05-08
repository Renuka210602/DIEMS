package com.example.diems_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Stu_Login extends AppCompatActivity {
    ImageButton imageButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stu_login);
        imageButton=(ImageButton) findViewById(R.id.imageButton);
        textView=(TextView) findViewById(R.id.signUp);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_main();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_stu_registration();
            }
        });
    }
    public void activity_main()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void activity_stu_registration()
    {
        Intent intent=new Intent(this, Stu_Registration.class);
        startActivity(intent);
    }
}