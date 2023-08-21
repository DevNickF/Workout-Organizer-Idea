package com.testworkout01;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button viewBtnStart = findViewById(R.id.btnStartMain);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean workoutSelectedVar = sharedPreferences.getBoolean("workoutWeekSelected", true);

        if (workoutSelectedVar) { setCurrentDayMain(viewBtnStart); }
        else { setCurrentNumberMain(viewBtnStart); }
    }

    public void clkStartMain(View v)
    {
        Intent intentWorkout = new Intent(MainActivity.this, WorkoutActivity.class);
        startActivity(intentWorkout);
    }

    public void clkExerciseSetupMain(View v)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean workoutSelectedVar = sharedPreferences.getBoolean("workoutWeekSelected", true);
        Intent intentExercise;

        if (workoutSelectedVar) { intentExercise = new Intent(MainActivity.this, WeekActivity.class); }
        else { intentExercise = new Intent(MainActivity.this, RotateActivity.class); }

        startActivity(intentExercise);
    }

    public void clkStretchMain(View v)
    {
        Intent intentStretch = new Intent(MainActivity.this, StretchActivity.class);
        startActivity(intentStretch);
    }

    public void clkCardioMain(View v)
    {
        Intent intentCardio = new Intent(MainActivity.this, CardioActivity.class);
        startActivity(intentCardio);
    }

    public void clkReturnMain(View v) { finish(); }

    public void setCurrentDayMain(Button passedButton)
    {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String currentDay = "Today";

        switch (dayOfWeek)
        {
            case Calendar.SUNDAY:
                currentDay = "Sunday";
                break;
            case Calendar.MONDAY:
                currentDay = "Monday";
                break;
            case Calendar.TUESDAY:
                currentDay = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                currentDay = "Wednesday";
                break;
            case Calendar.THURSDAY:
                currentDay = "Thursday";
                break;
            case Calendar.FRIDAY:
                currentDay = "Friday";
                break;
            case Calendar.SATURDAY:
                currentDay = "Saturday";
                break;
            default:
                currentDay = "Unknown";
                break;
        }

        passedButton.setText(currentDay);
    }

    public void setCurrentNumberMain(Button passedButton)
    {
        int currentNumberInt = 0;
        String currentNumberString = "Zero";

        switch (currentNumberInt)
        {
            case 1:
                currentNumberString = "One";
                break;
            case 2:
                currentNumberString = "Two";
                break;
            case 3:
                currentNumberString = "Three";
                break;
            case 4:
                currentNumberString = "Four";
                break;
            case 5:
                currentNumberString = "Five";
                break;
            case 6:
                currentNumberString = "Six";
                break;
            case 7:
                currentNumberString = "Seven";
                break;
            case 8:
                currentNumberString = "Eight";
                break;
            case 9:
                currentNumberString = "Nine";
                break;
            case 10:
                currentNumberString = "Ten";
                break;
            default:
                currentNumberString = "Unknown";
                break;
        }

        passedButton.setText(currentNumberString);
    }
}