/*Задача — Объединяем отсортированные связанные списки
Даны головы двух отсортированных связанных списков list1 и list2.
Объедините два списка в один отсортированный список. Список должен быть создан путем объединения узлов первых двух списков.
Верните голову объединенного связанного списка.*/

import java.util.Arrays;
import java.util.LinkedList;

public class Lesson3 {
    public LinkedList mergeTwoLists(LinkedList list1, LinkedList list2){

        LinkedList result=new LinkedList();
        int i1=0,i2=0;
        for(int i=0;i< list2.size()+ list1.size();i++){
            if(i2>= list2.size()&&(i1 < list1.size())){
                result.add(list1.get(i1));
                i1++;
                continue;
            }
            if (i1>= list1.size()&&(i2< list2.size())) {
                result.add(list2.get(i2));
                i2++;
                continue;
            }
            if((i1 < list1.size()) && (int) list1.get(i1)<(int) list2.get(i2)){
                result.add(list1.get(i1));
                i1++;
            }else if(i2< list2.size()){
                result.add(list2.get(i2));
                i2++;
            }
        }

        return result;
    }
}
