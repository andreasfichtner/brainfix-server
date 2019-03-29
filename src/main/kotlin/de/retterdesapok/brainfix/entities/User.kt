package de.retterdesapok.brainfix.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User {
    @Id
    @GeneratedValue
    var id: Long? = null
    var username: String = ""
    var passwordHash: String = ""
    var failedLogins: Long = 0
    var lastLogin: String = 0
    var isActive: Boolean = false
}