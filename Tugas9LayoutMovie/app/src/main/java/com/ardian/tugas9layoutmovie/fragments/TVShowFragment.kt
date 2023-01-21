package com.ardian.tugas9layoutmovie.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ardian.tugas9layoutmovie.Data
import com.example.tugas9layoutmovie.R
import com.ardian.tugas9layoutmovie.adapters.TvShowAdapter

class TvShowFragment : Fragment() {

    private lateinit var adapter: TvShowAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var tvShowArrayList: ArrayList<com.ardian.tugas9layoutmovie.Data>

    lateinit var name: Array<String>
    lateinit var detail: Array<String>
    lateinit var poster: Array<Int>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_tvshow)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = TvShowAdapter(tvShowArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        tvShowArrayList = arrayListOf<com.ardian.tugas9layoutmovie.Data>()

        name = arrayOf(
            getString(R.string.tvshow_name),
            getString(R.string.tvshow_name2),
            getString(R.string.tvshow_name3),
            getString(R.string.tvshow_name4),
            getString(R.string.tvshow_name5),
            getString(R.string.tvshow_name6)
        )

        detail = arrayOf(
            getString(R.string.tvshow_detail),
            getString(R.string.tvshow_detail2),
            getString(R.string.tvshow_detail3),
            getString(R.string.tvshow_detail4),
            getString(R.string.tvshow_detail5),
            getString(R.string.tvshow_detail6)
        )

        poster = arrayOf(
            R.drawable.tvshow,
            R.drawable.tvshow2,
            R.drawable.tvshow3,
            R.drawable.tvshow4,
            R.drawable.tvshow5,
            R.drawable.tvshow6
        )

        for (i in name.indices) {
            val tvshow = com.ardian.tugas9layoutmovie.Data(name[i], detail[i], poster[i])
            tvShowArrayList.add(tvshow)
        }
    }
}