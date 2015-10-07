package com.massiel.clima;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

                Toast.makeText(MainActivity.this,ciudad, Toast.LENGTH_LONG).show();
            }
        });
    }


}

