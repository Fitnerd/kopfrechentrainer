package com.example.enno.rechnentrainier;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    /** Called when the user clicks the easy button */
    public void easyCalc(View view) {
        Intent intent = new Intent(this, easyActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the normal button */
    public void normalCalc(View view) {
        Intent intent = new Intent(this, normalActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the hard button */
    public void hardCalc(View view) {
        Intent intent = new Intent(this, hardActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
