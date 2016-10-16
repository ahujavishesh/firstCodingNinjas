package com.vishesh.todo;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by Vishesh on 10-09-2016.
 */
public class ThingAdapter extends ArrayAdapter<Things>
{


    public ThingAdapter(Context context, int resource) {
        super(context, resource);
    }
}
