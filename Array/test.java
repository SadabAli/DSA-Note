package Array;

public class test {
    
    public static void Travers(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void Addition(int[] arr){
        int res = 0;
        for(int i=0 ; i< arr.length;i++ ){
            res = res + arr[i];
            
        }
        System.out.println("Sum of array elements: "+res);
    }




    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        

        Travers(arr);
        Addition(arr);
        System.out.println(arr[4]);

    }
}
