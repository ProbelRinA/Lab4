import java.util.Arrays;
import java.util.Random;

public class Histogram
{
    //Metoda do wypełniania tablicy liczbami losowymi z zakresu od MIN do MAX
    private static void fillArray(int[][] array, int MIN, int MAX)
    {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(MAX - MIN + 1) + MIN;
            }
        }
    }

    //Metoda do sortowania tablicy dwuwymiarowej
    private static void sortArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
    }

    //Metoda do wyświetlania tablicy dwuwymiarowej
    private static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Metoda do tworzenia histogramu
    private static int[] createHistogram(int[][] array)
    {
        int[] histogram = new int[46];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                histogram[array[i][j]]++;
            }
        }
        return histogram;
    }

    //Metoda do wyświetlania histogramu
    private static void printHistogram(int[] histogram)
    {
        for (int i = 20; i <= 45; i++) {
            System.out.println(i + ": " + histogram[i]);
        }
    }

    public static void main(String[] args) {
        //Tworzymy tablicy dwuwymiarowej
        int rows = 10;
        int columns = 10;
        int[][] array = new int[rows][columns];

        //Wypełniamy tablicy liczbami losowymi
        fillArray(array, 20, 45);

        //Wyświetlamy oryginalnej tablicy
        System.out.println("Original array:");
        printArray(array);

        //Sortujemy tablicy
        sortArray(array);

        //Wyświetlamy posortowanej tablicy
        System.out.println("\nSorted array: ");
        printArray(array);

        //Tworzymy histogramu
        int[] histogram = createHistogram(array);

        //Wyświetlamy histogramu
        System.out.println("\nHistogram: ");
        printHistogram(histogram);
    }
}
