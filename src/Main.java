public class Main {
    public static void main(String[] args) {
        CustomStringList list = new CustomStringList(new String[]{"lesson", "wood", "work", "hero", "magic"});
        System.out.println("Initial list: "+list);
        System.out.println(" ");
        System.out.println("The longest word in the list is: "+list.longestWord());
        System.out.println(" ");
        list.add("human");
        System.out.println("Add human to the list: "+list);
        System.out.println(" ");
        System.out.println("Trying to add human to the list again: ");
        list.addIfNotExists("human");
        System.out.println(" ");
        list.addIfNotExists("Humanity");
        System.out.println("Trying to add not existing item \" Humanity \" to the list ");
        System.out.println(list);
        System.out.println(" ");
        System.out.println("The longest word in the list is: "+list.longestWord());

    }
}
