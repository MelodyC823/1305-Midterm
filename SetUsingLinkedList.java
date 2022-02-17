public class SetUsingLinkedList implements SetInterface{

        Node head;
        SetUsingLinkedList(){
            head = null;
            size =0 ;
        }
        int size;
        public void add(int a){
            Node aNewNode = new Node();
            aNewNode.data = a;

            if(size == 0){
                head = aNewNode;
            }else {

                Node i = head;
                Node prev = i;
                while (i != null && a > i.data ) {
                    prev = i;
                    i = i.next;
                }

                if(i == prev){
                    aNewNode.next = head;
                    head  = aNewNode;
                }else{
                    prev.next = aNewNode;
                    aNewNode.next = i;
                }

            }
            size++;
        }

        public Integer remove(int i){
            if(size == 0)
                return  null;
            Integer result = head.data;
            head = head.next;
            return result;
        }

        public boolean contains(int a){
            Node i = head;
            while(i != null){
                if(a == i.data)
                    return true;

                i = i.next;
            }
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
            SetInterface aPriorityQueue = new SetUsingLinkedList();
            aPriorityQueue.add(1);
            aPriorityQueue.add(3);
            aPriorityQueue.add(8);

            aPriorityQueue.remove(8);


            System.out.println(aPriorityQueue.contains(5));
            System.out.println(aPriorityQueue.isEmpty());
            System.out.println(aPriorityQueue.getSize());

        }
    }

