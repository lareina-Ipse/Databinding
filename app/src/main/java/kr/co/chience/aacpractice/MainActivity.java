package kr.co.chience.aacpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.app.ActivityManager;
import android.os.Bundle;

import kr.co.chience.aacpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);

        MainViewModel viewModel = ViewModelProviders
                .of(this)
                .get(MainViewModel.class);

        viewModel.getUser().observe(this, user -> {
            binding.setViewmodel(viewModel);
            binding.setUser(user);
        });


    }
}
