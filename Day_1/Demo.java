public class Demo{
    public static void main(String[] args) {
        int nums[] = {3,7,2,4};

        // System.out.println(nums[3]);
        
        //Normal For Loop
        for(int i = 0; i < nums.length ; i++){
            System.out.println(nums[i]);
        }

        System.out.println("\n\n\n\n");

        //Enhanced for Loop
        for(int i : nums){
            System.out.println(i);
        }


        Student stud1 = new Student();
        stud1.rollNo = 1;
        stud1.name = "Amar";
        stud1.marks = 92;

        Student stud2 = new Student();
        stud2.rollNo = 2;
        stud2.name = "Aman";
        stud2.marks = 91;

        Student stud3 = new Student();
        stud3.rollNo = 3;
        stud3.name = "Amish";
        stud3.marks = 90;

        Student students[] = new Student[3];
        students[0] = stud1;
        students[1] = stud2;
        students[2] = stud3;


        for(Student stud : students){
            System.out.println(stud);
        }
        
        
    }
}


class Student {
    int rollNo;
    String name;
    int marks;
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
    }

    

}