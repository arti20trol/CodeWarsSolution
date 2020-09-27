package CodeWars;
/*
* ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot
* contain anything but exactly 4 digits or exactly 6 digits.
*If the function is passed a valid PIN string, return true, else return false.
*
*
* */
public class _1_validatePin {
    public static void main(String[] args) {
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("1"));
        System.out.println(validatePin("1234524"));
        System.out.println(validatePin("1dfs"));
    }

    public static boolean validatePin(String pin) {
        if ((pin.length() == 4) || (pin.length() == 6)) {
            return pin.matches("[0-9]+");
        }
        else return false;
    }
}
