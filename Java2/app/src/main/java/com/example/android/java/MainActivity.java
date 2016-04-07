package com.example.android.java;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.java.R;

import java.text.NumberFormat;
/**
 * prikazuje naruđbu naručene kave
 */
public class MainActivity extends ActionBarActivity {
    int kolicina = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * metoda koja se poziva pritiskom na dugme
     */
    public void submitOrder(View view) {

        display(kolicina);
        displayPrice(7*kolicina);
    }
    /**
     * prikazuje količinu na ekranu
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * prikazuje cijenu na ekranu
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * metoda za dugme plus(increment)
     */
    public void increment(View view) {
        kolicina =  kolicina + 1;
        display(kolicina);
    }

    /**
     * metoda za dugme minus(decrement)
     */


    public void decrement(View view) {
        kolicina = kolicina - 1;
        display(kolicina);
    }
}
