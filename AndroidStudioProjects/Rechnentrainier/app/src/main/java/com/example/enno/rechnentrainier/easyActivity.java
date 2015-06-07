package com.example.enno.rechnentrainier;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class easyActivity extends ActionBarActivity {
    Task task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        generateNums();
    }

    public void generateNums() {
        task = new giveTask().makeTask(2,1,100);
        TextView num1 = (TextView) findViewById(R.id.num1);
        TextView oper = (TextView) findViewById(R.id.operator);
        TextView num2 = (TextView) findViewById(R.id.num2);
        num1.setText(Integer.toString(task.getOperand1()));
        num2.setText(Integer.toString(task.getOperand2()));
        switch (task.getOperator()) {
            case 0:
                oper.setText("+");
                break;
            case 1:
                oper.setText("-");
                break;
            case 2:
                oper.setText("*");
                break;
            case 3:
                oper.setText("/");
                break;
        }
    }

    public void checkResult(View view) {
        TextView answer = (TextView) findViewById(R.id.anwser);
        TextView result = (TextView) findViewById(R.id.result);
        int result_num = Integer.parseInt(result.getText().toString());
        if(result_num == task.getResult()) {
            answer.setText("You're right!");
            generateNums();
        } else {
            answer.setText("Try again!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_easy, menu);
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
