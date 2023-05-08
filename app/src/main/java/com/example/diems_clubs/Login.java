package com.example.diems_clubs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.student);
        button2 = (Button) findViewById(R.id.faculty);
        button3 = (Button) findViewById(R.id.admin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_stu_login();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_faculty_login();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity_admin_login();
            }
        });
    }
    public void activity_stu_login()
    {
        Intent intent = new Intent(this,Stu_Login.class);
    }
    public void activity_faculty_login()
    {
        Intent intent = new Intent(this,Faculty_Login.class);
    }
    public void activity_admin_login()
    {
        Intent intent = new Intent(this,Admin_Login.class);
    }
}