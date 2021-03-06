package com.hexing.fdmdemo.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DBTEST".
*/
public class DBTestDao extends AbstractDao<DBTest, Void> {

    public static final String TABLENAME = "DBTEST";

    /**
     * Properties of entity DBTest.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Title = new Property(0, String.class, "title", false, "TITLE");
        public final static Property Context = new Property(1, String.class, "context", false, "CONTEXT");
        public final static Property Desc = new Property(2, String.class, "desc", false, "DESC");
    }


    public DBTestDao(DaoConfig config) {
        super(config);
    }
    
    public DBTestDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DBTEST\" (" + //
                "\"TITLE\" TEXT," + // 0: title
                "\"CONTEXT\" TEXT," + // 1: context
                "\"DESC\" TEXT);"); // 2: desc
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DBTEST\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DBTest entity) {
        stmt.clearBindings();
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(1, title);
        }
 
        String context = entity.getContext();
        if (context != null) {
            stmt.bindString(2, context);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(3, desc);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DBTest entity) {
        stmt.clearBindings();
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(1, title);
        }
 
        String context = entity.getContext();
        if (context != null) {
            stmt.bindString(2, context);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(3, desc);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public DBTest readEntity(Cursor cursor, int offset) {
        DBTest entity = new DBTest( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // title
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // context
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // desc
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DBTest entity, int offset) {
        entity.setTitle(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setContext(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDesc(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(DBTest entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(DBTest entity) {
        return null;
    }

    @Override
    public boolean hasKey(DBTest entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
