package grailsorganizer

class User {

    String username
    String firstName
    String lastName

    // Meta Attributes
    Date dateCreated
    Date dateUpdated

    static constraints = {
        username(unique: true, blank: false)
        firstName(blank: false)
        lastName(blank: false)
    }
}
