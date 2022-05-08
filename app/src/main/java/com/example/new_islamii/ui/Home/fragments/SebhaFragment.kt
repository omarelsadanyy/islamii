package com.example.new_islamii.ui.Home.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.example.new_islamii.R

class SebhaFragment : Fragment() {
    lateinit var sebha_count: Button
    lateinit var sebha_btn: Button
    lateinit var change_mode: Button
    var number: Int = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sebha, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initviews()
        sebha_btn.setOnClickListener {
            number += 1
            sebha_count.text = number.toString()
            if (number == 33) {
                number = 0
            }
        }
        change_mode.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
    }

    private fun initviews() {
        sebha_count = requireView().findViewById(R.id.sebha_count)
        sebha_btn = requireView().findViewById(R.id.sebha_count_btn)
        change_mode = requireView().findViewById(R.id.change_mode)
    }
}