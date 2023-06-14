import java.util.Scanner;

class MajorityArrayElement{
    int majorityElement(int arr[]){
        int majorElem = -1;
        int j;
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for ( j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]){
                    count ++;

                }
                if (count >= arr.length/2){
                    majorElem = arr[i];
                    break;
                }
            }
            if (j<arr.length) break;
        }
        return majorElem;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(new MajorityArrayElement().majorityElement(arr));
        sc.close();
    }
}
