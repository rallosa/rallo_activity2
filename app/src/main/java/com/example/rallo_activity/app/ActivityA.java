package com.example.rallo_activity.app;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityA extends ActivityRallosa {
    Button buttonB;
    Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        resultText = (EditText) findViewById(R.id.resultText);

    }

    public void onBackPressed() {
        Log.i(super.LOG_I_TEG, this.getLocalClassName() + ".onBackPressed()");
        super.onBackPressed();
    }
    public void onMyButtonClick(View view)
    {
        // выводим сообщение
        //Toast.makeText();

        Toast.makeText(this, "Зачем вы нажали?", Toast.LENGTH_SHORT).show();
    }
}
