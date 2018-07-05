package suliteos.blooddonation;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;

public class SignUpDonor extends AppCompatActivity implements View.OnClickListener {
    private TextInputEditText inputName,inputEmail,inputPhone,inputAddress,inputBloodType,inputDonated;
    private AppCompatButton signUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donor_sign_up);
        inputName = findViewById(R.id.input_name);
        inputEmail = findViewById(R.id.input_email);
        inputPhone = findViewById(R.id.input_phone);
        inputAddress = findViewById(R.id.input_address);
        inputBloodType = findViewById(R.id.input_blood_type);
        inputDonated = findViewById(R.id.input_donated);
        signUp = findViewById(R.id.btn_signup);

        signUp.setOnClickListener(this);
    }

    private void registerAsDonor() {
        String donarName = Objects.requireNonNull(inputName.getText()).toString().trim();
        String donarEmail = Objects.requireNonNull(inputEmail.getText()).toString().trim();
        String phone = Objects.requireNonNull(inputPhone.getText()).toString().trim();
        String address = Objects.requireNonNull(inputAddress.getText()).toString().trim();
        String bloodType = Objects.requireNonNull(inputBloodType.getText()).toString();
        String donate = Objects.requireNonNull(inputDonated.getText()).toString();

        if (TextUtils.isEmpty(donarName)) {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show();
        } else {
            if (TextUtils.isEmpty(donarEmail)) {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_LONG).show();
            } else {
                if (TextUtils.isEmpty(phone)) {
                    Toast.makeText(this, "Please enter your phone number", Toast.LENGTH_LONG).show();
                } else {
                    if (phone.length() < 10) {
                        Toast.makeText(this, "Phone number is too short,enter a minimum of 10 numbers", Toast.LENGTH_LONG).show();
                    } else {
                        if (TextUtils.isEmpty(address)) {
                            Toast.makeText(this, "Please enter your address", Toast.LENGTH_LONG).show();
                        } else {
                            if (TextUtils.isEmpty(bloodType)) {
                                Toast.makeText(this, "Please enter your blood group", Toast.LENGTH_LONG).show();
                            } else {
                                if (TextUtils.isEmpty(donate)) {
                                    Toast.makeText(this, "Please enter when you last donated blood", Toast.LENGTH_LONG).show();
                                }else {
                                    Toast.makeText(this,"Signed Up As Donor",Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (view==signUp){
            registerAsDonor();
        }
    }
}