/*
 * Author: Denis Verentsov
 * Email: decsent@yandex.ru
 * 2020-01-21
 */

package com.dvinc.database.objectbox

import android.content.Context
import io.objectbox.BoxStore

object ObjectBox {

    lateinit var boxStore: BoxStore
        private set

    fun init(context: Context) {
        boxStore = MyObjectBox.builder()
            .androidContext(context.applicationContext)
            .build()
    }
}
