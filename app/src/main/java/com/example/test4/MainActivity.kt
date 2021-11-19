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
//    실제 목록을 담아줄 어레이리스트를 만들고, 그 안에 실제 데이터들을 담아주자

    lateinit var mAdapter: StudentAdapter

//  온크리에이트 위에서는 적용이 안되기 때문에 Lateinint 사용해라라(mAdapter에 나중에 대입한다는 내용)
//  mAdapter들을 StudentAdapter 양식으로 뿌려줄것이다

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

//        실제 뿌려줄 데이터들을 어레이리스트 변수에 추가해주자

       mAdapter = StudentAdapter(this,R.layout.student_list_item, mStudentList)

//       스튜던트 어댑터 클래스를 객체화 한것(oncreate내부에서)

        studentListView.adapter = mAdapter

//       스튜던트리스트뷰의 어댑터를 엠어댑터로 작동시킬거야야

       studentListView.setOnItemClickListener { parent, view, position, id ->

//           아이템이 눌렷을때

            val clickedStudent = mStudentList[position]

//           변수가 순서대로 나올수 있게 코딩해줌

            Toast.makeText(this, "${clickedStudent.name} 이 클릭 됨", Toast.LENGTH_SHORT).show()

        }

//          사용자에게 보여지는 문구

         studentListView.setOnItemLongClickListener { parent, view, position, id ->

//           아이템이 길게 눌렸을때


             mStudentList.removeAt(position)

//             순서대로 삭제한다

             mAdapter.notifyDataSetChanged()

//             리스트가 변경되면 데이터반영을 해라(이것을 안하면 앱이 잘죽기 때문에 습관적으로 눌러주기)

            return@setOnItemLongClickListener true

//           함수의 결과로 뭘 줄것이냐는 코드 트루는 롱클릭 전용이라는 의미


         }


    }
}