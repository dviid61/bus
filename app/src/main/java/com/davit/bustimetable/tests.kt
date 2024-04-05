package com.davit.bustimetable

import androidx.compose.runtime.currentRecomposeScope
import java.time.Duration
import java.time.LocalTime
import java.time.format.DateTimeFormatter

var times: List<String> = listOf(
    "05:40",
    "06:10", "06:30", "06:45", "06:55",
    "07:10", "07:15", "07:45", "08:00",
    "09:00", "09:10",
    "10:10",
    "11:10",
    "12:10",
    "13:10",
    "14:10",
    "15:10", "15:30",
    "16:00", "16:10",
    "17:00", "17:10",
    "18:10",
    "19:10",
    "20:10",
    "21:10", "21:50",
    "22:55"
)

fun main(){

    println(getNextComing())

}

fun getCurrentTime(): String {
    val format = DateTimeFormatter.ofPattern("HH:mm")
    return LocalTime.now().format(format)
}

fun getNextComing(): Any {

    var listComings: List<String> = mutableListOf()

    times.forEach() {

        val busTime = Duration.ofHours(it.split(":")[0].toLong()).plusMinutes(it.split(":")[1].toLong())

        val currentTime = Duration
            .ofHours(getCurrentTime().split(":")[0].toLong())
            .plusMinutes(getCurrentTime().split(":")[1].toLong())

        listComings.add()
    }

}

