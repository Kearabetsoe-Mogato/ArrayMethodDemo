/**
 *
 * @author kearabetsoe mogato
 */
public class ArrayMethodDemo {
    public static void main(String[] args) {
        // display all integers
        //declaring the arrays
        int Eight[] = {8, 16, 24, 7, 14, 21, 6, 12};
        int sum=0;


        //HEADER
        System.out.println("\t first to last");
        //from first to last
        for (int counter = 0; counter < Eight.length; counter ++){
            System.out.println(counter + "\t" + Eight[counter] );
        }



        //HEADER
        System.out.println("\tLast to First");
        //from last to first
        {
            System.out.println( "\t" + Eight[7] +"\n\t"+ Eight[6]+"\n\t"+ Eight[5]+"\n\t"+ Eight[4]+"\n\t"+ Eight[3]+"\n\t"+ Eight[2]+"\n\t"+ Eight[1]+"\n\t"+ Eight[0]);
        }


        //the sum of the integers
        for (int counter = 0; counter < Eight.length; counter ++){
            sum+=Eight[counter];
        }
        System.out.println("the sum of these numbers is " + sum );


        //integers less than 5
        for (int counter = 0; counter < Eight.length; counter ++){
            System.out.println(counter + "\t" + Eight[counter] + "\t\t"  );
        }


    }

}
