public class Dancer extends Persen{

    private String groupName;
    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName= groupName;
    }
    public Dancer(String name, String designation){
        super(name, designation);

    }

    @Override
    public String toString() {
        return "Dancer {" +
                "name "+ getName()+
                "designation : " + getDesignation()+
                " groupName='" +  groupName + '}';
    }
}

