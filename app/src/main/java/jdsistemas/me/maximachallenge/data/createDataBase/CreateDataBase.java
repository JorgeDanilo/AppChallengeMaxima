package jdsistemas.me.maximachallenge.data.createDataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created on data 02/08/18.
 */
public class CreateDataBase extends SQLiteOpenHelper {

    private static final String DATA_BASE_NAME = "bd_maxima.db";
    private static final String TABLE = "produtos";
    private static final String CODE = "code";
    private static final String DESCRIPTION = "description";
    private static final String AVATAR = "avatar";
    private static final String FORNECEDOR = "fornecedor";
    private static final int VERSAO = 1;

    public CreateDataBase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = new StringBuilder().append("CREATE TABLE").append(TABLE).append("(").append(CODE).append(" integer primary key autoincrement,").append(DESCRIPTION).append(" text,").append(AVATAR).append(" text,").append(FORNECEDOR).append(" text").append(")").toString();
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }
}
