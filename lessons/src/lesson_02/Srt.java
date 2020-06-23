package lesson_02;

public class Srt {
    public static void main(String[] args) {
//        String str1 = "Hello world";
//        String str2 = new String("Hello world");
//        String str3 = new String(new char[]{'H', 'E', 'L', 'L', '0'});
//        String str4 = new String(new char[]{'H', 'E', 'L', 'L', '0'}, 2, 2);
//
//        System.out.println(str1.length());
//
//        char[] ch = str1.toCharArray();
//
//        for (char c : ch){
//            System.out.println(c);
//        }

//        str1 = " a  a ";
//        System.out.println("IS EMPTY : " + (str1.length() == 0));
//        System.out.println("IS EMPTY : " + (str1.isEmpty()));
//        System.out.println("IS EMPTY : " + (str1.isBlank()));
//
//        System.out.println(str1.trim().length());
//        System.out.println(str1.length());


        String example = "Part1";
        example = example.concat("Part2").concat("Part3");
        System.out.println(example);

        System.out.println(String.valueOf(100));

        example = example.join("_", "Part4", "Part2");

        System.out.println(example);

        String str1 = "str";
        String str2 = "str";
        String str3 = "sTr";

//        System.out.println(str1.compareTo(str2));
//        System.out.println(str1.compareTo(str3));

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.toUpperCase().equals(str3.toUpperCase()));
        System.out.println(str1.toLowerCase().equals(str3.toUpperCase()));

        String phone = "380505055050";
        System.out.println(phone.startsWith("380"));
    }
}
