package grailsorganizer

class Contact implements Serializable {

    String firstName
    String lastName
    String email
    String telephone
    String address
    String job
    String cellphone

    static constraints = {
    }
}
