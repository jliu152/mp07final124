package edu.illinois.cs.cs125.mp07final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    public static final String EXTRA_NUMBER1 = "com.example.application.example.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 = "com.example.application.example.EXTRA_NUMBER2";
    public static final String EXTRA_NUMBER3 = "com.example.application.example.EXTRA_NUMBER3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2() {
        EditText editText1 = (EditText) findViewById(R.id.edittext1);
        String text = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.edittext2);
        int age = Integer.parseInt(editText2.getText().toString());

        EditText editText3 = (EditText) findViewById(R.id.edittext3);
        int weight = Integer.parseInt(editText3.getText().toString());

        EditText editText4 = (EditText) findViewById(R.id.edittext4);
        int height = Integer.parseInt(editText4.getText().toString());

        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_NUMBER1, age);
        intent.putExtra(EXTRA_NUMBER2, weight);
        intent.putExtra(EXTRA_NUMBER3, height);
        startActivity(intent);
    }
}
