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
import com.ardian.tugas9layoutmovie.adapters.MovieAdapter

class MovieFragment : Fragment() {

    private lateinit var adapter: MovieAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var movieArrayList: ArrayList<com.ardian.tugas9layoutmovie.Data>

    lateinit var name: Array<String>
    lateinit var detail: Array<String>
    lateinit var poster : Array<Int>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rv_movie)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MovieAdapter(movieArrayList)
        recyclerView.adapter = adapter


    }

    private fun dataInitialize() {
        movieArrayList = arrayListOf<com.ardian.tugas9layoutmovie.Data>()

        name = arrayOf(
            getString(R.string.movie_name),
            getString(R.string.movie_name2),
            getString(R.string.movie_name3),
            getString(R.string.movie_name4),
            getString(R.string.movie_name5),
            getString(R.string.movie_name6)
        )

        detail = arrayOf(
            getString(R.string.movie_detail),
            getString(R.string.movie_detail2),
            getString(R.string.movie_detail3),
            getString(R.string.movie_detail4),
            getString(R.string.movie_detail5),
            getString(R.string.movie_detail6)
        )

        poster = arrayOf(
            R.drawable.movie,
            R.drawable.movie2,
            R.drawable.movie3,
            R.drawable.movie4,
            R.drawable.movie5,
            R.drawable.movie6
        )

        for (i in name.indices) {
            val movie = com.ardian.tugas9layoutmovie.Data(name[i], detail[i], poster[i])
            movieArrayList.add(movie)
        }
    }
}