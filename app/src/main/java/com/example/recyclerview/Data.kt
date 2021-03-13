package com.example.recyclerview

class Data(name: String?, isCheck: Boolean?) {
    private var title: String
    private var genre: Boolean
    init {
        this.title = name!!
        this.genre = isCheck!!
    }
    fun getTitle(): String? {
        return title
    }
    fun setTitle(name: String?) {
        title = name!!
    }
}