package com.example.kuis;

package com.example.Kuis;

import com.example.Kuis.dao.ProdukDao;
import com.example.Kuis.model.Produk;
import com.example.kuis.Adapter.MhsAdapter;
import com.example.kuis.MhsDao.MhsDao;


@MhsAdapter(entities = {AppDatabase.class}, version = 1)
public abstract class AppDatabase extends  {

    public abstract MhsDao produkDao();

    public MhsDao MhsDao() {
    }
}