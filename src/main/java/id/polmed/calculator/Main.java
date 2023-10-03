package id.polmed.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if(args.length != 3) {
            System.out.println("Usage: polmed-calculator operation number1 number2");
            return;
        }
        switch(args[0]) {
            case "add":
                    System.out.println(calculator.add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "substract":
                    System.out.println(calculator.substract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
            case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
                break;
        }
        
    }
}