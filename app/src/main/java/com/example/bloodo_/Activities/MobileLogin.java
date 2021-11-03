package com.example.bloodo_.Activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.bloodo_.R;
import com.example.bloodo_.UI.OtpEditText;

public class MobileLogin extends AppCompatActivity {

    private ImageView backBtn;
    private EditText pincode;
    private EditText mobileNumber;
    private AppCompatButton getOtp;
    private AlertDialog dialog;
    private AlertDialog.Builder dialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_login);

        backBtn = (ImageView) findViewById(R.id.verifyNumberBackBtn);
        pincode = (EditText) findViewById(R.id.pincodeId);
        mobileNumber = (EditText) findViewById(R.id.numberId);
        getOtp = (AppCompatButton) findViewById(R.id.getOtp);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MobileLogin.this, LoginActivity.class));
                finish();
            }
        });

        getOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!pincode.getText().toString().isEmpty()
                        && !mobileNumber.getText().toString().isEmpty()) {
                    setAlertDialog();
                } else {
                    Toast.makeText(MobileLogin.this,
                            "Please enter pincode and mobile number!!", Toast.LENGTH_SHORT).show();
                }
            }

            private void setAlertDialog() {
                dialogBuilder = new AlertDialog.Builder(MobileLogin.this);
                View view = getLayoutInflater().inflate(R.layout.popup, null);
                OtpEditText otpEditText = (OtpEditText) view.findViewById(R.id.et_otp);
                AppCompatButton okBtn = (AppCompatButton) view.findViewById(R.id.okButton);
                AppCompatButton resendBtn = (AppCompatButton) view.findViewById(R.id.resendBtn);

                dialogBuilder.setView(view);
                dialog = dialogBuilder.create();
                dialog.show();

                okBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!otpEditText.getText().toString().isEmpty()) {
                            dialog.dismiss();
                            startActivity(new Intent(MobileLogin.this, HomeActivity.class));
                            finish();
                        } else {
                            Toast.makeText(MobileLogin.this, "Please enter correct OTP!!", Toast.LENGTH_LONG).show();
                        }
                    }
                });

                resendBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MobileLogin.this, "Resend OTP", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}