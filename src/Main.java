import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
        System.out.print("String giriniz:");
        String inp = scan.nextLine();
  boolean sonuc = palindromControl(inp);
        System.out.println(sonuc);
    }

    private static boolean palindromControl(String inp) {
        if(inp.length()==0 || inp.length() == 1){
            return true;
        }else{
            if(inp.substring(0,1).equalsIgnoreCase(inp.substring(inp.length()-1))){
                return palindromControl(inp.substring(1,(inp.length()-1)));
            }else{
                return false;
            }
        }
    }
}