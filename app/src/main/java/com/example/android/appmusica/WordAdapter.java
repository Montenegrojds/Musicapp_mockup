package com.example.android.appmusica;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);
        }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord= getItem(position);
        TextView miwokTextView=(TextView)listItemView.findViewById(R.id.autorCancion);
        miwokTextView.setText(currentWord.getAuthorName());
        TextView defaultTextView=(TextView)listItemView.findViewById(R.id.nombreCancion);
        defaultTextView.setText(currentWord.getSongName());

        return listItemView;

    }

}