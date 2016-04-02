package com.example.salis.c1541078bj_task2;

/**
 * Created by Salis on 28/3/2016.
 */

    import android.app.Activity;
    import android.graphics.Typeface;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.ArrayAdapter;
    import android.widget.ImageView;
    import android.widget.TextView;

    public class CustomListAdapter extends ArrayAdapter<String> {
        Typeface font1 = Typeface.createFromAsset(getContext().getAssets(),"fonts/dark.ttf");
        Typeface font2 = Typeface.createFromAsset(getContext().getAssets(),"fonts/font2.ttf");

        private final Activity context;
        private final String[] itemname;
        private final Integer[] imgid;
        private final String[] year;



        public CustomListAdapter(Activity context, String[] itemname, String[] years, Integer[] imgid) {
            super(context, R.layout.item_details_view, itemname);
            // TODO Auto-generated constructor stub

            this.context=context;
            this.itemname=itemname;
            this.imgid=imgid;
            this.year = years;
        }

        public View getView(int position,View view,ViewGroup parent) {
            LayoutInflater inflater=context.getLayoutInflater();
            View rowView=inflater.inflate(R.layout.item_details_view, null, true);

            TextView txtTitle = (TextView) rowView.findViewById(R.id.name);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.photo);
            TextView extratxt = (TextView) rowView.findViewById(R.id.itemDescription);
            TextView moretxt = (TextView) rowView.findViewById(R.id.price);


            txtTitle.setText(itemname[position]);
            imageView.setImageResource(imgid[position]);
            extratxt.setText(year[position]);


            txtTitle.setTypeface(font1);
            extratxt.setTypeface(font2);

            return rowView;

        }
    }

