package com.example.icbc.databinding;
import com.example.icbc.R;
import com.example.icbc.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemListBindingImpl extends ItemListBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemListBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemListBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[0]
            );
        this.llLayout.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.data == variableId) {
            setData((com.example.icbc.DataBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable com.example.icbc.DataBean Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
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
        java.lang.String dataCinvcode = null;
        java.lang.String dataIdayqty = null;
        java.lang.String dataCinvname = null;
        java.lang.String dataItotalqty = null;
        com.example.icbc.DataBean data = mData;
        java.lang.String dataDstartdate = null;
        java.lang.String dataDenddate = null;
        java.lang.String dataIquantity = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.cinvcode
                    dataCinvcode = data.getCinvcode();
                    // read data.idayqty
                    dataIdayqty = data.getIdayqty();
                    // read data.cinvname
                    dataCinvname = data.getCinvname();
                    // read data.itotalqty
                    dataItotalqty = data.getItotalqty();
                    // read data.dstartdate
                    dataDstartdate = data.getDstartdate();
                    // read data.denddate
                    dataDenddate = data.getDenddate();
                    // read data.iquantity
                    dataIquantity = data.getIquantity();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataCinvcode);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataCinvname);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, dataDstartdate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataDenddate);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataIquantity);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, dataItotalqty);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, dataIdayqty);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}