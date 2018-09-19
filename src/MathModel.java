public abstract class MathModel {
    ISortMethod sm;
    int array[];
    protected MathModel() {

    }
    public abstract void setArray(int arrIn[]);
    public abstract void display();
    protected void performSort() {sm.sort();}
    public abstract void changeSort();
}
