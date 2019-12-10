package com.example.recpoo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }

    public void onRadioButtonClicked2(View view) {
        RadioButton radioButton = (RadioButton) view;
        int id = radioButton.getId();
        switch (id) {
            case R.id.radioButton6:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Parabéns");
                builder.setMessage("Você acertou novamente!");

                DialogInterface.OnClickListener btnOk = new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(), Tela3.class);
                        startActivity(intent);
                    }
                };

                builder.setPositiveButton("Ok", btnOk);
                builder.create().show();

                break;

            case R.id.radioButton7:
                Toast.makeText(
                        getApplicationContext(),
                        "Errou, tente novamente!",
                        Toast.LENGTH_SHORT
                ).show();

                break;

            case R.id.radioButton8:
                Toast.makeText(
                        getApplicationContext(),
                        "Errou, tente novamente!",
                        Toast.LENGTH_SHORT
                ).show();

                break;

            case R.id.radioButton9:
                Toast.makeText(
                        getApplicationContext(),
                        "Errou, tente novamente!",
                        Toast.LENGTH_SHORT
                ).show();

                break;

            case R.id.radioButton10:
                Toast.makeText(
                        getApplicationContext(),
                        "Errou, tente novamente!",
                        Toast.LENGTH_SHORT
                ).show();

                break;

        }
    }
}

