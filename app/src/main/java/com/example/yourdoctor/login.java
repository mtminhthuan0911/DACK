package com.example.yourdoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    Button btnSignIn, btnSignUp;
    EditText phone, password;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        phone = (EditText) findViewById(R.id.phone);
        password = (EditText) findViewById(R.id.password);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
        DB = new DBHelper(this);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String SDT = phone.getText().toString();
                String pass = password.getText().toString();

                if(phone.equals("") || pass.equals(""))
                    Toast.makeText(login.this, "Please Enter All The Fields", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkphonepass = DB.checkphonepassword(SDT, pass);
                    if(checkphonepass==true){
                        Toast.makeText(login.this, "Login Success", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(login.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View signup) {
                Intent intent = new Intent(getApplicationContext(),signup.class);
                startActivity(intent);

            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void opensignup(){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }



}