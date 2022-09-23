
/**
 * Has two classes, one that outputs the combination, and one that outputs the permutation
 *
 * @author Matthew Roesch
 * @version 1.0
 */
import java.util.*;
public class CombAndPerm
{
    // instance variables
    private double n;
    private double r;

    /**
     * Constructor for objects of class CombAndPerm
     */
    public CombAndPerm(double possible, double required)
    {
        // initialise instance variables
        n = possible;
        r = required;
    }

    /**
     * @param  none
     * @return    (n!)/(n!*(n-r)!)
     */
    public double combination()
    {
        double numerator = 1;
        double temp1 = n;
        double denominator = 1;
        double temp2 = n - r;
        double result = 0;
        while (temp1 > 0)
        {
            numerator = numerator * temp1;
            temp1--;
        }
        while (temp2 > 0)
        {
            denominator = denominator * temp2;
            temp2--;
        }
        denominator = denominator * numerator;
        result = numerator / denominator;
        return result;
    }
    
    /**
     * @param  none
     * @return    (n!)/((n-r)!)
     */
    public double permutation()
    {
        double numerator = 1;
        double temp1 = n;
        double denominator = 1;
        double temp2 = n - r;
        double result = 0;
        while (temp1 > 0)
        {
            numerator = numerator * temp1;
            temp1--;
        }
        while (temp2 > 0)
        {
            denominator = denominator * temp2;
            temp2--;
        }
        result = numerator / denominator;
        return result;
    }
}
