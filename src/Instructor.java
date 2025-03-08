public class Instructor extends user{
    private String departman;

    public Instructor(int id, String firstName, String lastName, String email,String departman) {
        super(id, firstName, lastName, email);
        this.departman = departman;
    }


    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }


    @Override
    public String toString() {
        return "Instructor{id=" + getId() + ", name='" + getFirstName() +getLastName()+ ", email="+ getEmail() +"', department='" + departman + "'}";
    }
}


