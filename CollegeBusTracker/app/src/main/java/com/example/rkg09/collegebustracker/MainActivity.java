package com.example.rkg09.collegebustracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Toast toast;
    private Button mDriver, mStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mDriver = (Button) findViewById(R.id.driver);
       mStudent = (Button) findViewById(R.id.student);

       mDriver.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this,DriverLoginActivity.class);
               startActivity(intent);
               finish();
               return;
           }
       });

        mStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,StudentLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.busnumber,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent intent=new Intent("com.example.rkg09.maps");
        //noinspection SimplifiableIfStatement
        if (id == R.id.bus9637) {
            startActivity(intent);
        }
        else if(id == R.id.bus9914){
        }
        else if(id == R.id.bus8821) {
        }
        else if(id == R.id.bus9331){
        }
        else if(id == R.id.bus9090){
        }
        else{
            toast= Toast.makeText(MainActivity.this,"Please Select BusNumber",Toast.LENGTH_LONG);
            toast.show();
        }

        return super.onOptionsItemSelected(item);
    }
}
