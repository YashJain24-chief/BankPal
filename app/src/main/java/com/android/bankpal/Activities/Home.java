package com.android.bankpal.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.bankpal.R;

public class Home extends AppCompatActivity {

    Animation anim;
    ImageView bankLogo;
    TextView tvBankTitle;
    ImageView imageAllUsers, imageAllTransactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        anim = AnimationUtils.loadAnimation(this, R.anim.animation);
        bankLogo = findViewById(R.id.bank_logo);
        imageAllUsers = findViewById(R.id.customerButton);
        imageAllTransactions = findViewById(R.id.TransactionButton);
        tvBankTitle = findViewById(R.id.bank_title);

        bankLogo.setAnimation(anim);
        tvBankTitle.setAnimation(anim);
        imageAllUsers.setAnimation(anim);
        imageAllTransactions.setAnimation(anim);
    }

    public void showAllUsers(View view) {
        Intent intent = new Intent(this, UsersList.class);
        startActivity(intent);
    }

    public void showAllTransactions(View view) {
        Intent intent = new Intent(this, TransactionHistory.class);
        startActivity(intent);
    }
}