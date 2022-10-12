import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        System.out.println("1. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int lastSixDigits = studentNumber%1000000;
        System.out.println("The last six digits in your student number is " + lastSixDigits);


        // ==============================================================================

        // 2. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        System.out.println("2. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
        int result = (lastTwoDigits%2);
        if (result == 0) {
            System.err.println("EVEN");
        } else {
            System.out.println("ODD");
        }


        // ==============================================================================

        // 3. Create a method that will return the total character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int charTotal = firstName.length() + surName.length();
        
        System.out.println("The total character length is " + charTotal);

        // ==============================================================================

        // 4. Create a method to that will return true if your firstname in BOTH
        // UPPERCASE and lowercase are EQUAL.
        // Otherwise, return false.
        System.out.println("4. Check your first name in LOWERCASE and UPPERCASE");
        System.out.print("Enter your first name in lowercase: ");
        String firstNameInLowerCase = scan.next();
        System.out.print("Enter your first name in UPPERCASE: ");
        String firstNameInUpperCase = scan.next();
        if (firstNameInLowerCase.equals("biennico") && firstNameInUpperCase.equals("BIENNICO")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // ==============================================================================

        // 5. Create a method that will return true if your name starts with
        // a vowel 'A','E','I','O','U'.
        // Otherwise, return false.
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);

        switch (firstChar) {
            case 'A':
                System.out.println("true");
                break;
            case 'E':
                System.out.println("true");
                break;
            case 'I':
                System.out.println("true");
                break;
            case 'O':
                System.out.println("true");
                break;
            case 'U':
                System.out.println("true");
                break;
            default:
                System.out.println("false");
                break;
        }
        


        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber2 = scan.nextInt();
        if (studentNumber2 == 2022101970){
            System.out.println("This is your student number");
        } else {
            System.out.println("This is not your student number.");
        }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        surName = scan.next();
        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase() ) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        switch (course) {
            case "BSIT":
                System.out.print("Enter your specialization (MWAA or MAA): ");
                String specialization1 = scan.next();
                System.out.println("You are enrolled in " + course + " with specialization in " + specialization1 );
                break;
            case "BSCS":
                System.out.print("Enter your specialization (DF or ML): ");
                String specialization2 = scan.next();
                System.out.println("You are enrolled in " + course + " with specialization in " + specialization2 );
                break;
            default:
                System.out.println("You did not pick one of the choices");
                break;
        }

        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();
        
        switch (strand) {
            case "STEM":
                System.out.println("That is a real strand");
                break;
            case "ICT":
                System.out.println("That is a real strand");
                break;
            case "HUMMS":
                System.out.println("That is a real strand");
                break;
            case "HOME ECONOMICS":
                System.out.println("That is a real strand");
                break;
            case "ARTS AND DESIGN":
                System.out.println("That is a real strand");
                break;
            case "TVL MARITIME":
                System.out.println("That is a real strand");
                break;
            default:
                System.out.println("That is not a real strand");
                break;
        }
        // ==============================================================================

        // 10. Create a condition to check if your student email address contains your
        // surname. (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if (studentEmailAddress.contains("abitria")) {
            System.out.println("valid email");
        } else {
            System.out.println("invalid email");
        }

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Think like an ATM.

        // You have an N amount of pesos in your savings account and you have decided
        // that you want to withdraw all of your money in the ATM.

        // The denomination of peso bills that the ATM could dispense are 20, 50, 100,
        // 200, 500, 1000.

        // Create a method that will return the minimum number of peso bills that the
        // ATM will dispense after withdrawing all of your money.

        // Example:
        // Elizer has 150 pesos in his bank account. If elizer withdraws 150 pesos in
        // the ATM, the ATM will dispense two peso bills (100 peso bill and 50 peso
        // bill). (Answer is 2)

        //System.out.println("11. Think like an ATM");
        //System.out.print("Enter the total amount of money in your bank account: ");
        //int amount = scan.nextInt();

        // Close scanner
        scan.close();
    }
}