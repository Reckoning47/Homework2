/*Chris Cooper
*  ESOF 322 section 1
*  9/19/2018
*
*  Sources: https://www.geeksforgeeks.org/merge-sort/
*                                        /insertion-sort/
*                                        /bubble-sort/
*           "Head First Design Patterns"; Elisabeth Freeman and Kathy Sierra
*
*/


public class Main {
    public static void main(String args[]){
        //first input array
        int myarray[] = {-1, 0, 9999, 1,3,2,7,5};
        int myarray2[] = {3,2,1};
        //creates a new MyMath instance with default sort method of BubbleSort Sort
        MathModel m = new MyMath(myarray);
        //displays the array
        m.display();
        //sorts the array
        m.performSort();
        //displays the now sorted array
        m.display();
        //set the working array to myarray2[]
        m.setArray(myarray2);
        //display the unsorted myarray2[]
        m.display();
        //change the sorting method to MergeSort REQUIRES USER INPUT OF "2"
        m.changeSort();
        //sort using MergeSort (we tested to make sure it worked :) )
        m.performSort();
        //display the now sorted myarray2[]
        m.display();
    }
}
