package grailsorganizer

import java.sql.Date

class Department implements Serializable {

    String name

    // Meta Attributes
    Date dateCreated
    Date dateUpdated

    static hasMany = [users: User, contacts: Contact]

    Set<User> getUsers(){

    }

    Set<Contact> getContacts(){

    }

    static constraints = {
        name(unique: true, blank: false)
        dateCreated(Date: true)
        dateUpdated(Date: true)
        users(nullable: false)
        contacts(nullable: false)
    }
}
