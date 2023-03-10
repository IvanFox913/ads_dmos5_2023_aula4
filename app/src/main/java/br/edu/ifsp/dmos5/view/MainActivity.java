package br.edu.ifsp.dmos5.view;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import br.edu.ifsp.dmos5.R;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerPayer;
    private Spinner spinnerReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerPayer = (Spinner) findViewById(R.id.payer_player_spinner);
        spinnerPayer.setOnItemSelectedListener(this);

        String[] listPlayer = getResources().getStringArray(R.array.list_player_spinner);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,listPlayer);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPayer.setAdapter(aa);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        //Toast.makeText(getApplicationContext(), position , Toast.LENGTH_LONG).show();
    }
}