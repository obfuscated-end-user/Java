class String_Reverse {
    void reverseString(String str) {
        // base case
        // if the string has no characters in it or it is 1 character long, then print itself
        if ((str == null) || (str.length() <= 1))
            System.out.println(str);
        else {
            // print the last character (note that it just uses print)
            System.out.print(str.charAt(str.length() - 1));
            // recurse and start at the same string but without the last character
            reverseString(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        String inputstr = "Data Structure";
        System.out.println("The given string: " + inputstr);
        String_Reverse obj = new String_Reverse();
        System.out.print("The equivalent reversed string: ");
        obj.reverseString(inputstr);
    }
}