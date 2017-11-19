package com.paragrafxv.workhours.projectclientview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;




/**
 * Created by mcieplak on 2017-11-17.
 */

class Project extends android.support.v7.widget.AppCompatTextView{
    public Project(Context context) {
        super(context);
    }

    public Project(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Project(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init(){
        setPadding(5,5,5,5);
    }

   public void setProjectColor(int color){


       setBackground(getResources().getDrawable(R.drawable.border_client));
       GradientDrawable stroke = (GradientDrawable) getBackground();
       stroke.setColor(null);
       setTextColor(color);
       stroke.setStroke(2, color);
   }



}
