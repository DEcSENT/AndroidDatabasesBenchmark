package com.dvinc.database.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RoomSimpleEntity::class], version = 1)
abstract class RoomDb : RoomDatabase() {

    abstract fun roomDao(): RoomSimpleEntityDao
}
