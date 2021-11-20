package com.example.test4.dates

import android.util.Log

//학생 이름 출생년도

class Student(

    val name : String,
    val birthYear : Int,
    val sex : String) {
// 생성자 만들기 ex) class 이름

    fun printName() {
        Log.d("연습용", this.name)
    }

    fun getMyAgeIn2021() : Int {
        val myAge = 2021 - this.birthYear + 1

        return myAge
    }

//    출생년도를 가지고 => (2021년 한국식) 나이로 변환해서 보여주기

}


