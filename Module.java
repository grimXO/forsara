package Package1;

public class Module {
    private String idModule;
    private Student[] class_list;
    private Integer enrolled;

    public Module(String idModule){
        this.idModule = idModule;
        this.class_list = new Student[5];
        this.enrolled = 0;
    }

    public String toString(){
        String output = " ";
        output += "Module\n";
        output += "Module\n" + this.idModule + "\n";
        for (int i = 0; i < this.enrolled; i++){
            output += this.class_list[i] + "\n";
        }
        return output;
    }

    public void enrol(Student s){
        this.class_list[this.enrolled] = s;
        this.enrolled += 1;

    }


}
