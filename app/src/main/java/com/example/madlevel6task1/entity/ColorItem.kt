package com.example.madlevel6task1.entity

data class ColorItem(
    var hex: String,
    var name: String
) {
    // Returns an image url from the specified hex variable in a 1080x1080 format
    fun getImageUrl() = "http://singlecolorimage.com/get/$hex/1080x1080"
}