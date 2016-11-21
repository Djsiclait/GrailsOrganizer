package grailsorganizer

import java.sql.Date

class Department {

    String name

    // Meta Attributes
    Date dateCreated
    Date dateUpdated



    static constraints = {
        name(unique: true, blank: false)
        dateCreated(Date: true)
        dateUpdated(Date: true)
    }
}
