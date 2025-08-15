#include<stdio.h>

void Linear_Search(int,int[],int);

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
    Linear_Search(key,a,size);
    return 0;
}

void Linear_Search(int key, int a[], int size){
    int i = 0,temp,ch = 0;
    for(i = 0; i < size; i++){
        if(key == a[i]){
            temp = i + 1;
            ch++;
        }
    }
    if(ch > 0){
        printf("Element is found in pos : %d\n",temp);
    } else {
        printf("Element not found\n");
    }
}