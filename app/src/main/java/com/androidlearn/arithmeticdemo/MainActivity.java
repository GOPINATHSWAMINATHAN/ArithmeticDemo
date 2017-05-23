package com.androidlearn.arithmeticdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText input;
    Button process;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=(EditText)findViewById(R.id.input);
        process=(Button)findViewById(R.id.process_button);
        output=(TextView)findViewById(R.id.output);
        //anonymous inner class
        //interface-->functional interface(anonymous inner class)
        //That interface has only one method to implement.
        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int a=Integer.parseInt(input.getText().toString());
                Integer b=a*a;
                output.setText(b.toString());
            }
        });
    }
}
