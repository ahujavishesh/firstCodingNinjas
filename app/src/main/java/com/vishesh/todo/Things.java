package com.vishesh.todo;

import android.widget.TextView;

import java.util.Date;

/**
 * Created by Vishesh on 10-09-2016.
 */
public class Things
{
    String title;
    String content;
    Date date;
    Things(String title,String content,Date date)
    {
        this.title=title;
        this.content=content;
        this.date=date;
    }
}
