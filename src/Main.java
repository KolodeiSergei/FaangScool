
public class Main {
    public static void main(String[] args) {
        int[] a={3,4,6,8,99};
        int[] b={1,43,65,796};
        Lesson1 lesson1 = new Lesson1();
        lesson1.merge(a,a.length,b,b.length);

        int[] les2 = {2,1,-3412,1111,-121,2,12,121,212,22,9};
        int k=3;
        Lesson2 lesson2 =new Lesson2();
        System.out.println(lesson2.findMaxAverage(les2,k));
    }

}