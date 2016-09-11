package id.sch.smktelkom_mlg.tugas01.xirpl5034.formbookingticket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    EditText etNO;
    Button bSub;
    TextView tvHasil;
    RadioButton rbLA, rbBA, rbWA, rbTA;
    CheckBox cbBL, cbMC, cbDS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etNO = (EditText) findViewById(R.id.editTextNO);
        bSub = (Button) findViewById(R.id.buttonSub);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        rbLA = (RadioButton) findViewById(R.id.radioButtonLA);
        rbBA = (RadioButton) findViewById(R.id.radioButtonBA);
        rbWA = (RadioButton) findViewById(R.id.radioButtonWA);
        rbTA = (RadioButton) findViewById(R.id.radioButtonTA);
        cbBL = (CheckBox) findViewById(R.id.checkBoxBL);
        cbMC = (CheckBox) findViewById(R.id.checkBoxMC);
        cbDS = (CheckBox) findViewById(R.id.checkBoxDS);



        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = etNama.getText().toString();
                int no = Integer.parseInt(etNO.getText().toString());
                String hasil = null;
                String layan = "Your Services :\n ";

                if (cbBL.isChecked()) {
                    layan += cbBL.getText() + "\n";
                }
                if (cbMC.isChecked()) {
                    layan += cbMC.getText() + "\n";
                }
                if (cbDS.isChecked()) {
                    layan += cbDS.getText() + "\n";
                }


                if (rbLA.isChecked()) {
                    hasil = rbLA.getText().toString();
                } else if (rbBA.isChecked()) {
                    hasil = rbBA.getText().toString();
                } else if (rbWA.isChecked()) {
                    hasil = rbWA.getText().toString();
                } else if (rbTA.isChecked()) {
                    hasil = rbTA.getText().toString();
                }
                if (hasil == null) {
                    tvHasil.setText("Please Choose Your Plane");
                } else {
                    tvHasil.setText("Name : " + nama + "\n" + "Number : " + no + "\n" + "Your Plane : " + hasil + "\n" + layan);
                }

            }
        });


    }
}
