package com.example.finalyearproject.java;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finalyearproject.R;

import java.util.ArrayList;
import java.util.List;

public class HarbourLineStationActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<TicketModel> ticketModelList;
    List<ReturnTicketModel> returnTicketModelsList;
    MyAdapter myAdapter;
    ReturnTicketAdapter returnTicketAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_western_line_station);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerStationName);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        // Create sample station data
        ticketModelList = new ArrayList<>();
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123456, "Churchgate Station", "3 HOUR", 10, "Churchgate Station", "Harbor Line"));
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123457, "Marine Lines Station", "3 HOUR", 10, "Marine Lines Station", "Harbor Line"));
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123458, "Charni Road Station", "3 HOUR", 10, "Charni Road Station", "Harbor Line"));
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "3 HOUR", 10, "Grant Road Station", "Harbor Line"));
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "3 HOUR", 10, "Mumbai Central Station", "Harbor Line"));
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "3 HOUR", 10, "Mahalaxmi Station", "Harbor Line"));
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "3 HOUR", 10, "Lower Parel Station", "Harbor Line"));
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "3 HOUR", 10, "Prabhadevi Station", "Harbor Line"));
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "3 HOUR", 10, "Dadar Station", "Harbor Line"));
        ticketModelList.add(new TicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "3 HOUR", 10, "Matunga Road Station", "Harbor Line"));
        // Add more stations as needed

        returnTicketModelsList = new ArrayList<>();
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123456, "Churchgate Station", "24 HOUR", 20, "Churchgate Station", "Harbor Line"));
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123457, "Marine Lines Station", "24 HOUR", 20, "Marine Lines Station", "Harbor Line"));
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123458, "Charni Road Station", "24 HOUR", 20, "Charni Road Station", "Harbor Line"));
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "24 HOUR", 20, "Grant Road Station", "Harbor Line"));
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "24 HOUR", 20, "Mumbai Central Station", "Harbor Line"));
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "24 HOUR", 20, "Mahalaxmi Station", "Harbor Line"));
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "24 HOUR", 20, "Lower Parel Station", "Harbor Line"));
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Grant Road Station", "24 HOUR", 20, "Prabhadevi Station", "Harbor Line"));
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Mumbai", "24 HOUR", 20, "Dadar Station", "Harbor Line"));
        returnTicketModelsList.add(new ReturnTicketModel("Second", "ORDINARY", 1, 0, "2024-02-17", 123459, "Mumbai", "24 HOUR", 20, "Matunga Road Station", "Harbor Line"));

        // Initialize adapter and set it to RecyclerView
        myAdapter = new MyAdapter(this, ticketModelList);
        returnTicketAdapter = new ReturnTicketAdapter(this, returnTicketModelsList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setAdapter(returnTicketAdapter);
    }
}



