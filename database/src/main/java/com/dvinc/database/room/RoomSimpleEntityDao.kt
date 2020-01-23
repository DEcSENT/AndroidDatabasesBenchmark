package com.dvinc.database.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface RoomSimpleEntityDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entity: RoomSimpleEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entities: List<RoomSimpleEntity>)

    @Query("SELECT * FROM room_simple_entity")
    fun getEntities(): List<RoomSimpleEntity>

    @Update
    fun updateEntities(entities: List<RoomSimpleEntity>)

    @Query("DELETE FROM room_simple_entity")
    fun deleteAllEntities()
}
