
//----------------------------------------------------------------------
// Towers.java          by Dale/Joyce/Weems                    Chapter 4
//
// Driver class for doTowers method that gets initial values and
// calls the method.
//
// Modified by Andrew Katz (Fall 2017):
//      made auxiliary output conditional
//      modified user input
//      changed some variable names
//----------------------------------------------------------------------

import java.util.Scanner;

/**
 * demonstrate classic recursion problem <br>
 * Towers of Hanoi is a puzzle consisting of: <br>
 * Three rods and a number of disks of different sizes, <br>
 * which can slide onto any rod. <br>
 * The puzzle starts with the disks in a neat stack in ascending order <br>
 * of size on one rod, the smallest at the top, thus making a conical shape. <br>
 * The objective of the puzzle is to move the entire stack to another rod, <br>
 * obeying the following simple rules: <br>
 *    Only one disk can be moved at a time. <br>
 *    Each move consists of taking the upper disk from one of the stacks <br>
 *                          and placing it on top of another stack. <br>
 *    No disk may be placed on top of a smaller disk.
 */
public class TowerOfHanoi
{

    private static String indent = "";  // indentation for trace
    private static int count;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nrRings;
        boolean keepAsking = true;
        while (keepAsking){
            System.out.println("Input the number of rings");
            nrRings = input.nextInt();

            if(nrRings<0){
                keepAsking = false;
            }else{
                //calculate the tower of hanoi
                boolean traceOn = getBool("Show Recursion Trace? ");
                System.out.println("Towers of Hanoi with " + nrRings + " rings\n");
                doTowers(nrRings, 1, 2, 3, traceOn);
                System.out.println("Number of moves: " + count);
            }
        }
    }


    /**
     * doTowers - recursively solve the Tower of Hanoi puzzle
     *
     * @param nrRings - int: number of rings to use
     * @param srcPeg - int: peg on which the rings are stacked: 0, 1, or 2
     * @param auxPeg - int: empty peg: 0, 1, or 2
     * @param tgtPeg - int: peg into which the rings are to be transferred
     * @param traceOn - boolean: display recursive calls or not
     */
    public static void doTowers(
            int nrRings,        // Number of rings to move
            int srcPeg,         // Peg containing rings to move (source)
            int auxPeg,         // Peg holding rings temporarily (auxiliary)
            int tgtPeg,         // Peg receiving rings being moved (target)
            boolean traceOn)    // show recursion trace or not flag
    {
        if (nrRings > 0)
        {
            //<editor-fold defaultstate="collapsed" desc="tracing">
            if (traceOn)
            {
                indent = indent + "  ";
//                System.out.println(indent
//                        + "Enter: Goal is to move " + nrRings
//                        + (nrRings == 1 ? " ring" : " rings")
//                        + " from peg " + srcPeg
//                        + " to peg " + tgtPeg
//                        + " thru aux peg " + auxPeg);
            }
            //</editor-fold>

            // Move nrRings - 1 rings from starting peg to auxiliary peg
            doTowers(nrRings - 1, srcPeg, tgtPeg, auxPeg, traceOn);

            // Move nth ring from starting peg to ending peg
            count++;
            System.out.println(indent + "Move ring " + nrRings
                    + " from peg " + srcPeg
                    + " to peg " + tgtPeg);

            // Move nrRings - 1 rings from auxiliary peg to ending peg
            doTowers(nrRings - 1, auxPeg, srcPeg, tgtPeg, traceOn);

            //<editor-fold defaultstate="collapsed" desc="tracing">
//            if (traceOn)
//            {
//                System.out.println(indent + "Exit case " + nrRings);
//                indent = indent.substring(2);
//            }
            //</editor-fold>
        }
    }

    /**
     * getInt - get integer input from the user
     *
     * @param lBound - int: minimal acceptable
     * @param uBound - int: maximal acceptable
     * @return int - user input
     */
    private static int getInt(int lBound, int uBound)
    {
        return getInt("Please enter an integer between ", lBound, uBound);
    }

    private static int getInt(String prompt, int lBound, int uBound)
    {
        int intRV = 0;
        System.out.printf(prompt);
        System.out.printf("between %d  and  %d\n",
                lBound, uBound);
        Scanner kbd = new Scanner(System.in);
        String usrInput = "";
        do
        {
            usrInput = kbd.nextLine();
            try
            {
                intRV = Integer.parseInt(usrInput);
                if (intRV < lBound || intRV > uBound)
                {
                    System.out.println(usrInput + " is not a valid number");
                }
            }
            catch (Exception ex)
            {
                System.out.println(usrInput + " is not a number");
            }
        }
        while (lBound > intRV || uBound < intRV);

        return intRV;
    }

    /**
     * getBool - get a yeah or nay response from the user
     *
     * @param prompt
     * @return
     */
    public static boolean getBool(String prompt)
    {
        boolean blnRV = false;  // defaulting to false
        Scanner kbd = new Scanner(System.in);
        System.out.println(prompt);
        String usrInput = kbd.nextLine();
        char yY = usrInput.charAt(0);
        blnRV = yY == 'y' || yY == 'Y';
        return blnRV;
    }
}
