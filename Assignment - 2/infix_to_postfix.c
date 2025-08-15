#include<stdio.h>
#include<stdbool.h>
#include<ctype.h>
#define max 30
int top = -1;
char stack[max];
void push(char);
char pop();
bool isfull();
bool isempty();
void infix_to_postfix(char[],char[]);
int check_precedence(char);
int main(){
    char infix[30],postfix[30];
    printf("Enter the infix expression : ");
    scanf("%s",infix);

    infix_to_postfix(infix,postfix);
    printf("The postfix expression is : %s",postfix);
    return 0;
}
bool isfull(){
    if(top == max - 1){
        return 1;
    } else {
        return 0;
    }
}
bool isempty(){
    if(top == -1){
        return 1;
    } else {
        return 0;
    }
}
void push(char ele){
    if(isfull()){
        printf("Stack overload\n");
    } else {
        stack[++top] = ele;
    }
}
char pop(){
    if(isempty()){
        printf("Stack underflow\n");
    } else {
        return stack[top--];
    }
}
int check_precedence(char ch){
    if(ch == '('){
        return 0;
    } else if(ch == '+' || ch == '-'){
        return 1;
    } else if(ch == '*' || ch == '/'){
        return 2;
    } else if(ch == '^'){
        return 3;
    } else {
        return 4;
    }
}
void infix_to_postfix(char infix[30],char postfix[30]){
    int k = 0,i = 0;
    char ch;

        while(infix[i] != '\0'){
            ch = infix[i];
            if(isalpha(ch)){
                postfix[k++] = ch;
            } else if(ch == '('){
                push(ch);
            } else if(ch == ')'){
                int str = pop();
                while(str != '('){
                    postfix[k++] = str;
                    str = pop();
                }
            } else {
                while(!isempty() && check_precedence(ch) <= check_precedence(stack[top])){
                    postfix[k++] = pop();
                }
                push(ch);
            }
            i++;
        }
    while(!isempty()){
        postfix[k++] = pop();
    }
    postfix[k] = '\0';
}