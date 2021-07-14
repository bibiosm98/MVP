package com.example.mvp

class Holder() {
    private var list = ArrayList<String>()
    fun addItem(newItem: String){
        list.add(newItem)
    }
    fun removeItem(position: Int){
        list.removeAt(position)
    }
    fun getHolderList(): ArrayList<String> {
        return list
    }
}