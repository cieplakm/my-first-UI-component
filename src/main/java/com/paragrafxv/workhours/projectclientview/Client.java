package com.paragrafxv.workhours.projectclientview;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;


/**
 * Created by mcieplak on 2017-11-17.
 */

class Client extends android.support.v7.widget.AppCompatTextView{
    public Client(Context context) {
        super(context);
    }

    public Client(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Client(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void init(){
        setPadding(5,5,5,5);
    }

   public void setClientColor(@ColorInt int color){

       setTextColor(getResources().getColor(R.color.ColorWhite));
       setBackground(getResources().getDrawable(R.drawable.border_client));
       
       GradientDrawable stroke = (GradientDrawable) getBackground();

       stroke.setColor(color);

       stroke.setStroke(2, color);
   }




}
