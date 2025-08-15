#include<stdio.h>
#include<stdbool.h>
#include<ctype.h>
#define max 30
int top = -1;
int stack[max];
void push(int);
int pop();
bool is_empty();
bool is_full();
void display();
int postfix(char[]);
int main(){
    char expression[30];   
    printf("Enter the expression : ");
    scanf("%s",expression);
    int res = postfix(expression);
    printf("The postfix of the expression is : %d",res);
    return 0;
}
bool is_full(){
	if(top == max - 1){
		return 1;
	} else {
		return 0;
	}
}bool is_empty(){
	if(top == -1){
		return 1; 
	} else {
		return 0;
	}
}
void push(int value){
	if(is_full() == 1){
		printf("Stack Overflow\n");
	} else {
		top++;
		stack[top] = value;
	}
}
int pop(){
	if(is_empty() == 1){
		printf("Stack Underflow\n");
	} else {
		return stack[top--];
	}
}
void display(){
	int i;
	for(i = 0; i <= top; i++){
		printf("%d ",stack[i]);
	}
	printf("\n");
}
int postfix(char expression[]){
    int i = 0,element1,element2,res;
    char ch;
    while(expression[i] != '\0'){
        ch = expression[i];
        if(isdigit(ch)){
            element1 = ch - '0';
            push(element1);
        } else {

            element2 = pop();
            element1 = pop();

            if(ch == '+'){
                res = element1 + element2;
            } else if(ch == '-'){
                res = element1 - element2;
            } else if(ch == '/'){
                res = element1 / element2;
            } else if(ch == '*'){
                res = element1 * element2;
            }
            push(res);
        }
        i++;
    }
    return pop();
}