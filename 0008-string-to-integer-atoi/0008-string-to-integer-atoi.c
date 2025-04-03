#include <limits.h> 
int myAtoi(char* s) {
    long num = atol(s);

    if (num > INT_MAX) {
        return INT_MAX;
    }
    if (num < INT_MIN) {
        return INT_MIN;
    }

    return (int)num; 
}
