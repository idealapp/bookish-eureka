package com.melanie.ideal;

public class Deal {
    private String type;
    private String preview;
    private String image;
    private String link;

    public Deal(String t, String p, String i, String l){
        type = t;
        preview = p;
        image = i;
        link = l;
    }

    public String getPreview(){
        return preview;
    }
}
