package com.example.rallo_activity.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;

//public class ActivityMain extends ActivityRallosa implements View.OnClickListener {
public class ActivityMain extends ActivityRallosa {
    //Button buttonA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buttonA = (Button) findViewById(R.id.buttonA);
        //buttonA.setOnClickListener(this);
/*
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonCClick(view);
            }
        });
*/
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        } else if ( resultCode == RESULT_OK ) {
            EditText oEditText = (EditText) findViewById(R.id.resultText);
            String resultText = data.getStringExtra("resultText");
            Log.i(LOG_I_TEG, " onActivityResult:  " + resultText);
            oEditText.setText(resultText);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
