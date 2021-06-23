package com.example.yourdoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

<<<<<<< HEAD
import com.example.yourdoctor.models.MedicalService;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import cz.msebera.android.httpclient.Header;

=======
>>>>>>> 71d88bcc1ed9dc5ab9209bd744c776279f25da9d
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

<<<<<<< HEAD
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://192.168.1.4:5001/api/medical-services/3", new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                try {
                    MedicalService medicalService = new MedicalService();
                    medicalService.setTitle(response.getString("title"));
                    medicalService.setDescription(response.getString("description"));
                    medicalService.setId(response.getLong("id"));

                    btnSignIn.setText(response.getString("title"));
                }
                catch(Exception e) {

                }
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                super.onSuccess(statusCode, headers, response);

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });

=======
>>>>>>> 71d88bcc1ed9dc5ab9209bd744c776279f25da9d
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
<<<<<<< HEAD
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void opensignup(){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }
=======
    }
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void opensignup(){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }


>>>>>>> 71d88bcc1ed9dc5ab9209bd744c776279f25da9d

}