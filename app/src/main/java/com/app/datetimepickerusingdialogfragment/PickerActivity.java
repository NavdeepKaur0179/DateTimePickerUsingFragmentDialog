package com.app.datetimepickerusingdialogfragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class PickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker);
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),getString(R.string.datepicker));
    }
    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month+1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        String dateMessage = (month_string +
                "/" + day_string + "/" + year_string);
        Toast.makeText(this, getString(R.string.date_selected) + dateMessage,
                Toast.LENGTH_SHORT).show();
    }

    public void showTimePicker(View view) {
       DialogFragment timeFragement=new TimePickerFragment();
       timeFragement.show(getSupportFragmentManager(),getString(R.string.timepicker));
    }

    public void processTimePickerResult(int hours,int minutes) {
        String hour_string = Integer.toString(hours);
        String minutes_string = Integer.toString(minutes);
        String timeMessage=(hour_string+" :" +minutes_string);
        Toast.makeText(this, getString(R.string.time_selected) + timeMessage,
                Toast.LENGTH_SHORT).show();
    }
}
