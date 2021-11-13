package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.test4.adapters.StudentAdapter
import com.example.test4.dates.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("김창완", 1998))
        mStudentList.add( Student("보라돌이", 1986))
        mStudentList.add( Student("뚜비", 1996))
        mStudentList.add( Student("나나", 2000))
        mStudentList.add( Student("뽀", 2002))
        mStudentList.add( Student("햇님", 1000))
        mStudentList.add( Student("달님", 1002))

        mAdapter = StudentAdapter(this,R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

    }
}