import java.util.*;
import java.util.stream.*;

class Students{
    String name;
    double cgpa;
    int id;

    public Students(String name, double cgpa, int id){ 
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class TopCGPAStudents{
    public static void main(String[] args) {
        System.out.println("Enter the number of students:");
        List<Students> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble(); 
            students.add(new Students(name, cgpa, id));
        }
        int K = sc.nextInt();

        List<String> result =
            students.stream()
                    .sorted(
                            Comparator.comparingDouble((Students s) -> s.cgpa) 
                                      .reversed()
                                      .thenComparing(s -> s.name)
                    )
                    .limit(K)
                    .map(s -> s.name)
                    .collect(Collectors.toList());
        System.out.println(String.join(" ", result));
    }
}