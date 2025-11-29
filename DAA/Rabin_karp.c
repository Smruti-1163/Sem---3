#include<stdio.h>
#include<string.h>
#include<math.h>
#define d 256
#define q 101
void rabinKarp(char T[100],char P[100])
{
    int n = strlen(T);
    int m = strlen(P);
    int i,j;
    int p = 0; 
    int t = 0;
    int h =(int)pow(d,m-1) % q;
    for(int i = 0; i < m; i++){
        p = (d*p + P[i]) % q;
        t = (d*t + T[i]) % q;
    }
    for(i = 0;i < n - m; i++){
        if(p == t){
            for(j = 0;j < m; j++){
                if(T[i + j] != P[j]){
                    break;
                }
            }
            if(j == m){
                printf("Pattern is found at index : %d\n",i);
            }
        }
        if(i < n - m){
            t = (d * (t - T[i] * h) + T[i + m]) % q;
            if(t < 0){
                t = t + q;
            }
        }
    }
}
void main(){
    char T[100],P[100];
    printf("Enter the text : ");
    scanf("%s",T);
    printf("Enter the pattern : ");
    scanf("%s",P);
    rabinKarp(T,P);

}