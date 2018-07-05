package suliteos.blooddonation;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class SignUpHospital extends AppCompatActivity implements View.OnClickListener {
    private TextInputEditText inputhospitalName,inputEmail,inputPassword,inputhospitalAddress, inputaverageBloodRequired, inputpersonsInCharge;
    private AppCompatButton signUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital_sign_up);

        inputhospitalName = findViewById(R.id.input_hospital_name);
        inputEmail = findViewById(R.id.input_email);
        inputPassword = findViewById(R.id.input_password);
        inputhospitalAddress = findViewById(R.id.input_hospital_address);
        inputaverageBloodRequired = findViewById(R.id.input_average_blood_required);
        inputpersonsInCharge = findViewById(R.id.input_person_in_charge);
        signUp = findViewById(R.id.btn_signup);
    }

    @Override
    public void onClick(View view) {
        if (view==signUp){
            registerAsHospital();
        }
    }

    private void registerAsHospital() {
        String hospitalName = Objects.requireNonNull(inputhospitalName.getText()).toString().trim();
        String hospitalEmail = Objects.requireNonNull(inputhospitalName.getText()).toString().trim();
        String hospitalPassword = Objects.requireNonNull(inputPassword.getText()).toString().trim();
        String hospitalAddress = Objects.requireNonNull(inputhospitalAddress.getText()).toString().trim();
        String averageBlood = Objects.requireNonNull(inputaverageBloodRequired.getText()).toString().trim();
        String personRequired = Objects.requireNonNull(inputpersonsInCharge.getText()).toString().trim();

        if (TextUtils.isEmpty(hospitalName)) {
            Toast.makeText(getApplicationContext(), "Please enter hospital name", Toast.LENGTH_LONG).show();
        } else {
            if (TextUtils.isEmpty(hospitalEmail)) {
                Toast.makeText(getApplicationContext(), "Please enter your hospital email address", Toast.LENGTH_LONG).show();
            } else {
                if (TextUtils.isEmpty(hospitalPassword)) {
                    Toast.makeText(getApplicationContext(), "Please enter your password", Toast.LENGTH_LONG).show();
                }
            }
            if (TextUtils.isEmpty(hospitalAddress)) {
                Toast.makeText(getApplicationContext(), "Please enter hospital address", Toast.LENGTH_LONG).show();
            } else {
                if (TextUtils.isEmpty(averageBlood)) {
                    Toast.makeText(getApplicationContext(), "Please enter hospital address", Toast.LENGTH_LONG).show();
                } else {
                    if (TextUtils.isEmpty(personRequired)) {
                        Toast.makeText(getApplicationContext(), "Please enter how many persons are in charge", Toast.LENGTH_LONG).show();
                    }
                }
            }
        }
    }
}