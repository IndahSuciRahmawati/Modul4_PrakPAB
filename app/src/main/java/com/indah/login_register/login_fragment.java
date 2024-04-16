package com.indah.login_register;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class login_fragment extends Fragment {

    public login_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_login_fragment, container, false);

        final EditText etUsername = view.findViewById(R.id.etUsername);
        final EditText etPassword = view.findViewById(R.id.etPassword);
        Button btnLoginSubmit = view.findViewById(R.id.btnLoginSubmit);

        btnLoginSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                // Buat Intent untuk berpindah ke LoginSuccessActivity
                Intent intent = new Intent(getActivity(), login_succses.class);

                // Sisipkan data ke Intent
                intent.putExtra("username", username);
                intent.putExtra("password", password);

                // Mulai LoginSuccessActivity dengan Intent yang sudah disiapkan
                startActivity(intent);
            }
        });

        return view;
    }
}



