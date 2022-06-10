package com.example.lugwheels;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lugwheels.databinding.ActivityRotaBinding;
import com.example.lugwheels.databinding.ActivitySignupBinding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SignupActivity extends AppCompatActivity {
    private ActivitySignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = "";
                EditText typed_email = findViewById(R.id.typed_email);
                EditText typed_password = findViewById(R.id.typed_password);
                EditText typed_password2 = findViewById(R.id.typed_password2);

                String users = readFromFile("users.txt");
                String users_info [] = users.split(";");

                boolean exists = false;
                boolean match = false;

                if(typed_password.getText().toString().equals(typed_password2.getText().toString()))
                    match=true;

                if(match) {
                    for (int i = 0; i < users_info.length; i++) {
                        String[] cred = users_info[i].split(",");
                        System.out.println(cred[0]);
                        String email = cred[0];
                        if (email.equals(typed_email.getText().toString())) {
                            exists = true;
                            Toast.makeText(getApplicationContext(), "Utilizador já existe", Toast.LENGTH_LONG).show();
                            break;
                        }
                    }

                    if(!exists) {
                        info = typed_email.getText().toString() + "," + typed_password.getText().toString() + ";";
                        writeToFile(info);
                        startActivity(new Intent(getApplicationContext(),  CondutorClienteActivity.class));
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Passwords não coincidem!", Toast.LENGTH_LONG).show();
                }


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
