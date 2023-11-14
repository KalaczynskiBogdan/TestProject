package com.example.testproject.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.testproject.R;

import java.util.ArrayList;
import java.util.List;

public class ArticleActivity extends AppCompatActivity {
    private TextView resultTextView;
    private TextView textView;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        List<Article> articles = new ArrayList<>();

        textView = findViewById(R.id.title_view);
        textView.setText("ARTICLES");

        articles.add(new Article("Basketball", "Basketball is a game played between two teams of five " +
                "players each on a rectangular court, usually indoors. Each team tries to score by tossing " +
                "the ball through the opponent's goal, an elevated horizontal hoop and net called a basket."));
        articles.add(new Article("Football", "Football, also called association football or soccer, is a" +
                " game involving two teams of 11 players who try to maneuver the ball into the other team's " +
                "goal without using their hands or arms. The team that scores more goals wins."));
        articles.add(new Article("Boxing", "What defines boxing?" +
                "Boxing is a sport that involves strategically punching an opponent while defending yourself from their" +
                " return punches. Some amateurs practice boxing as a way to stay in shape. If you go to a boxing match, " +
                "you'll see two fighters in a ring surrounded by thick ropes. "));

        ListView articlesList = findViewById(R.id.list_view);

        ArrayAdapter<Article> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, articles);
        articlesList.setAdapter(adapter);

        resultTextView = findViewById(R.id.view_text1);

        articlesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Article selectedArticle = (Article) parent.getItemAtPosition(position);
                updateResultTextView("Article: " + selectedArticle.getTitle() +
                        "\n " + selectedArticle.getText());
            }
        });
    }
    private void updateResultTextView(String message) {
        resultTextView.setText(message);
    }

}
