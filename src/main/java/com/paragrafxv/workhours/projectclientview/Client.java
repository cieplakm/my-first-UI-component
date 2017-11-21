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

        setBackground(getResources().getDrawable(R.drawable.border_client));
    }

   public void setClientColor(@ColorInt int color){
       GradientDrawable stroke = (GradientDrawable) getBackground();
       stroke.setColor(color);
       stroke.setStroke(2, color);
       setWhiteText();
   }

    public void setBackgroundTansparent(){
       GradientDrawable stroke = (GradientDrawable) getBackground();
       stroke.setColor(null);
       setDarkText();
   }

    private void setWhiteText(){
        setColorOfText(getResources().getColor(R.color.ColorWhite));
    }

    private void setDarkText(){
        setColorOfText(getResources().getColor(R.color.colorPrimary));
    }

    public void setColorOfText(@ColorInt int color){
       setTextColor(color);
   }


}
