#include<stdio.h>
void swap(int *a, int *b){
    int temp = *a; 
    *a = *b;
    *b = temp;
}
int partition(int A[20], int low, int high){
    int pivot = A[low];
    int i = low;
    int j = high;
    while(i < j){
        do{
            i++;
        } while(A[i] < pivot);
        do{
            j--;
        } while(A[j] > pivot);
        if(i < j){
            swap(&A[i],&A[i]);
        }
    }
    swap(&A[low],&A[j]);
    return j;
}
void quicksort(int A[20], int low, int high){
    if(low < high){
        int j = partition(A,low,high);
        quicksort(A,low,j);
        quicksort(A,j+1,high);
    }
}
int main(){
    int A[50],n;
    printf("Enter the number of elements : \n");
    scanf("%d",&n);
    printf("Enter %d elements : \n",n);
    for(int i = 0; i < n; i++){
        scanf("%d",&A[i]);
    }
    quicksort(A,0,n-1); 
    printf("Sorted Array : \n");
    for(int i = 0; i < n; i++){
        printf("%d ",A[i]);
    }
    return 0;
}