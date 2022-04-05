import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner myScaner = new Scanner(System.in);
        int[] arr = {10, -3, 20, 78, 45, 24};
        Tool t = new Tool();
        t.Bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Tool {

    public void Bubble(int[] arr) {
        int temp = 0;//定义一个中间变量
        for (int i = 0; i < arr.length - 1; i++) {//外循环的次数 等于数组长度-1
            for (int j = 0; j < arr.length - 1 - i; j++) {//内循环次数等于素组长度-1-外循环多少次i
                if (arr[j] > arr[j + 1]) { //如果前面的数小于后面的数，则交换两个数的位置
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
