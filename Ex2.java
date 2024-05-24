import java.util.ArrayList;


/* implementing all methods of ArrayList */



/*
   All implementing methods from Collection interface
   * add()  -  Appends the specified element to the end of this list.
   * remove()  - Removes the first occurrence of the specified element from this list, if it is present.
   * contains()
   * size()
   * isEmpty()

   * iterator() -> Ex3.java
*/


class Ex2{
    public static void main(String[] args){
        ArrayList<Character> list = new ArrayList<Character>();
        
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('a');

        System.out.println(list);
        
        // list.remove('a');

        boolean flag = list.remove(Character.valueOf('a')); // succesfully removed value
        System.out.println(flag);
        
        System.out.println(list);

        

    }
}