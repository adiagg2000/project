package com.example.dell.project;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=2;
    public void Increment(View view){

        quantity=quantity+1;
        display(quantity);

    }


    public void Decrement(View view){
        quantity=quantity-1;
        display(quantity);

    }


public void submitOrder(View view){
        display(quantity);
        displayPrice(quantity*5);
}

private void display(int number){
    TextView quantityTextView = (TextView) findViewById(
            R.id.quantity_text_view);
    quantityTextView.setText("" + number);

}

private void displayPrice(int number){
    TextView priceTextView = (TextView) findViewById(
            R.id.price_text_view);
    priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
