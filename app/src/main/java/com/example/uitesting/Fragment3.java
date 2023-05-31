package com.example.uitesting;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment {
    PieChart pieChart;
    Conn_services conn=new Conn_services();
    private RecyclerView recyclerView;
    private CardAdapter cardAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment3, container, false);
        conn.pack_rule();
pieChart=view.findViewById(R.id.piechart);
        pieChart.addPieSlice(
                new PieModel(
                        "mail",
                  15,
                        Color.parseColor("#FF6384")));
        pieChart.addPieSlice(
                new PieModel(
                        "e-meetings",
                        10,
                        Color.parseColor("#36a2eb")));
        pieChart.addPieSlice(
                new PieModel(
                        "Music",
                        5,
                        Color.parseColor("#FFCE56")));
        pieChart.addPieSlice(
                new PieModel(
                        "OTT",
                        12,
                        Color.parseColor("#4BC0C0")));
        pieChart.addPieSlice(
                new PieModel(
                        "Social",
                        8,
                        Color.parseColor("#9966FF")));
        pieChart.addPieSlice(
                new PieModel(
                        "Travel",
                        7,
                        Color.parseColor("#FF9F40")));
        pieChart.addPieSlice(
                new PieModel(
                        "Fitness",
                        9,
                        Color.parseColor("#F7464A")));
        pieChart.addPieSlice(
                new PieModel(
                        "Learn",
                        13,
                        Color.parseColor("#23EB3B")));
        pieChart.addPieSlice(
                new PieModel(
                        "Sleep",
                        11,
                        Color.parseColor("#8F8F8F")));
        pieChart.addPieSlice(
                new PieModel(
                        "shop",
                        6,
                        Color.parseColor("#FFD700")));
        pieChart.addPieSlice(
                new PieModel(
                        "Others",
                        4,
                        Color.parseColor("#808080")));

        // To animate the pie chart
        pieChart.startAnimation();
        recyclerView = view.findViewById(R.id.recyclerView);

        // Create the list of card items
        List<CardItem> cardItems = createCardItems();

        // Set up the RecyclerView
        cardAdapter = new CardAdapter(cardItems, requireContext());
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        recyclerView.setAdapter(cardAdapter);


        return view;
    }
    private List<CardItem> createCardItems() {
        List<CardItem> cardItems = new ArrayList<>();

        // Add your card items here
        // Example:
        cardItems.add(new CardItem( R.drawable.logo_mails,"Mails", "Info 1", "Info 2", "Info 3"));
        cardItems.add(new CardItem( R.drawable.logo_games,"Games", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem( R.drawable.logo_meetings,"E-meetings", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem(R.drawable.logo_music, "Music", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem(R.drawable.logo_video, "OTT/Video", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem(R.drawable.logo_social, "Social", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem(R.drawable.logo_travel, "Travel", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem(R.drawable.logo_fitness, "Fitness", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem( R.drawable.logo_learn,"Learn", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem(R.drawable.logo_sleep, "Sleep", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem(R.drawable.logo_shopping, "Shop", "Info 4", "Info 5", "Info 6"));
        cardItems.add(new CardItem(R.drawable.logo_others, "Others", "Info 4", "Info 5", "Info 6"));


        // ...

        return cardItems;
    }
}
