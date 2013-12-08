package com.czytelnyblog.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Person {
    private String name;        
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public Person(String name) {
        this.name = name;
    }    
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        String old = this.name;
        this.name = name;                  
        changeSupport.firePropertyChange("name", old, name);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
 
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
