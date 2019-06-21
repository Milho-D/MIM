package com.example.mim.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.mim.R;
import com.example.mim.model.Agence;
import com.example.mim.model.Vehicule;

public class NewVehiculeActivity extends AppCompatActivity {

    private EditText editNumeroSerieView;
    private EditText editMarqueView;
    private EditText editImmatriculationView;
    private EditText editAgenceView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicule_form);
        editNumeroSerieView = findViewById(R.id.edit_v_numserie);
        editMarqueView = findViewById(R.id.edit_v_marque);
        editImmatriculationView = findViewById(R.id.edit_v_immat);
        editAgenceView = findViewById(R.id.edit_v_agence);

        final Button button = findViewById(R.id.v_btn_save);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                if (TextUtils.isEmpty(editNumeroSerieView.getText()) &&
                    TextUtils.isEmpty((editMarqueView.getText())) &&
                    TextUtils.isEmpty(editImmatriculationView.getText()) &&
                    TextUtils.isEmpty(editAgenceView.getText())) {

                    setResult(RESULT_CANCELED, intent);
                } else {
                    String numeroSerie = editNumeroSerieView.getText().toString();
                    String marque = editMarqueView.getText().toString();
                    String immatriculation = editImmatriculationView.getText().toString();
                    String agence = editAgenceView.getText().toString();
                    Vehicule vehicule = new Vehicule(numeroSerie,marque,immatriculation, 0.0,false,false,Integer.parseInt(agence));

                    intent.putExtra("vehicule", vehicule);

                    setResult(RESULT_OK, intent);
                }
                finish();
            }
        });
    }
}
