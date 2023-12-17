import java.util.Arrays;

public class CustomStringList {
    public String[] list;

    public CustomStringList(String[] list) {
        this.list = list;
    }

    private boolean check(String string) {
        for (String elements : this.list) {
            if (string.equals(elements)) {
                return true;
            }
        }
        return false;
    }

    private boolean check(String[] arrayOfString) {
        return Arrays.equals(arrayOfString, this.list);
    }

    public String longestWord() {
        String longestWord = this.list[0];
        for (String elements : this.list) {
            if (elements.length() > longestWord.length()) {
                longestWord = elements;
            }
        }
        return longestWord;
    }

    public void add(String string) {
        String[] newArray = new String[this.list.length + 1];

        System.arraycopy(this.list, 0, newArray, 0, this.list.length);

        newArray[newArray.length - 1] = string;

        this.list = newArray;
    }

    public void addIfNotExists(String string) {
        if (check(string)) {
            System.out.println("String " + string + " is already present in the list");
        } else {
            String[] newArray = new String[this.list.length + 1];

            System.arraycopy(this.list, 0, newArray, 0, this.list.length);

            newArray[newArray.length - 1] = string;

            this.list = newArray;
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(this.list);
    }
}
