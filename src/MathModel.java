public abstract class MathModel {
    ISortMethod sm;
    int array[];
    public MathModel() {

    }
    public void setArray(int arrIn[]) {
        this.array = arrIn;
    }
    public abstract void display();
    public void performSort() {sm.sort();}
}
