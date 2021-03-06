package com.example.lugwheels;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityLoginBinding;
import com.example.lugwheels.databinding.ActivitySignupBinding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LoginActivity extends AppCompatActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "";
                EditText typed_email = findViewById(R.id.typed_email);
                EditText typed_password = findViewById(R.id.typed_password);


                String users = readFromFile("users.txt");

                System.out.println("ola      "+users);
                String users_info[] = users.split(";");

                boolean auth = false;
                boolean empty = false;

                if (typed_password.getText().toString().equals("") || typed_email.getText().toString().equals(""))
                    empty = true;
                if (!empty ) {
                    for (int i = 0; i < users_info.length; i++) {
                        String[] cred = users_info[i].split(",");
                        if (cred.length==1)break;
                        String email = cred[0];
                        String pass = cred[1];
                        if (email.equals(typed_email.getText().toString()) && pass.equals(typed_password.getText().toString())) {
                            auth = true;
                            startActivity(new Intent(getApplicationContext(), CondutorClienteActivity.class));
                            break;
                        }
                    }
                    if (!auth)
                        Toast.makeText(getApplicationContext(), "Email ou password inv??lidos", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(getApplicationContext(), "Campos Vazios!", Toast.LENGTH_LONG).show();

            }
        });

        View back = findViewById(R.id.backB);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    public String readFromFile(String file) {
        String ret = "";
        try {
            InputStream inputStream = new FileInputStream(new File(String.valueOf(getApplicationContext().getFilesDir()) +"/"+ file));

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();
                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append(receiveString);
                }
                inputStream.close();
                ret = stringBuilder.toString();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("FileToJson", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("FileToJson", "Can not read file: " + e.toString());
        }
        return ret;
    }

}
