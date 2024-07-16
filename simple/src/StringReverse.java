public class StringReverse {
    public String notString(String str) {

        if(str.length() >= 2){
            String nam = str.substring(0,3);
            if(!nam.equals("not")){
                return "not "+str;
            } else {
                return str;
            }

        }else{
            return  "not "+str;
        }
    }
    public String frontBack(String str) {
        String temp = "";
        for(int i=str.length(); i>0; i--){
            temp = temp + Character.toString(str.charAt(i-1));
        }
        return temp;

    }

}
