import java.util.Scanner;
public class LinearSearch {
    public static int LinearSearch(int array[], int key){
        
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[50];
        System.out.println("Enter array length");
        int n=sc.nextInt();
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the Element you want to search in Array");
        int key = sc.nextInt();
        sc.close();
        System.out.print("Element Present on index - " + LinearSearch(array, key));
    }
}
