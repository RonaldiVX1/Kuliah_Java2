import java.util.Scanner;


public class Modul {
    public static void main(String[] args)

    {

        Scanner scan = new Scanner( System.in );

        System.out.println("Interpolation Search Test\n");

        int n, i;

        System.out.println("Enter number of integer elements");

        n = scan.nextInt();

        /** Create integer array on n elements **/

        int[] arr = new int[n];

        System.out.println("\nMasukan "+ n +" array : ");

        for (i = 0; i < n; i++)

            arr[i] = scan.nextInt();

        bubbleSort(arr,n);
        System.out.println("Sorted");
        printArray(arr,n);

        System.out.println("\nEnter element to search for : ");

        int key = scan.nextInt();

        int result = interpolationSearch(arr, key);

        System.out.println("Interpolation Search :");
        if (result == -1)

            System.out.println(key +" tidak ditemukan");

        else

            System.out.println(" Ditemukan di array ke : "+ result);

        System.out.println("Binary Search :");
        binarySearch(arr,arr[0],arr[arr.length-1],key );

    }

    public static int interpolationSearch(int[] sortedArray, int toFind)
    {

        int low = 0;

        int high = sortedArray.length - 1;

        int mid;

        while (sortedArray[low] <= toFind && sortedArray[high] >= toFind)

        {

            if (sortedArray[high] - sortedArray[low] == 0)

                return (low + high)/2;

            /** out of range is possible  here **/

            mid = low + ((toFind - sortedArray[low]) * (high - low)) / (sortedArray[high] - sortedArray[low]);



            if (sortedArray[mid] < toFind)

                low = mid + 1;

            else if (sortedArray[mid] > toFind)

                high = mid - 1;

            else

                return mid;

        }

        if (sortedArray[low] == toFind)

            return low;

        else

            return -1;

    }

    static void bubbleSort(int[] arr, int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("ditemukan di index ke: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("tidak ditemukan");
        }
    }

}


