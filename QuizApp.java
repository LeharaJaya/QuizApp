import java.util.Scanner;

public class QuizApp {
    public static void main(String[]args){
        questions_answers questions = new questions_answers();
        questions_answers answers = new questions_answers();
        Scanner input = new Scanner(System.in);
        char ans;
        int  correct =0 , wrong = 0;
        questions.question1();
        ans = input.next().charAt(0);
        if (ans== answers.answer1){
            correct++;
        }
        else wrong++;
        questions.question2();
        ans = input.next().charAt(0);
        if (ans== answers.answer2){
            correct++;
        }
        else wrong++;
        questions.question3();
        ans = input.next().charAt(0);
        if (ans== answers.answer3){
            correct++;
        }
        else wrong++;
        questions.question4();
        ans = input.next().charAt(0);
        if (ans== answers.answer4){
            correct++;
        }
        else wrong++;
        questions.question5();
        ans = input.next().charAt(0);
        if (ans== answers.answer5){
            correct++;
        }
        else wrong++;
        questions.question6();
        ans = input.next().charAt(0);
        if (ans== answers.answer6){
            correct++;
        }
        else wrong++;
        questions.question7();
        ans = input.next().charAt(0);
        if (ans== answers.answer7){
            correct++;
        }
        else wrong++;
        questions.question8();
        ans = input.next().charAt(0);
        if (ans== answers.answer8){
            correct++;
        }
        else wrong++;
        questions.question9();
        ans = input.next().charAt(0);
        if (ans== answers.answer9){
            correct++;
        }
        else wrong++;
        questions.question10();
        ans = input.next().charAt(0);
        if (ans== answers.answer10){
            correct++;
        }
        else wrong++;

        double correct_double = correct;
        double percentage = (correct_double/10)*100;

        System.out.println("The total marks are : 100");
        System.out.println("Your marks are : " + correct*10);
        System.out.println("Total questions are : 10");
        System.out.println("your correct answers count : "+correct +"\n your wrong answer count : "+wrong );
        System.out.println((" precentage is : " + percentage+ "%"));

    }
}
class questions_answers{
    void question1(){
        System.out.println("What is the primary purpose of the main method in a Java program?\n" +
                "\n" +
                "a) To initialize global variables\n" +
                "b) To serve as the entry point of the program\n" +
                "c) To handle exceptions\n" +
                "d) To manage memory allocation");
    }
    void question2(){
        System.out.println("Which of the following is not a valid access modifier in Java?\n" +
                "\n" +
                "a) public\n" +
                "b) private\n" +
                "c) protected\n" +
                "d) internal");
    }
    void question3(){
        System.out.println("What keyword is used to create a subclass in Java?\n" +
                "\n" +
                "a) inherit\n" +
                "b) extends\n" +
                "c) implements\n" +
                "d) derives");
    }
    void question4(){
        System.out.println("Which method is called when an object is created in Java?\n" +
                "\n" +
                "a) initialize()\n" +
                "b) constructor()\n" +
                "c) setup()\n" +
                "d) finalize()");
    }
    void question5(){
        System.out.println("Which of the following is a valid declaration of a Java array?\n" +
                "\n" +
                "a) int[] arr = new int[5];\n" +
                "b) int arr[] = new int(5);\n" +
                "c) int arr[5] = new int[];\n" +
                "d) int arr(5) = new int[];");
    }
    void question6(){
        System.out.println("What is the output of the following Java code?\n" +
                "int a = 5;\n" +
                "int b = 10;\n" +
                "System.out.println(a + b * a);\n" +
                "a) 75\n" +
                "b) 55\n" +
                "c) 50\n" +
                "d) 60");
    }
    void question7(){
        System.out.println("Which of the following is true about Java?\n" +
                "\n" +
                "a) Java is platform-dependent.\n" +
                "b) Java supports multiple inheritance using classes.\n" +
                "c) Java supports operator overloading.\n" +
                "d) Java uses automatic garbage collection.");
    }
    void question8(){
        System.out.println("What is the purpose of the finally block in exception handling in Java?\n" +
                "\n" +
                "a) To execute code only if no exceptions are thrown\n" +
                "b) To execute code regardless of whether an exception is thrown or not\n" +
                "c) To catch exceptions\n" +
                "d) To throw an exception");
    }
    void question9(){
        System.out.println("Which of the following is not a primitive data type in Java?\n" +
                "\n" +
                "a) int\n" +
                "b) boolean\n" +
                "c) char\n" +
                "d) String");
    }
    void question10(){
        System.out.println("Which of the following statements is true about the String class in Java?\n" +
                "\n" +
                "a) Strings are mutable\n" +
                "b) Strings are objects\n" +
                "c) Strings can be created using the new keyword only\n" +
                "d) The length() method returns the number of characters plus one");
    }
    //key
    char answer1 ='b';
    char answer2 ='d';
    char answer3 ='b';
    char answer4 ='b';
    char answer5 ='a';
    char answer6 ='b';
    char answer7 ='d';
    char answer8 ='b';
    char answer9 ='d';
    char answer10 ='b';
}
