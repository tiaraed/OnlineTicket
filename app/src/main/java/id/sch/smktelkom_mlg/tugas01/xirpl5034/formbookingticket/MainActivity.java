package id.sch.smktelkom_mlg.tugas01.xirpl5034.formbookingticket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    EditText etNO;
    Button bSub;
    TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etNO = (EditText) findViewById(R.id.editTextNO);
        bSub = (Button) findViewById(R.id.buttonSub);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = etNama.getText().toString();
                int no = Integer.parseInt(etNO.getText().toString());
                tvHasil.setText("Nama : " + nama + "\n" + "Number : " + no);

            }
        });


    }
}
