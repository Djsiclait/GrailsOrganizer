package grailsorganizer

class User implements Serializable {

    String username
    String firstName
    String lastName

    // Meta Attributes
    Date dateCreated
    Date dateUpdated

    static belongsTo = [Department]

    static constraints = {
        username(unique: true, blank: false)
        firstName(blank: false)
        lastName(blank: false)
        dateCreated(Date: true)
        dateUpdated(Date: true)
    }
}
