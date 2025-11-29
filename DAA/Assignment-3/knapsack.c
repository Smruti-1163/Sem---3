#include<stdio.h>
int main(){
    int n,i;
    printf("Enter the total no. of items in knapsack : \n");
    scanf("%d",&n);
    int p[n],w[n];
    float x[n];
    float M,U;
    printf("Enter the profits of the %d items : \n",n);
    for(i = 0; i < n; i++){
        scanf("%d",&p[i]);
    }
    printf("Enter the weights of the %d items : \n",n);
    for(i = 0; i < n; i++){
        scanf("%d",&w[i]);
    }
    printf("Enter the kanpsack capacity : \n");
    scanf("%f",&M);
    for(i = 0; i < n; i++){
        x[i] = 0;
    }
    U = M;
    for(i = 0; i < n; i++){
        if(w[i] > U){
            break;
        } else {
            x[i] = 1;
            U = U - w[i];
        }
    }
    if(i <= n){
        x[i] = U/w[i];
    }
    float total_profits = 0;
    for(int i = 0; i < n; i++){
        total_profits += x[i] * p[i];
    }
    printf("%f",total_profits);
}