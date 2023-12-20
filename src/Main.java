public class Main {
    public static void main(String[] args) {
        CustomList list = new CustomList(new int[]{23,11,2,8,153,5});
        System.out.println(list);
        list.selectionSort1();
        System.out.println(list);

    }
}
