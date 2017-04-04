/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Performs the sorting on Point type using Comparable according to X coordinates and calls Comparator method of another class Compare Y to compare Y coordinates
 * @author sharanya
 */
public class Point implements Comparable<Point> {

    private int x;
    private int y;
    List<Point> list = new ArrayList<Point>();

    Point() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   /** 
    * get method for X 
    * @return x value for X
    */
    public Integer getX() {
        return x;
    }

    /**
     * set method for Y
     * @param x value for x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * get method for Y
     * 
     * @return y value of Y
     */
    public Integer getY() {
        return y;
    }

    /**
     * Set method for Y
     * @param y value for y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Constructor for Point
     * @param x value for X
     * @param y value for Y
     */
    public Point(int x, int y) {
        this.x = x;//intialises X value of this object
        this.y = y;//intialises Y value of this object
    }

    /**
     * Performs comparison of points on X coordinates
     * @param otherPoint object to compare this object with
     * @return 
     */
    @Override
    public int compareTo(Point otherPoint) {       
        if(this.getX()==otherPoint.getX()) // if x values are same, return difference between y coordinates
            
                return  this.getY().compareTo(otherPoint.getY());
        else
            return this.getX().compareTo(otherPoint.getX()); // otherwise returns difference between x coordinates
         
    }
    /**
     * Generates 100 random points and adds to arraylist "list"
     */
    public void generatePoints()
    {
        
        for(int i=0;i<100;i++)
        {
        list.add(new Point((int) (Math.random() * 50) + 0,(int) (Math.random() * 50) + 0)); //generates x and y value between 0 and 50
        }
    }
    
/**
 * Sorts the list of points using  compareTo method and compare Method of CompareY class
 */
    public void sortPoints()
    {
        Collections.sort(list);  // Sorts the array list using comparable-  compareTo method of Point, according to x coordinates
        System.out.println("\nAfter Sorting according to X: ");

        for (Point a : list) // printing the sorted list according to Y axes
        {
            System.out.printf("%-3d %-1s %-3d\n",a.getX(),"," , a.getY() );
        }
         CompareY obj= new CompareY(); //Object declaration for Y class to implement comparator- sorting accoridng to y coordinates
         Collections.sort(list,obj); //Use of two parameters to invoke CompareY class' comparemethod
         
        // Sorts the array list

        // Sorts the array list using comparator - according to Y coordinates
        System.out.println("\nAfter Sorting according to Y: ");

        for (Point a : list) // printing the sorted list according to Y axes
        {
            System.out.printf("%-3d %-1s %-3d\n",a.getX(),"," , a.getY() );
        }
        
    }
    
    /**
     * Displays list of points in the array list
     */
 public void displayPoints()
    {
     
         
        // Sorts the array list

        // Sorts the array list using comparator
        System.out.println("Contents of List");

        for (Point a : list) // printing the sorted list of ages
        {
            System.out.printf("%-3d %-1s %-3d\n",a.getX(),"," , a.getY() );
        }
    }

  
    
}
