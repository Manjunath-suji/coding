package linked.list;

public class ll {

    public node head;
    private node tail;
    private int size;

    public ll()   {
        size=0;
        this.head=null;
        this.tail=null;
    }
    public void insertAtPosition(int position, int data) {
        if (position < 0) {
            throw new IllegalArgumentException("Position must be non-negative.");
        }
        head = insertAtPositionRecursive(head, position, data);
        size++;
    }
    public void dup(){
        node temp=head;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;
            }

        } tail=temp;
        tail.next=null;
    }
    private node insertAtPositionRecursive(node node1, int position, int data) {
        if (position == 0) {
            node newNode = new node(data);
            newNode.next = node1;
            return newNode;
        } else if (node1 == null) {
            throw new IndexOutOfBoundsException("Position is out of bounds.");
        } else {
            node1.next = insertAtPositionRecursive(node1.next, position - 1, data);
            return node1;
        }
    }

   public void insert(int value){
        node r=new node(value);

        if(head==null){
            head=r;

            tail=head;
        }
        else{
            r.next=head;

            head=r;
        }

        size++;
   }
    public void last(int value){
        node r=new node(value);
        r.prev=tail;
        tail.next=r;
        r.next=null;
        tail=r;



        size++;
    }
    public void dell(){
        tail=tail.prev;
        size--;
            }
   public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"<--->");
            temp=temp.next;

        }
       System.out.print("null");
   }
    public void reverse(){
        node temp=tail;
        System.out.print("null");
        for(int i=0;i<size;i++){
            System.out.print("<--->"+temp.value);
            temp=temp.prev;

        }
       ;
    }
    public void del(){
        head=head.next;
        head.prev=null;
        size--;
    }
    public void delete(int index){
        node temp=head;
        for(int j=1;j<index;j++){
            temp=temp.next;
        }
        node g=temp.next;
        node f=g.next;
        temp.next=f;
        f.prev=temp;

       size--;


    }



    private class node{
        public int value;
        private node next;
        private node prev;

        public node(int value) {
            this.value = value;

        }

        public node(int value, node prev, node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
