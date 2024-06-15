/*Вторая задача — Максимальное среднее значение
  Дан целочисленный массив nums, состоящий из n элементов, и целое число k.
  Найдите непрерывный подмассив длиной k, имеющий максимальное среднее значение, и верните это значение.
  Подмассив — это последовательность чисел без изменения порядка или пропуска элементов исходного массива.*/

public class Lesson2 {
    public double findMaxAverage(int[] nums,int k){
        double results=0;
        int[] res = new int[nums.length-k];

        for(int i=0;i<nums.length-k;i++){
            for(int j=i;j< i+k;j++) {
                res[i] += nums[j];
            }
        }
        for(int i=0;i<nums.length-k;i++){
            if(results<=res[i]){
                results=res[i];
            }
        }

        return results;
    }
}
