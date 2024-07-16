public class countYZ {
    public int countYZ(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) { // looping the string to get each char
            if (i > 0 && !Character.isLetter(str.charAt(i)) && (Character.toString((str.charAt(i - 1))).equalsIgnoreCase("y") || Character.toString(str.charAt(i - 1)).equalsIgnoreCase("z"))) // trying to find a last char is x or y. you no need to change char to sting I personnally do it since I hate char :P
                ++count;
            if (i + 1 == str.length() && (Character.toString((str.charAt(i))).equalsIgnoreCase("y") || Character.toString(str.charAt(i)).equalsIgnoreCase("z"))) {
                ++count;
            }
        }
        return count;
    }
}
