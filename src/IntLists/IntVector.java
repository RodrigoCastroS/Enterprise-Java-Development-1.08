package IntLists;

public class IntVector implements IntList {
    private int[] intVector;
    int MAX_SIZE = 10;

    int currentArrayPosition;

    public IntVector() {
        this.intVector = new int[MAX_SIZE];
    }

    public int length(){
        return this.intVector.length;
    }
    @Override
    public void add(int number) {
        if (currentArrayPosition == intVector.length) {
            // Increase the size of the array by 50%
            int[] newIntArray = new int[(int) (intVector.length * 2)];

            intVector = copyArray(intVector, newIntArray);
        }

        intVector[currentArrayPosition] = number;
        currentArrayPosition++;
    }


    @Override
    public int get(int index) {
        Integer element = null;

        try {
            element = this.intVector[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index that you specified is not within the Integer Array List.");
        }

        return element;
    }

    private int[] copyArray(int[] currentArray, int[] newArray) {
        for (int i = 0; i < currentArray.length; i++) {
            newArray[i] = currentArray[i];
        }

        return newArray;
    }


}
