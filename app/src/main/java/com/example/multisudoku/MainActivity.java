package com.example.multisudoku;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    Button[] btnDisplays;
    Button[] btnInputs;

    ConstraintLayout btnOverInput;
    int btnDisplaySelected = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOverInput = findViewById(R.id.btnOverInput);

        btnDisplays = new Button[] {
                findViewById(R.id.btnDisplay1),
                findViewById(R.id.btnDisplay2),
                findViewById(R.id.btnDisplay3)
        };

        btnInputs= new Button[]{
                findViewById(R.id.btnI1),
                findViewById(R.id.btnI2),
                findViewById(R.id.btnI3),
                findViewById(R.id.btnI4),
                findViewById(R.id.btnI5),
                findViewById(R.id.btnI6),
                findViewById(R.id.btnI7),
                findViewById(R.id.btnI8),
                findViewById(R.id.btnI9)
        };

        for (int i = 0; i < btnDisplays.length; i++) {
            int numI = i;
            btnDisplays[i].setOnClickListener(v -> {
                btnDisplaySelected = numI;
                btnOverInput.setVisibility(VISIBLE);

            });
        }

        for (int i = 0; i <btnInputs.length; i++) {
            int numI = i;
            btnInputs[i].setOnClickListener(v -> {
                if (btnDisplaySelected != -1){
                    btnDisplays[btnDisplaySelected].setText(String.valueOf(numI + 1));

                }
                btnOverInput.setVisibility(INVISIBLE);
            });
//            guniasd
        }
    }
}