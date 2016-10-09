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

    TextView textViewNama, textViewHobi, textViewJurusan, textViewAlamat;
    EditText editTextNama, editTextAlamat;
    RadioButton radioButtonLk, radioButtonWn;
    CheckBox CBNyanyi, CBGambar, CBOlah, CBBaca;
    Spinner spinnerJurusan;
    Button buttonOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
