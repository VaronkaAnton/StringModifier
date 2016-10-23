public class Main {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(); //StringBuilder class is used for better performance 
        for (int i = 0; i < args.length; i++) {
            str.append(args[i]);
            if (i != args.length - 1)
                str.append(' ');
        }

        System.out.println("input is: " + str);

        while ((str.length() != 0) && (str.charAt(0) == '0'))
            str.deleteCharAt(0);
        if (str.length() == 0)
            System.out.println("output is: " + str);
        else
        {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    if ((!Character.isDigit(str.charAt(i - 1))) && (str.charAt(i - 1) != '.'))
                        str.deleteCharAt(i--);
                }
            }
            System.out.println("output is: " + str);
        }
    }
}
