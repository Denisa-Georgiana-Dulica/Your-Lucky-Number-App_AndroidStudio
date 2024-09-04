package com.example.yourluckynumber;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent i=getIntent();
        String nr=i.getStringExtra("nr");
        int lifeNr=Integer.parseInt(nr);
        TextView mean=findViewById(R.id.textView3);
        if(lifeNr==1)
        {
            mean.setText("You are a self-confident person with a lot of curiosity and a desire to explore paths less traveled by others. " +
                    "The number 1 is the number of innovators, inventors, and creators. You need to learn to embrace your individuality.");
        }
        else {
            if(lifeNr==2)
            {
                mean.setText("It is the number of love and the burning need for connection. " +
                        "The number 2 represents philanthropists, people with big hearts and above-average emotional intelligence. " +
                        "However, you need to learn to find a balance that is beneficial to you between giving and receiving. You must also learn to say 'no'.");
            }
            else if(lifeNr==3)
            {
                mean.setText("It is the number of winners and ambitious people. These are individuals who manage to achieve everything they set their minds to. " +
                        "However, they need to learn to manage their overflowing energy much better.");
            }
            else if(lifeNr==4)
            {
                mean.setText("It is the number of people who seek stability in relationships and closeness with others. " +
                        "They know the art of communication and understanding others. " +
                        "However, you need to learn to persevere more and have more confidence in yourself to achieve what you want more easily.");
            }
            else if(lifeNr==5)
            {
                mean.setText("These people know how to overcome challenges with optimism and humor. " +
                        "They constantly need interesting experiences and stimuli to avoid getting bored. " +
                        "It is the number of adventurers and seekers. " +
                        "You need to learn to also discover the value of calm in all this intense hustle and bustle!");
            }
            else if(lifeNr==6)
            {
                mean.setText("You are very endearing and kind, generous with advice and help, as well as material support. " +
                        "Wise, balanced, and understanding from a young age, you manage to get involved quickly in the serious matters of life.");
            }
            else if(lifeNr==7)
            {
                mean.setText("The most important ability conferred by the life path number 7 is depth of thought. " +
                        "In any field you are involved in, you need to analyze and verify everything with your own reasoning, as you do not accept taking others' word for granted.");
            }
            else if(lifeNr==8)
            {
                mean.setText("You generally deal with practical, concrete matters and are not very tempted to dream or split hairs. " +
                        "You are determined to put your organizational skills and pragmatism to work to establish your place in life.");
            }
            else if(lifeNr==9)
            {
                mean.setText("A person with the life path number 11 is particularly concerned with spiritual enlightenment, as the number 11 is associated with spirituality. " +
                        "Being one of the master numbers, 11 provides a higher understanding and knowledge beyond ordinary limits.");
            }
        }


    }
}