import java.util.*;

 class ArrayIntList {
     private  ArrayList<Integer> list;

     public ArrayIntList(ArrayList<Integer> list) {
         this.list = list;
     }

     // Cumulative sum algorithm
    public int sum() {
         int sum = 0;

        for (Integer num : list) {
            sum += num;
        }
        return sum;
    }

    // Average algorithm
     public double average() {
         // check for emptiness
         if (list.isEmpty()) {
             return 0.0;
         }
         // initialization
         double average;
         double listSize = 0;
         double sum = 0;

         // cumulative sum
         for (Integer num : list) {
             sum += num;
             listSize++;
         }
         average = sum/listSize;
         return average;
     }


    public ArrayList<Integer> getList() {
         return list;
    }
}