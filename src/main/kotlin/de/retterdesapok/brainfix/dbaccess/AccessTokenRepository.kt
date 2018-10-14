package de.retterdesapok.brainfix.dbaccess

import de.retterdesapok.brainfix.entities.AccessToken
import org.springframework.data.repository.CrudRepository

interface AccessTokenRepository : CrudRepository<AccessToken, Long> {
    public fun findByToken(token: String) : AccessToken
    public fun existsByToken(token: String) : Boolean
}