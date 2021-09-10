package com.example.custom_toast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class custom_toast extends Toast {

    View rootView;

    public custom_toast(Context context, int duration, String text) {
        super(context);

        rootView=LayoutInflater.from(context).inflate(R.layout.custom_toast_layout,null);
        this.setDuration(duration);
        TextView v =rootView.findViewById(R.id.tvTitle);
        v.setText(text);
        setView(rootView);
    }
    public static custom_toast ct(Context context,String text,int duration){
        return new custom_toast(context,duration,text);
    }
}
//TODO:1.Create a project
//TODO:2.Design an xml layout and make a button just
//TODO:3.Make a new layout for custom Toast
//TODO:4.Make a java class,extend it with Toast and override its methods
//TODO:5.Define a class View and make a refrence variable of it                 Line No 13
//TODO:6.Make a static class with return data type name of class ,give function name,pass parameters  Line No 24
//TODO:7.return this class with name_Of_Parent_Class(and give parameters)                             Line No 25
//TODO:8.error will come and override all mthods
//TODO:9.Then make Parent class private                                                               Line No 15
//TODO:10.Now from refrence variable of View which is rootView find layout                            Line No 18
//TODO:11.then set Duration                                                                           Line No 19
//TODO:12.find textView from rootView                                                                 Line No 20
//TODO:13.Then set this TextView                                                                      Line No 21
//TODO:14.Then set View                                                                               Line No 22


