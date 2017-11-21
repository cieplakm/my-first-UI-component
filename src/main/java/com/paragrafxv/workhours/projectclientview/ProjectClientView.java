package com.paragrafxv.workhours.projectclientview;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

public class ProjectClientView extends LinearLayout {
    private View root;
    private Project project;
    private Client client;
    private TextView projectTitle;
    private TextView clientTitle;

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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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

        projectTitle = (TextView) root.findViewById(R.id.tv_project_title);
        clientTitle  = (TextView) root.findViewById(R.id.tv_client_title);

        hideProject(false);
        hideClient(false);
    }


    public void setVisible(Visible visible){

        if (visible == Visible.ONLY_CLIENT){
            hideProject(true);
            hideClient(false);
        }else if (visible == Visible.ONLY_PROJECT){
            hideProject(false);
            hideClient(true);
        }else{
            hideProject(false);
            hideClient(false);
        }
    }

    public enum Visible {ONLY_CLIENT, ONLY_PROJECT, BOTH}

    private void hideProject(Boolean disp){
        project.setVisibility(disp ? GONE : VISIBLE);
        projectTitle.setVisibility(disp ? GONE : VISIBLE);

    }

    private void hideClient(boolean b) {
        client.setVisibility(b ? GONE : VISIBLE);
        clientTitle.setVisibility(b ? GONE : VISIBLE);
    }

    public void setTitles(String projectTitle, String clientTitle) {
        project.setText(projectTitle);
        client.setText(clientTitle);
    }


    public void setColors(int projectColor, int colclientColor) {
        if (projectColor!= -1 ){
            project.setProjectColor(projectColor);
        }else {
            project.setProjectColor(getResources().getColor(R.color.colorPrimary));
        }

        if (colclientColor!= -1 ){
            client.setClientColor(colclientColor);
        }else {
            client.setClientColor(getResources().getColor(R.color.colorPrimary));
            client.setColorOfText(getResources().getColor(R.color.colorPrimary));
            client.setBackgroundTansparent();
        }

    }


}
