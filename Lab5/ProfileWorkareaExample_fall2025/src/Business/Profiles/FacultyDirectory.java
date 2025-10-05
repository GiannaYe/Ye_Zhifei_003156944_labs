/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import java.util.*;
import Business.Business;
import Business.Person.Person;

/**
 *
 * @author yzf01
 */
public class FacultyDirectory {
    ArrayList<FacultyProfile> list; 
    
    public FacultyDirectory() {
        list = new ArrayList<>();
    }
    
    public FacultyProfile newFacultyProfile (Person p) {
        FacultyProfile fp = new FacultyProfile(p);
        list.add(fp);
        return fp;
    }
    
    public FacultyProfile findFaculty(String id) {

        for (FacultyProfile sp : list) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
        return null; //not found after going through the whole list
    }
}
