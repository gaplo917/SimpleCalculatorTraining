package com.gaplotech.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// IF YOU ARE PLANNING TO USE JAVA FOR THIS TRAINING
public class SimpleCalculatorActivity extends AppCompatActivity {

  // ====================== DO NOT MODIFY START ============================
  TextView resultTextView;
  Button oneBtn;
  Button twoBtn;
  Button threeBtn;
  Button fourBtn;
  Button fiveBtn;
  Button sixBtn;
  Button sevenBtn;
  Button eightBtn;
  Button nineBtn;
  Button plusBtn;
  Button minusBtn;
  Button divideBtn;
  Button multiplyBtn;
  // ====================== DO NOT MODIFY END  ============================

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    // ====================== DO NOT MODIFY START ============================
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_simple_calculator);

    resultTextView = (TextView) findViewById(R.id.resultTextView);
    oneBtn = (Button) findViewById(R.id.oneBtn);
    twoBtn = (Button) findViewById(R.id.twoBtn);
    threeBtn = (Button) findViewById(R.id.threeBtn);
    fourBtn = (Button) findViewById(R.id.fourBtn);
    fiveBtn = (Button) findViewById(R.id.fiveBtn);
    sixBtn = (Button) findViewById(R.id.sixBtn);
    sevenBtn = (Button) findViewById(R.id.sevenBtn);
    eightBtn = (Button) findViewById(R.id.eightBtn);
    nineBtn = (Button) findViewById(R.id.nineBtn);
    plusBtn = (Button) findViewById(R.id.plusBtn);
    minusBtn = (Button) findViewById(R.id.minusBtn);
    divideBtn = (Button) findViewById(R.id.divideBtn);
    multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
    // ====================== DO NOT MODIFY END  ============================

    // Start writing your solution below this line
    // if you are not familiar with Android, there are some examples of how to handle UI
    // The example is NOT part of the solution, you can delete it anytime
    Log.d("Click","Going to set a resultTextView to 'Hello world!'");
    resultTextView.setText("Hello world!");

    oneBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        // do something when oneBtn is clicked
        Log.d("Click","One Button Clicked");
      }
    });

  }

}
