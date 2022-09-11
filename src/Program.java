import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {
    /**
     *
     * @param args for recording all students
     */
    public static void main(String[] args) {

        Abiturient[] arr = CreateArr(); //створення масиву студентів
        System.out.println("Список абітурієнтів із іменем Катерина:");
        String СriterioName = "Катерина";
         Abiturient[] resA = CriterionA(arr, СriterioName);
         for (int i = 0; i < resA.length; i++)
         {

             System.out.println(resA[i]);

         }
         System.out.println("Список абітурієнтів,середній бал у яких вище 2.5:");
         Double CriterionMark = 2.5;
         Abiturient[] resB = CriterionB(arr, CriterionMark);
         for (int i = 0; i < resB.length; i++)
         {
                 System.out.println(resB[i]);
         }
        System.out.println("2 абітурієнти, що мають найвищий середній бал:");
        int CriterionCount=2;
        Abiturient[] resC = CriterionC(arr, CriterionCount);
        for (int i = 0; i < resC.length; i++)
        {

            System.out.println(resC[i]);

        }

    }

    /**
     *
     * @return
    registered applicants with their data
     */
    static Abiturient[] CreateArr() {
        Abiturient a1 = new Abiturient(12, "Катерина", "Лукашів", "с", "Kyiv", "222552", 2.6);
        Abiturient a2 = new Abiturient(12, "Наталія", "Фішман", "ca", "Lviv", "26626", 2.3);
        Abiturient a3 = new Abiturient(12, "Катерина", "Іванова", "cas", "London", "26555", 2.5);
        Abiturient a4 = new Abiturient(12, "Олена", "Петрова", "cas", "London", "26555", 8.5);
        Abiturient[] arr = { a1, a2, a3,a4 };
        return arr;
    }

    /**
     *
     * @param arr  accepts
     * @param name accepts
     * @return the result for task A, output of the applicant with the specified name
     */
    static Abiturient[] CriterionA(Abiturient[] arr, String name) {
        Abiturient[] res = {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getname() == name) {
                int n = res.length;
                res = addX(n, res, arr[i]);

            }
        }
        return res;
    }

    /**
     *
     * @param arr  accepts
     * @param arv accepts
     * @return
    the result for task B, the output of the applicant with the above-mentioned average score
     */
    static Abiturient[] CriterionB(Abiturient[] arr, Double arv) {
        Abiturient[] res = {};
        for (int i = 0; i < arr.length; i++)// p b
        {
            if (arr[i].getavgmark() > arv) {
                int n = res.length;
                res = addX(n, res, arr[i]);
            }
        }
        return res;
    }

    /**
     *
     * @param arr accepts
     * @param k the number to be displayed
     * @return returns the given number of applicants with the specified score
     */
    static Abiturient[] CriterionC(Abiturient[] arr, int k) {
        Abiturient[] res = {};
        Arrays.sort(arr, new SortAbiturient());
        for (int i = 0; i < k; i++) {
            int n = res.length;
            res = addX(n, res, arr[i]);
        }
        return res;
    }

    /**
     *
     * @param n
    number of all
     * @param arr array of all
     * @param x
    variable
     * @return returns the formed array
     */
    //формування масиву всіх абітурієнтів
    public static Abiturient[] addX(int n, Abiturient arr[], Abiturient x) {
        int i;
        Abiturient newarr[] = new Abiturient[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return newarr;
    }

}