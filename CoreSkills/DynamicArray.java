package CoreSkills;

import java.util.Arrays;

class DynamicArray {

    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        if (i < length) {
            return arr[i];
        }
        System.out.print("Array index out of bounds: ");
        return -1;
    }

    public void set(int i, int n) {
        if (i < capacity) {
            arr[i] = n;
        }
        System.out.print("Array index out of bounds: ");
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        if (length > 0) {
            length--;
        }
        return arr[length];
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }

    public static void main(String[] args) {
        DynamicArray dynamo = new DynamicArray(20);
        dynamo.pushback(2);
        dynamo.pushback(3);
        dynamo.pushback(5);

        for (int i = 0; i < dynamo.length; i++) {
            System.out.println(dynamo.get(i));
        }

        dynamo.popback();
        for (int i = 0; i < dynamo.length; i++) {
            System.out.println(dynamo.get(i));
        }
        System.out.println(dynamo.get(19));
        dynamo.set(22, 20);
        int[] a = new int[30];
    }
}
