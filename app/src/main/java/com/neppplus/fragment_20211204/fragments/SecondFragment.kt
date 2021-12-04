package com.neppplus.fragment_20211204.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.neppplus.fragment_20211204.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment {


    class SecondFragment : Fragment(){

//    xml을 연결해주는 역할만 담당

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            return inflater.inflate(R.layout.fragment_second,container,false)
        }

//    동작 관련 코드 담당

        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)

            btnToastSecond.setOnClickListener {

                Toast.makeText(requireContext(), "프래그먼트에서 두번째 토스트 띄우기", Toast.LENGTH_SHORT).show()



            }
        }

    }
}