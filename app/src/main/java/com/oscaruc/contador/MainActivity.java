package com.oscaruc.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final int[] mConteo = {0};
        final TextView mConteoTextView = findViewById(R.id.conteo_text_view);
        final Button mContarButton = findViewById(R.id.contar_button);
        final Button mReiniciarButton = findViewById(R.id.reiniciar_button);

        mContarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mConteo[0]++;
                mConteoTextView.setText(Integer.toString(mConteo[0]));
            }
        });

        mReiniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 mConteo[0] = 0;
                mConteoTextView.setText(Integer.toString(mConteo[0]));
            }
        });






    }
}
