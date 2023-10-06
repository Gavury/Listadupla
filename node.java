class Node {
        int data;
            Node next;
                Node prev;

                    public Node(int data) {
                            this.data = data;
                                }
                                }

                                class DoublyLinkedList {
                                    Node head;

                                        public void insertSorted(int data) {
                                                Node newNode = new Node(data);

                                                        if (head == null || data <= head.data) {
                                                                    newNode.next = head;
                                                                                newNode.prev = null;
                                                                                            if (head != null) {
                                                                                                            head.prev = newNode;
                                                                                                                        }
                                                                                                                                    head = newNode;
                                                                                                                                                System.out.println("Passo: Inserido " + data + " na posição inicial.");
                                                                                                                                                            return;
                                                                                                                                                                    }

                                                                                                                                                                            Node current = head;
                                                                                                                                                                                    while (current.next != null && current.next.data < data) {
                                                                                                                                                                                                current = current.next;
                                                                                                                                                                                                        }

                                                                                                                                                                                                                newNode.next = current.next;
                                                                                                                                                                                                                        if (current.next != null) {
                                                                                                                                                                                                                                    current.next.prev = newNode;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                    current.next = newNode;
                                                                                                                                                                                                                                                            newNode.prev = current;
                                                                                                                                                                                                                                                                    System.out.println("Passo: Inserido " + data + " após " + current.data);
                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                            public void display() {
                                                                                                                                                                                                                                                                                    Node current = head;
                                                                                                                                                                                                                                                                                            while (current != null) {
                                                                                                                                                                                                                                                                                                        System.out.print(current.data + " ");
                                                                                                                                                                                                                                                                                                                    current = current.next;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                    System.out.println();
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                        public class Main {
                                                                                                                                                                                                                                                                                                                                            public static void main(String[] args) {
                                                                                                                                                                                                                                                                                                                                                    DoublyLinkedList list = new DoublyLinkedList();

                                                                                                                                                                                                                                                                                                                                                            int[] elementos = {5, 15, 10, 20, 3};
                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                            for (int elemento : elementos) {
                                                                                                                                                                                                                                                                                                                                                                                        list.insertSorted(elemento);
                                                                                                                                                                                                                                                                                                                                                                                                    list.display();
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                
}