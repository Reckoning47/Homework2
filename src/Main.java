public class Main {
    public static void main(String args[]){
        int myarray[] = {1,3,2,7,5};
        int myarray2[] = {3,2,1};
        MathModel m = new MyMath(myarray);
        m.display();
        m.performSort();
        m.display();
        m.setArray(myarray2);
        m.display();
        m.performSort();
        m.display();
        m.changeSort();
    }
}
