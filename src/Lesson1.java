import java.util.Arrays;

/*Даны 2 целочисленных массива nums1 и nums2, они отсортированы в неубывающем порядке. И 2 числа m и n, которые представляют количество элементов массивов nums1 и nums2 соответственно.
  Объедините nums1 и nums2 в один массив, элементы которого отсортированы в неубывающем порядке.
  Конечный отсортированный массив не должен быть возвращен функцией, а вместо этого должен храниться внутри массива nums1.
  В связи с этим, nums1 имеет длину m + n, где первые m элементов обозначают элементы, которые должны быть объединены,
   а последние n элементов имеют значение 0 и должны игнорироваться.*/
public class Lesson1 {
    public void merge(int[] nums1,int m, int[] nums2, int n){
        int pointer = m+n-1;
        int[] result=new int[m+n];
        int pointerNum1 = m-1;
        int pointerNum2 = n-1;
        while(pointer>=0){
            if(pointerNum2<0) break;

            if(pointerNum1>=0 && nums1[pointerNum1]>nums2[pointerNum2]){
                result[pointer]=nums1[pointerNum1];
                pointerNum1--;
            }else{
                result[pointer]=nums2[pointerNum2];
                pointerNum2--;
            }
            pointer--;
        }
        System.out.println(Arrays.toString(result));
    }
}
