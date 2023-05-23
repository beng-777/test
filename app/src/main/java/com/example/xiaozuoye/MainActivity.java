package com.example.xiaozuoye;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.test);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.test:
                EditText editText1=(EditText) findViewById(R.id.edit_text);
                String inputText=editText1.getText().toString();
                if(inputText.isEmpty()) {
                    AlertDialog.Builder dialog1 = new AlertDialog.Builder(MainActivity.this);
                    dialog1.setTitle("标题").setMessage("输入不能为空").setPositiveButton("确定", null).create().show();
                }
                System.out.println(inputText);
                Toast.makeText(MainActivity.this,inputText,
                        Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
