package suliteos.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private AppCompatButton loginButton;
    private TextInputEditText inputEmail,inputPassword;
    private TextView signUpAsDonor,signUpAsHospital;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputEmail = findViewById(R.id.input_email);
        inputPassword = findViewById(R.id.input_password);
        loginButton = findViewById(R.id.btn_login);
        signUpAsDonor = findViewById(R.id.link_donor_sign_up);
        signUpAsHospital = findViewById(R.id.link_hospital_sign_up);

        loginButton.setOnClickListener(this);
        signUpAsDonor.setOnClickListener(this);
        signUpAsHospital.setOnClickListener(this);
    }

    private void userLogin(){
        String name = Objects.requireNonNull(inputEmail.getText()).toString().trim();
        String email = Objects.requireNonNull(inputPassword.getText()).toString().trim();

        if (TextUtils.isEmpty(name)){
            Toast.makeText(this,"Please enter your registered email",Toast.LENGTH_LONG).show();
        }else {
            if (TextUtils.isEmpty(email)){
                Toast.makeText(this,"Please enter your registered password",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this,"Logged In",Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onClick(View view) {
        if (view==loginButton){
            userLogin();
        }
        if (view==signUpAsDonor){
            finish();
            startActivity(new Intent(this,SignUpDonor.class));
        }
        if (view==signUpAsHospital){
            finish();
            startActivity(new Intent(this,SignUpHospital.class));
        }
    }
}