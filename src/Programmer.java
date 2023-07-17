public class Programmer extends Persen {
    private String companyName;


    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public Programmer(String name, String designation){
        super(name, designation);

}

    @Override
    public String toString() {
        return "Programmer { " +
                " name : "+ getName()  +
                "; designation = : " + getDesignation()  +
                "; companyName ='" + companyName + '}';
    }
}
