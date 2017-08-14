package com.londonappbrewery.destini;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    int storyIndex;
    Story [] stories = {
            new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2,2,1),
            new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2,2,3),
            new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2,5,4),
            new Story(R.string.T4_End),
            new Story(R.string.T5_End),
            new Story(R.string.T6_End)
    };

    Button answerOneButton;
    Button answerTwoButton;
    TextView story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerOneButton = (Button) findViewById(R.id.buttonTop);
        answerTwoButton = (Button) findViewById(R.id.buttonBottom);
        story = (TextView) findViewById(R.id.storyTextView);

        if(savedInstanceState != null){
            storyIndex = savedInstanceState.getInt("StoryIndex");
        } else {
            storyIndex = 0;
        }

        updateStory();

        answerOneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Story currentStory = stories[storyIndex];
                storyIndex = currentStory.getNextOneIndex();
                updateStory();
            }
        });

        answerTwoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Story currentStory = stories[storyIndex];
                storyIndex = currentStory.getNextTwoIndex();
                updateStory();
            }
        });
    }

    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putInt("StoryIndex", 0);
    }

    private void updateStory(){
        Story currentStory = stories[storyIndex];

        if(currentStory.isEnd()){
            answerOneButton.setVisibility(View.INVISIBLE);
            answerTwoButton.setVisibility(View.INVISIBLE);
        } else {
            answerOneButton.setText(currentStory.getAnswerOneID());
            answerTwoButton.setText(currentStory.getAnswerTwoID());
        }

        story.setText(currentStory.getStoryID());
    }


}
