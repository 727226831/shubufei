package com.example.icbc.databinding;
import com.example.icbc.R;
import com.example.icbc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityItem1BindingImpl extends ActivityItem1Binding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_item1, 1);
        sViewsWithIds.put(R.id.tv_key1, 2);
        sViewsWithIds.put(R.id.tv_key2, 3);
        sViewsWithIds.put(R.id.tv_key3, 4);
        sViewsWithIds.put(R.id.ll_item2, 5);
        sViewsWithIds.put(R.id.tv_key4, 6);
        sViewsWithIds.put(R.id.ll_item3, 7);
        sViewsWithIds.put(R.id.tv_key5, 8);
        sViewsWithIds.put(R.id.tv_key6, 9);
        sViewsWithIds.put(R.id.tv_count, 10);
        sViewsWithIds.put(R.id.ll_item4, 11);
        sViewsWithIds.put(R.id.tv_key7, 12);
        sViewsWithIds.put(R.id.tv_title1, 13);
        sViewsWithIds.put(R.id.et_warehouse, 14);
        sViewsWithIds.put(R.id.ll_item5, 15);
        sViewsWithIds.put(R.id.tv_key10, 16);
        sViewsWithIds.put(R.id.tv_key9, 17);
        sViewsWithIds.put(R.id.tv_key11, 18);
        sViewsWithIds.put(R.id.ll_item6, 19);
        sViewsWithIds.put(R.id.tv_key12, 20);
        sViewsWithIds.put(R.id.tv_item13, 21);
        sViewsWithIds.put(R.id.tv_item8, 22);
        sViewsWithIds.put(R.id.et_item8, 23);
        sViewsWithIds.put(R.id.l_bottom, 24);
        sViewsWithIds.put(R.id.tv_total, 25);
        sViewsWithIds.put(R.id.b_submit, 26);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityItem1BindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private ActivityItem1BindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[26]
            , (android.widget.EditText) bindings[23]
            , (android.widget.EditText) bindings[14]
            , (android.widget.RelativeLayout) bindings[24]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[25]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}