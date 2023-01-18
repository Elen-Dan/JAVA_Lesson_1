/**
 * Task_1
 */
import java.util.Arrays;
import java.util.Random;

public class Task_1 {

    public static void main(String[] args) {
        int i = randNum();
        System.out.println("Случайное целое число в диапазоне от 0 до 2000 равняется i = " + i);
        int n = mostSignificantBit(i);
        System.out.println("Старший значащий бит выпавшего числа i равен n = " + n);
        firstArray(i, n);
        secondArray(i, n);
    }

    static int randNum() {
        return new Random().nextInt(2001);
    } // Решение задачи 1

    static int mostSignificantBit(int i) {
        return Integer.toBinaryString(i).length();
    } // Решение задачи 2

    static void firstArray(int i, int n) {
        int max = Short.MAX_VALUE;
        int[] m1 = new int[0];
        while (i <= max){
            if (i % n == 0){
                int[] temp = new int[m1.length + 1];
                for (int g = 0; g < m1.length; g++){
                    temp[g] = m1[g];
                }
                m1 = temp;
                m1[m1.length - 1] = i;
            }
            i++;
        }
        System.out.println("Массив кратных n чисел в диапазоне от i до константы Short.MAX_VALUE = 32767 равен: \n"+ Arrays.toString(m1));
    } // Решение задачи 3

    static void secondArray(int i, int n) {
        int min = Short.MIN_VALUE;
        int[] m2 = new int[0];
        while (min <= i){
            if (min % n != 0){
                int[] temp = new int[m2.length + 1];
                for (int g = 0; g < m2.length; g++){
                    temp[g] = m2[g];
                }
                m2 = temp;
                m2[m2.length - 1] = min;
            }
            min++;
        }
        System.out.println("Массив кратных n чисел в диапазоне от i до константы Short.MIN_VALUE = -32767 равен: \n"+ Arrays.toString(m2));

    } // Решение задачи 4
}