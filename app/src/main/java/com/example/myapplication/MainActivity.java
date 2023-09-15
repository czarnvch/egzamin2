package com.example.myapplication;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv =  findViewById(R.id.wyswietl);
        EditText mail = findViewById(R.id.mail);
        EditText pass1 = findViewById(R.id.haslo1);
        EditText pass2 = findViewById(R.id.haslo2);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail1 = mail.getText().toString();
                String passwd1 = pass1.getText().toString();
                String passwd2 = pass2.getText().toString();
                    if (!mail1.isEmpty() && mail1.toString().contains("@")) {
                        if (!passwd1.isEmpty() && !passwd1.isEmpty() && passwd1.equals(passwd2))
                            tv.setText("Witaj! " + mail1);

                        else
                            tv.setText("Hasła się rożnią");

                    }
                    else
                        tv.setText("Błędny email");

            }


        });
    }
}