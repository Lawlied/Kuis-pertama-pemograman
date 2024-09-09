package com.example.kuis.model;

package com.example.Kuis.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "produk")
public class Produk {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int id;

    @ColumnInfo(name = "nama")
    public String nama;

    @ColumnInfo(name = "nomor")  // Changed to "nomor" to avoid duplicate "deskripsi" column name
    public String nomor;

    @ColumnInfo(name = "program")  // Changed to "program" to avoid duplicate column name
    public String deskripsi;
}