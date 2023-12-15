/**
 * @author Elias.Gomes
 */
public class Person {
    private String name;
    private int age;
    private String address;

    private String profession;

    /**
     * @return return person name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * @since version1
     */
    public void printPerson(){
        System.out.println("Olá "+ this.name);
    }
}
