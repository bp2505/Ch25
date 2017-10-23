import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CH25 {
    public static void main(String[]Args){
        Scanner kbd = new Scanner(System.in);
        System.out.println("enter the number of objects");
        int size = kbd.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Container> array = new ArrayList<>();
        System.out.println("enter the weight of the objects");
        for (int x = 0; x < size; x++){
            list.add(kbd.nextInt());
        }
        Collections.sort(list);
        Integer x = -1;
        list.add(x);
        list.trimToSize();
        //System.out.println(list.size());
        array.add(new Container());
        System.out.println(list.size());
        int counter = 0;
        array.add(new Container());
        array.get(0).add(list.get(0));
        array.get(0).setCapacity(array.get(0).getCapacity()-list.get(0));
        for (int count = 1; count<size-1; count++){
                while ((array.get(counter).getCapacity() - list.get(count) <= 10)&&
                        (array.get(counter).getCapacity() - list.get(count) >= 0)&&(list.get(count)!=-1)) {
                    array.get(counter).setCapacity(array.get(counter).getCapacity() - list.get(count));
                    array.get(counter).add(list.get(count));
                    count++;
                }
                if ((array.get(counter).getCapacity() - list.get(count) < 0)) {
                    ++counter;
                    array.add(new Container());
                    array.get(counter).add(list.get(count));
                    array.get(counter).setCapacity(array.get(counter).getCapacity()-list.get(count));
                }
        }
        array.get(array.size()-1).add(list.get(size-1));
        array.get(array.size()-1).setCapacity(array.get(counter).getCapacity()-list.get(size-1));

        System.out.println(array.size());
        for (Container y: array){
            System.out.println(y.toString());
        }

    }
}
