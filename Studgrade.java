public class Studgrade
{

    public static void main(String[] args) {
        int[][][] grades = {
                {
                        {85, 90, 78},
                        {92, 88, 76},
                        {80, 85, 90},
                        {70, 80, 65}
                },
                {
                        {88, 85, 95},
                        {92, 90, 85},
                        {84, 76, 89},
                        {79, 82, 77}
                },
                {
                        {80, 78, 85},
                        {86, 88, 92},
                        {91, 85, 84},
                        {74, 72, 70}
                },
                {
                        {95, 93, 88},
                        {89, 91, 85},
                        {78, 80, 86},
                        {70, 72, 75}
                },
                {
                        {83, 85, 89},
                        {78, 80, 76},
                        {85, 88, 91},
                        {90, 85, 88}
                }
        };
        for (int classIndex = 0; classIndex < grades.length; classIndex++) {
            System.out.println("Class " + (classIndex + 1) + ":");

            for (int subjectIndex = 0; subjectIndex < grades[classIndex].length; subjectIndex++) {
                System.out.println("  Subject " + (subjectIndex + 1) + ":");

                for (int studentIndex = 0; studentIndex < grades[classIndex][subjectIndex].length; studentIndex++) {
                    int sum = 0;
                    for (int sub = 0; sub < grades[classIndex].length; sub++) {
                        sum += grades[classIndex][sub][studentIndex];
                    }
                    double average = sum / (double) grades[classIndex].length;
                    System.out.printf("    Student %d average: %.2f\n", studentIndex + 1, average);
                }
            }
            System.out.println();
        }
    }
}
