public class GradeAnalyzer {
    public static void main(String[] args) {
        int[] grades = {85, 92, 78, 95, 88, 75, 90, 82, 89, 93};

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;

        int highest = grades[0];
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}