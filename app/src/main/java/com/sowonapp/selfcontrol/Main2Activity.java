package com.sowonapp.selfcontrol;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox First,Second,Third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        First = (CheckBox)findViewById(R.id.CheckBokFirst);
        Second = (CheckBox)findViewById(R.id.CheckBoxSecond);
        Third = (CheckBox)findViewById(R.id.CheckBoxThird);

        //First CheckBox
        First.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(First.isChecked())
                {
                    Toast.makeText(MainActivity.this,"설정완료 : 체크됨", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"설정완료 : 체크되지 않음", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //Second CheckBox
        Second.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Second.isChecked())
                {
                    Toast.makeText(MainActivity.this,"설정완료 : 체크됨", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"설정완료 : 체크되지 않음", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //Third CheckBox

        Third.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Third.isChecked())
                {
                    Toast.makeText(MainActivity.this,"설정완료 : 체크됨", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"설정완료 : 체크되지 않음", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.parent) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
