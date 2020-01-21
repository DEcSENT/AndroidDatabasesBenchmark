package com.dvinc.database.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface RoomSimpleEntityDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entity: RoomSimpleEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entities: List<RoomSimpleEntity>)
}