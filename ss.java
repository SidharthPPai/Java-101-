public class ss {
    public static void main(String[] args){
        int[] elements={40,20,100,190,170,400}; // declaring arrays
        int n = elements.length;
        for(int i=0;i<n;i++){    // decarling for loop for elemt 1
            for(int j=i+1;j<n;j++){ //decarling nested for loop for elemt 2
                if(elements[i] > elements[j]){ // using statement we compare the values of two elements
                    int temp = elements[i];   // now we store  the value of element[i] to temp{(intermediate storage)
                     elements[i]=elements[j]; // then we store the value of second on to firt position
                    elements[j]=temp; // then we store the value of second value to the first value position which is declared in temp

                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(elements[i]);
        }
    }
}
