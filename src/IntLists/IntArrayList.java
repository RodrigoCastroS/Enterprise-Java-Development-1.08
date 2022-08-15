package IntLists;


public class IntArrayList implements IntList{

    private int[] intArray;
    int MAX_SIZE = 10;

    int currentArrayPosition;

    public IntArrayList() {
        this.intArray = new int[MAX_SIZE];
    }



    @Override
    public void add(int number) {
        if(currentArrayPosition == intArray.length) {
            // Increase the size of the array by 50%
            int[] newIntArray = new int[(int) (intArray.length * 1.5)];

            intArray = copyArray(intArray, newIntArray);
        }

        intArray[currentArrayPosition] = number;
        currentArrayPosition++;
    }

    private int[] copyArray(int[] currentArray, int[] newArray) {
        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i];
        }

        return newArray;
    }

    @Override
    public int get(int index) {
        Integer element = null;

        try {
            element = this.intArray[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index that you specified is not within the Integer Array List.");
        }

        return element;
    }
}
