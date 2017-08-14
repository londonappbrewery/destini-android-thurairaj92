package com.londonappbrewery.destini;

/**
 * Created by tletchumanan on 14/08/2017.
 */

public class Story {
    int storyID;
    int answerOneID;
    int answerTwoID;

    int nextOneIndex;
    int nextTwoIndex;

    boolean end;

    public Story(int storyID, int answerOneID, int answerTwoID, int nextOneIndex, int nextTwoIndex) {
        this.storyID = storyID;
        this.answerOneID = answerOneID;
        this.answerTwoID = answerTwoID;
        this.nextOneIndex = nextOneIndex;
        this.nextTwoIndex = nextTwoIndex;
        end = false;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public Story(int storyID) {
        this.storyID = storyID;
        end = true;

    }

    public int getNextOneIndex() {
        return nextOneIndex;
    }

    public void setNextOneIndex(int nextOneIndex) {
        this.nextOneIndex = nextOneIndex;
    }

    public int getNextTwoIndex() {
        return nextTwoIndex;
    }

    public void setNextTwoIndex(int nextTwoIndex) {
        this.nextTwoIndex = nextTwoIndex;
    }

    public int getStoryID() {
        return storyID;

    }

    public void setStoryID(int storyID) {
        this.storyID = storyID;
    }

    public int getAnswerOneID() {
        return answerOneID;
    }

    public void setAnswerOneID(int answerOneID) {
        this.answerOneID = answerOneID;
    }

    public int getAnswerTwoID() {
        return answerTwoID;
    }

    public void setAnswerTwoID(int answerTwoID) {
        this.answerTwoID = answerTwoID;
    }
}
