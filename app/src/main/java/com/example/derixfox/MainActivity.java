package com.example.derixfox;

import static android.graphics.Color.RED;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.button.MaterialButton;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private MaterialButton button_one;
    private TextView text111, text555, text666, textView,text000;
private ImageView fon;

    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_one = findViewById(R.id.text444);
        editText2 = findViewById(R.id.text333);
        editText1 = findViewById(R.id.text222);
        text555 = findViewById(R.id.text555);
        text666 = findViewById(R.id.text666);
        textView = findViewById(R.id.textView);
        text111 = findViewById(R.id.text111);
        text000 = findViewById(R.id.text000);
        fon = findViewById(R.id.fon);

        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editText1) {
                if (editText1.toString().length() > 0) {
                    button_one.setBackgroundColor(RED);
                } else {
                    button_one.setBackgroundColor(Color.GRAY);
                }
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editText2) {
                if (editText2.toString().length() > 0) {
                    button_one.setBackgroundColor(RED);
                } else {
                    button_one.setBackgroundColor(Color.GRAY);
                }
            }
        });


        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equals("admin") && editText2.getText().toString()
                        .equals("admin")) {
                    text000.setVisibility(View.GONE);
                    text111.setVisibility(View.GONE);
                    editText1.setVisibility(View.GONE);
                    editText2.setVisibility(View.GONE);
                    button_one.setVisibility(View.GONE);
                    text555.setVisibility(View.GONE);
                    text666.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались"
                            , Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Неправильный пароль или Email",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }




}