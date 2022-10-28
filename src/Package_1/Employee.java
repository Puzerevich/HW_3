package Package_1;

public class Employee {

    private String FullName;
    private String Position;
    private String Email;
    private String Phone;
    private String BirthDate;

    public Employee(String fullname, String postion, String email, String phone, String birthdate){
        FullName  = fullname;
        Position  = postion;
        Email     = email;
        Phone     = phone;
        BirthDate = birthdate;
    }

    public Employee() {

    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FullName='" + FullName + '\'' +
                ", Position='" + Position + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", BirthDate='" + BirthDate + '\'' +
                '}';
    }
}
