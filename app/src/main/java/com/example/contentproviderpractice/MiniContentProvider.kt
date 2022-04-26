package com.example.contentproviderpractice

import android.content.ContentProvider
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.util.Log
import com.example.contentproviderpractice.MainActivity.Companion.TAG

class MiniContentProvider : ContentProvider()
{
    companion object
    {
        lateinit var mData: Array<String>
    }

    override fun onCreate(): Boolean
    {
        var context : Context = getContext()!!
        mData = context.getResources().getStringArray(R.array.words);
        return true;
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        TODO("Not yet implemented")
    }

    override fun getType(uri: Uri): String? {
        TODO("Not yet implemented")
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        Log.e(TAG, " you words has insert sucessfully " +  uri.toString())

       return uri
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
       Log.e(TAG, "your words has been deleted sucessfully " + uri.toString())

        return 0
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int {

        Log.e(TAG, "your words has been update successflly")

        return 0
    }


}