package com.example.user.dateandtime;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button datepicker, timepicker;
    EditText txttime, txtdate;
    private int mYear, mMonth, mDay, mHour, mMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txttime = findViewById(R.id.timetxt);
        txtdate = findViewById(R.id.datetxt);
        datepicker = findViewById(R.id.datebtn);
        timepicker = findViewById(R.id.timebtn);


    }

    public void date(View view) {
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                txtdate.setText(dayOfMonth + "-" + (month + 1) + "-" + year);

            }
        }, mYear, mMonth, mDay);
        dpd.show();
    }

    public void time(View view) {
      final Calendar c=Calendar.getInstance();
      mHour=c.get(Calendar.HOUR);
      mMinute=c.get(Calendar.MINUTE);
        TimePickerDialog tpd=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                txttime.setText(hourOfDay + ":" + minute);
            }
            },mHour,mMinute,false);
        tpd.show();
        }

    }





