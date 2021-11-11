package lesson3;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input url: ");
        String url = sc.nextLine();
        int indexOfColon = url.indexOf(":");
        int indexOfSlash = url.lastIndexOf("/");
        int indexOFDot = url.indexOf(".");
        String prefix = url.substring(0, indexOfColon);
        switch (prefix){
            case "http":
            case "https":
                System.out.println("prefix: " + prefix);
        break;
            default:
                System.out.println("Other prefix");
                break;
        }
        String domainName = url.substring(indexOfSlash+1,indexOFDot);
        System.out.println("domain name: " + domainName);
        String suffixes = url.substring(indexOFDot);
        switch (suffixes){
            case ".com":
            case ".net":
                System.out.println("suffixes: " + suffixes);
                break;
            default:
                System.out.println("Other suffixes");
                break;
        }
    }
}
