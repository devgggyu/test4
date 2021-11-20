package com.example.test4.adapters

import android.content.Context
import android.inputmethodservice.Keyboard
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.test4.R
import com.example.test4.dates.Student

class StudentAdapter(val mContext : Context,
                     val resId : Int,
                     val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

    // 어떤 종류의 데이터를 상속 받아서 뿌려주게 해주는게 ArrayAdapter

    val inf = LayoutInflater.from(mContext)

//    student_list_item.xml에서 작성한 코드를 여기서 사용하는 것

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
// getView 함수를 쓰는 이유  기본모양이 아닌 우리가 원하는 모양을 뿌리기 위해서 이것을 오버라이딩이라 한다.
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf. inflate(R.layout.student_list_item, null)

//      컨버트 뷰를 검사할겁니다, 템프로우가 비어있다면 슈튜던트 리스트 아이템으로 체워 줘
        }

        val row = tempRow!!

//      "!!" 코틀린 문법에서 null 관리


        val studentData = mList[position]

//      position에 맞게 데이터를 뿌려줘라


       val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearTxt)
        val sexTxt = row.findViewById<TextView>(R.id.sexTxt)

//        앱이 죽을수 있기 때문에 변수를 만든다.

        nameTxt.text = studentData.name

        birthYearTxt.text = "(${studentData.birthYear}년생)"

        sexTxt.text = "${studentData.sex}성"

//        각 학생의 이름 / 출생년도 반영

        studentData.printName()


        return  row
//        결과로 "row" 가 나간다

    }



}