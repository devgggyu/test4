package com.example.test4.dates

import android.util.Log

//학생 이름 출생년도

class Student(

    val name : String,
    val birthYear : Int,
    val sex : String) {
// 생성자 만들기 ex) class 이름

    fun printMyNameToLog(num1 : Int, num2 : Double) : Boolean{


//        학생의 기능? 예시
//        자신의 이름을 로그로 찍는 기능

        if (num1 > num2) {
            Log.d("연습용", this.name)
            return false

//            num1이 num2 보다 크면 로그를 이름만 출력해
        }
        else {
            Log.d("연습용", this.name)
            Log.d("연습용", "잘 부탁드립니다.")
        }

//        그렇지 않다면, 이름과 인사도 로그를 출력해해

        return true










}


