package com.betrybe.playground

class Student(
    name: String,
    age: Int,
    email: String,
    val enrollmentNumber: String,
    val subjects: List<Discipline>,
    val academicPeriod: PeriodEnum
) : Person(name, age, email)