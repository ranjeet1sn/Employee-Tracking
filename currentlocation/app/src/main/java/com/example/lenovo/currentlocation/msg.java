package com.example.lenovo.currentlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class msg extends AppCompatActivity {
  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
    //    textView=findViewById(R.id.textview);

        Toast.makeText(msg.this,"Employee Task Notification",Toast.LENGTH_SHORT).show();
    }
}
