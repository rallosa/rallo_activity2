package com.example.rallo_activity.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityB extends ActivityRallosa {
    Button buttonC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        buttonC = (Button) findViewById(R.id.buttonC);
        resultText = (EditText) findViewById(R.id.resultText);
    }

    public void onBackPressed() {
        Log.i(super.LOG_I_TEG, this.getLocalClassName() + ".onBackPressed()");
        super.onBackPressed();
    }

}
