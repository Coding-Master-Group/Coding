#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	char text[101];
	char flash;

	while (scanf("%[^\n]s", text) != EOF) {
		printf("%s\n", text);

		scanf("%c", &flash);
	}

	return 0;
}