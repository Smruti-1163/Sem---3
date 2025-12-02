#include<stdio.h>
void fractionKnapsack(int n, int capacity, float p[20],float w[20]){
    int i,j;
    float x[20],ratio[20],temp,total_profit = 0;
    for(i = 0; i < n; i++){
        ratio[i] = p[i]/w[i];
    }
    for(i = 0; i < n; i++){
        for(j = i+1; j < n; j++){
            if(ratio[i] < ratio[j]){
                temp = ratio[j];
                ratio[j] = ratio[i];
                ratio[i] = temp;

                temp = p[j];
                p[j] = p[i];
                p[i] = temp;

                temp = w[j];
                w[j] = w[i];
                w[i] = temp; 
            }
        }
    }
    for(i = 0; i < n; i++){
        x[i] = 0.0;
    }
    for(i = 0; i < n; i++){
        if(w[i] > capacity){
            break;
        } else {
            x[i] = 1.0;
            total_profit  += p[i];
            capacity -= w[i];
        }
    }
    if(i < n){
        x[i] = capacity/w[i];
        total_profit += x[i] * p[i];
    }
    printf("Total profit : %.2f",total_profit);
}
int main(){
    int n;
    float p[20],w[20]; 
    printf("Enter the no. of items : ");
    scanf("%d",&n);
    printf("Enter the profit of the %d items : ",n);
    for(int i = 0; i < n; i++){
        scanf("%f",&p[i]);
    }
    printf("Enter the weight of %d items : ",n);
    for(int i = 0; i < n; i++){
        scanf("%f",&w[i]);
    }
    int capacity;
    printf("Enter the capacity of the kanpsack : \n");
    scanf("%d",&capacity);
    fractionKnapsack(n,capacity,p,w);
    return 0;
}