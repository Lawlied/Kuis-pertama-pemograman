package com.example.kuis.MhsDao;


import com.example.kuis.Adapter.MhsAdapter;

import java.util.List;

@MhsDao
public interface MhsDao {
    @insert
    void insert(MhsAdapter produk);

    @Update
    void update(MhsAdapter produk);

    @Delete
    void delete(MhsAdapter produk);

    @Query("SELECT * FROM produk")
    List<MhsAdapter> getAll();
}