package com.example.nvv.testlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.nvv.mylibrary.MyMathClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickbtn(View view) {

        int i = MyMathClass.opPlus(9, 4);
        ((TextView) findViewById(R.id.tv)).setText(i + "");

    }

}
