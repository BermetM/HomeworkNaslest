public class Singer extends Persen {
       private String bandName;


       public Singer(String name, String designation, String bandName){
              super(name, designation);
              this.bandName =bandName ;
       }

       public Singer(String name, String designation) {
              super(name, designation);

       }

       @Override
       public String toString() {
              return "Singer {" +
                      " name : " + getName() +
                      " ; designation = " + getDesignation() +
                      " ; bandName = '" + bandName + '}';
       }



}