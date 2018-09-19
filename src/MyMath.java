public class MyMath extends MathModel {
    public MyMath(int arr[]) {
        array = arr;
        sm = new BubbleSort(array);
    }
    public void display()
    {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
