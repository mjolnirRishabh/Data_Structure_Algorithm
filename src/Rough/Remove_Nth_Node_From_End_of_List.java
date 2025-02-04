import java.util.LinkedList;

public class Remove_Nth_Node_From_End_of_List {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList();
        int n=2;

        list.addFirst(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == n){
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
