package Utils;

import java.util.Scanner;

public class CalculatorUtil {
    MessageUtil messageUtil = new MessageUtil();
    int firstNumber, secondNumber;
    public void calculator(){
        Scanner takInput=new Scanner(System.in);
        messageUtil.messageUser("Input first Number: ");
        firstNumber = takInput.nextInt();
        messageUtil.messageUser("Input second Number: ");
        secondNumber = takInput.nextInt();
        userAnswer();
        //close scanner
        takInput.close();
    }
    public int add(int firstNumber, int secondNumber){
        int result = firstNumber+secondNumber;
       return  result;
    }
    public int subtract(int firstNumber, int secondNumber){
        int result = firstNumber-secondNumber;
        return result;
    }
    public int divide(int firstNumber, int secondNumber){
        int result = firstNumber/secondNumber;
        return result;
    }
    public int multiply(int firstNumber, int secondNumber){
        int result = firstNumber*secondNumber;
        return result;
    }
    public void userAnswer(){
        Scanner takInput=new Scanner(System.in);
        messageUtil.messageUser("1. +\n2. -\n3. /\n4. x");
        int userChoice = takInput.nextInt();

        if (userChoice==1){
            messageUtil.messageUser("Answer: "+ add(firstNumber,secondNumber));
            continueTask();
        } else if (userChoice==2) {
            messageUtil.messageUser("Answer: "+ subtract(firstNumber,secondNumber));
            continueTask();
        }else if (userChoice==3){
            messageUtil.messageUser("Answer: "+ divide(firstNumber,secondNumber));
            continueTask();
        } else if (userChoice==4) {
            messageUtil.messageUser("Answer: "+ multiply(firstNumber,secondNumber));
            continueTask();
        }else {
            messageUtil.messageUser("Try again");
            userAnswer();
        }
        //close scanner
        takInput.close();
    }
    public void continueTask(){
        Scanner takeInput=new Scanner(System.in);
        messageUtil.messageUser("Do you wish to continue\n Yes or No");
        String userChoice = takeInput.nextLine();

        if(userChoice.equalsIgnoreCase("Yes")){
            calculator();
        } else if (userChoice.equalsIgnoreCase("No")) {
            messageUtil.messageUser("Thank you, Come again.");
        }else{
            messageUtil.messageUser("Try again");
            continueTask();
        }
        //close scanner        takeInput.close();
    }
}
