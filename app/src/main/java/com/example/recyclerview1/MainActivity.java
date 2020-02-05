package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Vegetarian","Category book","Description book",R.drawable.thevegetarian));
        lstBook.add(new Book("The Martian","Category book","Description book",R.drawable.themartian));
        lstBook.add(new Book("Alive","Category book","Description book",R.drawable.alive));
        lstBook.add(new Book("Evil Monkey Robot","Category book","Description book",R.drawable.evilrobot));
        lstBook.add(new Book("Maria Sempel","Category book","Description book",R.drawable.mariasempel));
        lstBook.add(new Book("Privacy","Category book","Description book",R.drawable.privacy));
        lstBook.add(new Book("The Vegetarian","Category book","Description book",R.drawable.thevegetarian));
        lstBook.add(new Book("The Martian","Category book","Description book",R.drawable.themartian));
        lstBook.add(new Book("Alive","Category book","Description book",R.drawable.alive));
        lstBook.add(new Book("Evil Monkey Robot","Category book","Description book",R.drawable.evilrobot));
        lstBook.add(new Book("Maria Sempel","Category book","Description book",R.drawable.mariasempel));
        lstBook.add(new Book("Privacy","Category book","Description book",R.drawable.privacy));
        lstBook.add(new Book("The Vegetarian","Category book","Description book",R.drawable.thevegetarian));
        lstBook.add(new Book("The Martian","Category book","Description book",R.drawable.themartian));
        lstBook.add(new Book("Alive","Category book","Description book",R.drawable.alive));
        lstBook.add(new Book("Evil Monkey Robot","Category book","Description book",R.drawable.evilrobot));
        lstBook.add(new Book("Maria Sempel","Category book","Description book",R.drawable.mariasempel));
        lstBook.add(new Book("Privacy","Category book","Description book",R.drawable.privacy));


        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,lstBook);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);

    }
}
