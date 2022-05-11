package org.way2it.data_structures.list;

import java.util.Arrays;
import java.util.Objects;

public class List {

    // Represent values in this list
    private String[] values = new String[4];

    // Represent the number of values that were added to this list
    private int length = 0;

    public List() {
    }

    // Should add new value to the end of the list, increment length and extend array by x2 if needed
    public void add(String value) {
        if (length >= values.length) {
            values = Arrays.copyOf(values, length * 2);
        }
        values[length] = value;
        length ++;
    }

    // Should add new value at the specified index, moving other values to the right,
    // increment length and extend array by x2 if needed
    public void addAtIndex(String value, int index) {
        if (index >= length) {
            values = Arrays.copyOf(values, length * 2);
        }

        String[] newArray = Arrays.copyOfRange(values, index, values.length-1);
        values[index] = value;
        int count = index + 1;
        for (String s : newArray) {
            values[count] = s;
            count ++;
        }
        length ++;

    }

    // Should return a value at specified index, or null if index is out of list bounds
    public String get(int index) {
        if (index <= length) {
            return values[index];
        }
        return null;
    }

    // Should return the index of the first occurrence of specified value in list
    // If the value does not exist - return -1
    public int indexOf(String value) {
        for (int i = 0; i < values.length; i++) {
            if (Objects.equals(values[i], value)) {
                return  i;
            }
        }

        return -1;
    }

    // Should remove the value at specified index, decrementing the length of this list and moving next values to the left
    public void remove(int index) {
        if (index > length) {
            System.out.println("Wrong index!");
        } else {
            int currIndex = index;
            for (int i = index + 1; i <= values.length -1; i++) {
                values[currIndex] = values[i];
                currIndex++;
            }
            length--;
        }
    }

    public int getLength() {
        return length;
    }

}
