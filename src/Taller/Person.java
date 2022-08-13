package Taller;


public class Person {
    public String id, nationalId,idType, name, email, lastName;
    public Location location;
    public PersonType personType;

    public Person(String id, String nationalId, String idType, String name, String email, String lastName, Location location, PersonType personType) {
        this.id = id;
        this.nationalId = nationalId;
        this.idType = idType;
        this.name = name;
        this.email = email;
        this.lastName = lastName;
        this.location = location;
        this.personType = personType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", nationalId=" + nationalId + ", idType=" + idType + ", name=" + name + ", email=" + email + ", lastName=" + lastName + ", location=" + location + ", personType=" + personType + '}';
    }
    
    public boolean biometricValidation(){
        boolean validated = false;
        
        return validated;
    }
}
