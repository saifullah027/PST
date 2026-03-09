import java.util.*;
import java.util.stream.*;

class Students{
    String name;
    int marks;

    public Students(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}

public class TopKStudents{
    public static void main(String[] args) {
        System.out.println("Enter the number of students:");
        List<Students> students=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            String name=sc.next();
            int marks=sc.nextInt();
            students.add(new Students(name,marks));
        }
        int K=sc.nextInt();
             List<String> result =
                students.stream()
                        .sorted(
                                Comparator.comparingInt((Students s) -> s.marks)
                                          .reversed()
                                          .thenComparing(s -> s.name)
                        )
                        .limit(K)
                        .map(s -> s.name)
                        .collect(Collectors.toList());
        System.out.println(String.join(" ", result));
    }
}