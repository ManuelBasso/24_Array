//Scrivere un programma che contenga un metodo che permetta di rimuovere gli elementi duplicati
//in un array di interi. L'array ottenuto dovrà essere stampato a video.

//Pair programming

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
    int newArray[]={6,1,1,2,3,4,6,5,2,10,11};
        delete(newArray);
    }

 public static void delete(int a[]){
     
    
    for(int i = 0; i < a.length; i++){
        Arrays.sort(a);
        if ((i == a.length-1)|| (a[i]!=a[i+1])) {
            System.out.print(a[i]+ " ");
        }
    }
}
}


