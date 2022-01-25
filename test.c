#include <stdio.h>
#include <string.h>

typedef struct Book {
	char title[50];
	char desc[50];
} Book;

int main () {
	Book book;
	
	strcpy(book.title, "How to learn?");
	strcpy(book.desc, "write and think and write and think...");

	printf("title: %s\n", book.title);
	printf("desc: %s\n", book.desc);

	return 0;
}
