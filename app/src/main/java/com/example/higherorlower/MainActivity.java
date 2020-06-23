package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private static int numGuessed = 0, actualNum = 0;
    private static Random rand = new Random();
    public void guess(View view)
    {
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        numGuessed = Integer.parseInt(guessEditText.getText().toString());
        if (numGuessed > actualNum) Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        else if (numGuessed < actualNum) Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        else
        {
            Toast.makeText(this, "You got it! Can you do it again?", Toast.LENGTH_SHORT).show();
            actualNum = rand.nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actualNum = rand.nextInt(20) + 1;
    }
}