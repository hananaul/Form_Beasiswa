package id.sch.smktelkom_mlg.tugas1.xiirpl1020.formpendaftaranbeasiswa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TVnama, TVHobi, TVJurusan, TVAlamat, TVHasil, TVHasil2, TVHasil3, TVHasil4, TVHasil5, TVHasil6;
    EditText ETNama, ETAlamat, ETEmail;
    RadioButton RBLk, RBWn;
    CheckBox CBNyan, CBGam, CBOl, CBBa;
    Spinner spJurus;
    Button butOK;
    RadioGroup RGJk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVHasil6 = (TextView) findViewById(R.id.textViewHasil6);
        spJurus = (Spinner) findViewById(R.id.spinnerJurusan);
        TVHasil5 = (TextView) findViewById(R.id.textViewHasil5);
        ETEmail = (EditText) findViewById(R.id.editTextEmail);
        TVHasil4 = (TextView) findViewById(R.id.textViewHasil4);
        TVHasil3 = (TextView) findViewById(R.id.textViewHasil3);
        TVHasil2 = (TextView) findViewById(R.id.textViewHasil2);
        TVHasil = (TextView) findViewById(R.id.textViewHasil);
        TVnama = (TextView) findViewById(R.id.textViewNama);
        TVHobi = (TextView) findViewById(R.id.textViewHobi);
        TVJurusan = (TextView) findViewById(R.id.textViewJurusan);
        TVAlamat = (TextView) findViewById(R.id.textViewAlamat);
        ETNama = (EditText) findViewById(R.id.editTextNama);
        ETAlamat = (EditText) findViewById(R.id.editTextAlamat);
        RBLk = (RadioButton) findViewById(R.id.radioButtonLk);
        RBWn = (RadioButton) findViewById(R.id.radioButtonWn);
        RGJk = (RadioGroup) findViewById(R.id.RadioGrup);
        CBNyan = (CheckBox) findViewById(R.id.CBNyanyi);
        CBGam = (CheckBox) findViewById(R.id.CBGambar);
        CBOl = (CheckBox) findViewById(R.id.CBOlah);
        CBBa = (CheckBox) findViewById(R.id.CBBaca);
        spJurus = (Spinner) findViewById(R.id.spinnerJurusan);
        butOK = (Button) findViewById(R.id.buttonOK);


        butOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
            }
        });
    }

    private void doProcess() {
        if (isValid()) ;
    }

    private boolean isValid() {

        boolean valid = true;

        String nama = ETNama.getText().toString();
        if (nama.isEmpty()) {
            ETNama.setError("Nama Belum Diisi");
            valid = false;
        } else
            TVHasil.setText("Nama\t\t\t\t: " + nama);

        String alamat = ETAlamat.getText().toString();
        if (alamat.isEmpty()) {
            ETAlamat.setError("Alamat Belum Diisi");
            valid = false;
        } else
            TVHasil2.setText("Alamat\t\t\t: " + alamat);

        String email = ETEmail.getText().toString();
        if (email.isEmpty()) {
            ETEmail.setError("Email Belum Diisi");
            valid = false;
        } else
            TVHasil5.setText("Email\t\t\t: " + alamat);

        String hasil = null;
        if (RBLk.isChecked()) {
            hasil = RBLk.getText().toString();
            TVHasil3.setText("Jenis Kelamin\t\t: Laki-Laki");
            valid = true;
        } else if (RBWn.isChecked()) {
            hasil = RBWn.getText().toString();
            TVHasil3.setText("Jenis Kelamin\t\t: Wanita");
            valid = true;
        }

        String hobi = "Hobi anda\t\t: ";
        int startlen = hobi.length();
        if (CBBa.isChecked()) hobi += CBBa.getText() + ", ";
        if (CBNyan.isChecked()) hobi += CBNyan.getText() + ", ";
        if (CBOl.isChecked()) hobi += CBOl.getText() + ", ";
        if (CBGam.isChecked()) hobi += CBGam.getText() + ", ";
        if (hobi.length() == startlen) hobi += "Tidak ada";
        TVHasil4.setText(hobi);

        TVHasil6.setText("Pilihan Jurusan : " + spJurus.getSelectedItem().toString());

        return true;
    }


}
