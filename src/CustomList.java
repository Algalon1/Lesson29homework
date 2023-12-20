import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomList {
    private int[] list;

    public CustomList(int[] list) {
        this.list = list;
    }

    public CustomList() {
        this.list = new int[0];
    }


    public int indexOF(int value) {
        for (int i = 0; i < this.list.length; i++) {
            if (value == this.list[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOF(int value) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (value == this.list[i]) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index, int defaultValue) {
        for (int i = 0; i < this.list.length; i++) {
            if (index == i) {
                return this.list[i];
            }
        }
        return defaultValue;
    }

    public int get(int index) {
        return get(index, 0);
    }

    public void add(int value) {
        int[] newList = new int[this.list.length + 1];
        copyArray(this.list, newList);
        newList[newList.length - 1] = value;
        this.list = newList;
        System.out.println(Arrays.toString(this.list));
    }

    public int getMax() {
        int maxValue = this.list[0];
        for (int elements : this.list) {
            if (elements > maxValue) {
                maxValue = elements;
            }
        }
        return maxValue;
    }

    private int pop() {
        int[] newList = new int[this.list.length - 1];
        int lastElem = this.list[this.list.length - 1];
        copyArray(this.list, newList);
        this.list = newList;
        return lastElem;
    }

    private void copyArray(int[] init, int[] result) {
        int minLength = init.length > result.length ? result.length : init.length;
        for (int i = 0; i < minLength; i++) {
            result[i] = init[i];
        }
    }

    public void removeLeft(int value) {
        for (int i = 0; i < this.list.length; i++) {
            if (value == this.list[i]) {
                shiftByIndex(i);
                pop();
                return;
            }
        }
        System.out.println("Данного числа нет в массиве");
    }

    public void removeRight(int value) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (value == this.list[i]) {
                shiftByIndex(i);
                pop();
                return;
            }
        }
        System.out.println("Данного числа нет в массиве");
    }

    public void removeAll(int value) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (value == this.list[i]) {
                shiftByIndex(i);
                pop();
            }
        }
    }

    public void removeByIndex(int index) {
        if (index > -1 && index < this.list.length) {
            for (int i = 0; i < this.list.length; i++) {
                if (index == i) {
                    removeLeft(this.list[i]);
                }
            }
        } else {
            System.out.println("Данного числа нет в массиве");
        }
    }

    public void removeAllByIndex(int index) {
        if (index > -1 && index < this.list.length) {
            for (int i = 0; i < this.list.length; i++) {
                if (index == i) {
                    removeAll(this.list[i]);
                }
            }
        } else {
            System.out.println("Данного числа нет в массиве");
        }
    }

    public void reverse() {
        for (int i = 0; i < this.list.length / 2; i++) {
            swap(i,this.list.length - 1 - i);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - 1 - i; j++) {
                if (this.list[j] > this.list[j + 1]) {
                    swap(j,j+1);
                }
            }
        }
    }

    public void selectionSort(){
        for (int i = 0; i < this.list.length; i++) {
            int max = this.list[0];
            int maxIndex = 0;
            for (int j = 0; j < this.list.length - i; j++) {
                if (this.list[j]>max){
                    max=this.list[j];
                    maxIndex = j;
                }
            }
            swap(maxIndex,this.list.length -1 - i);
        }
    }
    public void selectionSort1() {
        for (int i = 0; i < this.list.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < this.list.length; j++) {
                if (this.list[j] > this.list[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(maxIndex, i);
        }
    }

    private void swap(int index1, int index2){
        int temp = this.list[index1];
        this.list[index1] = this.list[index2];
        this.list[index2] = temp;
    }



    public void bubbleSort(boolean desc) {
        if (desc){
            for (int i = 0; i < this.list.length; i++) {
                for (int j = 0; j < this.list.length - 1 - i; j++) {
                    if (this.list[j+1]>this.list[j]){
                        swap(j+1,j);
                    }
                }
            }
        }else {
            for (int i = 0; i < this.list.length; i++) {
                for (int j = 0; j < this.list.length - 1 - i; j++) {
                    if (this.list[j] > this.list[j + 1]) {
                        swap(j,j+1);
                    }
                }
            }
        }
    }






    private void shiftByIndex(int index) {
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
    }


    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }
}
