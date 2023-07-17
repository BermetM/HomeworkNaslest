public class Persen {
    private String name;
    private String designation;

    public Persen(String name,String designation){
        this.name=name;
        this.designation=designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void method(){
        System.out.println("'");
    }
    public void Ok(){
        System.out.println("Ok");
    }

    @Override
    public String toString() {
        return"Persen :"+ "name : " + getName() + "; designation : "
                + getDesignation();
    }
}

