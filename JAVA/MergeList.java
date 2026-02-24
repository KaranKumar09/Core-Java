import java.util.*;

public class MergeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of list 1: ");
        int size1 = scanner.nextInt();
        int[] list1 = new int[size1];
        System.out.print("Enter elements of list 1: ");
        for (int i = 0; i < size1; i++) {
            list1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of list 2: ");
        int size2 = scanner.nextInt();
        int[] list2 = new int[size2];
        System.out.print("Enter elements of list 2: ");
        for (int i = 0; i < size2; i++) {
            list2[i] = scanner.nextInt();
        }
        
        int[] mergedList = merge(list1, list2);
        System.out.println("Merged and sorted list: " + Arrays.toString(mergedList));
        
        scanner.close();
    }
    
    public static int[] merge(int[] list1, int[] list2) {
        // Sort the input lists
        Arrays.sort(list1);
        Arrays.sort(list2);
        
        // Merge the two sorted lists
        int[] mergedList = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;
        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                mergedList[k++] = list1[i++];
            } else {
                mergedList[k++] = list2[j++];
            }
        }
        
        while (i < list1.length) {
            mergedList[k++] = list1[i++];
        }
        
        while (j < list2.length) {
            mergedList[k++] = list2[j++];
        }
        
        return mergedList;
    }
}
