package kcohen.calendartry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.CalendarView;
import android.content.Intent;

public class CalendarMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_main);
    }

    public void editNote(View view){

        Intent intent = new Intent(this, EditNoteActivity.class);


    }

}
