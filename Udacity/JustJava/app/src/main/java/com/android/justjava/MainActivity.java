package com.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantity;
    int price;
    int pricePerCup = 2;
    int chocoTopping;
    int wCreamTopping;
    //double totalOrderPrice;
    CheckBox whippedCreamCheckBox;
    CheckBox chocolateCheckBox;
    TextView quantityTextView;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void increment(View view) {

        if (quantity == 100) {
            Toast.makeText(this, "You cannot have more than 100 coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void decrement(View view) {
        if (quantity == 1) {
            Toast.makeText(this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * Calculates the price of the order based on the current quantity.
     *
     * @param //quantity    is number of coffee cups ordered
     * @param //pricePerCup is the price for one cup of coffee
     * @param chocoTopping  is whether or not the user wants topping added
     * @param wCreamTopping is whether or not the user wants topping added
     * @param //name        is the name of the customer
     * @return the price
     */
    private int calculatePrice(boolean chocoTopping, boolean wCreamTopping) {
        int quantity = Integer.valueOf(quantityTextView.getText().toString());
        price = quantity * pricePerCup;
        int basePrice = 2;

        //add $1 if the user wants chocolate
        if (chocoTopping) {
            basePrice = basePrice + 1;
        }
        //add $2 if the user wants whippedCream
        if (wCreamTopping)
            basePrice = basePrice + 2;
        //calculate the total order price by multiplying by the quantity
        return basePrice * quantity;
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View View) {

        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        // Log.v("MainActivity", "Name: " + name);

        whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_box);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_box);
        boolean hasChocolate = chocolateCheckBox.isChecked();

        quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantity = Integer.valueOf(quantityTextView.getText().toString());

        int price = calculatePrice(hasChocolate, hasWhippedCream);
        String priceMessage = createOrderSummary(price, hasWhippedCream, hasChocolate, name);
        displayMessage(priceMessage);


//        Intent intent = new Intent(Intent.ACTION_CALL);
//        intent.setData(Uri.parse("tel:7085296472"));
//        intent.putExtra(Intent.EXTRA_SUBJECT, priceMessage);
//        this.startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
    }

//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("geo:47.6,-122.3"));
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
    //        }


    /**
     * This method displays the given text on the screen.
     *
     * @return
     */
       private String createOrderSummary(double basePrice, boolean hasWhippedCream, boolean hasChocolate, String name) {
           String priceMessage = "Name: " + name;
           priceMessage += "\nAdd whipped cream? " + hasWhippedCream;
           priceMessage += "\nAdd chocolate? " + hasChocolate;
           priceMessage += "\nQuantity: " + quantity;
           priceMessage += "\nTotal: $" + basePrice;
           priceMessage += "\nThank you!";
           return priceMessage;

        //String formattedString = new StringBuilder();
//                .append("Name: " + name)
//                .append("\n")
//                .append("Add whipped cream?: " + hasWhippedCream)
//                .append("\n")
//                .append("Add chocolate?: " + hasChocolate)
//                .append('\n')
//                .append("Quantity: ")
//                .append(quantity)
//                .append('\n')
//                .append("Total: ")
//                .append("$" + basePrice)
//                .append('\n')
//                .append("Thank you")
//                .toString();
       }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

     private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

}
/*
//TextView textView = new TextView(this);
//textView.setText("Wwwwwwwwwwwwowowowowowowowowowowowowoowowowowoowowowooowoowoowow!");
//textView.setTextSize(40);
//textView.setTextColor(Color.GREEN);
//textView.setMaxLines(2);
//setContentView(textView);

//        String testMessage = "Hi Alex";
//        Log.wtf("Message", testMessage);
//        testMessage = newDisplayMessage(testMessage);
//        testMessage = testMessage + " Ramos";
//        Log.wtf("Message", testMessage);


//int myNumber = 3;

//int finalNumber  = plusFive(myNumber);

//System.out.println(finalNumber);


//private int plusFive(int pizza){
//  int price = pizza + 5;

//  return price;

*/