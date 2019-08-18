package com.example.makwana.kyleenzweilerfishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.makwana.kyleenzweilerfishtracker.R;

/**
 * Displays the main screen.
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);
    }

    ///      MvpView methods       ///
    @Override
    public void showSignInScreen() {
        Toast.makeText(this,"Taking user to the Sign in screen",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this,"Taking user to the Sign up screen",Toast.LENGTH_SHORT).show();
    }
}