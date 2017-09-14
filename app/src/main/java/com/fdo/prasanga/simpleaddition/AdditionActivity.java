package com.fdo.prasanga.simpleaddition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdditionActivity extends AppCompatActivity {

    EditText et_num1, et_num2;
    TextView answer;
    Button btn_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        et_num1 = (EditText)findViewById(R.id.et_num1);
        et_num2 = (EditText)findViewById(R.id.et_num2);
        answer = (TextView)findViewById(R.id.tv_answer);
        btn_add = (Button)findViewById(R.id.btn_add);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(et_num1.getText().toString());
                int num2 = Integer.parseInt(et_num2.getText().toString());
                int output = num1 + num2;

               answer.setText(Integer.toString(output));
            }
        });
    }
}
