public abstract class MathModel {
    ISortMethod sm;
    int array[];
    public MathModel() {

    }
    public abstract void setArray(int arrIn[]);
    public abstract void display();
    public void performSort() {sm.sort();}
    public abstract void changeSort();
}
