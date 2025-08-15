#include<stdio.h>

int Binary_Search(int,int[],int);

int main(){
    int i = 0,key,size;
    printf("Enter the size of the array : ");
    scanf("%d",&size);
    int a[size];
    printf("Enter the array elements : ");
    for(i = 0; i < size; i++){
        scanf("%d",&a[i]);
    } 
    printf("Enter the key you want to search : ");
    scanf("%d",&key);
    int res = Binary_Search(key,a,size);
    if(res == key){
        printf("Element is found\n");
    } else {
        printf("Element not found\n");
    }
    return 0;
}

int Binary_Search(int key, int a[], int size){
    int low = 0, high = size - 1;
    int mid;
    while(low <= high){
        mid = (low + high) / 2;
        if(key > a[mid]){
            low = mid + 1;
        } else if(key < a[mid]){
            high = mid - 1;
        } else {
            return a[mid];
        }
    }
}