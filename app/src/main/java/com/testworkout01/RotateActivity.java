package com.testworkout01;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RotateActivity extends WeekActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        String physiqueChoiceRotateVar = sharedPreferences.getString("physiqueChoiceRotate", "");

        TextView txtToneRotateView = findViewById(R.id.txtToneRotate);
        TextView txtBuildRotateView = findViewById(R.id.txtBuildRotate);
        TextView txtStrengthRotateView = findViewById(R.id.txtStrengthRotate);

        int physiqueCheckOnDrawableId = R.drawable.button_physique_check_on;
        int physiqueCheckOffDrawableId = R.drawable.button_physique_check_off;

        switch (physiqueChoiceRotateVar.toLowerCase())
        {
            case "tonerotate":
                txtToneRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOnDrawableId, 0, 0, 0);
                txtBuildRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);
                txtStrengthRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);
                break;
            case "buildrotate":
                txtToneRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);
                txtBuildRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOnDrawableId, 0, 0, 0);
                txtStrengthRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);
                break;
            case "strengthrotate":
                txtToneRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);
                txtBuildRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);
                txtStrengthRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOnDrawableId, 0, 0, 0);
                break;
            default:
                System.out.println("FML");
                break;
        }

        Button btnOneRotateView = findViewById(R.id.btnOneRotate);
        int disabledBackgroundDrawableId = R.drawable.button_background_disabled;
        boolean isButtoneRed = sharedPreferences.getBoolean("skipOne", false);

        if (isButtoneRed) { btnOneRotateView.setBackgroundResource(disabledBackgroundDrawableId); }

        String[] bodyParts = {"skipOne", "chestOne", "restOne"};

        TextView txtSkipRotateView = findViewById(R.id.txtSkipRotate);
        TextView txtChestRotateView = findViewById(R.id.txtChestRotate);
        TextView txtRestRotateView = findViewById(R.id.txtRestRotate);

        int muscleStarOnDrawableId = R.drawable.button_muscle_star_on;
        int muscleStarOffDrawableId = R.drawable.button_muscle_star_off;

        for (String bodyPart : bodyParts)
        {
            boolean isStarChecked = sharedPreferences.getBoolean(bodyPart, false);
            // System.out.println(isStarChecked + "  " + bodyPart);

            switch (bodyPart.toLowerCase())
            {
                case "skipone":
                    if (isStarChecked) { txtSkipRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOnDrawableId, 0, 0, 0); }
                    else { txtSkipRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOffDrawableId, 0, 0, 0); }
                    break;
                case "chestone":
                    if (isStarChecked) { txtChestRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOnDrawableId, 0, 0, 0); }
                    else { txtChestRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOffDrawableId, 0, 0, 0); }
                    break;
                case "restone":
                    if (isStarChecked) { txtRestRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOnDrawableId, 0, 0, 0); }
                    else { txtRestRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOffDrawableId, 0, 0, 0); }
                    break;
                default:
                    System.out.println("FML");
                    break;
            }
        }
    }

    public void clkToneHeaderLeftRotate(View v)
    {
        TextView txtPhysiqueRotateTouched = (TextView) v;

        int physiqueCheckOnDrawableId = R.drawable.button_physique_check_on;
        txtPhysiqueRotateTouched.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOnDrawableId, 0, 0, 0);

        TextView txtBuildRotateView = findViewById(R.id.txtBuildRotate);
        TextView txtStrengthRotateView = findViewById(R.id.txtStrengthRotate);

        int physiqueCheckOffDrawableId = R.drawable.button_physique_check_off;
        txtBuildRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);
        txtStrengthRotateView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("physiqueChoiceRotate", "toneRotate");
        editor.apply();
    }

    public void clkBuildHeaderCenterRotate(View v)
    {
        TextView txtPhysiqueRotateTouched = (TextView) v;

        int physiqueCheckOnDrawableId = R.drawable.button_physique_check_on;
        txtPhysiqueRotateTouched.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOnDrawableId, 0, 0, 0);

        TextView txtToneView = findViewById(R.id.txtToneRotate);
        TextView txtStrengthView = findViewById(R.id.txtStrengthRotate);

        int physiqueCheckOffDrawableId = R.drawable.button_physique_check_off;
        txtToneView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);
        txtStrengthView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("physiqueChoiceRotate", "buildRotate");
        editor.apply();
    }

    public void clkStrengthHeaderRightRotate(View v)
    {
        TextView txtPhysiqueRotateTouched = (TextView) v;

        int physiqueCheckOnDrawableId = R.drawable.button_physique_check_on;
        txtPhysiqueRotateTouched.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOnDrawableId, 0, 0, 0);

        TextView txtToneView = findViewById(R.id.txtToneRotate);
        TextView txtBuildView = findViewById(R.id.txtBuildRotate);

        int physiqueCheckOffDrawableId = R.drawable.button_physique_check_off;
        txtToneView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);
        txtBuildView.setCompoundDrawablesWithIntrinsicBounds(physiqueCheckOffDrawableId, 0, 0, 0);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("physiqueChoiceRotate", "strengthRotate");
        editor.apply();
    }

    public void clkOneLeftRotate(View v)
    {
        Button btnOneTouchedRotate = (Button) v;
        Button btnTwoView = findViewById(R.id.btnTwoRotate);
        Button btnThreeView = findViewById(R.id.btnThreeRotate);

        int btnBackgroundOnDrawableId = R.drawable.button_background_on;
        int btnBackgroundOffDrawableId = R.drawable.button_background_off;
        int btnBackgroundDisabledDrawableId = R.drawable.button_background_disabled;

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestOneVar = sharedPreferences.getBoolean("chestOne", false);
        Boolean restOneVar = sharedPreferences.getBoolean("restOne", false);
        Boolean skipOneVar = sharedPreferences.getBoolean("skipOne", false);

        if (skipOneVar) { btnOneTouchedRotate.setBackgroundResource(btnBackgroundDisabledDrawableId); }
        else { btnOneTouchedRotate.setBackgroundResource(btnBackgroundOnDrawableId); }

        btnTwoView.setBackgroundResource(btnBackgroundOffDrawableId);
        btnThreeView.setBackgroundResource(btnBackgroundOffDrawableId);

        clearSelectedMusclesRotate();
        assignStoredMuscleValuesRotate(chestOneVar, restOneVar, skipOneVar);
    }

    public void clkTwoLeftRotate(View v)
    {
        Button btnTwoTouchedRotate = (Button) v;
        Button btnOneView = findViewById(R.id.btnOneRotate);
        Button btnThreeView = findViewById(R.id.btnThreeRotate);

        int btnBackgroundOnDrawableId = R.drawable.button_background_on;
        int btnBackgroundOffDrawableId = R.drawable.button_background_off;
        int btnBackgroundDisabledDrawableId = R.drawable.button_background_disabled;

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestTwoVar = sharedPreferences.getBoolean("chestTwo", false);
        Boolean restTwoVar = sharedPreferences.getBoolean("restTwo", false);
        Boolean skipTwoVar = sharedPreferences.getBoolean("skipTwo", false);

        if (skipTwoVar) { btnTwoTouchedRotate.setBackgroundResource(btnBackgroundDisabledDrawableId); }
        else { btnTwoTouchedRotate.setBackgroundResource(btnBackgroundOnDrawableId); }

        btnOneView.setBackgroundResource(btnBackgroundOffDrawableId);
        btnThreeView.setBackgroundResource(btnBackgroundOffDrawableId);

        clearSelectedMusclesRotate();
        assignStoredMuscleValuesRotate(chestTwoVar, restTwoVar, skipTwoVar);
    }

    public void clkThreeLeftRotate(View v)
    {
        Button btnThreeTouchedRotate = (Button) v;
        Button btnOneView = findViewById(R.id.btnOneRotate);
        Button btnTwoView = findViewById(R.id.btnTwoRotate);

        int btnBackgroundOnDrawableId = R.drawable.button_background_on;
        int btnBackgroundOffDrawableId = R.drawable.button_background_off;
        int btnBackgroundDisabledDrawableId = R.drawable.button_background_disabled;

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        Boolean chestThreeVar = sharedPreferences.getBoolean("chestThree", false);
        Boolean restThreeVar = sharedPreferences.getBoolean("restThree", false);
        Boolean skipThreeVar = sharedPreferences.getBoolean("skipThree", false);

        if (skipThreeVar) { btnThreeTouchedRotate.setBackgroundResource(btnBackgroundDisabledDrawableId); }
        else { btnThreeTouchedRotate.setBackgroundResource(btnBackgroundOnDrawableId); }

        btnOneView.setBackgroundResource(btnBackgroundOffDrawableId);
        btnTwoView.setBackgroundResource(btnBackgroundOffDrawableId);

        clearSelectedMusclesRotate();
        assignStoredMuscleValuesRotate(chestThreeVar, restThreeVar, skipThreeVar);
    }

    public void clkChestRightRotate(View v)
    {
        clearSelectedRestRotate();
        btnMuscleStarChangerRotate(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int toggleMuscleStarDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (toggleMuscleStarDrawableId == R.drawable.button_muscle_star_on);
        int selectedNumber = 0;

        selectedNumber = getSelectedNumberRotate();

        switch (selectedNumber)
        {
            case R.id.btnTwoRotate:
                editor.putBoolean("chestTwo", isStarChecked);
                editor.putBoolean("restTwo", false);
                editor.putBoolean("skipTwo", false);
                break;
            case R.id.btnThreeRotate:
                editor.putBoolean("chestThree", isStarChecked);
                editor.putBoolean("restThree", false);
                editor.putBoolean("skipThree", false);
                break;
            default:
                editor.putBoolean("chestOne", isStarChecked);
                editor.putBoolean("restOne", false);
                editor.putBoolean("skipOne", false);
                break;
        }

        editor.apply();
    }

    public void clkRestRightRotate(View v)
    {
        clearSelectedMusclesRotate();
        btnMuscleStarChangerRotate(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int toggleMuscleStarDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (toggleMuscleStarDrawableId == R.drawable.button_muscle_star_on);
        int selectedNumber = 0;

        selectedNumber = getSelectedNumberRotate();

        switch (selectedNumber)
        {
            case R.id.btnTwoRotate:
                editor.putBoolean("chestTwo", false);
                editor.putBoolean("restTwo", isStarChecked);
                editor.putBoolean("skipTwo", false);
                break;
            case R.id.btnThreeRotate:
                editor.putBoolean("chestThree", false);
                editor.putBoolean("restThree", isStarChecked);
                editor.putBoolean("skipThree", false);
                break;
            default:
                editor.putBoolean("chestOne", false);
                editor.putBoolean("restOne", isStarChecked);
                editor.putBoolean("skipOne", false);
                break;
            }

        editor.apply();
    }

    public void clkSkipRightRotate(View v)
    {
        btnMuscleStarChangerRotate(v);

        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        int toggleMuscleStarDrawableId = v.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        boolean isStarChecked = (toggleMuscleStarDrawableId == R.drawable.button_muscle_star_on);
        int selectedNumber = 0;

        int btnBackgroundOnDrawableId = R.drawable.button_background_on;
        int btnBackgroundDisabledDrawableId = R.drawable.button_background_disabled;
        Button btnOneView = findViewById(R.id.btnOneRotate);
        Button btnTwoView = findViewById(R.id.btnTwoRotate);
        Button btnThreeView = findViewById(R.id.btnThreeRotate);

        selectedNumber = getSelectedNumberRotate();

        switch (selectedNumber)
        {
            case R.id.btnTwoRotate:
                editor.putBoolean("skipTwo", isStarChecked);
                editor.apply();

                Boolean skipTwoVar = sharedPreferences.getBoolean("skipTwo", false);

                if (skipTwoVar) { btnTwoView.setBackgroundResource(btnBackgroundDisabledDrawableId); }
                else { btnTwoView.setBackgroundResource(btnBackgroundOnDrawableId); }
                break;
            case R.id.btnThreeRotate:
                editor.putBoolean("skipThree", isStarChecked);
                editor.apply();

                Boolean skipThreeVar = sharedPreferences.getBoolean("skipThree", false);

                if (skipThreeVar) { btnThreeView.setBackgroundResource(btnBackgroundDisabledDrawableId); }
                else { btnThreeView.setBackgroundResource(btnBackgroundOnDrawableId); }
                break;
            default:
                editor.putBoolean("skipOne", isStarChecked);
                editor.apply();

                Boolean skipOneVar = sharedPreferences.getBoolean("skipOne", false);

                if (skipOneVar) { btnOneView.setBackgroundResource(btnBackgroundDisabledDrawableId); }
                else { btnOneView.setBackgroundResource(btnBackgroundOnDrawableId); }
                break;
        }
    }

    public void clkDaysFooterLeftRotate(View v)
    {
        Intent intentSwitchRotate = new Intent(RotateActivity.this, WeekActivity.class);
        startActivity(intentSwitchRotate);
    }

    public void clkDoneFooterRightRotate(View v)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("MyWorkoutINIs", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putBoolean("workoutWeekSelected", false);
        editor.apply();

        Intent intentHome = new Intent(RotateActivity.this, MainActivity.class);
        startActivity(intentHome);
    }

    public void btnMuscleStarChangerRotate(View v)
    {
        TextView textView = (TextView) v;
        textView.setSelected(!textView.isSelected());

        int toggleMuscleStarDrawableId = textView.isSelected() ? R.drawable.button_muscle_star_off : R.drawable.button_muscle_star_on;
        textView.setCompoundDrawablesWithIntrinsicBounds(toggleMuscleStarDrawableId, 0, 0, 0);
    }

    public int getSelectedNumberRotate()
    {
        int[] viewIds = {R.id.btnOneRotate, R.id.btnTwoRotate, R.id.btnThreeRotate};

        for (int viewId : viewIds)
        {
            Button buttonBackgroundView = findViewById(viewId);
            if (buttonBackgroundView.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.button_background_on).getConstantState()) ||
                buttonBackgroundView.getBackground().getConstantState().equals(getResources().getDrawable(R.drawable.button_background_disabled).getConstantState()))
            {
                return viewId;
            }
        }
        return 0;
    }

    public void clearSelectedMusclesRotate()
    {
        TextView txtChestRotateView = findViewById(R.id.txtChestRotate);
        TextView txtRestRotateView = findViewById(R.id.txtRestRotate);
        TextView txtSkipRotateView = findViewById(R.id.txtSkipRotate);

        int muscleStarOffDrawableId = R.drawable.button_muscle_star_off;
        txtChestRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOffDrawableId, 0, 0, 0);
        txtRestRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOffDrawableId, 0, 0, 0);
        txtSkipRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOffDrawableId, 0, 0, 0);
    }

    public void assignStoredMuscleValuesRotate(Boolean chestRotateVar, Boolean restRotateVar, Boolean skipRotateVar)
    {
        int muscleStarOnDrawableId = R.drawable.button_muscle_star_on;

        if (chestRotateVar)
        {
            TextView txtChestRotateView = findViewById(R.id.txtChestRotate);
            txtChestRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOnDrawableId, 0, 0, 0);
        }

        if (restRotateVar)
        {
            TextView txtRestRotateView = findViewById(R.id.txtRestRotate);
            txtRestRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOnDrawableId, 0, 0, 0);
        }

        if (skipRotateVar)
        {
            TextView txtSkipRotateView = findViewById(R.id.txtSkipRotate);
            txtSkipRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOnDrawableId, 0, 0, 0);
        }
    }

    public void clearSelectedRestRotate()
    {
        TextView txtRestRotateView = findViewById(R.id.txtRestRotate);

        int muscleStarOffDrawableId = R.drawable.button_muscle_star_off;
        txtRestRotateView.setCompoundDrawablesWithIntrinsicBounds(muscleStarOffDrawableId, 0, 0, 0);
    }

    public void clkFourLeftRotate(View v)
    {

    }

    public void clkFiveLeftRotate(View v)
    {

    }

    public void clkSixLeftRotate(View v)
    {

    }

    public void clkSevenLeftRotate(View v)
    {

    }

    public void clkEightLeftRotate(View v)
    {

    }

    public void clkNineLeftRotate(View v)
    {

    }

    public void clkTenLeftRotate(View v)
    {

    }

    public void clkTricepRightRotate(View v)
    {

    }

    public void clkBackRightRotate(View v)
    {

    }

    public void clkBicepRightRotate(View v)
    {

    }

    public void clkShoulderRightRotate(View v)
    {

    }

    public void clkTrapRightRotate(View v)
    {

    }

    public void clkForearmRightRotate(View v)
    {

    }

    public void clkLegsRightRotate(View v)
    {

    }

    public void clkCoreRightRotate(View v)
    {

    }
}