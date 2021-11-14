package com.example.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.test4.adapters.StudentAdapter
import com.example.test4.dates.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("김창완", 1998, "남"))
        mStudentList.add( Student("보라돌이", 1986, "남"))
        mStudentList.add( Student("뚜비", 1996, "남"))
        mStudentList.add( Student("나나", 2000,"여"))
        mStudentList.add( Student("뽀", 2002,"여"))
        mStudentList.add( Student("햇님", 1000,"무"))
        mStudentList.add( Student("달님", 1002,"무"))

        mAdapter = StudentAdapter(this,R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

        studentListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 이 클릭 됨", Toast.LENGTH_SHORT).show()

        }

         studentListView.setOnItemLongClickListener { parent, view, position, id ->


             mStudentList.removeAt(position)

             mAdapter.notifyDataSetChanged()

             return@setOnItemLongClickListener true


         }


    }
}