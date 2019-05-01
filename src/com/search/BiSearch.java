package com.search;

public class BiSearch {

    public static int biSearch(int[] arr,int x){
        if(arr == null || arr.length <= 0 ){
            return -1;
        }
        return  biSearchCore(arr,0,arr.length - 1,x);
    }

    public static int biSearchCore(int[] arr,int l,int r,int x){
        if(l == r){
            if(arr[l] == x){
                return l;
            }else {
                return -1;
            }
        }else {
            int mid = (l + r)/2;
            if(x == arr[mid]){
                return mid;
            }
            if(x < arr[mid]){
                return biSearchCore(arr,l,mid,x);
            }else {
                return biSearchCore(arr,mid,r,x);
            }
        }
    }
}
