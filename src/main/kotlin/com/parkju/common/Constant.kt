package com.parkju.common

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*
//Where is this repository?
object Constant {
    val EMPTY_DATE = Date(0)
    val EMPTY_SQL_DATE = java.sql.Date(0)
    val EMPTY_SQL_TIME = java.sql.Time(0)
    val EMPTY_SQL_TIMESTAMP = java.sql.Timestamp(0)
    val EMPTY_LOCAL_DATE = LocalDate.of(1970, 1, 1)
    val EMPTY_LOCAL_TIME = LocalTime.of(0, 0)
    val EMPTY_LOCAL_DATETIME = LocalDateTime.of(1970, 1, 1, 0, 0)
}