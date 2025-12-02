#include<stdio.h>
void merge(int A[50], int p, int q, int r){
    int n1 =  q-p+1;
    int n2 = r-q;
    int L[n1 + 1], R[n2 + 1];
    for(int i = 0; i < n1; i++){
        L[i] = A[p+i];
    }
    for(int j = 0; j < n2; j++){
        R[j] = A[q+1+j];
    }
    L[n1] = 9999;
    R[n2] = 9999;
    int i = 0;
    int j = 0;
    for(int k = p; k <= r; k++){
        if(L[i] <= R[j]){
            A[k] = L[i];
            i++;
        } else {
            A[k] = R[j];
            j++;
        }
    }
}
void mergeSort(int A[], int p, int r){
    if(p < r){
        int q = (p+r)/2;
        mergeSort(A,p,q);
        mergeSort(A,q+1,r);
        merge(A,p,q,r);
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
    printf("Sorted Array : \n");
    mergeSort(A,0,n-1);
    for(int i = 0; i < n; i++){
        printf("%d ",A[i]);
    }
    return 0;
}