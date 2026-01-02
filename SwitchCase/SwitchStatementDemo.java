import java.util.Scanner;

public class SwitchStatementDemo {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        float first_operand, second_operand;
        String operator_instruction =
            "Operations available:\n1 -> Add\n2 -> Subtract\n3 -> Multiply\n4 -> Divide\n5 -> Square of n\n6 -> Root of n\n7 -> Exit program\n";
        System.out.print(operator_instruction);

        while (true) {
            System.out.print("Enter operation: ");
            int operation = user_input.nextInt();
            switch (operation) {
                case 1:
                    System.out.print("Enter first integer: ");
                    first_operand = user_input.nextFloat();
                    System.out.print("Enter second integer: ");
                    second_operand = user_input.nextFloat();
                    System.out.println(
                        first_operand +
                            " + " +
                            second_operand +
                            " = " +
                            (first_operand + second_operand)
                    );
                    break;
                case 2:
                    System.out.print("Enter first integer: ");
                    first_operand = user_input.nextFloat();
                    System.out.print("Enter second integer: ");
                    second_operand = user_input.nextFloat();
                    System.out.println(
                        first_operand +
                            " - " +
                            second_operand +
                            " = " +
                            (first_operand - second_operand)
                    );
                    break;
                case 3:
                    System.out.print("Enter first integer: ");
                    first_operand = user_input.nextFloat();
                    System.out.print("Enter second integer: ");
                    second_operand = user_input.nextFloat();
                    System.out.println(
                        first_operand +
                            " * " +
                            second_operand +
                            " = " +
                            (first_operand * second_operand)
                    );
                    break;
                case 4:
                    System.out.print("Enter first integer: ");
                    first_operand = user_input.nextFloat();
                    System.out.print("Enter second integer: ");
                    second_operand = user_input.nextFloat();
                    System.out.println(
                        first_operand +
                            " / " +
                            second_operand +
                            " = " +
                            (first_operand / second_operand)
                    );
                    break;
                case 5:
                    System.out.print("Enter integer: ");
                    first_operand = user_input.nextFloat();
                    System.out.println(
                        "Square of " +
                            first_operand +
                            " = " +
                            (first_operand * first_operand)
                    );
                    break;
                case 6:
                    System.out.print("Enter integer: ");
                    first_operand = user_input.nextFloat();
                    System.out.println(
                        "Square root of " +
                            first_operand +
                            " = " +
                            (Math.sqrt(first_operand))
                    );
                    break;
                case 7:
                    System.out.println("Program exited successfully.");
                    user_input.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
