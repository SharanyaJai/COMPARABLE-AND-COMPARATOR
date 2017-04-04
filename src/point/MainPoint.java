/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

import java.util.ArrayList;
import java.util.List;

/**
 * Invokes the object of Point class to perform operation on point type
 * @author sharanya
 */
public class MainPoint {
 public static void main(String[] args) {
        // TODO code application logic here
        
        Point obj1= new Point();
Point p= null;// declares an object of Point class
        obj1.generatePoints();// invokes geenaretmethod to genearte points for the decalared object
        obj1.displayPoints();// invokes display method to display the points
        obj1.sortPoints();// invokes sort points method to sort the points
        
         
        String x="Sharan";
        System.out.println(x.substring(1, 4)+"\n"+x.charAt(2));
        p.generatePoints();
        System.out.println();

    }
   
}
