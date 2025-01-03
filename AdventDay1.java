import java.io.*;
import java.util.Arrays;
import java.util.List;


public class AdventDay1 {
    public static void main(String[] args) {
        // init our arrays and vars
     
        int leftArray[];
        int rightArray[];
        int[] sortedLeft;
        int[] sortedRight;
        int tempDist=0;
        int tempLeft=0;
        int tempRight=0;
        long total = 0;
        String strLine;
        long linecount = 0;

   
        BufferedReader fr = new BufferedReader(new FileReader("input.txt")); //open the file as buffered
        
        //read the line, split on the space, and then store the number to an array 
        while ((strLine = fr.readLine()) != null)   {
            String[] tokens = strLine.split("  ");
        //    if (linecount == 0){
         //       leftArray[0] = new int[Integer.parseInt(tokens[0])];
        //        rightArray[0] = new int[Integer.parseInt(tokens[1])];
        //        linecount++;
        //    } else {
                leftArray[leftArray.length + 1] = new int[Integer.parseInt(tokens[0])];
                rightArray[rightArray.length + 1] = new int[Integer.parseInt(tokens[1])];
       //     }
        fr.close();
    

    
        //sort each list
        Arrays.sort(leftArray);
        Arrays.sort(rightArray);

        //now start the add
        for (int i=0; i<=leftArray.length; i++){
            tempLeft = leftArray[i];
            tempRight = rightArray[i];

            tempDist = Math.abs( tempLeft - tempRight);
            total = total + tempDist;

        }

   
        System.out.println("The total is " + total);
   
    }
    }
}