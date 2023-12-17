import java.util.Arrays;

public class CustomStringList {
    public String[] list;

    public CustomStringList(String[] list) {
        this.list = list;
    }

    public boolean check(String string){
        for (String elements: this.list ) {
            if (string.equals(elements)){
                return true;
            }
        }
        return false;
    }

    public boolean check(String[] arrayOfString){
        return Arrays.equals(arrayOfString,this.list);
    }

    public String longestWord(){
        String longestWord = this.list[0];
        for (String elements:this.list) {
            if (elements.length()>longestWord.length()){
                longestWord = elements;
            }
        }
        return longestWord;
    }

    public void add(String string){
        String[] newArray = new String[this.list.length+1];

        System.arraycopy(this.list,0,newArray,0,this.list.length);

        newArray[newArray.length-1] = string;

        this.list = newArray;
        System.out.println(Arrays.toString(this.list));
    }

    public void addIfNotExists(String string){
        for (String elements: this.list){
            if (string.equals(elements)){
                System.out.println("Строка "+string+" в массиве уже есть");
            }else {
                String[] newArray = new String[this.list.length+1];

                System.arraycopy(this.list,0,newArray,0,this.list.length);

                newArray[newArray.length-1] = string;

                this.list = newArray;
                System.out.println(Arrays.toString(this.list));
            }
        }
    }
}
