package com.example.projek_akhir_kba_muhammadwildanarrafisohib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import com.example.projek_akhir_kba_muhammadwildanarrafisohib.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = binding.etUsernamaRegister.getText().toString().trim();
                String email = binding.etEmailRegister.getText().toString().trim();
                String password = binding.etPasswordRegister.getText().toString().trim();

                if (TextUtils.isEmpty(username)) {
                    binding.etUsernamaRegister.setError("Username harus diisi!");
                } else if (TextUtils.isEmpty(email)) {
                    binding.etEmailRegister.setError("Email harus diisi !");
                } else if (TextUtils.isEmpty(password)) {
                    binding.etPasswordRegister.setError("Password harus diisi !");
                }else{
                    register(username,email,password);
                }
            }
        });
    }


}