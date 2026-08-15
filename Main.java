import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int score = 0;

        System.out.print("1. What does OOP stand for?\n");
        System.out.print("A. Object-Oriented Programming\n");
        System.out.print("B. Object Operation Program\n");
        System.out.print("C. Open Object Programming\n");
        System.out.print("D. Ordered Object Process\n");
        System.out.print("Enter answer Here: ");

        String Ans1 = s.nextLine();

        if (Ans1.equalsIgnoreCase("A")) {
            System.out.print("\nA is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.print("\n2. What is a class in Java?\n");
        System.out.print("A. A variable that stores numbers\n");
        System.out.print("B. A blueprint for creating objects\n");
        System.out.print("C. A method that runs automatically\n");
        System.out.print("D. A Java package\n");
        System.out.print("Enter answer Here: ");

        String Ans2 = s.nextLine();

        if (Ans2.equalsIgnoreCase("B")) {
            System.out.print("\nB is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.print("\n3. Which keyword is used to create an object?\n");
        System.out.print("A. class\n");
        System.out.print("B. object\n");
        System.out.print("C. new\n");
        System.out.print("D. create\n");
        System.out.print("Enter answer Here: ");

        String Ans3 = s.nextLine();

        if (Ans3.equalsIgnoreCase("C")) {
            System.out.print("\nC is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.print("\n4. What is a constructor?\n");
        System.out.print("A. A method used only to print output\n");
        System.out.print("B. A special method used to initialize an object\n");
        System.out.print("C. A variable inside a class\n");
        System.out.print("D. A loop\n");
        System.out.print("Enter answer Here: ");

        String Ans4 = s.nextLine();

        if (Ans4.equalsIgnoreCase("B")) {
            System.out.print("\nB is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.print("\n5. Which OOP concept hides data by restricting direct access?\n");
        System.out.print("A. Inheritance\n");
        System.out.print("B. Polymorphism\n");
        System.out.print("C. Encapsulation\n");
        System.out.print("D. Abstraction\n");
        System.out.print("Enter answer Here: ");

        String Ans5 = s.nextLine();

        if (Ans5.equalsIgnoreCase("C")) {
            System.out.print("\nC is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.print("\n6. Which keyword is used for inheritance in Java?\n");
        System.out.print("A. inherits\n");
        System.out.print("B. extends\n");
        System.out.print("C. inherit\n");
        System.out.print("D. implements\n");
        System.out.print("Enter answer Here: ");

        String Ans6 = s.nextLine();

        if (Ans6.equalsIgnoreCase("B")) {
            System.out.print("\nB is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.print("\n7. What is polymorphism?\n");
        System.out.print("A. One class having no objects\n");
        System.out.print("B. An object having multiple variables\n");
        System.out.print("C. The ability of one interface/method to take different forms\n");
        System.out.print("D. Hiding data from users\n");
        System.out.print("Enter answer Here: ");

        String Ans7 = s.nextLine();

        if (Ans7.equalsIgnoreCase("C")) {
            System.out.print("\nC is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.print("\n8. Which access modifier makes a variable accessible only inside its own class?\n");
        System.out.print("A. public\n");
        System.out.print("B. protected\n");
        System.out.print("C. private\n");
        System.out.print("D. static\n");
        System.out.print("Enter answer Here: ");

        String Ans8 = s.nextLine();

        if (Ans8.equalsIgnoreCase("C")) {
            System.out.print("\nC is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.print("\n9. What is the purpose of a getter?\n");
        System.out.print("A. To delete an object\n");
        System.out.print("B. To retrieve/access a value\n");
        System.out.print("C. To create a class\n");
        System.out.print("D. To modify a value\n");
        System.out.print("Enter answer Here: ");

        String Ans9 = s.nextLine();

        if (Ans9.equalsIgnoreCase("B")) {
            System.out.print("\nB is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.print("\n10. What is the purpose of a setter?\n");
        System.out.print("A. To modify/update a value\n");
        System.out.print("B. To retrieve a value\n");
        System.out.print("C. To create an object\n");
        System.out.print("D. To destroy a class\n");
        System.out.print("Enter answer Here: ");

        String Ans10 = s.nextLine();

        if (Ans10.equalsIgnoreCase("A")) {
            System.out.print("\nA is Correct!!\n");
            score++;
        } else {
            System.out.print("\nYour answer is Wrong\n");
        }


        System.out.println("\n==============================");
        System.out.println("         QUIZ FINISHED");
        System.out.println("==============================");
        System.out.println("Your Score: " + score + "/10");

        if (score == 10) {
            System.out.println("Excellent! Perfect Score!");
        } else if (score >= 8) {
            System.out.println("Great job!");
        } else if (score >= 5) {
            System.out.println("Good job! Keep practicing.");
        } else {
            System.out.println("Keep studying and try again!");
        }

    }
}