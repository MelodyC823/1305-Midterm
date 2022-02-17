
public class SetUsingArray implements SetInterface {

    int []arr = new int[1000];
    int size = 0;

    public void add(int a){
        if(size == 0)
            arr[size++] = a;
        int i = 0;

        while(a > arr[i] && i < size - 1){
            i++;
        }
        int position = i;

        int j = size-1;
        while(j >= i){
            arr[j+1] = arr[j];
            j--;
        }
        arr[i] = a;
        size++;
    }

    public Integer remove(int i){

        if(size ==0)
            return  null;

        int j = 0;
        while(j < size-1){
            arr[j] = arr[j+1];

            j++;
        }
        return arr[j];
    }

    public boolean contains(int a){

        return false;
    }

    public boolean isEmpty(){
        return  size == 0;
    }

    public Integer getSize(){
        return size;
    }



    // driver code
    public static void main(String[] args) {
        SetInterface aPriorityQueue = new SetUsingArray();
        aPriorityQueue.add(1);
        aPriorityQueue.add(3);
        aPriorityQueue.add(8);
        aPriorityQueue.remove(8);

        System.out.println(aPriorityQueue.contains(2));
        System.out.println(aPriorityQueue.isEmpty());
        System.out.println(aPriorityQueue.getSize());

    }
}

