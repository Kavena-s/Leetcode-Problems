

char * mergeAlternately(char * word1, char * word2){
    if(strlen(word1)==0)
        return word2;
    else if(strlen(word2)==0)
        return word1;
    
    int length=strlen(word1)+strlen(word2);
    char *newword = (char *)malloc((length + 1) * sizeof(char));
    int temp=0;
    if(strlen(word1)>strlen(word2)){
        for(int i=0;i<(length-strlen(word1));i++){
            newword[temp]=word1[i];
            temp=temp+1;
            newword[temp]=word2[i];
            temp=temp+1;
        }
        for(int i=(length-strlen(word1));i<strlen(word1);i++){
            newword[temp]=word1[i];
            temp=temp+1;
        }
    }
    else if(strlen(word1)<strlen(word2)){
        for(int i=0;i<(length-strlen(word2));i++){
            newword[temp]=word1[i];
            temp=temp+1;
            newword[temp]=word2[i];
            temp=temp+1;
        }
        for(int i=(length-strlen(word2));i<strlen(word2);i++){
            newword[temp]=word2[i];
            temp=temp+1;
        }
    }
    else{
        for(int i=0;i<strlen(word1);i++){
            newword[temp]=word1[i];
            temp=temp+1;
            newword[temp]=word2[i];
            temp=temp+1;
        }
    }
    newword[temp]='\0';
    return newword;
}
