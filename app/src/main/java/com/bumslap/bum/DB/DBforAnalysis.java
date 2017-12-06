package com.bumslap.bum.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by oyoun on 17. 12. 6.
 */

public class DBforAnalysis extends SQLiteOpenHelper{

    private Context context;

    public DBforAnalysis(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
        this.context = context;
    }



    /**
     * Database 가 존재하지 않을 때, 딱 한 번 실행된다.
     * DB를 만드는 역할을 한다.
     */
    @Override
    public void onCreate(SQLiteDatabase db){
        //String도 가능하지만, StringBuffer 가 Query 만들기 더 편하다.
        StringBuffer sb = new StringBuffer();
        sb.append(" CREATE TABLE TEST_TABLE (");
        sb.append(" _ID INTEGER PRIMARY KEY AUTOINCREMENT, ");
        sb.append(" MENU_NAME TEXT, ");
        sb.append(" MENU_IMAGE, ");
        sb.append(" MENU_PRICE, ");
        sb.append(" MENU_COST ) ");

        // SQLite Database로 쿼리 실행
        db.execSQL(sb.toString());

        Toast.makeText(context, "메뉴 정보 생성", Toast.LENGTH_LONG).show();


    }

    /**
     * version이  up되어서 table 구조가 변경되었을 때 실행
     */

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        Toast.makeText(context, "버전이 올라갔습니다.", Toast.LENGTH_SHORT).show();
    }

    public  void testDB(){
        SQLiteDatabase db = getReadableDatabase();
    }

}
