/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

import java.util.Comparator;

/**
 *  Implements comparator for Point object for sorting according to Y coordinates
 * @author sharanya
 */
public class CompareY implements Comparator<Point>{

    /**
     * Compares two points on Y coordinates
     * @param o1 point object 1
     * @param o2 point object 2
     * @return 
     */
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
               
    
    
    
    }

    @Override
    public int compare(Point o1, Point o2) {
        if(o1.getY()==o2.getY()) //If Y values are same, returns difference between x coordinates
        {
            //int x= o1.getX();
            
            return o1.getX().compareTo(o2.getX());
        }
        else
        {
            //int y= o1.getY();
            
            return o1.getY().compareTo(o2.getY());    // otherwise return Difference between Y coordinates
        }
    }
    
    
}

