// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.List;

public class task_1 {
    public static void main(String[] args) {
        List<Integer> list1 = createList(10, 0, 10);
        System.out.println(list1);
        List<Integer> list2 = delEven(list1);
        System.out.println(list2);
        System.out.println(findMax(list1));
        System.out.println(findMin(list1));
        System.out.println(findAverage(list1));
    }

    static List<Integer> createList(int size, int min, int max) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }

    public static List<Integer> delEven(List<Integer> list) {
        List<Integer> listDif = new ArrayList<>(list);
        int i = 0;
        while (i < listDif.size()){
            if(listDif.get(i) % 2 == 0) listDif.remove(i);
            else i++;
       }
        return listDif;
    }

    public static int findMin(List<Integer> list){
        int min = list.get(0);
        for(int element : list){
            if(element < min) min = element;
        }
        return min;
    }
 
    public static int findMax(List<Integer> list){
        int max = list.get(0);
        for(int element : list){
            if(element > max) max = element;
        }
        return max;
    }

    public static Double findAverage(List<Integer> list){
        int sum = 0;
        for(int element : list) sum += element;
        Double average = Double.valueOf(sum)/Double.valueOf(list.size());
        return average;
    }
}