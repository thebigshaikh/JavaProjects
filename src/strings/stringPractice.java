package strings;
import java.util.*;
import java.lang.*;

public class stringPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website;
        System.out.println("Enter website");
        website = sc.nextLine();

//        website.
        String[] split_website;

//        website = sc.nextLine();
        split_website = website.split("\\.");
//        System.out.println(split_website[split_website.length-1]);
        System.out.println(Arrays.toString(split_website));


        switch (split_website[split_website.length-1]){
            case "com":
                System.out.println("Monday");
                break;
            case "org" :
                System.out.println("Tuesday");
                break;
            case "in":
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid website selected");

        }
    }
}
