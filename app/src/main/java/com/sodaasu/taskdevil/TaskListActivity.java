package com.sodaasu.taskdevil;

import android.app.ListActivity;
import android.os.Bundle;


public class TaskListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
    }
}
