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
                String users_info [] = users.split(";");

                boolean auth = false;

                for (int i =0;i<users_info.length;i++) {
                    String [] cred = users_info[i].split(",");
                    System.out.println(cred[0]);
                    String email = cred[0];
                    String pass = cred[1];
                    if (email.equals(typed_email.getText().toString()) && pass.equals(typed_password.getText().toString())) {
                        auth = true;
                        startActivity(new Intent(getApplicationContext(),  CondutorClienteActivity.class));
                        break;
                    }
                }

                if(!auth)
                    Toast.makeText(getApplicationContext(), "Email ou password inválidos", Toast.LENGTH_LONG).show();
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

    private void writeToFile(String data) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput("users.txt", Context.MODE_APPEND));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
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
