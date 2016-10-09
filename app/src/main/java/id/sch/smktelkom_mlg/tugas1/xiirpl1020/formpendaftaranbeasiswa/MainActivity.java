package id.sch.smktelkom_mlg.tugas1.xiirpl1020.formpendaftaranbeasiswa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TVnama, TVHobi, TVJurusan, TVAlamat;
    EditText ETNama, ETAlamat;
    RadioButton RBLk, RBWn;
    CheckBox CBNyan, CBGam, CBOl, CBBa;
    Spinner spinnerJurus;
    Button butOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVnama = (TextView) findViewById(R.id.textViewNama);
        TVHobi = (TextView) findViewById(R.id.textViewHobi);
        TVJurusan = (TextView) findViewById(R.id.textViewJurusan);
        TVAlamat = (TextView) findViewById(R.id.textViewAlamat);
        ETNama = (EditText) findViewById(R.id.editTextNama);
        ETAlamat = (EditText) findViewById(R.id.editTextAlamat);
        RBLk = (RadioButton) findViewById(R.id.radioButtonLk);
        RBWn = (RadioButton) findViewById(R.id.radioButtonWn);
        CBNyan = (CheckBox) findViewById(R.id.CBNyanyi);
        CBGam = (CheckBox) findViewById(R.id.CBGambar);
        CBOl = (CheckBox) findViewById(R.id.CBOlah);
        CBBa = (CheckBox) findViewById(R.id.CBBaca);
        spinnerJurus = (Spinner) findViewById(R.id.spinnerJurusan);
        butOK = (Button) findViewById(R.id.buttonOK);
    }

}
