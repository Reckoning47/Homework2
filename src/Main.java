public class Main {
    public static void main(String args[]){
        int myarray[] = {1,3,2,7,5};
        MathModel m = new MyMath(myarray);
        m.display();
        m.performSort();
        m.display();
    }
}
