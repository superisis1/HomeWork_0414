package kr.insungjung.hw0414;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText mUserName = findViewById(R.id.nameText);
        EditText mUserEmail = findViewById(R.id.emailText);
        CheckBox mCheckAll = findViewById(R.id.allCheck);
        CheckBox mCheck1 = findViewById(R.id.check1);
        CheckBox mCheck2 = findViewById(R.id.check2);
        CheckBox mCheck3 = findViewById(R.id.check3);
        CheckBox mCheck4 = findViewById(R.id.check4);
        Button mButton = findViewById(R.id.nextBtn);




    }
}
