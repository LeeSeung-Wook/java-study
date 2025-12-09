package ex06;

class MyLikedList {
    MyNode root;

    public void add(MyNode node){
        // 1. 처음 노드는 root에 무조건 넣는다.
        if(this.root == null){
            this.root = node;
        }

        // 2. 최초 노드로 가서 root에서부터 next가 null인지 검증하기
        // 두번째는 next가 null이 아니니까 넣어


        // 2---. 두번째 노드는 root에 next에 무조건 넣는다.
        // 3---. 세번째 노드는 root에 next의 next에 넣는다.
    }

    public void remove(MyNode node){

    }

    public MyNode get(String key){
        return null;
    }
}

class MyNode {
    String key;
    String value;
    MyNode next;

    public MyNode(String key, String value, MyNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}



public class MyList02 {
    public static void main(String[] args) {
        MyLikedList myList = new MyLikedList();

        MyNode myNode1 = new MyNode("name","홍길동", null);
        //myList.root = myNode1;

        MyNode myNode2 = new MyNode("age","15", null);
        //myNode1.next = myNode2;

        MyNode myNode3 = new MyNode("weight","50", null);
        //myNode2.next = myNode3;

        myList.add(myNode1); // root에 담기
        myList.add(myNode2); // root의 next에 담기
        myList.add(myNode3);

        myList.remove(null);

        MyNode node = myList.get("name");
    }
}