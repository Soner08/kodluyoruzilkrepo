public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix){
        this.name= name;
        this.code= code;
        this.prefix= prefix;

        int note= 0;

    }
    void addTeacher(Teacher teacher1){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher1;
        }else {
            System.out.println("Öğretmen dersle uyuşmuyor!!");
        }


    }
    void printTeacher(){
        this.teacher.print();

    }

    }

