public class Main {
    public static void main(String[] args) {
        Teacher t1= new Teacher("Lale Şiviloğlu","5436","TRH" );
        Teacher t2= new Teacher("Süleyman SEVİMLİ","2345","ÇRFY");
        Teacher t3= new Teacher("Metin Lokumcu","2345","MAT");


        Course tarih=new Course("Tarih","TRH101","TRH");
        tarih.addTeacher(t1);

        Course coğrafya=new Course("Çoğrafya","ÇRFY102","ÇRFY");
        coğrafya.addTeacher(t2);

        Course matematik=new Course("Matematik","MAT103","MAT");
        matematik.addTeacher(t3);

        Student s1=new Student("Soner DEMİRCİ","6043","12/B",tarih, matematik,coğrafya);
        s1.addBulkExamNote(45,68,99);
        s1.isPass();


    }
}