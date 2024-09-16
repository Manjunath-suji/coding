public class ll {


    public int size ;
    private node head;
    private node tail;

    public ll(){
        size=0;

    }
    public void insert(int value){
        node n=new node(value);
        if(head==null){
           head=n;
           tail=n;
        }
        n.next=head;
        tail.next=null;
        head=n;
        size++;
    }
    public void last(int value){
        node n=new node(value);
        tail.next=n;
        tail=n;
        size++;

    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void ind(int value,int index){
        node temp=head;
        while (index > 1) {
           temp=temp.next;
        }
        node n=new node(value);

        n.next=temp.next;
        temp.next=n;
        size++;



    }


    class node {
        private int value;
        private node next;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }
}
