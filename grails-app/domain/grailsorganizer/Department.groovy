package grailsorganizer

class Department {

    String name

    // Meta Attributes
    Date dateCreated
    Date dateUpdated

    static constraints = {
        name(unique: true, blank: false)
    }
}
