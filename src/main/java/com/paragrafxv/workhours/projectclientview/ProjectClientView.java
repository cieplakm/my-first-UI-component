package com.paragrafxv.workhours.projectclientview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

/**
 * Created by Moni on 2017-11-19.
 */

public class ProjectClientView extends LinearLayout {
    private String projectTitle;
    private String clientTitle;
    private int projectColor;
    private int clientColor;
    private View root;
    private Project project;
    private Client client;

    public ProjectClientView(Context context) {
        super(context);
        init();
    }

    public ProjectClientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ProjectClientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public ProjectClientView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        super.setOnClickListener(l);
    }

    public void init(){
        root = LayoutInflater.from(getContext()).inflate(R.layout.layout,null,false);


        //int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT);


        root.setLayoutParams(layoutParams);
        addView(root);



        project  = (Project) root.findViewById(R.id.project);
        client  = (Client) root.findViewById(R.id.client);
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
        project.setText(projectTitle);
    }

    public void setClientTitle(String clientTitle) {
        this.clientTitle = clientTitle;
        client.setText(clientTitle);
    }

    public void setProjectColor(int color) {
        this.projectColor = projectColor;
        project.setProjectColor(color);
    }

    public void setClientColor(int color) {
        this.clientColor = clientColor;
        client.setClientColor(color);
    }
}
