package com.example.mvp

class Holder() {
    var list = ArrayList<String>()
    override fun toString(): String {
        return super.toString() + list.toString()
    }
}