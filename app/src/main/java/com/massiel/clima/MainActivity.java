package com.massiel.clima;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by payerdis on 10/6/15.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Button buttonBuscar = (Button) findViewById(R.id.button_buscar);

        buttonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText_ciudad = (EditText) findViewById(R.id.editText_ciudad);
                String ciudad = editText_ciudad.getText().toString();

                int temperatura = temperatura();

                int icon;
                if(temperatura >= 25 )
                    icon = R.drawable.sunny;
                else
                    icon = R.drawable.cloudy;

                TextView textMensaje = (TextView)findViewById(R.id.text_message);
                textMensaje.setCompoundDrawablesWithIntrinsicBounds(icon, 0, 0, 0);
                textMensaje.setText(String.valueOf(temperatura) + " C");
                textMensaje.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,ciudad, Toast.LENGTH_LONG).show();
            }
        });
    }

    private int temperatura() {
        return (int) (Math.random() * 20 + 20);
    }

}

