package com.example.proje;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.net.ContentHandler;

public class islemler extends BaseExpandableListAdapter {

    String[] liste={"Sebzeler","Meyveler","Süs Bitkileri"};
    String[][] listeicerik={{"Domates","Biber","Fasulye","Havuç","Ispanak","Karnabahar","Patates","Patlıcan","Salatalık","Soğan"},{"Çilek","Ceviz","Dut","Elma","Erik","Karpuz","Kayısı","Kiraz","Portakal","Üzüm"},{"Aloe Vera","Begonya","Glayöl","Gül","Kaktüs","Karanfil","Lale","Petunya","Sardunya","Sümbül"}};
    private Context c;
    public islemler (Context c)
    {
        this.c=c;
    }


    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public int getGroupCount() {
        return liste.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listeicerik[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }



    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        TextView tv1=new TextView(c);
        tv1.setText(liste[groupPosition]);
        tv1.setTextSize(25);
        tv1.setPadding(40,10,10,10);
        tv1.setTextColor(Color.BLUE);
        return tv1;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        TextView tv2=new TextView(c);
        tv2.setText(listeicerik[groupPosition][childPosition]);
        tv2.setTextSize(20);
        tv2.setTextColor(Color.BLACK);
        tv2.setPadding(40,10,10,10);
        return tv2;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
