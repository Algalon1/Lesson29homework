public class Main {
    public static void main(String[] args) {
        CustomList list = new CustomList(new int[]{1,2,2,17,4,2,5});
        System.out.println(" ");
        System.out.println("Initial list: "+list);
        list.removeByIndex(3);
        System.out.println("Removing element with index 3: "+list);
        System.out.println(" ");
        CustomList list1 = new CustomList(new int[]{1,2,2,17,4,2,5});
        System.out.println("Initial list: "+list1);
        list1.removeAllByIndex(1);
        System.out.println("Removing element with index 1, and other elements, that have the same value: "+list1);

    }
}
