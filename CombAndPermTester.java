
/**
 * Test the CombAndPerm class
 *
 * @author Matthew Roesch
 * @version 1.0
 */
import java.util.*;
public class CombAndPermTester
{
    public static void main (String[] args)
    {
        CombAndPerm comb_permtest = new CombAndPerm(52,5);
        System.out.println(comb_permtest.combination());
        System.out.println(comb_permtest.permutation());
    }
}
