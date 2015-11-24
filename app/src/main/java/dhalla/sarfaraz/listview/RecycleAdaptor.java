package dhalla.sarfaraz.listview;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

/**
 * Created by rajat on 2/8/2015.
 */
public class RecycleAdaptor extends RecyclerView.Adapter<RecycleAdaptor.ViewHolder> {
    private String[] dataSource;
    private String[] dataSource2;
    private int[] dataSource1;

    public RecycleAdaptor(String[] dataArgs,int[] dataArgs1,String[] dataArgs2) {
        dataSource = dataArgs;
        dataSource1 = dataArgs1;
        dataSource2 = dataArgs2;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_main, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(dataSource[position]);
        holder.textViewDesc.setText(dataSource2[position]);
        holder.imageView.setImageResource(dataSource1[position]);
    }

    @Override
    public int getItemCount() {
        return dataSource.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        protected TextView textView;
        protected TextView textViewDesc;
        protected ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            textView =  (TextView) itemView.findViewById(R.id.txttitle);
            textViewDesc =  (TextView) itemView.findViewById(R.id.txtdescription);
            imageView =  (ImageView) itemView.findViewById(R.id.imgImage);

        }


    }
}