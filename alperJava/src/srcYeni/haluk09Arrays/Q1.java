package srcYeni.haluk09Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Q1 {




        /* TASK :
         kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
         ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
         java code create ediniz.

         */
        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            System.out.print("arryinizin boyutunu giriniz :");
            int arrBoyutu =scan.nextInt();

            int arr []=new int[arrBoyutu];

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Arrayin "+(i+1) +". elemanini giriniz : ");
                arr[i]=scan.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);

            System.out.println("girdiginiz arrayin max - min eleman degeri :"+(arr[arrBoyutu - 1] - arr[0]));




    }
}
