
public class Primitive {
    public static void main(String[] args){
        System.out.println(determineType("9144"));
    }

    public static String determineType(String number) {

        String result ="";
        try{
            if(Long.parseLong(number) <= Math.pow(2,8)-1 && Long.parseLong(number) >= -Math.pow(2,8))
                result= "byte";
            else if (Long.parseLong(number) <= Math.pow(2,16)-1 && Long.parseLong(number) >= -Math.pow(2,16))
                result = "short";
            else if (Long.parseLong(number) <= Math.pow(2,32)-1 && Long.parseLong(number) >= -Math.pow(2,32))
                result = "int";
            else if (Long.parseLong(number) <= Math.pow(2,64)-1 && Long.parseLong(number) >= -Math.pow(2,64))
                result = "long";
        }
        catch(NumberFormatException e){
            result = "none";
        }
        return result;
    }
}