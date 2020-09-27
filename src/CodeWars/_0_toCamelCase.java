package CodeWars;
/*
* Complete the method/function so that it converts dash/underscore
*  delimited words into camel casing.
*  The first word within the output should be capitalized only
*  if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
*
*
*
* */
public class _0_toCamelCase {

    static String toCamelCase(String s){
        String[] res = s.split("_");
        String result;
        if(res.length == 1)
        {
            res = s.split("-");
            result = changeString(res);
        }else {
            result = changeString(res);
        }
        return result;
    }

    public static String changeString(String[] data) {
        StringBuilder sb = new StringBuilder();
        sb.append(data[0]);

        for(int i = 1; i < data.length; i++) {
            Character temp = data[i].charAt(0);
            sb.append(Character.toUpperCase(temp) + data[i].substring(1));
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String input0 = "the_Stealth_Warrior";
        String input1 = "the-Stealth-Warrior";
        System.out.println(toCamelCase(input0));
        System.out.println(toCamelCase(input1));
    }

}