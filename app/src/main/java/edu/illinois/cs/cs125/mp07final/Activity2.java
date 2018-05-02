package edu.illinois.cs.cs125.mp07final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int age = intent.getIntExtra(MainActivity.EXTRA_NUMBER1, 0);
        int weight = intent.getIntExtra(MainActivity.EXTRA_NUMBER2, 0);
        int height = intent.getIntExtra(MainActivity.EXTRA_NUMBER3, 0);
        double calories = (6.23 + 4.35) / 2 * weight + (12.7 + 6.7) / 2 * height - (6.8 + 4.7) / 2 * age + (66 + 655) / 2;
        double bmi = (weight * 0.453592) / ((height * 0.0254) * (height * 0.0254));
        String sentence = "";
        if (bmi < 18.5) {
            sentence = " You are underweight.";
        } else if (bmi >= 18.5 && bmi < 25 ) {
            sentence = " You are healthy.";
        } else if (bmi >= 25 && bmi < 29.9 ) {
            sentence = " You are overweight.";
        } else {
            sentence = " You are obese.";
        }

        TextView textView1 = (TextView) findViewById(R.id.textview1);
        TextView textView2 = (TextView) findViewById(R.id.textview2);
        TextView textView3 = (TextView) findViewById(R.id.textview3);
        TextView textView4 = (TextView) findViewById(R.id.textview4);
        TextView textView5 = (TextView) findViewById(R.id.textview5);
        TextView textView6 = (TextView) findViewById(R.id.textview6);

        textView1.setText("Name: " + text);
        textView2.setText("Age: " + age);
        textView3.setText("Weigth: " + weight + " pounds");
        textView4.setText("Height: " + height + " inches");
        textView5.setText("Calories needed: " + calories);
        textView6.setText(sentence);


    }
}
