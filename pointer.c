#include <stdio.h>

int main () {
	int i = 10;
	int *p;
	int **q;
	
	p = &i;
	q = &p;

	printf("%p", p);
	printf("%p", q);
}
