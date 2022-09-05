public class App {
    public static void main(String[] args) {

        Student me = new Student();

        me.surname = "Unidad";
        me.firstname = "Jerome Marccux";
        me.middleinitial = 'S' ;
        me.birthOfDate = 12/07/2003;
        me.studentNumber = 2022103090;
        me.studentEmailAddress = "unidadjs@students.national-u.edu.ph";
        me.amIAwsome = true;

        me.sayMystudentNumber();
        me.sayMystudentEmailAddrerss();
        me.sayMyamIAwsome();
    }
}
