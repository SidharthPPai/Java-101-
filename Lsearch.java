import java.util.*;

public class Lsearch {
    public static void main(String[] args) {
        int[] elements={10,20,31,43,91,72,68,99,102};

        int n = elements.length;

        for(int j=0;j<n;j++){ // print the array using the for loop
            System.out.println(elements[j]);
        }

        System.out.println("enter the element to be searched ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int flag=0;
        for( int i =0; i<n ;i++){
            if(k==elements[i]){
                flag=1;
            }

        }
        if(flag==1){ //== implies comparison while single = assignment ops
            System.out.println("element is found");
        }
        else{
            System.out.println("element not found");
        }

    }
}
