package helloJAVA;
import java.util.Arrays;;
public class JQ1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("command line is empty pleas write something...");
            return ;
        }
        Arrays.sort(args);
        System.out.println("sorted string in accending order : ");
           for (String str : args) {
            System.out.println(str);
          }
    }
}