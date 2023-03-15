package com.example.firstlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    Button login;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.login);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        image=findViewById(R.id.imageView);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i=new Intent(MainActivity.this,MainActivity2.class);
//                String s=username.getText().toString().trim();
//                i.putExtra("Identifier",s);
//                startActivity(i);

                Toast.makeText(MainActivity.this, "Successfull", Toast.LENGTH_SHORT).show();
                changeImage();
                changeButton();
            }
        });
    }
        public void changeImage()
        {
            image.setBackgroundResource(R.drawable.img3);
        }
        public void changeButton()
        {
            login.setBackgroundColor(R.drawable.button);
        }
}