package com.company;



public class HashTableElement {

    private String key;
    private Object element;

    public HashTableElement(String key,Object element){
        this.key=key;
        this.element=element;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }



    @Override
    public String toString() {
        return '\n'+"HashTableElement{" +
                "key='" + key +
                ", element=" + element +
                '}'+'\n';
    }
}