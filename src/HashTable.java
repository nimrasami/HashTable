
public class HashTable {
    
    //Table size
    public static int size = 17;
    //Method to do the linear programming 
    private static void insert(int[] hashT, int number) {

        int index = number % size;

        while (hashT[index] != 0) {
            index = (index + 1) % size;
        }
        
        hashT[index] = number;
    }

    public static void main(String[] args) {
        
        //Insert variables in array
        int array[] = {6, 12, 34, 29, 28, 11, 23, 7, 0, 33, 30, 45};

        int hashT[] = new int[size];
        for (int x = 0; x < array.length; x++) {
            insert(hashT, array[x]);
        }

        //Print out the table
        System.out.println("The hashtable is: ");
        for (int x = 0; x < size; x++) {
            System.out.println(x + " goes to " + hashT[x]);
        }
    }

}
