package com.example.erol.androidclients;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button button;
    EditText editTextIp,editTextPort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button = (Button) findViewById(R.id.button);
        editTextIp = (EditText) findViewById(R.id.ipEditText);
        editTextPort = (EditText) findViewById(R.id.portEditText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TCPClient.SERVERIP = editTextIp.getText().toString();
                TCPClient.SERVERPORT = Integer.parseInt(editTextPort.getText().toString());
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });
    }
}
