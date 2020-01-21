/*
 * Author: Denis Verentsov
 * Email: decsent@yandex.ru
 * 2020-01-21
 */

package com.dvinc.database.objectbox

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class BoxSimpleEntity(

    @Id
    var id: Long = 0,

    val name: String
)
