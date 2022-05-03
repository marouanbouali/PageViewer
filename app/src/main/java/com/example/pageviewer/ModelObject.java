package com.example.pageviewer;

public enum ModelObject {
    RED(R.string.red, R.layout.first_view),
    BLUE(R.string.blue, R.layout.second_view),
    GREEN(R.string.green, R.layout.third_page);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int mTitleResId, int mLayoutResId) {
        this.mTitleResId = mTitleResId;
        this.mLayoutResId = mLayoutResId;
    }

    public int getmTitleResId() {
        return mTitleResId;
    }

    public void setmTitleResId(int mTitleResId) {
        this.mTitleResId = mTitleResId;
    }

    public int getmLayoutResId() {
        return mLayoutResId;
    }

    public void setmLayoutResId(int mLayoutResId) {
        this.mLayoutResId = mLayoutResId;
    }
}


