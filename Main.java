import java.util.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.LinkedList;

class InvalidInputException extends Exception
{
    InvalidInputException(String str)
    {

        super(str);
    }
}
class Linked_list
{
    static void func() {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();
        char ch, choice;
        do {
            ch = ' ';
            try {
                System.out.println("Enter which operation you would be like to perform" +"\n"+
                        "A:Insert" + "\n" +
                        "B:Insert at Position" + "\n" +
                        "C:Delete" + "\n" +
                        "D:Delete at position" + "\n" +
                        "E:Centre" + "\n" +
                        "F:Sort" + "\n" +
                        "G:Reverse" + "\n" +
                        "H:Size" + "\n" +
                        "I:Iterator" + "\n" +
                        "J:Traverse/Print");
                ch = sc.next().charAt(0);
                switch (ch) {
                    case 'A': {
                        System.out.print("Enter data : ");
                        int data = sc.nextInt();

                        ll.add(String.valueOf(data));
                        break;
                    }
                    case 'B': {
                        System.out.print("Enter data : ");
                        int data1 = sc.nextInt();
                        System.out.println("Enter Position");
                        int position = sc.nextInt();
                        StringBuilder st = new StringBuilder();
                        StringBuilder st1 = new StringBuilder();
                        for (String integer : ll) {
                            st.append(integer).append(" ");
                        }
                        for(int i = 0; i < ll.size(); i++)
                        {
                            st1.append(st.charAt(i));
                            if( i == position)
                            {
                                st1.append(data1).append(" ");
                            }
                        }
                        System.out.println("\n" + st1);
                        break;
                    }
                    case 'C': {
                        System.out.print("Enter data : ");
                        ll.remove(ll.size());
                        System.out.println(ll);
                        break;
                    }
                    case 'D': {
                        System.out.print("Enter data :");
                        int data1 = sc.nextInt();
                        System.out.print("Enter Position :");
                        int position = sc.nextInt();
                        ll.remove(position);
                        System.out.println(ll);
                        break;
                    }
                    case 'E': {
                        System.out.print("The middle node is ");
                        StringBuilder st = new StringBuilder();
                        for (String integer : ll) {
                            st.append(integer).append(" ");
                        }
                        System.out.println(st.charAt(ll.size()/2));
                        break;
                    }
                    case 'F': {
//                    size
                        System.out.println("Size pf Linked List: " + ll.size());
                        break;
                    }
                    case 'G': {
//                    sort
                        Collections.sort(ll);
                        System.out.println("Sorted linked list: \n" + ll);
                        break;
                    }
                    case 'H': {
//                    reverse
                        Collections.reverse(ll);
                        System.out.println("Reversed Linked_list : \n " + ll);
                        break;
                    }
                    case 'I': {
//                    iterator
                        for (String s : ll)
                            System.out.println(s);
                        break;
                    }
                    case 'J': {
//                    traverse
                        for (String lE : ll) {
                            System.out.print(lE + " ");
                        }
                        break;
                    }
                    default:
                        throw new IllegalStateException("Unexpected value: " + ch);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            choice = ' ';
            while(choice != 'Y' && choice != 'N')
            {
                try
                {
                    System.out.print("Wish to continue implementing Data Structures? (Y/N) ? ");
                    choice = sc.next().charAt(0);
                    choice = Character.toUpperCase(choice);

                    if(choice != 'Y' && choice != 'N')
                    {
                        System.out.println(choice);
                        throw new InvalidInputException("Please input correct character");
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);

                }
            }
        }while (choice != 'N') ;
    }
}

class Hash_table{
    static void func(){
        Scanner sc = new Scanner(System.in);
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        char choice;
        do {
            System.out.println("Enter which operation you would like to perform" + "\n" +
                    "1:Insert" + "\n" +
                    "2:Delete" + "\n" +
                    "3:Contains a value" + "\n" +
                    "4:Get value by key" + "\n" +
                    "5:Iterator" + "\n" +
                    "6:Size" + "\n" +
                    "7:Traverse" + "\\" + "Print" + "\n" );
            char ch = sc.next().charAt(0);
            String key;
            int value;
            try {
                switch (ch) {
                    case '1': {
                        System.out.println("Enter the key-value pair you want to add to hash table");
                        key = sc.next();
                        value = sc.nextInt();
                        hashtable.put(key, value);
                        System.out.println(hashtable);
                        break;
                    }
                    case '2': {
                        System.out.println("Enter the key-value pair you want to delete");
                        key = sc.next();
                        if (!hashtable.isEmpty()) {
                            if (hashtable.containsKey(key)) {
                                hashtable.remove(key);
                                System.out.println("Hashtable after deletion: \n "+hashtable);
                            }
                            else
                                System.out.println("Key not found");
                        } else
                            System.out.println("Hash Table already empty");
                        break;
                    }
                    case '3': {
                        System.out.println("Enter the key you want to check");
                        key = sc.next();
                        if (hashtable.containsKey(key))
                            System.out.println("Key found");
                        else
                            System.out.println("Key not found");

                        System.out.println("Enter the value you want to search");
                        value = sc.nextInt();
                        if (hashtable.containsValue(value))
                            System.out.println("Value found");
                        else
                            System.out.println("Value not found");

                        break;
                    }
                    case '4': {
                        System.out.println("Enter the kay whose value you want to get");
                        key = sc.next();
                        if (hashtable.containsKey(key))
                            System.out.println("The value for key " + key + "= " + hashtable.get(key));
                        else
                            System.out.println("Key not found");

                        break;
                    }
                    case '5': {
//                    iterator
                        Set<String> setOfCountries = hashtable.keySet();
                        for (String k : setOfCountries) {
                            System.out.println(k + "\t" + hashtable.get(k));
                        }
                        break;
                    }
                    case '6': {
                        System.out.println("Size of hashtable : " + hashtable.size());
                        break;
                    }
                    case '7': {
                        System.out.println("Traversing through the hashtable");
                        if (hashtable.size() != 0) {
                            Enumeration<String> keys = hashtable.keys();
                            while (keys.hasMoreElements()) {
                                key = keys.nextElement();
                                System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
                            }
                        } else
                            System.out.println("Hash Table is Empty");
                        break;
                    }
                    default:
                        System.out.println("Input a valid choice");
                        break;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            choice = ' ';
            while(choice != 'Y' && choice != 'N')
            {
                try
                {
                    System.out.print("Wish to continue implementing hash table? (Y/N) ? ");
                    choice = sc.next().charAt(0);
                    choice = Character.toUpperCase(choice);

                    if(choice != 'Y' && choice != 'N')
                    {
                        System.out.println(choice);
                        throw new InvalidInputException("Please input correct character");
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);

                }
            }
        }while(choice != 'N');

    }

}

class Stack_class{
    static void func(){
        Stack<Integer> stack = new Stack<Integer>();
        char ch, choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter which operation you would like to perform" + "\n" +
                    "A:Push" + "\n" +
                    "B:Pop" + "\n" +
                    "C:Peek" + "\n" +
                    "D:Contains" + "\n" +
                    "E:Size" + "\n" +
                    "F:Sort" + "\n" +
                    "G:Center" + "\n" +
                    "H:Reverse" + "\n" +
                    "I:Iterator" + "\n" +
                    "J:Traverse" + "\\" + "Print" + "\n" +
                    "K:Exit Stack Implementation Stage");
            System.out.println("Input your choice");
            ch = sc.next().charAt(0);
            try {
                switch (ch) {
                    case 'A': {
                        System.out.println("Input the value to be pushed");
                        stack.push(sc.nextInt());
                        System.out.println(stack);
                        break;
                    }
                    case 'B': {
                        System.out.println("Element popped : " + stack.pop());
                        System.out.println(stack);
                        break;
                    }
                    case 'C': {
                        System.out.println("Element at top : " + stack.peek());
                        break;
                    }
                    case 'D': {
                        System.out.println("Input value to be searched");
                        Integer pos = (Integer) stack.search(sc.nextInt());
                        if (pos == -1)
                            System.out.println("Element not found");
                        else
                            System.out.println("Element is found at position: " + pos);
                        break;
                    }
                    case 'E': {
                        System.out.println("Size of Stack: " + stack.size());
                        break;
                    }
                    case 'F': {
//                sort
                        Collections.sort(stack);
                        System.out.println("Sorted Stack: \n" + stack);
                        break;
                    }
                    case 'G': {
//                center
                        if (stack.size() == 0) {
                            System.out.println("Stack is empty now");
                            break;
                        } else {
                            Stack st1 = (Stack)stack.clone();
                            System.out.println(st1.remove((st1.size()/2)));
                        }
                        break;
                    }
                    case 'H': {
//                reverse
                        System.out.println("Reversed Stack is :");
                        Collections.reverse(stack);
                        System.out.println(stack);
                        break;
                    }
                    case 'I': {
//              iterator
                        for (Integer integer : stack) {
                            System.out.println(integer);
                        }
                        break;
                    }
                    case 'J': {
//                traverse
                        for (Integer item : stack)
                            System.out.println(item);
                        break;
                    }
                    case 'K': {
                        System.out.println("Exiting Stack Implementation function ");
                        break;
                    }
                    default:
                        System.out.println("Please make a valid choice");
                        break;
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            choice = ' ';
            while(choice != 'Y' && choice != 'N')
            {
                try
                {
                    System.out.print("Wish to continue? (Y/N) ? ");
                    choice = sc.next().charAt(0);
                    choice = Character.toUpperCase(choice);

                    if(choice != 'Y' && choice != 'N')
                    {
                        System.out.println(choice);
                        throw new InvalidInputException("Please input correct character");
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);

                }
            }
        }while(choice != 'N');
    }

}

class Queue{
    static void func(){
        Scanner obj = new Scanner(System.in);
        java.util.Queue<Integer> q= new PriorityQueue<Integer>();
        Iterator<Integer>it1;
        it1 = q.iterator();
        char choice = ' ';
        do {
            System.out.println("Enter which operation you would be like to perform" +"\n"+
                    "A:Enqueue"+"\n"+
                    "B:Dequeue(Highest Priority)"+"\n"+
                    "C:Peek(Highest Priority)"+"\n"+
                    "D:Contains"+"\n"+
                    "E:Size"+"\n"+
                    "F:Centre"+"\n"+
                    "G:Sort"+"\n"+
                    "H:Reverse"+"\n"+
                    "I:Iterator"+"\n"+
                    "J: Traverse/Print");
            char ch = obj.next().charAt(0);
            try {
                switch (ch) {
                    case 'A': {
                        System.out.println("Enter the values in the queue");
                        int x = obj.nextInt();
                        q.add(x);
                        System.out.println(q);
                        break;
                    }
                    case 'B': {
                        if (q.isEmpty())
                            System.out.println(" Queue is empty.");
                        else
                            System.out.println(q.poll());
                        break;
                    }
                    case 'C': {
                        System.out.println("The top element of Queue is" + q.peek());
                    }
                    case 'D': {
                        System.out.println("Enter the number user want to check if it is present in the queue");
                        int y = obj.nextInt();
                        System.out.println("Does the Priority Queue contains " + y + q.contains(y));
                        break;
                    }
                    case 'E': {
                        System.out.println("The size of the Priority Queue is: " + q.size());
                        break;
                    }
                    case 'F': {
                        int indexOfMiddleNumber = q.size() / 2;
                        for (int index = 0; index < indexOfMiddleNumber; ++index) {
                            q.poll();
                        }
                        System.out.println(q.poll());
                        break;
                    }
                    case 'G': {
                        int n = q.size();
                        int []arr = new int[n];
                        for (int i = 0; i < n; i++)
                            arr[i] = obj.nextInt();
                        Arrays.sort(arr);
                        System.out.println("The sorted queue is as follows :");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i]);
                        }

                    }
                    case 'H': {
                        System.out.println("The reverse queue is hereby as follows :");
                        java.util.Stack<Integer> st = new java.util.Stack<Integer>();
                        while (!q.isEmpty()) {
                            st.add(q.peek());
                            q.remove();
                        }
                        while (!st.isEmpty()) {
                            q.add(st.peek());
                            System.out.print(st.pop());
                        }

                    }
                    case 'I': {
                        System.out.println("The iterator values are: ");
                        while (it1.hasNext()) {
                            System.out.println(it1.next());
                        }
                        System.out.println();
                        break;
                    }
                    case 'J': {
                        System.out.println("The Traversed elements in priority queue are :");
                        while (it1.hasNext()) {
                            System.out.println(it1.next());
                        }
                        System.out.println();
                        break;
                    }
                    default:
                        System.out.println("Input a valid choice");
                        break;
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            while(choice != 'Y' && choice != 'N')
            {
                try
                {
                    System.out.print("Wish to continue implementing Queue? (Y/N) ? ");
                    choice = obj.next().charAt(0);
                    choice = Character.toUpperCase(choice);

                    if(choice != 'Y' && choice != 'N')
                    {
                        System.out.println(choice);
                        throw new InvalidInputException("Please input correct character");
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);

                }
            }
        }while(choice != 'N');
    }
}

class Priority_Queue {

    static void func() {
        Scanner obj = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        Iterator<Integer> it = pq.iterator();
        char choice = ' ';
        do {
            try {
                System.out.println(" Enter which operation you would be like to perform" + "\n" +
                        "1:Enqueue" + "\n" +
                        "2:Dequeue(Highest Priority)" + "\n" +
                        "3:Peek(Highest Priority)" + "\n" +
                        "4:Contains" + "\n" +
                        "5:Size" + "\n" +
                        "6:Middle" + "\n" +
                        "7:Iterator " + "\n" +
                        "8:Traverse/Print " + "\n" +
                        "9:Reverse");
                char ch = obj.next().charAt(0);
                switch (ch) {
                    case '1': {
                        System.out.println("Enter the values in the queue");
                        int x = obj.nextInt();
                        pq.add(x);
                        break;

                    }
                    case '2': {
                        if (pq.isEmpty())
                            System.out.println("Priority Queue is empty.");
                        else
                            System.out.println(pq.poll());
                        break;

                    }
                    case '3': {
                        System.out.println(pq.peek());
                        break;
                    }
                    case '4': {
                        System.out.println("Enter the number user want to check if it is present in the queue");
                        int y = obj.nextInt();
                        System.out.println("Does the Priority Queue contains " + y + pq.contains(y));
                        break;
                    }
                    case '5': {
                        System.out.println("The size of the Priority Queue is: " + pq.size());
                        break;
                    }
                    case '6': {
                        int indexOfMiddleNumber = pq.size() / 2;
                        for (int index = 0; index < indexOfMiddleNumber; ++index) {
                            pq.poll();
                        }
                        System.out.println(pq.poll());
                        break;
                    }
                    case '7': {

                        System.out.println("The iterator values are: ");
                        while (it.hasNext()) {
                            System.out.println(it.next());
                        }
                        System.out.println();
                        break;
                    }
                    case '8': {
                        System.out.println("The Traversed elements in priority queue are :");
                        while (it.hasNext()) {
                            System.out.println(it.next());
                        }
                        System.out.println();
                        break;
                    }
                    case '9': {
                        System.out.println("The reverse priority queue is here as follows :");
                        Object[] arr = pq.toArray();
                        for (Object o : arr) System.out.println(o);
                        break;
                    }

                    default:
                        System.out.println("Input a valid choice");
                        break;
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            while(choice != 'Y' && choice != 'N')
            {
                try
                {
                    System.out.print("Wish to continue implementing Priority Queue? (Y/N) ? ");
                    choice = obj.next().charAt(0);
                    choice = Character.toUpperCase(choice);

                    if(choice != 'Y' && choice != 'N')
                    {
                        System.out.println(choice);
                        throw new InvalidInputException("Please input correct character");
                    }
                }
                catch(Exception e)
                {
                    System.out.println(e);

                }
            }
        }while(choice != 'N');
    }
}


class Data_Structure {
    public static void main(String[] args) {
        char ch , choice;
        Scanner sc = new Scanner(System.in);
        do {
            ch = ' ';
            choice = ' ';
            System.out.println("Enter which data structure you want to implement" + "\n" +
                    "1: Linked List" + "\n" +
                    "2: Hash_table" + "\n" +
                    "3: Stack" + "\n" +
                    "4: Queue" + "\n" +
                    "5: Priority Queue" + "\n" +
                    "6:Exit" + "\n");
            ch = sc.next().charAt(0);
            try {
                switch (ch) {
                    case '1': {
                        Linked_list.func();
                        break;
                    }
                    case '2': {
                        Hash_table.func();
                        break;
                    }
                    case '3': {
                        Stack_class.func();
                        break;
                    }
                    case '4': {
                        Queue.func();
                        break;
                    }
                    case '5': {
                        Priority_Queue.func();
                        break;
                    }
                    case '6':
                        System.out.println("Exiting Data Structure");
                        break;
                    default:
                        throw new InvalidInputException("Please make a valid choice");
                }
                while(choice != 'Y' && choice != 'N')
                {
                    try
                    {
                        System.out.print("Wish to continue implementing Data Structures? (Y/N) ? ");
                        choice = sc.next().charAt(0);
                        choice = Character.toUpperCase(choice);

                        if(choice != 'Y' && choice != 'N')
                        {
                            System.out.println(choice);
                            throw new InvalidInputException("Please input correct character");
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);

                    }
                }
            }
            catch (Exception e) {
                System.out.println(e);
            }
        } while(choice != 'N');
    }
}