
import java.util.Scanner;

public class CheckBloodPressure {
    
    public static void checkBloodPressure() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter systolic top number and bottom number: ");
        double top = input.nextDouble();
        double bottom = input.nextDouble();
        if (top < 80 || bottom < 60) {
            System.out.println("Low blood pressure");
        } 
        else if (top < 120 && bottom < 80) {
            System.out.println("Perfect blood pressure");
        } 
        else if ((top >= 120 && top <= 129)&& (bottom >= 80 && bottom <= 84)) {
            System.out.println("Normal");
        } 
        else if ((top >= 130 && top <= 139)|| (bottom >= 85 && bottom <= 89)) {
            System.out.println("Prehypertension");
        } 
        else if ((top >= 140 && top <= 159) || (bottom>= 90 && bottom <= 99)) {
            System.out.println("High blood Pressure (hypertension Stage 1)");
        }
    } 

    public static void checkBloodSugar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Are you fasting[yes/no]? ");
        String isFasting = input.nextLine();
        if (isFasting.equalsIgnoreCase("yes")) {
            System.out.println("Enter Min value: ");
            int min = input.nextInt();
            System.out.println("Enter Max value: ");
            int max = input.nextInt();
            if (min >= 70 && max <= 100) {
                System.out.println("Normal");
            } 
            else if (min >= 101 && max <= 125) {
                System.out.println("Pre-diabetes");
            } 
            else {
                System.out.println("Diabetes");
            }
        } 
        else {
            System.out.print("Enter value 2 hours after a meal: ");
            int afterMeals = input.nextInt();
            if (afterMeals < 140) {
                System.out.println("Normal");
            } 
            else if (afterMeals >= 141 && afterMeals < 200) {
                System.out.println("Pre-diabetes");
            } 
            else {
                System.out.println("Diabetes");
            }
        }

    }
    public static void checkAverageBloodSugar() {
                Scanner input = new Scanner(System.in);
                int[] array = new int[5];
                int sum = 0;
                for (int i = 0; i < array.length; i++) {
                        System.out.print("Enter the blood sugar reading for test " + (i + 1) + ": ");
                        array[i] = input.nextInt();
                        input.nextLine();
                        sum = sum +  array[i];
                }
                double avgBloodSugar = (double)sum / array.length;
                System.out.print("Are you fasting? ");
                String isFasting = input.nextLine();
                System.out.println("Average Blood sugar for five tests is:" + avgBloodSugar+"mg/dl");
                if (isFasting.equalsIgnoreCase("yes")) {
                        if (avgBloodSugar >= 70 && avgBloodSugar <= 100) 
                                System.out.println("Normal"); 
                        else if (avgBloodSugar >= 101 && avgBloodSugar <= 125) 
                                System.out.println("Pre-diabetes");
                        else 
                                System.out.println("Diabetes");
                } 
                else {
                        if (avgBloodSugar < 140) 
                                System.out.println("Normal");
                        else if (avgBloodSugar >= 141 && avgBloodSugar < 200) 
                                System.out.println("Pre-diabetes");
                        else 
                                System.out.println("Diabetes");
                }

        }
    public static void bmiCalculator(double weight ,double height) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter Height in (cm): ");
                 height = input.nextDouble();
                System.out.print("Enter Weight in (kg): ");
                 weight = input.nextDouble();
                double heightInMeter =  height / 100;
                double bmi = weight / (heightInMeter * heightInMeter);
                System.out.printf("Your BMI: %.2f\n",bmi);
                if (bmi < 18.5)
                        System.out.println("Underweight");
                else if (bmi < 25)
                        System.out.println("Normal");
                else if (bmi < 30)
                        System.out.println("Overweight");
                else
                        System.out.println("Obese");

    }
    public static void caloriesCalculator(double weight, double height , String gender , int age ) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter The Weight in kg: ");
                weight = input.nextDouble();
                System.out.print("Enter The Height in cm: ");
                height = input.nextDouble();
                input.nextLine();
                System.out.print("Enter The Gender: ");
                gender = input.nextLine();
                System.out.print("Enter The Age: ");
                age = input.nextInt();
                input.nextLine();
                double bmr = 0;
                if (gender.equalsIgnoreCase("female")) 
                    bmr = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
                else 
                    bmr = 66.47 + (13.75 * weight) + (5.003 * height) - (6.755 * age);
                System.out.println("-----------------------------------");
                System.out.println("1. Sedentary (little or no excercise)");
                System.out.println("2. Moderately active (excercise 3-5 day/week)");
                System.out.println("3. Very active (hard excercise 6-7 days/week)");
                System.out.println("-----------------------------------");
                System.out.print("Select Level of Activity: ");
                int activityLevel = input.nextInt();
                input.nextLine();
                double amr=0;
                if (activityLevel == 1) 
                        amr = bmr * 1.2;
                else if (activityLevel == 2) 
                        amr = bmr * 1.55;
                else if (activityLevel == 3)
                        amr = bmr * 1.9;
                System.out.println("AMR: " + amr);
        } 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice ,age=0 ;
        double weight=0 , height=0;
        String gender="";
        do {
            System.out.println("-----------------------------------");
            System.out.println("1. Check Blood Pressure ");
            System.out.println("2. Check Blood Sugar ");
            System.out.println("3. Check Average Blood Sugar ");
            System.out.println("4. BMI Calculator ");
            System.out.println("5. Calories Calculator ");
            System.out.println("6. Exit ");
            System.out.println("-----------------------------------");
            System.out.println("\nEnter your choice :   ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    checkBloodPressure();
                    break;
                case 2:
                    checkBloodSugar();
                    break;
                case 3:
                    checkAverageBloodSugar();
                    break;
                case 4:
                    bmiCalculator(weight,height);
                    break;
                case 5:
                    caloriesCalculator(weight, height, gender , age);
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("in valid choice");
            }
        } while (true);
    }
}
