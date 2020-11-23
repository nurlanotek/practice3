import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //System.out.printf("Please insert the number: ");
        //for(boolean test = false; test == false;){
            try{
                System.out.println("Enter an integer: ");
                int num = input.nextInt();
                num=Math.abs(num);
                //test = true;
                System.out.println(findSum(num));
            }
            catch(InputMismatchException e){System.out.println("error");
            }
            //input.nextLine();

        }




    public static String findSum(int num){
        int sum=0;
        String temporary=Integer.toString(num);
        String sumString=temporary;
        String m=temporary+temporary;
        for(int i=0; i<3;i++){
            sum+=Integer.parseInt(temporary);
            temporary+=Integer.toString(num);
            //sumString+="+"+temporary;
            //System.out.println(sumString);
        }
        for(int i=0; i<2;i++){
            sumString+=" + "+ m;
            m+=Integer.toString(num);
            System.out.println(sumString);

        }

            return String.format("%s "+"= "+"%d",sumString, sum );
    }


}

