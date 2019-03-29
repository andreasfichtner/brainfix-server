package de.retterdesapok.brainfix

import java.time.*
import java.time.format.DateTimeFormatter

class Utilities {
    companion object {

        fun getDateStringYesterday(): String {
            val yesterday = LocalDateTime.now().minusDays(1).withSecond(0).withNano(0)
            return getStringFromLocalDateTime(yesterday)
        }

        fun getDateStringNow(): String {
            val now = LocalDateTime.now().withSecond(0)
            return getStringFromLocalDateTime(now)
        }

        fun getStringFromLocalDateTime(dateTime: LocalDateTime): String {
            val zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.systemDefault()).format(DateTimeFormatter.ISO_INSTANT)
            return zonedDateTime.format(DateTimeFormatter.ISO_INSTANT)
        }
    }
}