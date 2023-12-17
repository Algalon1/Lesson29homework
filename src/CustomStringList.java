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
}
