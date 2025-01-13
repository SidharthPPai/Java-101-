import java.util.*;



public class bs {
    public static void main(String[] args) {

        int[] elements={40,20,100,190,170,400}; // declaring arrays
        int n = elements.length; //declring the length of the array here it is 6
        for(int i=0;i<n;i++){    // decarling for loop for elemt 1
            for(int j=0;j<n-i-1;j++){ //decarling nested for loop for elemt 2
                if(elements[j] > elements[j+1]){ // here we compare nearest two elemnts
                        int temp=elements[j]; // then store the value for first elemt into a temporary storage
                        elements[j]=elements[j+1]; // then we store the value of second value to the first value position
                        elements[j+1]=temp;// then we store the first value from temp to the second value  position
                }
            }
        }

        for(int i=0;i<n;i++){ // print the array using the for loop
            System.out.println(elements[i]);
        }
    }

}
