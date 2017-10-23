import java.util.ArrayList;

public class Container {
    private int capacity = 10;
    private ArrayList<Integer> array = new ArrayList<>();

    public Container(){

    }

    @Override
    public String toString() {
        return "Container{" +
                "array=" + array +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void add(int x){
        this.array.add(x);
    }
}
