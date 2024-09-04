package com.example.yourluckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = getIntent();
        String day = intent.getStringExtra("day");
        String month = intent.getStringExtra("month");
        String year = intent.getStringExtra("year");
        Button share = findViewById(R.id.share);
        Button mean = findViewById(R.id.means);

        TextView nr=findViewById(R.id.lifeNumber);
        nr.setText(""+CalculateLifeNumber(day,month,year));


        mean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent i=new Intent(getApplicationContext(),ThirdActivity.class);
                    String nrs=nr.getText().toString();
                    i.putExtra("nr",nrs);
                    startActivity(i);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_SEND);
                i.setType("text/plane");
                i.putExtra(Intent.EXTRA_SUBJECT,"Do you want to calculate your life number easier?");
                i.putExtra(Intent.EXTRA_TEXT,"You should try YOUR LUCKY NUMBER APP !!");
                startActivity(i);
            }
        });

    }

    public int CalculateLifeNumber(String day, String month, String year)
    {
        int sumDay = 0;
        for (int i = 0; i < day.length(); i++) {
            int nr = Character.getNumericValue(day.charAt(i));
            sumDay += nr;
        }
        int sumMonth = 0;
        for (int i = 0; i < month.length(); i++) {
            int nr = Character.getNumericValue(month.charAt(i));
            sumMonth += nr;
        }
        int sumaYear = 0;
        for (int i = 0; i < year.length(); i++) {
            int nr = Character.getNumericValue(year.charAt(i));
            sumaYear += nr;
        }
        int sum=sumDay+sumMonth+sumaYear;
        int sumF=0;
        while(sum!=0)
        {
            sumF+=sum%10;//the last figure
            sum/=10;//delete the last figure
        }
        return sumF;
    }

}