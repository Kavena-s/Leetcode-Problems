#include <stdio.h>
#include <stdlib.h>
#include <limits.h> 

typedef struct {
    int key;
    int value;
} HashItem;

int hash(int key, int size) {
    return abs(key) % size;
}

void insert(HashItem* map, int size, int key, int value) {
    int index = hash(key, size);
    while (map[index].key != INT_MIN) { 
        index = (index + 1) % size;      
    }
    map[index].key = key;
    map[index].value = value;
}

int find(HashItem* map, int size, int key) {
    int index = hash(key, size);
    while (map[index].key != INT_MIN) {
        if (map[index].key == key) {
            return map[index].value;
        }
        index = (index + 1) % size;
    }
    return -1; 
}

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* result = (int*)malloc(2 * sizeof(int));
    *returnSize = 2;
    HashItem* hashMap = (HashItem*)malloc(numsSize * 2 * sizeof(HashItem));
    for (int i = 0; i < numsSize * 2; i++) {
        hashMap[i].key = INT_MIN;
    }
    for (int i = 0; i < numsSize; i++) {
        int complement = target - nums[i];
        int complementIndex = find(hashMap, numsSize * 2, complement);
        if (complementIndex != -1) {
            result[0] = complementIndex;
            result[1] = i;
            free(hashMap);
            return result;
        }
        insert(hashMap, numsSize * 2, nums[i], i);
    }
    free(hashMap);
    return result;
}
