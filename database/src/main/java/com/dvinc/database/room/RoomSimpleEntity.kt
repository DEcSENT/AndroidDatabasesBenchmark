package com.dvinc.database.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RoomSimpleEntity(

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    val name: String
)
