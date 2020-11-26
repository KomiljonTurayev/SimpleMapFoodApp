package com.example.simplemap.model

class PopularFood {
    var name: String
    var price: String
    var imageUrl: Int

    var rating: String? = null
    var restorantname: String? = null

    constructor(name: String, price: String, imageUrl: Int, rating: String, restorantname: String) {
        this.name = name
        this.price = price
        this.imageUrl = imageUrl
        this.rating = rating
        this.restorantname = restorantname
    }

    constructor(name: String, price: String, imageUrl: Int) {
        this.name = name
        this.price = price
        this.imageUrl = imageUrl
    }


}