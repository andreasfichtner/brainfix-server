package de.retterdesapok.brainfix

import java.text.SimpleDateFormat
import java.time.Instant
import java.time.LocalDate
import java.util.*
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale





class Utilities {
    companion object {

        fun getDateStringYesterday(): String {
            var yesterday = LocalDate.now().minusDays(1)
            return yesterday.format(DateTimeFormatter.ISO_INSTANT)
        }

        fun getDateStringNow(): String {
            return LocalDate.now().format(DateTimeFormatter.ISO_INSTANT)
        }
    }
}