package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button Add_button;
    Button Sub_button;
    TextView result;
    TextView dif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=(EditText) findViewById(R.id.editText_first_no);
        number2=(EditText) findViewById(R.id.editText_second_no);
        Add_button=(Button) findViewById(R.id.add_button);
        Sub_button = (Button) findViewById(R.id.sub_button);
        result = (TextView) findViewById(R.id.editview_answer);
        dif = (TextView) findViewById(R.id.textView_diff) ;
        Add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 =
                        Double.parseDouble(number1.getText().toString());
                double num2 =
                        Double.parseDouble(number2.getText().toString());
                double sum = num1 + num2;

                result.setText(Double.toString(sum));
            }
        });
        Sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 =
                        Double.parseDouble(number1.getText().toString());
                double num2 =
                        Double.parseDouble(number2.getText().toString());
                double diff = num1-num2;
                dif.setText(Double.toString(diff));
            }
        });
    }
}



<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    tools:layout_editor_absoluteY="81dp">

    <EditText
        android:id="@+id/editview_answer"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:layout_marginLeft="100dp"
        android:layout_marginTop="300dp"
        android:inputType="number" />
    <TextView
        android:id="@+id/textView_answer"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:layout_marginLeft="30dp"
        android:layout_marginTop="300dp"
        android:textSize="20dp"
        android:textStyle="bold" />

    <TextView
        android:id="@+id/textView_diff"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:layout_marginLeft="200dp"
        android:layout_marginTop="300dp"
        android:textSize="20dp"
        android:textStyle="bold" />

    <EditText
        android:id="@+id/editText_first_no"
        android:layout_width="150dp"
        android:layout_height="50dp"
        android:layout_marginLeft="200dp"
        android:layout_marginTop="40dp"
        android:inputType="number" />
    <!-- for message input first number-->
    <TextView
        android:id="@+id/textView_first_no"
        android:layout_width="150dp"
        android:layout_height="50dp"
        android:layout_marginLeft="10dp"
        android:layout_marginTop="50dp"
        android:text="First number"
        android:textSize="20dp" />
    <!--view message -->
    <TextView
        android:id="@+id/textView_second_no"
        android:layout_width="150dp"
        android:layout_height="50dp"
        android:layout_marginLeft="10dp"
        android:layout_marginTop="100dp"
        android:text="Second number"
        android:textSize="20dp" />
    <!-- take input for second number -->
    <EditText
        android:id="@+id/editText_second_no"
        android:layout_width="150dp"
        android:layout_height="50dp"
        android:layout_marginLeft="200dp"
        android:layout_marginTop="90dp"
        android:inputType="number"
        tools:ignore="MissingConstraints" />

    <Button
        android:id="@+id/add_button"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:layout_marginLeft="110dp"
        android:layout_marginTop="200dp"
        android:text="ADD" />

    <Button
        android:id="@+id/sub_button"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:layout_marginLeft="220dp"
        android:layout_marginTop="200dp"
        android:text="SUB" />
</RelativeLayout>
