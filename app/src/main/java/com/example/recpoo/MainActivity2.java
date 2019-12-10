package com.example.recpoo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

    public class MainActivity2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
        }

        public void onRadioButtonClicked(View view) {
            RadioGroup radioGroup = (RadioGroup) view;
            int id = radioGroup.getId();
            switch (id) {
                case R.id.radioButton:
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setTitle("Parabéns");
                    builder.setMessage("Você acertou!");

                    DialogInterface.OnClickListener btnOk = new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(), Tela2.class);
                            startActivity(intent);
                        }
                    };

                    builder.setPositiveButton("Ok", btnOk);
                    builder.create().show();

                    break;

                case R.id.radioButton2:
                    Toast.makeText(
                            getApplicationContext(),
                            "Errou, tente novamente!",
                            Toast.LENGTH_SHORT
                    ).show();

                    break;

                case R.id.radioButton3:
                    Toast.makeText(
                            getApplicationContext(),
                            "Errou, tente novamente!",
                            Toast.LENGTH_SHORT
                    ).show();

                    break;

                case R.id.radioButton4:
                    Toast.makeText(
                            getApplicationContext(),
                            "Errou, tente novamente!",
                            Toast.LENGTH_SHORT
                    ).show();

                    break;

                case R.id.radioButton5:
                    Toast.makeText(
                            getApplicationContext(),
                            "Errou, tente novamente!",
                            Toast.LENGTH_SHORT
                    ).show();

                    break;
            }
        }
    }

