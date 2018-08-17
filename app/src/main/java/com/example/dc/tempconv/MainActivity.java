package com.example.dc.tempconv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup g1, g2;
    RadioButton r1, r2;
    EditText e1;
    TextView t1;
    Button b1;

    double num;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g1 = (RadioGroup)findViewById(R.id.rg1);
        g2 = (RadioGroup)findViewById(R.id.rg2);
        b1 = (Button)findViewById(R.id.button);
        t1 = (TextView)findViewById(R.id.textView3);
        e1 = (EditText)findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r1 = (RadioButton)findViewById(g1.getCheckedRadioButtonId());
                r2 = (RadioButton)findViewById(g2.getCheckedRadioButtonId());

                switch (r1.getId())
                {
                    case R.id.radioButton:
                        num = Double.parseDouble(e1.getText().toString());
                        switch (r2.getId())
                        {
                            case R.id.radioButton3:
                                num *= 5.8588;
                                t1.setText(""+num+" TL");
                                break;
                            case R.id.radioButton4:
                                t1.setText(""+num+" USD");
                        }
                        break;
                    case R.id.radioButton2:
                        num = Double.parseDouble(e1.getText().toString());
                        switch (r2.getId())
                        {
                            case R.id.radioButton3:
                                num /= 5.8588;
                                t1.setText(""+num+" USD");
                                break;
                            case R.id.radioButton4:
                                t1.setText(""+num+" TL");
                        }
                        break;


                }
            }
        });
    }
}
