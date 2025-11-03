package com.example.vominhhoang_androidrecyclerview;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<MyModel> myModelList;
    CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myModelList = new ArrayList<>();

        // Thêm nhiều dòng dữ liệu (tên + tuổi)
        myModelList.add(new MyModel("Võ Minh Hoàng", "age: 20"));
        myModelList.add(new MyModel("Nguyễn Hoàng Long", "age: 24"));
        myModelList.add(new MyModel("Trần Thị Thu Hà", "age: 21"));
        myModelList.add(new MyModel("Phạm Quang Huy", "age: 27"));
        myModelList.add(new MyModel("Lê Thị Ngọc Ánh", "age: 22"));
        myModelList.add(new MyModel("Vũ Minh Tuấn", "age: 30"));
        myModelList.add(new MyModel("Đỗ Thị Khánh Ly", "age: 19"));
        myModelList.add(new MyModel("Bùi Anh Khoa", "age: 26"));
        myModelList.add(new MyModel("Hoàng Thị Tuyết Nhi", "age: 20"));
        myModelList.add(new MyModel("Cao Đức Thịnh", "age: 28"));
        myModelList.add(new MyModel("Dương Thị Mai Phương", "age: 23"));


        customAdapter = new CustomAdapter(this, myModelList);
        recyclerView.setAdapter(customAdapter);

        // Khi click -> hiện Toast tên người
        customAdapter.setSelectListener(new SelectListener() {
            @Override
            public void onItemClicked(MyModel myModel) {
                Toast.makeText(MainActivity.this, myModel.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
