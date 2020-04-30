package com.app.datetimepickerusingdialogfragment;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker.
        final Calendar c = Calendar.getInstance();
        int hours = c.get(Calendar.HOUR_OF_DAY);
        int minutes = c.get(Calendar.MINUTE);
        // Create a new instance of TimePickerDialog and return it.
        return new TimePickerDialog(getActivity(), this, hours, minutes, true);
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hours, int minutes) {
        PickerActivity activity=(PickerActivity)getActivity();
        activity.processTimePickerResult(hours,minutes);

    }
}
