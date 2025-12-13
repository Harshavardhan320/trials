package main.java.com.fsm.validator;

public class Main {
    public static void main(String[] args) {

        try{
            new ValidatorEngine().run();
        }catch (Exception e){
            System.out.println("Error :"+ e.getMessage());
            System.exit(1);
        }
    }
}