package com.paragrafxv.workhours.projectclientview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public class ProjectClientView extends LinearLayout {
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
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT);
        root.setLayoutParams(layoutParams);
        addView(root);
        project  = (Project) root.findViewById(R.id.project);
        client  = (Client) root.findViewById(R.id.client);
    }

    public void setProjectTitle(String projectTitle) {
        project.setText(projectTitle);
    }

    public void setClientTitle(String clientTitle) {
        client.setText(clientTitle);
    }

    public void setProjectColor(int color) {
        project.setProjectColor(color);
    }

    public void setClientColor(int color) {
        client.setClientColor(color);
    }
}
