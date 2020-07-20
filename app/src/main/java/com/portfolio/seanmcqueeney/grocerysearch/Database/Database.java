package com.portfolio.seanmcqueeney.grocerysearch.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

import com.portfolio.seanmcqueeney.grocerysearch.Model.product;

public class Database extends SQLiteAssetHelper{

    private static final String DB_NAME = "GroceryDB.db";
    private static final int DB_VER = 1;

    public Database(Context context) {
        super(context, DB_NAME, null, DB_VER);

    }

    //Function to get all products
    public List<product> getProduct(){

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"ID"," Product", "Isle", "Department"};
        String tableName = "GroceryDB";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<product> result = new ArrayList<>();

        if (cursor.moveToFirst()){
            do{
                product product = new product();
                product.setId(cursor.getInt(cursor.getColumnIndex("Id")));
                product.setIsle(cursor.getInt(cursor.getColumnIndex("Isle")));
                product.setName(cursor.getString(cursor.getColumnIndex("Product")));
                product.setDepartment(cursor.getString(cursor.getColumnIndex("Department")));

                result.add(product);
            }while (cursor.moveToNext());
        }
        return result;
    }

    public List<String> getProductName(){

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"Product"};
        String tableName = "GroceryDB";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<product> result = new ArrayList<>();

        if (cursor.moveToFirst()){
            do{

                result.add(cursor.getString(cursor.getColumnIndex("Product")));
            }while (cursor.moveToNext());
        }
        return result;
    }


    //Function to get all Isle
    public List<String> getIsle(){

        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String[] sqlSelect = {"ID", "Product", "Isle", "Department"};
        String tableName = "GroceryDB";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db, sqlSelect, null, null, null, null, null);
        List<product> result = new ArrayList<>();

        if (cursor.moveToFirst()){
            do{
                product product = new product();
                product.setIsle(cursor.getInt(cursor.getColumnIndex("Isle")));
                product.setName(cursor.getString(cursor.getColumnIndex("Product")));
                product.setDepartment(cursor.getString(cursor.getColumnIndex("Department")));

                result.add(product);
            }while (cursor.moveToNext());
        }
        return result;
    }




}
