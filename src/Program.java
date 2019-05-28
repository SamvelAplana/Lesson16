import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by OUT-Akopyan-SR on 27.05.2019.
 */
public class Program {
    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\OUT-Akopyan-SR\\Downloads\\Новая папка\\text.txt")))
        {
            while ((s = br.readLine()) !=null) {
                System.out.println(s);
            }
        }catch (IOException ext){
            System.out.println("Ошибка ввода-вывода: " + ext);

        }

    }


}


