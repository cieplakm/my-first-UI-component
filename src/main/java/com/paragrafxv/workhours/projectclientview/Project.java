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
        setBackground(getResources().getDrawable(R.drawable.border_client));
    }

   public void setProjectColor(int color){
       GradientDrawable stroke = (GradientDrawable) getBackground();
       setTransparentBackground(stroke);
       setTextColor(color);
       stroke.setStroke(2, color);//border
   }

    private void setTransparentBackground( GradientDrawable stroke){
        stroke.setColor(null);//background color
    }



}
