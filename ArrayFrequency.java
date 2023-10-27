package com.xworkz.arrayfrequency;

public class ArrayFrequency {
    public static void main(String[] args) {
        int array[] = {1,2,3,1,4,2,3,2,1,3,1};

        int frequency[] = new int[array.length];
        int visited = -1;

        for (int index = 0; index < array.length; index++) {
            int count = 1;

            for (int index1 = index+1; index1 < array.length; index1++) {
                if (array[index]==array[index1]){

                    count++;
                    frequency[index1] = visited;
                }
                if(frequency[index]!=visited){
                    frequency[index]=count;
                }
            }

        }
        for (int index = 0; index < frequency.length; index++) {
           if(frequency[index]!=visited){

                System.out.println(array[index]+ " "+frequency[index]);
           }

        }
    }

}
