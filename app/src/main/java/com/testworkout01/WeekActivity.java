package com.testworkout01;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeekActivity extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        String physiqueChoiceWeekVar = sharedPreferences.getString("physiqueChoiceWeek", "");

        TextView txtToneWeekView = findViewById(R.id.txtToneWeek);
        TextView txtBuildWeekView = findViewById(R.id.txtBuildWeek);
        TextView txtStrengthWeekView = findViewById(R.id.txtStrengthWeek);

        int mainDrawableId = R.drawable.button_physique_check_on;
        int otherDrawableId = R.drawable.button_physique_check_off;

        switch (physiqueChoiceWeekVar.toLowerCase())
        {
            case "toneweek":
                txtToneWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
                txtBuildWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);
                txtStrengthWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);
                break;
            case "buildweek":
                txtToneWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);
                txtBuildWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
                txtStrengthWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);
                break;
            case "strengthweek":
                txtToneWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);
                txtBuildWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);
                txtStrengthWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
                break;
            default:
                System.out.println("FML");
                break;
        }

        String[] bodyParts = {"chestMonday", "tricepMonday", "backMonday", "bicepMonday", "shoulderMonday", "trapMonday", "forearmMonday", "legsMonday", "coreMonday", "restMonday"};

        TextView txtChestWeekView = findViewById(R.id.txtChestWeek);
        TextView txtTricepWeekView = findViewById(R.id.txtTricepWeek);
        TextView txtBackWeekView = findViewById(R.id.txtBackWeek);
        TextView txtBicepWeekView = findViewById(R.id.txtBicepWeek);
        TextView txtShoulderWeekView = findViewById(R.id.txtForearmWeek);
        TextView txtLegsWeekView = findViewById(R.id.txtLegsWeek);
        TextView txtCoreWeekView = findViewById(R.id.txtCoreWeek);
        TextView txtRestWeekView = findViewById(R.id.txtRestWeek);

        int mainDrawableId02 = R.drawable.button_muscle_star_on;
        int otherDrawableId02 = R.drawable.button_muscle_star_off;

        for (String bodyPart : bodyParts)
        {
            boolean isStarChecked = sharedPreferences.getBoolean(bodyPart, false);

            // System.out.println(isStarChecked + "  " + bodyPart);

            switch (bodyPart.toLowerCase())
            {
                case "chestmonday":
                    if (isStarChecked) { txtChestWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId02, 0, 0, 0); }
                    else { txtChestWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId02, 0, 0, 0); }
                    break;
                case "tricepmonday":
                    if (isStarChecked) { txtTricepWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId02, 0, 0, 0); }
                    else { txtTricepWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId02, 0, 0, 0); }
                    break;
                case "backmonday":
                    if (isStarChecked) { txtBackWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId02, 0, 0, 0); }
                    else { txtBackWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId02, 0, 0, 0); }
                    break;
                case "bicepmonday":
                    if (isStarChecked) { txtBicepWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId02, 0, 0, 0); }
                    else { txtBicepWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId02, 0, 0, 0); }
                    break;
                case "shouldermonday":
                    if (isStarChecked) { txtShoulderWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId02, 0, 0, 0); }
                    else { txtShoulderWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId02, 0, 0, 0); }
                    break;
                case "legsmonday":
                    if (isStarChecked) { txtLegsWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId02, 0, 0, 0); }
                    else { txtLegsWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId02, 0, 0, 0); }
                    break;
                case "coremonday":
                    if (isStarChecked) { txtCoreWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId02, 0, 0, 0); }
                    else { txtCoreWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId02, 0, 0, 0); }
                    break;
                case "restmonday":
                    if (isStarChecked) { txtRestWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId02, 0, 0, 0); }
                    else { txtRestWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId02, 0, 0, 0); }
                    break;
                default:
                    System.out.println("FML");
                    break;
            }
        }
    }

    public void clkToneHeaderLeftWeek(View v)
    {
        TextView txtToneWeekTouched = (TextView) v;
        int mainDrawableId = R.drawable.button_physique_check_on;
        txtToneWeekTouched.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);

        TextView txtBuildWeekView = findViewById(R.id.txtBuildWeek);
        TextView txtStrengthWeekView = findViewById(R.id.txtStrengthWeek);

        int otherDrawableId = R.drawable.button_physique_check_off;
        txtBuildWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);
        txtStrengthWeekView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("physiqueChoiceWeek", "toneWeek");
        editor.apply();
    }

    public void clkBuildHeaderCenterWeek(View v)
    {
        TextView txtBuildWeekTouched = (TextView) v;
        int mainDrawableId = R.drawable.button_physique_check_on;
        txtBuildWeekTouched.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);

        TextView txtToneView = findViewById(R.id.txtToneWeek);
        TextView txtStrengthView = findViewById(R.id.txtStrengthWeek);

        int otherDrawableId = R.drawable.button_physique_check_off;
        txtToneView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);
        txtStrengthView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("physiqueChoiceWeek", "buildWeek");
        editor.apply();
    }

    public void clkStrengthHeaderRightWeek(View v)
    {
        TextView txtStrengthWeekTouched = (TextView) v;
        int mainDrawableId = R.drawable.button_physique_check_on;
        txtStrengthWeekTouched.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);

        TextView txtToneView = findViewById(R.id.txtToneWeek);
        TextView txtBuildView = findViewById(R.id.txtBuildWeek);

        int otherDrawableId = R.drawable.button_physique_check_off;
        txtToneView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);
        txtBuildView.setCompoundDrawablesWithIntrinsicBounds(otherDrawableId, 0, 0, 0);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("physiqueChoiceWeek", "strengthWeek");
        editor.apply();
    }

    public void clkMondayLeftWeek(View v)
    {
        Button btnWeekTouched = (Button) v;
        int mainDrawableId = R.drawable.button_background_on;
        btnWeekTouched.setBackgroundResource(mainDrawableId);

        Button btnTuesdayView = findViewById(R.id.btnTuesdayWeek);
        Button btnWednesdayView = findViewById(R.id.btnWednesdayWeek);
        Button btnThursdayView = findViewById(R.id.btnThursdayWeek);
        Button btnFridayView = findViewById(R.id.btnFridayWeek);
        Button btnSaturdayView = findViewById(R.id.btnSaturdayWeek);
        Button btnSundayView = findViewById(R.id.btnSundayWeek);

        int otherDrawableId = R.drawable.button_background_off;
        btnTuesdayView.setBackgroundResource(otherDrawableId);
        btnWednesdayView.setBackgroundResource(otherDrawableId);
        btnThursdayView.setBackgroundResource(otherDrawableId);
        btnFridayView.setBackgroundResource(otherDrawableId);
        btnSaturdayView.setBackgroundResource(otherDrawableId);
        btnSundayView.setBackgroundResource(otherDrawableId);

        clearSelectedMusclesWeek();

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestMondayVar = sharedPreferences.getBoolean("chestMonday", false);
        Boolean tricepMondayVar = sharedPreferences.getBoolean("tricepMonday", false);
        Boolean backMondayVar = sharedPreferences.getBoolean("backMonday", false);
        Boolean bicepMondayVar = sharedPreferences.getBoolean("bicepMonday", false);
        Boolean shoulderMondayVar = sharedPreferences.getBoolean("shoulderMonday", false);
        Boolean trapMondayVar = sharedPreferences.getBoolean("trapMonday", false);
        Boolean forearmMondayVar = sharedPreferences.getBoolean("forearmMonday", false);
        Boolean legsMondayVar = sharedPreferences.getBoolean("legsMonday", false);
        Boolean coreMondayVar = sharedPreferences.getBoolean("coreMonday", false);
        Boolean restMondayVar = sharedPreferences.getBoolean("restMonday", false);

        assignStoredMuscleValuesWeek(chestMondayVar, tricepMondayVar, backMondayVar, bicepMondayVar, shoulderMondayVar, trapMondayVar, forearmMondayVar, legsMondayVar, coreMondayVar, restMondayVar);
    }

    public void clkTuesdayLeftWeek(View v)
    {
        Button btnWeekTouched = (Button) v;
        int mainDrawableId = R.drawable.button_background_on;
        btnWeekTouched.setBackgroundResource(mainDrawableId);

        Button btnMondayView = findViewById(R.id.btnMondayWeek);
        Button btnWednesdayView = findViewById(R.id.btnWednesdayWeek);
        Button btnThursdayView = findViewById(R.id.btnThursdayWeek);
        Button btnFridayView = findViewById(R.id.btnFridayWeek);
        Button btnSaturdayView = findViewById(R.id.btnSaturdayWeek);
        Button btnSundayView = findViewById(R.id.btnSundayWeek);

        int otherDrawableId = R.drawable.button_background_off;
        btnMondayView.setBackgroundResource(otherDrawableId);
        btnWednesdayView.setBackgroundResource(otherDrawableId);
        btnThursdayView.setBackgroundResource(otherDrawableId);
        btnFridayView.setBackgroundResource(otherDrawableId);
        btnSaturdayView.setBackgroundResource(otherDrawableId);
        btnSundayView.setBackgroundResource(otherDrawableId);

        clearSelectedMusclesWeek();

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestTuesdayVar = sharedPreferences.getBoolean("chestTuesday", false);
        Boolean tricepTuesdayVar = sharedPreferences.getBoolean("tricepTuesday", false);
        Boolean backTuesdayVar = sharedPreferences.getBoolean("backTuesday", false);
        Boolean bicepTuesdayVar = sharedPreferences.getBoolean("bicepTuesday", false);
        Boolean shoulderTuesdayVar = sharedPreferences.getBoolean("shoulderTuesday", false);
        Boolean trapTuesdayVar = sharedPreferences.getBoolean("trapTuesday", false);
        Boolean forearmTuesdayVar = sharedPreferences.getBoolean("forearmTuesday", false);
        Boolean legsTuesdayVar = sharedPreferences.getBoolean("legsTuesday", false);
        Boolean coreTuesdayVar = sharedPreferences.getBoolean("coreTuesday", false);
        Boolean restTuesdayVar = sharedPreferences.getBoolean("restTuesday", false);

        assignStoredMuscleValuesWeek(chestTuesdayVar, tricepTuesdayVar, backTuesdayVar, bicepTuesdayVar, shoulderTuesdayVar, trapTuesdayVar, forearmTuesdayVar, legsTuesdayVar, coreTuesdayVar, restTuesdayVar);
    }

    public void clkWednesdayLeftWeek(View v)
    {
        Button btnWeekTouched = (Button) v;
        int mainDrawableId = R.drawable.button_background_on;
        btnWeekTouched.setBackgroundResource(mainDrawableId);

        Button btnMondayView = findViewById(R.id.btnMondayWeek);
        Button btnTuesdayView = findViewById(R.id.btnTuesdayWeek);
        Button btnThursdayView = findViewById(R.id.btnThursdayWeek);
        Button btnFridayView = findViewById(R.id.btnFridayWeek);
        Button btnSaturdayView = findViewById(R.id.btnSaturdayWeek);
        Button btnSundayView = findViewById(R.id.btnSundayWeek);

        int otherDrawableId = R.drawable.button_background_off;
        btnMondayView.setBackgroundResource(otherDrawableId);
        btnTuesdayView.setBackgroundResource(otherDrawableId);
        btnThursdayView.setBackgroundResource(otherDrawableId);
        btnFridayView.setBackgroundResource(otherDrawableId);
        btnSaturdayView.setBackgroundResource(otherDrawableId);
        btnSundayView.setBackgroundResource(otherDrawableId);

        clearSelectedMusclesWeek();

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestWednesdayVar = sharedPreferences.getBoolean("chestWednesday", false);
        Boolean tricepWednesdayVar = sharedPreferences.getBoolean("tricepWednesday", false);
        Boolean backWednesdayVar = sharedPreferences.getBoolean("backWednesday", false);
        Boolean bicepWednesdayVar = sharedPreferences.getBoolean("bicepWednesday", false);
        Boolean shoulderWednesdayVar = sharedPreferences.getBoolean("shoulderWednesday", false);
        Boolean trapWednesdayVar = sharedPreferences.getBoolean("trapWednesday", false);
        Boolean forearmWednesdayVar = sharedPreferences.getBoolean("forearmWednesday", false);
        Boolean legsWednesdayVar = sharedPreferences.getBoolean("legsWednesday", false);
        Boolean coreWednesdayVar = sharedPreferences.getBoolean("coreWednesday", false);
        Boolean restWednesdayVar = sharedPreferences.getBoolean("restWednesday", false);

        assignStoredMuscleValuesWeek(chestWednesdayVar, tricepWednesdayVar, backWednesdayVar, bicepWednesdayVar, shoulderWednesdayVar, trapWednesdayVar, forearmWednesdayVar, legsWednesdayVar, coreWednesdayVar, restWednesdayVar);
    }

    public void clkThursdayLeftWeek(View v)
    {
        Button btnWeekTouched = (Button) v;
        int mainDrawableId = R.drawable.button_background_on;
        btnWeekTouched.setBackgroundResource(mainDrawableId);

        Button btnMondayView = findViewById(R.id.btnMondayWeek);
        Button btnTuesdayView = findViewById(R.id.btnTuesdayWeek);
        Button btnWednesdayView = findViewById(R.id.btnWednesdayWeek);
        Button btnFridayView = findViewById(R.id.btnFridayWeek);
        Button btnSaturdayView = findViewById(R.id.btnSaturdayWeek);
        Button btnSundayView = findViewById(R.id.btnSundayWeek);

        int otherDrawableId = R.drawable.button_background_off;
        btnMondayView.setBackgroundResource(otherDrawableId);
        btnTuesdayView.setBackgroundResource(otherDrawableId);
        btnWednesdayView.setBackgroundResource(otherDrawableId);
        btnFridayView.setBackgroundResource(otherDrawableId);
        btnSaturdayView.setBackgroundResource(otherDrawableId);
        btnSundayView.setBackgroundResource(otherDrawableId);

        clearSelectedMusclesWeek();

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestThursdayVar = sharedPreferences.getBoolean("chestThursday", false);
        Boolean tricepThursdayVar = sharedPreferences.getBoolean("tricepThursday", false);
        Boolean backThursdayVar = sharedPreferences.getBoolean("backThursday", false);
        Boolean bicepThursdayVar = sharedPreferences.getBoolean("bicepThursday", false);
        Boolean shoulderThursdayVar = sharedPreferences.getBoolean("shoulderThursday", false);
        Boolean trapThursdayVar = sharedPreferences.getBoolean("trapThursday", false);
        Boolean forearmThursdayVar = sharedPreferences.getBoolean("forearmThursday", false);
        Boolean legsThursdayVar = sharedPreferences.getBoolean("legsThursday", false);
        Boolean coreThursdayVar = sharedPreferences.getBoolean("coreThursday", false);
        Boolean restThursdayVar = sharedPreferences.getBoolean("restThursday", false);

        assignStoredMuscleValuesWeek(chestThursdayVar, tricepThursdayVar, backThursdayVar, bicepThursdayVar, shoulderThursdayVar, trapThursdayVar, forearmThursdayVar, legsThursdayVar, coreThursdayVar, restThursdayVar);
    }

    public void clkFridayLeftWeek(View v)
    {
        Button btnWeekTouched = (Button) v;
        int mainDrawableId = R.drawable.button_background_on;
        btnWeekTouched.setBackgroundResource(mainDrawableId);

        Button btnMondayView = findViewById(R.id.btnMondayWeek);
        Button btnTuesdayView = findViewById(R.id.btnTuesdayWeek);
        Button btnWednesdayView = findViewById(R.id.btnWednesdayWeek);
        Button btnThursdayView = findViewById(R.id.btnThursdayWeek);
        Button btnSaturdayView = findViewById(R.id.btnSaturdayWeek);
        Button btnSundayView = findViewById(R.id.btnSundayWeek);

        int otherDrawableId = R.drawable.button_background_off;
        btnMondayView.setBackgroundResource(otherDrawableId);
        btnTuesdayView.setBackgroundResource(otherDrawableId);
        btnWednesdayView.setBackgroundResource(otherDrawableId);
        btnThursdayView.setBackgroundResource(otherDrawableId);
        btnSaturdayView.setBackgroundResource(otherDrawableId);
        btnSundayView.setBackgroundResource(otherDrawableId);

        clearSelectedMusclesWeek();

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestFridayVar = sharedPreferences.getBoolean("chestFriday", false);
        Boolean tricepFridayVar = sharedPreferences.getBoolean("tricepFriday", false);
        Boolean backFridayVar = sharedPreferences.getBoolean("backFriday", false);
        Boolean bicepFridayVar = sharedPreferences.getBoolean("bicepFriday", false);
        Boolean shoulderFridayVar = sharedPreferences.getBoolean("shoulderFriday", false);
        Boolean trapFridayVar = sharedPreferences.getBoolean("trapFriday", false);
        Boolean forearmFridayVar = sharedPreferences.getBoolean("forearmFriday", false);
        Boolean legsFridayVar = sharedPreferences.getBoolean("legsFriday", false);
        Boolean coreFridayVar = sharedPreferences.getBoolean("coreFriday", false);
        Boolean restFridayVar = sharedPreferences.getBoolean("restFriday", false);

        assignStoredMuscleValuesWeek(chestFridayVar, tricepFridayVar, backFridayVar, bicepFridayVar, shoulderFridayVar, trapFridayVar, forearmFridayVar, legsFridayVar, coreFridayVar, restFridayVar);
    }

    public void clkSaturdayLeftWeek(View v)
    {
        Button btnWeekTouched = (Button) v;
        int mainDrawableId = R.drawable.button_background_on;
        btnWeekTouched.setBackgroundResource(mainDrawableId);

        Button btnMondayView = findViewById(R.id.btnMondayWeek);
        Button btnTuesdayView = findViewById(R.id.btnTuesdayWeek);
        Button btnWednesdayView = findViewById(R.id.btnWednesdayWeek);
        Button btnThursdayView = findViewById(R.id.btnThursdayWeek);
        Button btnFridayView = findViewById(R.id.btnFridayWeek);
        Button btnSundayView = findViewById(R.id.btnSundayWeek);

        int otherDrawableId = R.drawable.button_background_off;
        btnMondayView.setBackgroundResource(otherDrawableId);
        btnTuesdayView.setBackgroundResource(otherDrawableId);
        btnWednesdayView.setBackgroundResource(otherDrawableId);
        btnThursdayView.setBackgroundResource(otherDrawableId);
        btnFridayView.setBackgroundResource(otherDrawableId);
        btnSundayView.setBackgroundResource(otherDrawableId);

        clearSelectedMusclesWeek();

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestSaturdayVar = sharedPreferences.getBoolean("chestSaturday", false);
        Boolean tricepSaturdayVar = sharedPreferences.getBoolean("tricepSaturday", false);
        Boolean backSaturdayVar = sharedPreferences.getBoolean("backSaturday", false);
        Boolean bicepSaturdayVar = sharedPreferences.getBoolean("bicepSaturday", false);
        Boolean shoulderSaturdayVar = sharedPreferences.getBoolean("shoulderSaturday", false);
        Boolean trapSaturdayVar = sharedPreferences.getBoolean("trapSaturday", false);
        Boolean forearmSaturdayVar = sharedPreferences.getBoolean("forearmSaturday", false);
        Boolean legsSaturdayVar = sharedPreferences.getBoolean("legsSaturday", false);
        Boolean coreSaturdayVar = sharedPreferences.getBoolean("coreSaturday", false);
        Boolean restSaturdayVar = sharedPreferences.getBoolean("restSaturday", false);

        assignStoredMuscleValuesWeek(chestSaturdayVar, tricepSaturdayVar, backSaturdayVar, bicepSaturdayVar, shoulderSaturdayVar, trapSaturdayVar, forearmSaturdayVar, legsSaturdayVar, coreSaturdayVar, restSaturdayVar);
    }

    public void clkSundayLeftWeek(View v)
    {
        Button btnWeekTouched = (Button) v;
        int mainDrawableId = R.drawable.button_background_on;
        btnWeekTouched.setBackgroundResource(mainDrawableId);

        Button btnMondayView = findViewById(R.id.btnMondayWeek);
        Button btnTuesdayView = findViewById(R.id.btnTuesdayWeek);
        Button btnWednesdayView = findViewById(R.id.btnWednesdayWeek);
        Button btnThursdayView = findViewById(R.id.btnThursdayWeek);
        Button btnFridayView = findViewById(R.id.btnFridayWeek);
        Button btnSaturdayView = findViewById(R.id.btnSaturdayWeek);

        int otherDrawableId = R.drawable.button_background_off;
        btnMondayView.setBackgroundResource(otherDrawableId);
        btnTuesdayView.setBackgroundResource(otherDrawableId);
        btnWednesdayView.setBackgroundResource(otherDrawableId);
        btnThursdayView.setBackgroundResource(otherDrawableId);
        btnFridayView.setBackgroundResource(otherDrawableId);
        btnSaturdayView.setBackgroundResource(otherDrawableId);

        clearSelectedMusclesWeek();

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestSundayVar = sharedPreferences.getBoolean("chestSunday", false);
        Boolean tricepSundayVar = sharedPreferences.getBoolean("tricepSunday", false);
        Boolean backSundayVar = sharedPreferences.getBoolean("backSunday", false);
        Boolean bicepSundayVar = sharedPreferences.getBoolean("bicepSunday", false);
        Boolean shoulderSundayVar = sharedPreferences.getBoolean("shoulderSunday", false);
        Boolean trapSundayVar = sharedPreferences.getBoolean("trapSunday", false);
        Boolean forearmSundayVar = sharedPreferences.getBoolean("forearmSunday", false);
        Boolean legsSundayVar = sharedPreferences.getBoolean("legsSunday", false);
        Boolean coreSundayVar = sharedPreferences.getBoolean("coreSunday", false);
        Boolean restSundayVar = sharedPreferences.getBoolean("restSunday", false);

        assignStoredMuscleValuesWeek(chestSundayVar, tricepSundayVar, backSundayVar, bicepSundayVar, shoulderSundayVar, trapSundayVar, forearmSundayVar, legsSundayVar, coreSundayVar, restSundayVar);
    }

    public void clkChestRightWeek(View v)
    {
        clearSelectedRestWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("chestTuesday", isStarChecked);
                editor.putBoolean("restTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("chestWednesday", isStarChecked);
                editor.putBoolean("restWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("chestThursday", isStarChecked);
                editor.putBoolean("restThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("chestFriday", isStarChecked);
                editor.putBoolean("restFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("chestSaturday", isStarChecked);
                editor.putBoolean("restSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("chestSunday", isStarChecked);
                editor.putBoolean("restSunday", false);
                break;
            default:
                editor.putBoolean("chestMonday", isStarChecked);
                editor.putBoolean("restMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkTricepRightWeek(View v)
    {
        clearSelectedRestWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("tricepTuesday", isStarChecked);
                editor.putBoolean("restTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("tricepWednesday", isStarChecked);
                editor.putBoolean("restWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("tricepThursday", isStarChecked);
                editor.putBoolean("restThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("tricepFriday", isStarChecked);
                editor.putBoolean("restFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("tricepSaturday", isStarChecked);
                editor.putBoolean("restSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("tricepSunday", isStarChecked);
                editor.putBoolean("restSunday", false);
                break;
            default:
                editor.putBoolean("tricepMonday", isStarChecked);
                editor.putBoolean("restMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkBackRightWeek(View v)
    {
        clearSelectedRestWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("backTuesday", isStarChecked);
                editor.putBoolean("restTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("backWednesday", isStarChecked);
                editor.putBoolean("restWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("backThursday", isStarChecked);
                editor.putBoolean("restThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("backFriday", isStarChecked);
                editor.putBoolean("restFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("backSaturday", isStarChecked);
                editor.putBoolean("restSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("backSunday", isStarChecked);
                editor.putBoolean("restSunday", false);
                break;
            default:
                editor.putBoolean("backMonday", isStarChecked);
                editor.putBoolean("restMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkBicepRightWeek(View v)
    {
        clearSelectedRestWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("bicepTuesday", isStarChecked);
                editor.putBoolean("restTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("bicepWednesday", isStarChecked);
                editor.putBoolean("restWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("bicepThursday", isStarChecked);
                editor.putBoolean("restThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("bicepFriday", isStarChecked);
                editor.putBoolean("restFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("bicepSaturday", isStarChecked);
                editor.putBoolean("restSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("bicepSunday", isStarChecked);
                editor.putBoolean("restSunday", false);
                break;
            default:
                editor.putBoolean("bicepMonday", isStarChecked);
                editor.putBoolean("restMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkShoulderRightWeek(View v)
    {
        clearSelectedRestWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("shoulderTuesday", isStarChecked);
                editor.putBoolean("restTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("shoulderWednesday", isStarChecked);
                editor.putBoolean("restWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("shoulderThursday", isStarChecked);
                editor.putBoolean("restThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("shoulderFriday", isStarChecked);
                editor.putBoolean("restFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("shoulderSaturday", isStarChecked);
                editor.putBoolean("restSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("shoulderSunday", isStarChecked);
                editor.putBoolean("restSunday", false);
                break;
            default:
                editor.putBoolean("shoulderMonday", isStarChecked);
                editor.putBoolean("restMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkTrapRightWeek(View v)
    {
        clearSelectedRestWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("trapTuesday", isStarChecked);
                editor.putBoolean("restTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("trapWednesday", isStarChecked);
                editor.putBoolean("restWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("trapThursday", isStarChecked);
                editor.putBoolean("restThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("trapFriday", isStarChecked);
                editor.putBoolean("restFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("trapSaturday", isStarChecked);
                editor.putBoolean("restSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("trapSunday", isStarChecked);
                editor.putBoolean("restSunday", false);
                break;
            default:
                editor.putBoolean("trapMonday", isStarChecked);
                editor.putBoolean("restMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkForearmRightWeek(View v)
    {
        clearSelectedRestWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("forearmTuesday", isStarChecked);
                editor.putBoolean("restTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("forearmWednesday", isStarChecked);
                editor.putBoolean("restWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("forearmThursday", isStarChecked);
                editor.putBoolean("restThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("forearmFriday", isStarChecked);
                editor.putBoolean("restFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("forearmSaturday", isStarChecked);
                editor.putBoolean("restSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("forearmSunday", isStarChecked);
                editor.putBoolean("restSunday", false);
                break;
            default:
                editor.putBoolean("forearmMonday", isStarChecked);
                editor.putBoolean("restMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkLegsRightWeek(View v)
    {
        clearSelectedRestWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("legsTuesday", isStarChecked);
                editor.putBoolean("restTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("legsWednesday", isStarChecked);
                editor.putBoolean("restWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("legsThursday", isStarChecked);
                editor.putBoolean("restThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("legsFriday", isStarChecked);
                editor.putBoolean("restFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("legsSaturday", isStarChecked);
                editor.putBoolean("restSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("legsSunday", isStarChecked);
                editor.putBoolean("restSunday", false);
                break;
            default:
                editor.putBoolean("legsMonday", isStarChecked);
                editor.putBoolean("restMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkCoreRightWeek(View v)
    {
        clearSelectedRestWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("coreTuesday", isStarChecked);
                editor.putBoolean("restTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("coreWednesday", isStarChecked);
                editor.putBoolean("restWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("coreThursday", isStarChecked);
                editor.putBoolean("restThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("coreFriday", isStarChecked);
                editor.putBoolean("restFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("coreSaturday", isStarChecked);
                editor.putBoolean("restSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("coreSunday", isStarChecked);
                editor.putBoolean("restSunday", false);
                break;
            default:
                editor.putBoolean("coreMonday", isStarChecked);
                editor.putBoolean("restMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkRestRightWeek(View v)
    {
        clearSelectedMusclesWeek();
        btnMuscleStarChangerWeek(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int mainDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (mainDrawableId == R.drawable.button_muscle_star_on);
        int selectedDay = 0;

        selectedDay = getSelectedDayWeek();

        switch (selectedDay)
        {
            case R.id.btnTuesdayWeek:
                editor.putBoolean("restTuesday", isStarChecked);
                editor.putBoolean("chestTuesday", false);
                editor.putBoolean("tricepTuesday", false);
                editor.putBoolean("backTuesday", false);
                editor.putBoolean("bicepTuesday", false);
                editor.putBoolean("shoulderTuesday", false);
                editor.putBoolean("trapTuesday", false);
                editor.putBoolean("forearmTuesday", false);
                editor.putBoolean("legsTuesday", false);
                editor.putBoolean("coreTuesday", false);
                break;
            case R.id.btnWednesdayWeek:
                editor.putBoolean("restWednesday", isStarChecked);
                editor.putBoolean("chestWednesday", false);
                editor.putBoolean("tricepWednesday", false);
                editor.putBoolean("backWednesday", false);
                editor.putBoolean("bicepWednesday", false);
                editor.putBoolean("shoulderWednesday", false);
                editor.putBoolean("trapWednesday", false);
                editor.putBoolean("forearmWednesday", false);
                editor.putBoolean("legsWednesday", false);
                editor.putBoolean("coreWednesday", false);
                break;
            case R.id.btnThursdayWeek:
                editor.putBoolean("restThursday", isStarChecked);
                editor.putBoolean("chestThursday", false);
                editor.putBoolean("tricepThursday", false);
                editor.putBoolean("backThursday", false);
                editor.putBoolean("bicepThursday", false);
                editor.putBoolean("shoulderThursday", false);
                editor.putBoolean("trapThursday", false);
                editor.putBoolean("forearmThursday", false);
                editor.putBoolean("legsThursday", false);
                editor.putBoolean("coreThursday", false);
                break;
            case R.id.btnFridayWeek:
                editor.putBoolean("restFriday", isStarChecked);
                editor.putBoolean("chestFriday", false);
                editor.putBoolean("tricepFriday", false);
                editor.putBoolean("backFriday", false);
                editor.putBoolean("bicepFriday", false);
                editor.putBoolean("shoulderFriday", false);
                editor.putBoolean("trapFriday", false);
                editor.putBoolean("forearmFriday", false);
                editor.putBoolean("legsFriday", false);
                editor.putBoolean("coreFriday", false);
                break;
            case R.id.btnSaturdayWeek:
                editor.putBoolean("restSaturday", isStarChecked);
                editor.putBoolean("chestSaturday", false);
                editor.putBoolean("tricepSaturday", false);
                editor.putBoolean("backSaturday", false);
                editor.putBoolean("bicepSaturday", false);
                editor.putBoolean("shoulderSaturday", false);
                editor.putBoolean("trapSaturday", false);
                editor.putBoolean("forearmSaturday", false);
                editor.putBoolean("legsSaturday", false);
                editor.putBoolean("coreSaturday", false);
                break;
            case R.id.btnSundayWeek:
                editor.putBoolean("restSunday", isStarChecked);
                editor.putBoolean("chestSunday", false);
                editor.putBoolean("tricepSunday", false);
                editor.putBoolean("backSunday", false);
                editor.putBoolean("bicepSunday", false);
                editor.putBoolean("shoulderSunday", false);
                editor.putBoolean("trapSunday", false);
                editor.putBoolean("forearmSunday", false);
                editor.putBoolean("legsSunday", false);
                editor.putBoolean("coreSunday", false);
                break;
            default:
                editor.putBoolean("restMonday", isStarChecked);
                editor.putBoolean("chestMonday", false);
                editor.putBoolean("tricepMonday", false);
                editor.putBoolean("backMonday", false);
                editor.putBoolean("bicepMonday", false);
                editor.putBoolean("shoulderMonday", false);
                editor.putBoolean("trapMonday", false);
                editor.putBoolean("forearmMonday", false);
                editor.putBoolean("legsMonday", false);
                editor.putBoolean("coreMonday", false);
                break;
        }

        editor.apply();
    }

    public void clkRotationFooterLeftWeek(View v)
    {
        Intent intentSwitchWeek = new Intent(WeekActivity.this, RotateActivity.class);
        startActivity(intentSwitchWeek);
    }

    public void clkDoneFooterRightWeek(View v)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean("workoutWeekSelected", true);
        editor.apply();

        Intent intentHome = new Intent(WeekActivity.this, MainActivity.class);
        startActivity(intentHome);
    }

    public void btnMuscleStarChangerWeek(View v)
    {
        TextView textView = (TextView) v;
        textView.setSelected(!textView.isSelected());

        int mainDrawableId = textView.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        textView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
    }

    public int getSelectedDayWeek()
    {
        int[] viewIds = {R.id.btnMondayWeek, R.id.btnTuesdayWeek, R.id.btnWednesdayWeek, R.id.btnThursdayWeek, R.id.btnFridayWeek, R.id.btnSaturdayWeek, R.id.btnSundayWeek};

        for (int viewId : viewIds)
        {
            Button buttonBackgroundView = findViewById(viewId);
            if (buttonBackgroundView.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.button_background_on).getConstantState()))
            {
                return viewId;
            }
        }
        return 0;
    }

    public void clearSelectedMusclesWeek()
    {
        TextView txtChestWeekView = findViewById(R.id.txtChestWeek);
        TextView txtTricepWeekView = findViewById(R.id.txtTricepWeek);
        TextView txtBackWeekView = findViewById(R.id.txtBackWeek);
        TextView txtBicepWeekView = findViewById(R.id.txtBicepWeek);
        TextView txtShoulderWeekView = findViewById(R.id.txtShoulderWeek);
        TextView txtTrapWeekView = findViewById(R.id.txtTrapWeek);
        TextView txtForearmWeekView = findViewById(R.id.txtForearmWeek);
        TextView txtLegsWeekView = findViewById(R.id.txtLegsWeek);
        TextView txtCoreWeekView = findViewById(R.id.txtCoreWeek);
        TextView txtRestWeekView = findViewById(R.id.txtRestWeek);

        int mainDrawableId = R.drawable.button_muscle_star_off;
        txtChestWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        txtTricepWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        txtBackWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        txtBicepWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        txtShoulderWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        txtTrapWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        txtForearmWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        txtLegsWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        txtCoreWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        txtRestWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
    }

    public void assignStoredMuscleValuesWeek(Boolean chestWeekVar, Boolean tricepWeekVar, Boolean backWeekVar, Boolean bicepWeekVar, Boolean shoulderWeekVar, Boolean trapWeekVar, Boolean forearmWeekVar, Boolean legsWeekVar, Boolean coreWeekVar, Boolean restWeekVar)
    {
        int mainDrawableId = R.drawable.button_muscle_star_on;

        if (chestWeekVar)
        {
            TextView txtChestWeekView = findViewById(R.id.txtChestWeek);
            txtChestWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }

        if (tricepWeekVar)
        {
            TextView txtTricepWeekView = findViewById(R.id.txtTricepWeek);
            txtTricepWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }

        if (backWeekVar)
        {
            TextView txtBackWeekView = findViewById(R.id.txtBackWeek);
            txtBackWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }

        if (bicepWeekVar)
        {
            TextView txtBicepWeekView = findViewById(R.id.txtBicepWeek);
            txtBicepWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }

        if (shoulderWeekVar)
        {
            TextView txtShoulderWeekView = findViewById(R.id.txtShoulderWeek);
            txtShoulderWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }

        if (trapWeekVar)
        {
            TextView txtTrapRotateView = findViewById(R.id.txtTrapWeek);
            txtTrapRotateView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }

        if (forearmWeekVar)
        {
            TextView txtForearmRotateView = findViewById(R.id.txtForearmWeek);
            txtForearmRotateView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }

        if (legsWeekVar)
        {
            TextView txtLegsWeekView = findViewById(R.id.txtLegsWeek);
            txtLegsWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }

        if (coreWeekVar)
        {
            TextView txtCoreWeekView = findViewById(R.id.txtCoreWeek);
            txtCoreWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }

        if (restWeekVar)
        {
            TextView txtRestWeekView = findViewById(R.id.txtRestWeek);
            txtRestWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
        }
    }

    public void clearSelectedRestWeek()
    {
        TextView txtRestWeekView = findViewById(R.id.txtRestWeek);

        int mainDrawableId = R.drawable.button_muscle_star_off;
        txtRestWeekView.setCompoundDrawablesWithIntrinsicBounds(mainDrawableId, 0, 0, 0);
    }
}