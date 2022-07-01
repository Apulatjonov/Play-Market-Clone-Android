package com.example.playmarket

import android.net.Uri
import java.net.URL

class InnerItem() {
    var picture:String? = null
    var logo:String? = null
    var name:String? = null
    var type:String? = null
    var score:String? = null
    var memory:String? = null
    constructor(picture:String?, logo:String?, name:String?, type:String?, score:String?, memory:String?):this(){
        this.name = name
        this.logo = logo
        this.picture = picture
        this.type = type
        this.score = score
        this.memory = memory
    }
}