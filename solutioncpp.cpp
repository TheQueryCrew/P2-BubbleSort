#include <bits/stdc++.h>
using namespace std;
void swap(int *xp, int *yp) 
{ 
    int temp = *xp; 
    *xp = *yp; 
    *yp = temp; 
} 
void bubbleSort(int arr[],int n){    
    for(int i =0;i<n;i++){
        for(int j=0;j<n-i;j++){
            if(arr[j]>arr[j+1]){
                swap(&arr[j],&arr[j+1]);
            }
        }
    }
}

int main(){
    int arr[] = {3,5,77,91,0,23};
    bubbleSort(arr,6);
    for(int x:arr){
        cout<<x<<" ";
    }

    return 0;
}