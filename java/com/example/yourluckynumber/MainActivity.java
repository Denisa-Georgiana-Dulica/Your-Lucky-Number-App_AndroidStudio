package com.example.yourluckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText edDay=findViewById(R.id.editTDay);
        EditText edMonth=findViewById(R.id.editTMonth);
        EditText edYear=findViewById(R.id.editTYear);


        Button calculeaza=findViewById(R.id.button);
        calculeaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String day =edDay.getText().toString();
                String month =edMonth.getText().toString();
                String year =edYear.getText().toString();
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("day",day);
                intent.putExtra("month",month);
                intent.putExtra("year",year);
                startActivity(intent);
            }
        });

    }
}