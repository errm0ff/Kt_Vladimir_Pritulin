
/**
 *
 * @author Vladimir Pritulin
 */
import java.util.Scanner;
 
public class zadanie1 {
 
        public static void main(String[] args) {
 
            Scanner sc = new Scanner(System.in);
            //Вводим предложение в консоль
            System.out.println("Введите слова одной строкой через пробел");
            String myStr = sc.nextLine();
            //Начальное количество слов равно 0
            myStr = myStr.replace("  ", " ");
            String[] myWordsArray = myStr.split(" ");
            int NumMassiv = myWordsArray.length; //количество слов в массиве
            
            for( int i = 0; i < NumMassiv; i++){ //расчет рандомного числа массива
            int a = 1;
            int b = NumMassiv;
            int random_number1 = a + (int)(Math.random() * b);
            if (random_number1 == NumMassiv ){
            random_number1 = a + (int) (Math.random() * b);
            }
            
            System.out.println(myWordsArray[random_number1]);
            
            
          
 
          
        }
    }
        
}