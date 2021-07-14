package com.example.mvp

class MainActivityPresenter(private val view: View) {
    private val holders: Holder = Holder()

    fun addString(newHolder: String?){
        if (newHolder != null) {
            holders.list.add(newHolder)
        }
        view.updateHolderList(holders.list)
    }

    fun removeString(position: Int){
        holders.list.removeAt(position)
        view.updateHolderList(holders.list)
    }
}