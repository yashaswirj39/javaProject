package customexception;

import java.util.Scanner;

public class CustomException extends Exception{

    CustomException(){

    }

    CustomException(String str) {
        super(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            if (!str.equalsIgnoreCase("yash")){
                /*CustomException ce = new CustomException("Name does not matched ...w");
                throw ce;*/
                throw new CustomException("Name Does not match... ");
            }
        } catch (CustomException e){

            e.printStackTrace();
        } finally {
            System.out.println("finally... ");
        }
    }
}
