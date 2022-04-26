package com.example.contentproviderpractice

import android.net.Uri

class Contract (){
    companion object
    {
        var AUTHORITY : String = "com.android.example.minimalistcontentprovider.provider"
        var CONTENT_PATH : String = "words"
        var CONTENT_URI : Uri = Uri.parse("content://" + AUTHORITY + "/" + CONTENT_PATH)
        var ALL_ITEMS : Int = -2
        var WORD_ID : String = "id"
        var SINGLE_RECORD_MIME_TYPE : String = "vnd.android.cursor.item/vnd.com.example.provider.words"
        var MULTIPLE_RECORDS_MIME_TYPE : String = "vnd.android.cursor.dir/vnd.com.example.provider.words"

    }



}
