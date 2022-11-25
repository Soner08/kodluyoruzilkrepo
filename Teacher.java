public class Teacher {
    String name;
    String mbnum;
    String branch;

    Teacher (String name,String mbnum,String branch){
        this. name = name;
        this. mbnum= mbnum;
        this. branch= branch;

    }
    void print(){
        System.out.println("Adı : "+ this.name);
        System.out.println("Telefon no : "+ this.mbnum);
        System.out.println("Branş : "+ this.branch);
    }
}
