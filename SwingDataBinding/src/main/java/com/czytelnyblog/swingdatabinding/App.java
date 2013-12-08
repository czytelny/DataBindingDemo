package com.czytelnyblog.swingdatabinding;

import com.czytelnyblog.model.Person;
import com.czytelnyblog.view.MainView;
import com.czytelnyblog.view.SubformView;


public class App 
{
    
    public static void main( String[] args )
    {
        Person p1 = new Person("czytelnyblog.wordpress.com");
        MainView mainView = new MainView(p1);
        SubformView subformView = new SubformView(p1);
        
        mainView.setLocationByPlatform(true);
        mainView.setVisible(true);
        subformView.setLocationByPlatform(true);
        subformView.setVisible(true);        
    }
}
