package com.example.todolist

import androidx.room.*
import androidx.room.Dao

@Dao

interface DAO {

        @Query("SELECT * FROM todo")
        fun getTodos(): MutableList<ToDo>

        @Insert
        fun createToDo(toDo: ToDo)

        @Delete
        fun deleteToDo(toDo: ToDo)

        @Update
        fun updateToDo(toDo: ToDo)
}