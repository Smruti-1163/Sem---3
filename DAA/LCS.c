#include<stdio.h>
#include<string.h>

#define max 100

int C[max][max];
char B[max][max];
char X[max],Y[max];

void Print_Lcs(int i, int j){
    if(i == 0 || j == 0){
        return;
    }
    if(B[i][j] == 'D'){
        Print_Lcs(i-1,j-1);
        printf("%c",X[i-1]);
    } else if(B[i][j] == 'U'){
        Print_Lcs(i-1,j);
    } else {
        Print_Lcs(i,j-1);
    }
}
void Lcs_Length(){
    int m = strlen(X);
    int n = strlen(Y);

    for(int i = 0; i <= m; i++){
        C[i][0] = 0;
    }
    for(int j = 0; j <= n; j++){
        C[0][j] = 0;   
    }
    
    for(int i = 1; i <= m; i++){
        for(int j = 1; j <= n; j++){
            if(X[i] == Y[j]){
                C[i][j] = C[i-1][j-1] + 1;
                B[i][j] = 'D';
            } else if(C[i-1][j] >= C[i][j-1]){
                C[i][j] = C[i-1][j];
                B[i][j] = 'U';
            } else {
                C[i][j] = C[i][j-1];
                B[i][j] == 'L';
            }
        }
    }
}
int main(){
    printf("Enter the '1st' String : \n");
    scanf("%s",X);
    printf("Enter the '2nd' String : \n");
    scanf("%s",Y);

    Lcs_Length();

    int m = strlen(X);
    int n = strlen(Y);

    printf("Lcs Lenght : %d\n",C[m][n]);

    printf("Lcs = ");
    Print_Lcs(m,n);
    printf("\n");
    return 0;
}