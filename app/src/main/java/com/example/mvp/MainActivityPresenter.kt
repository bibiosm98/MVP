package com.example.mvp

class MainActivityPresenter(private val view: View) {
    private val holders: Holder = Holder()

    fun addString(newItem: String?){
        newItem?.let{
            holders.addItem(newItem)
        }
        view.updateHolderList(holders.getHolderList())
    }

    fun removeString(position: Int){
        holders.removeItem(position)
        view.updateHolderList(holders.getHolderList())
    }
}