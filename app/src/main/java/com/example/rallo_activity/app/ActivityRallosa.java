package com.example.rallo_activity.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ActivityRallosa extends Activity {
    protected final String LOG_I_TEG = "RALLOSA";
    static final int PICK_CONTACT_REQUEST_A = 1;
    static final int PICK_CONTACT_REQUEST_B = 2;
    static final int PICK_CONTACT_REQUEST_C = 3;
    EditText resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onCreate()");
    }
    protected void onStart() {
        super.onStart();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onStart()");
    }
    protected void onRestart() {
        super.onRestart();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onRestart()");
    }
    protected void onResume() {
        super.onResume();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onResume()");
    }
    protected void onPause() {
        super.onPause();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onPause()");
    }
    protected void onStop() {
        super.onStop();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onStop()");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onDestroy()");
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onActivityResult()");
    }

    public void onBackPressed() {
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onBackPressed()");
    }

    public void onButtonAClick(View view) {
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onButtonAClick()");
        Intent intent = new Intent(this, com.example.rallo_activity.app.ActivityA.class);
        startActivityForResult(intent, ActivityMain.PICK_CONTACT_REQUEST_A);
    }
    public void onButtonBClick(View view) {
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onButtonBClick()");
        Intent intent = new Intent(this, com.example.rallo_activity.app.ActivityB.class);
        startActivityForResult(intent, ActivityMain.PICK_CONTACT_REQUEST_B);
    }

    public void onButtonCClick(View view) {
        Log.i(LOG_I_TEG, this.getLocalClassName() + ".onButtonCClick()");
        Intent intent = new Intent(this, ActivityC.class);
        String defaultText = resultText.getText().toString();

        Log.i(LOG_I_TEG, this.getLocalClassName() + " defaultText = " + defaultText);
        intent.putExtra("defaultText", defaultText);
        //startActivity(intent); //  Запуск Активити
        // Запуск Активити с ожтданием результата
        startActivityForResult(intent, ActivityMain.PICK_CONTACT_REQUEST_C);
    }

//ghbdtn
}
