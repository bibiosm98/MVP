package com.example.mvp

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ArrayAdapter<String>
    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MainActivityPresenter(this)

        adapter = ArrayAdapter<String>(
            this,
            R.layout.simple_list_item_checked,
            R.id.text1,
            mutableListOf()
        )
        binding.lvHolders.adapter = adapter

        binding.lvHolders.setOnItemLongClickListener { _, _, position, _ ->
            presenter?.removeString(position)
            return@setOnItemLongClickListener false
        }
        binding.btnAdd.setOnClickListener {
            presenter?.addString(binding.etInput.text.toString())
        }
    }

    override fun updateHolderList(list: ArrayList<String>) {
        adapter.clear()
        adapter.addAll(list)
        adapter.notifyDataSetChanged()
    }
}