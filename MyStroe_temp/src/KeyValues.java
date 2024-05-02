/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rlarl
 */
public class KeyValues {
    int keyIndex;
    int viewIndex;
    String []values;

    public KeyValues(String[] values, int viewIndex, int keyIndex ) {
        this.keyIndex = keyIndex;
        this.viewIndex = viewIndex;
        this.values = values;
    }

    public int getKeyIndex() {
        return keyIndex;
    }

    public void setKeyIndex(int keyIndex) {
        this.keyIndex = keyIndex;
    }

    public int getViewIndex() {
        return viewIndex;
    }

    public void setViewIndex(int viewIndex) {
        this.viewIndex = viewIndex;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }
    

    @Override
    public String toString() {
        return values[viewIndex];
    }
    
}