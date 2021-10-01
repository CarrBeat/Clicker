package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer coin = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("coin", coin);
    }

    public void onClickBtnAddCoins(View view) {
        TextView coinView = (TextView)findViewById(R.id.coin);
        coin++;
        if (coin > 100){
            coinView.setTextSize(45);
        }
        if (coin > 1000){
            coinView.setTextSize(40);
        }
        if (coin > 10000){
            coinView.setTextSize(35);
        }
        if (coin > 100000){
            coinView.setTextSize(30);
        }
        if (coin > 1000000){
            coinView.setTextSize(25);
        }
            coinView.setText(coin.toString());
    }
    private void resetUI() {
        ((TextView) findViewById(R.id.coin)).setText(coin.toString());
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("coin")) {
            coin = savedInstanceState.getInt("coin");
        }
        resetUI();
    }

}