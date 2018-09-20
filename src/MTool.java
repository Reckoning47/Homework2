import java.util.Scanner;
public class MTool extends MathModel {
    public MTool(int arr[]) {
        array = arr;
        sm = new MergeSort(array);
    }

    public void setArray(int[] arrIn) {
        array = arrIn;
        sm = new MergeSort(array);
    }

    public void display()
    {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public void changeSort() {
        int selection;
        System.out.println("Welcome to our sort method selection menu!\n" +
                "What sort method would you like to use?\n" +
                "1 - BubbleSort\n" +
                "2 - MergeSort\n" +
                "3 - InsertionSort\n");
        Scanner input = new Scanner(System.in);
        selection = input.nextInt();
        if (selection == 1){
            System.out.println("You have selected BubbleSort!");
            sm = new BubbleSort(array);
        }
        else if (selection == 2){
            System.out.println("You have selected MergeSort!");
            sm = new BubbleSort(array);
        }
        else if (selection == 3){
            System.out.println("You have selected InsertionSort!");
            sm = new InsertionSort(array);
        }
        //TODO FIX BREAKING AT 2ND INVALID INPUT
        else{
            System.out.println("Invalid selection! Try again");
            selection = input.nextInt();
        }
    }
}
