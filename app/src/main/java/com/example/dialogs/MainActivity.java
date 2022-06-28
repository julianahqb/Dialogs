package com.example.dialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements MyDialog.onExitListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDialog(View view) {
        MyDialog dialog = new MyDialog();
        dialog.show(getSupportFragmentManager(), "dialog");
    }

    @Override
    public void onExit() {
        finish();
    }

    public void openDialogSimpleList(View view) {
        MyDialogSimpleList dialogSimpleList = new MyDialogSimpleList();
        dialogSimpleList.show(getSupportFragmentManager(), "dialogSimpleList");
    }

    public void openTimePicker(View view) {
        MyTimePickerDialog timePickerDialog = new MyTimePickerDialog();
        timePickerDialog.show(getSupportFragmentManager(), "dialog");
    }

    public void openDatePicker(View view) {
        MyDatePickerDialog datePickerDialog = new MyDatePickerDialog();
        datePickerDialog.show(getSupportFragmentManager(), "dialog");
    }
}