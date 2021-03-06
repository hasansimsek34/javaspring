package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Java implements Course {
    @Autowired
    private OfficeHours officeHours;
  /*  //constructor injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
*/
    public OfficeHours getOfficeHours() {
        return officeHours;
    }
    /*
    //Setter injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
    */
    @Override
    public void getTeachingHours(){

        System.out.println("Weekly Teaching Hours: "+(30+officeHours.getHours()));
    }

}
