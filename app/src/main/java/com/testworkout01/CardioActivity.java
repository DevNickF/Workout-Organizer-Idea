package com.testworkout01;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CardioActivity extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

        Random rand = new Random();
        int randomNumber = rand.nextInt(5);

        ImageView imgCardioView = findViewById(R.id.imgCardio);
        int[] cardioPics = {R.drawable.img_runner_cardio, R.drawable.img_rowing_cardio, R.drawable.img_ropes_cardio, R.drawable.img_jumping_cardio, R.drawable.img_biker_cardio};
        imgCardioView.setImageResource(cardioPics[randomNumber]);

        TextView txtCardioView = findViewById(R.id.txtCardio);
        String[] cardioExercises = {"Run\n\nDistance will help increase your stamina.",
                "Row\n\nHelps improve your cardiovascular system.",
                "Jump Rope\n\nPushes more oxygen to your muscles overtime.",
                "Jumping Jacks\n\nThis exercise will engage your entire body.",
                "Bike\n\nStrengthens the heart muscle and lowers the pulse."};
        txtCardioView.setText(cardioExercises[randomNumber]);
    }
}
