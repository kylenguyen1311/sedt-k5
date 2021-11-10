package lesson3;

public class hw1 {
    public static void main(String[] args) {
        String input = "2 hrs and 5 minutes";
        input = input.replaceAll(" ","");
        char[] myChars = input.toCharArray();
        System.out.println(input);
        int hrs = 0, mins =0;
            for (int i = 0; i < myChars.length; i++) {
                if(Character.isDigit(myChars[i]))
                    if(String.valueOf(myChars[i+1]).equals("h"))
                    hrs = Integer.parseInt(String.valueOf(myChars[i]));
                    else if (String.valueOf(myChars[i+1]).equals("m"))
                        mins = Integer.parseInt(String.valueOf(myChars[i]));
                }
        System.out.println("Total minutes: " + (hrs*60+mins));
            }
        }
