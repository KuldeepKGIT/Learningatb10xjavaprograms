package Task_1st_feb;

import java.util.Scanner;

public class web_based_domain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the URL");
        String str = scanner.nextLine();
        if(str.contains(".net")){
            System.out.println(str+" it is a network-related website");
        }
        else if(str.contains(".com")){
            System.out.println(str+" it is a commercial website");
        }
        else if(str.contains(".org")){
            System.out.println(str+" it is a non-profitable website");
        }
        else if(str.contains(".edu")){
            System.out.println(str+" it is an educational website");
        }
        else if(str.contains(".gov")){
            System.out.println(str+" it is a government website");
        }
        else if(str.contains(".info")){
            System.out.println(str+" it is an informational website");
        }
        else System.out.println(str+" it is not a website");
    }
}
