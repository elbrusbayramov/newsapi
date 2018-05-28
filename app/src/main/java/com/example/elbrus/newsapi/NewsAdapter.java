package com.example.elbrus.newsapi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news
 * in the data source (a list of {@link News} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    private static final String LOG_TAG =NewsAdapter.class.getSimpleName();

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news    is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(@NonNull Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID agent name
        TextView agentNameView = listItemView.findViewById(R.id.agent_name);
        // Display the agent name of the current news in that TextView
        agentNameView.setText(currentNews.getAgentName());

        // Find the TextView with view ID description
        TextView descriptionView = listItemView.findViewById(R.id.description);
        // Display the description of the current news in that TextView
        descriptionView.setText(currentNews.getDescription());

        // Create a new Date object from the time in milliseconds of the earthquake
        String[] arrayOf = currentNews.getPublishedTime().split("T");
        String pubishedAt = arrayOf[0]+" "+arrayOf[1].substring(0,arrayOf[1].length()-1);

        // Find the TextView with view ID date
        TextView publishedAtTextView = (TextView) listItemView.findViewById(R.id.published_at);



        publishedAtTextView.setText(pubishedAt);


// Return the list item view that is now showing the appropriate data
        return listItemView;
    }



}
