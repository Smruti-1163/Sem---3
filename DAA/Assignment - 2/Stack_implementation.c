#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
#define max 10
int top = -1;
int stack[max];
void push(int);
void pop();
bool is_empty();
bool is_full();
void display();
int main(){
	int ch,value;
	while(1){
		printf("1. Push\n 2. Pop\n 3. display\n 4.Exit program\n");
		printf("Enter your choice : ");
		scanf("%d",&ch);
		switch(ch){
			case 1:
				printf("Enter the value to insert in the stack : ");
				scanf("%d",&value);
				push(value);
				break;
			case 2:
				pop();
				break;
			case 3: 
				display();
				break;
			case 4:
				printf("Thankyou for using this program\n");
				exit(0);
			default:
				printf("Invalid choice\n");
		}
	}
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
void pop(){
	if(is_empty() == 1){
		printf("Stack Underflow\n");
	} else {
		stack[top--];
	}
}
void display(){
	int i;
	for(i = 0; i <= top; i++){
		printf("%d ",stack[i]);
	}
	printf("\n");
}