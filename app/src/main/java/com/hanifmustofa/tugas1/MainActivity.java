package com.hanifmustofa.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    int harga_tiket = 35000;
    int total_harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.edit_text);

        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                total_harga = Integer.parseInt(editText.getText().toString()) * harga_tiket;
                Toast.makeText(getApplicationContext(), " Pesanan Anda Berhasil, Total Harga: " + String.valueOf(total_harga) , Toast.LENGTH_LONG).show();
            }
        });

    }


}
