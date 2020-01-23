package com.dvinc.database.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "room_simple_entity")
data class RoomSimpleEntity(

    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    val name: String
)
