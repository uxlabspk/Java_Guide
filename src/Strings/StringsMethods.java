package Strings;

public class StringsMethods {
    public static void main(String[] args) {
        // String myName = new String("Muhammad Naveed");
        // but it is recommended that we define string link given below:
        String myName = "Muhammad Naveed";

        // printing the length of the string.
        System.out.println(myName.length());

        // concatenating two strings.
        System.out.println(myName.concat(". I am a programmer."));

        // formatting the string
        System.out.println(String.format("My name is %s", myName));

        // finding the character at index 3.
        System.out.println(myName.charAt(3));

        // comparing the two strings.
        String yourName = "Muhammad NAveed";
        System.out.println(myName.equals(yourName));

        // comparing by ignore case.
        System.out.println(myName.equalsIgnoreCase(yourName));

        // printing the index of first occurrence of char 'h'
        System.out.println(myName.indexOf('h'));

        // replacing 'M' with '*'
        System.out.println(myName.replace('M', '*'));

        // split the string and print these tokens
        for (String tokens : myName.split("")) {
            System.out.println(tokens);
        }

        // printing the sub-string from the string.
        System.out.println(myName.substring(3, 8));

        // Check whether myName starts with the char 'M'
        boolean isTrue = myName.startsWith("M");
        System.out.println(isTrue);

        // Check whether myName ends with the char 'd'
        isTrue = myName.endsWith("d");
        System.out.println(isTrue);

        // Transform myName to lowercase letters
        System.out.println(myName.toLowerCase());

        // Transform myName to uppercase letters
        System.out.println(myName.toUpperCase());

        // Remove the unnecessary spaces from the string.
        System.out.println(myName.trim());
    }
}
