package com.ardian.tugas9layoutmovie

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.tugas9layoutmovie.R
import android.view.ViewGroup

class TvShowFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tv_show,container,false)
    }
}