package com.example.diems_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Faculty_Login extends AppCompatActivity {
    ImageButton imageButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_login);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        textView = (TextView) findViewById(R.id.signUp);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_main();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_faculty_registration();
            }
        });
    }
    public void activity_main()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void activity_faculty_registration()
    {
        Intent intent = new Intent(this,Faculty_Registration.class);
        startActivity(intent);
    }
}